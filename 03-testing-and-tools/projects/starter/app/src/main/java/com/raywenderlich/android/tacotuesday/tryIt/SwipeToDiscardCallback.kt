/*
 * Copyright (c) 2020 Razeware LLC
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

package com.mycompany.android.tacotuesday.tryIt

import android.graphics.Canvas
import android.view.View
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.mycompany.android.tacotuesday.data.Recipe


class SwipeToDiscardCallback(
    private val recipeRecyclerViewAdapter: TryItRecipesRecyclerViewAdapter,
    private val discard: (Recipe) -> Unit
) : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {

  private val uiUtil by lazy { ItemTouchHelper.Callback.getDefaultUIUtil() }

  override fun onMove(
      recyclerView: RecyclerView,
      viewHolder: RecyclerView.ViewHolder,
      target: RecyclerView.ViewHolder): Boolean {
    return false
  }

  override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
    val itemPosition = viewHolder.adapterPosition
    val recipe: Recipe = recipeRecyclerViewAdapter.getRecipeAtPosition(itemPosition)

    discard(recipe)
  }

  override fun onSelectedChanged(viewHolder: RecyclerView.ViewHolder?, actionState: Int) {
    if (viewHolder != null) {
      val foregroundView: View = (viewHolder as TryItRecipesRecyclerViewAdapter.ViewHolder).viewForeground
      uiUtil.onSelected(foregroundView)
    }
  }

  override fun onChildDrawOver(
      c: Canvas, recyclerView: RecyclerView,
      viewHolder: RecyclerView.ViewHolder?, dX: Float, dY: Float, actionState: Int,
      isCurrentlyActive: Boolean
  ) {
    val foregroundView: View = (viewHolder as TryItRecipesRecyclerViewAdapter.ViewHolder).viewForeground
    uiUtil.onDrawOver(c, recyclerView, foregroundView, dX, dY, actionState, isCurrentlyActive)
  }

  override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
    val foregroundView: View = (viewHolder as TryItRecipesRecyclerViewAdapter.ViewHolder).viewForeground
    uiUtil.clearView(foregroundView)
  }

  override fun onChildDraw(
      c: Canvas, recyclerView: RecyclerView,
      viewHolder: RecyclerView.ViewHolder, dX: Float, dY: Float, actionState: Int,
      isCurrentlyActive: Boolean
  ) {
    val foregroundView: View = (viewHolder as TryItRecipesRecyclerViewAdapter.ViewHolder).viewForeground
    uiUtil.onDraw(c, recyclerView, foregroundView, dX, dY, actionState, isCurrentlyActive)
  }
}