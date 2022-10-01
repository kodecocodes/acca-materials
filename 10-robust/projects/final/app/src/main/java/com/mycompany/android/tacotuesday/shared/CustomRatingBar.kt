/*
 * Copyright (c) 2022 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.mycompany.android.tacotuesday.shared

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.os.Bundle
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import androidx.core.content.res.getResourceIdOrThrow
import androidx.core.view.ViewCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import androidx.customview.widget.ExploreByTouchHelper
import com.mycompany.android.tacotuesday.R

class CustomRatingBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

  @DrawableRes
  private val drawableResUnchecked: Int

  @DrawableRes
  private val drawableResChecked: Int
  private val label: String
  private val editable: Boolean
  var rating = 0
    set(value) {
      field = value
      invalidate()
      contentDescription = context.getString(R.string.current_rating_description, value)
    }
  private val screenDensity = context.resources.displayMetrics.density
  private val diameter = (iconSizeDp * screenDensity).toInt()
  private val spacingWidth = (spacingWidthDp * screenDensity).toInt()
  private val maxRating = 5
  private val rectangles: Array<Rect> = Array(maxRating) { i ->
    val yFactor = i / maxRating
    val xFactor = i % maxRating
    val x = paddingLeft + xFactor * (diameter + spacingWidth)
    val y = paddingTop + yFactor * (diameter + spacingWidth)
    Rect(x, y, x + diameter, y + diameter)
  }
  private val exploreByTouchHelper = CustomRatingBarExploreByTouchHelper(this)

  init {
    context.theme.obtainStyledAttributes(
        attrs,
        R.styleable.CustomRatingBar,
        0, 0).apply {

      try {
        drawableResChecked = getResourceIdOrThrow(R.styleable.CustomRatingBar_drawableChecked)
        drawableResUnchecked = getResourceIdOrThrow(R.styleable.CustomRatingBar_drawableUnchecked)
        label = getString(R.styleable.CustomRatingBar_ratingLabel) ?: ""
        editable = getBoolean(R.styleable.CustomRatingBar_editable, true)
      } finally {
        recycle()
      }
    }
    isFocusable = true
    invalidate()
    ViewCompat.setAccessibilityDelegate(this, exploreByTouchHelper)
    accessibilityLiveRegion = ACCESSIBILITY_LIVE_REGION_POLITE
  }

  override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    val width: Int = maxRating * (diameter + spacingWidth) - spacingWidth + paddingLeft + paddingRight
    val height: Int = diameter + paddingTop + paddingBottom

    setMeasuredDimension(width, height)
  }

  override fun onDraw(canvas: Canvas) {
    diameter / 2.toFloat()
    for (i in 0 until maxRating) {
      val image = if (i >= rating) {
        ResourcesCompat.getDrawable(resources, drawableResUnchecked, context.theme)
      } else {
        ResourcesCompat.getDrawable(resources, drawableResChecked, context.theme)
      }
      image!!.setBounds(rectangles[i].left, rectangles[i].top, rectangles[i].right,
          rectangles[i].bottom)
      image.draw(canvas)
    }
  }

  override fun onTouchEvent(event: MotionEvent): Boolean {
    if (editable) {
      when (event.action) {
        MotionEvent.ACTION_DOWN -> return true
        MotionEvent.ACTION_UP -> {
          val selectedIndex = findRatingAtPoint(event.x, event.y)
          onSelected(selectedIndex)
          return true
        }
      }
    }
    return super.onTouchEvent(event)
  }

  private fun onSelected(selectedIndex: Int) {
    if (selectedIndex == INVALID_VALUE) return
    rating = selectedIndex + 1
    invalidate()
  }

  private fun findRatingAtPoint(x: Float, y: Float): Int {
    var selectedIndex = INVALID_VALUE
    for (i in 0 until maxRating) {
      if (rectangles[i].contains(x.toInt(), y.toInt())) {
        selectedIndex = i
        break
      }
    }
    return selectedIndex
  }

  override fun dispatchHoverEvent(event: MotionEvent?): Boolean {
    return (event?.let {
      exploreByTouchHelper.dispatchHoverEvent(it)
    } ?: run { false }
        || super.dispatchHoverEvent(event))
  }

  override fun dispatchKeyEvent(event: KeyEvent?): Boolean {
    return (event?.let {
      exploreByTouchHelper.dispatchKeyEvent(it)
    } ?: run { false }
        || super.dispatchKeyEvent(event))
  }

  override fun onFocusChanged(
      gainFocus: Boolean,
      direction: Int,
      previouslyFocusedRect: Rect?
  ) {
    super.onFocusChanged(gainFocus, direction,
        previouslyFocusedRect)
    exploreByTouchHelper.onFocusChanged(gainFocus, direction,
        previouslyFocusedRect)
  }

  inner class CustomRatingBarExploreByTouchHelper(host: View) :
      ExploreByTouchHelper(host) {

    override fun getVisibleVirtualViews(
        virtualViewIds: MutableList<Int>?
    ) {
      rectangles.forEachIndexed { index, _ ->
        virtualViewIds?.add(index)
      }
    }

    override fun getVirtualViewAt(x: Float, y: Float): Int {
      val index = findRatingAtPoint(x, y)
      return if (index == INVALID_VALUE) INVALID_ID else index
    }

    override fun onPopulateNodeForVirtualView(
        virtualViewId: Int,
        node: AccessibilityNodeInfoCompat
    ) {
      node.text = context.getString(
          R.string.custom_rating_bar_description,
          label,
          virtualViewId + 1
      )
      node.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK)
      node.setBoundsInParent(rectangles[virtualViewId])
    }

    override fun onPerformActionForVirtualView(
        virtualViewId: Int,
        action: Int,
        arguments: Bundle?
    ): Boolean {
      when (action) {
        AccessibilityNodeInfoCompat.ACTION_CLICK -> {
          onSelected(virtualViewId)
          return true
        }
      }
      return false
    }
  }

  companion object {
    const val INVALID_VALUE = -1
    const val spacingWidthDp = 10f
    const val iconSizeDp = 48f
  }
}
