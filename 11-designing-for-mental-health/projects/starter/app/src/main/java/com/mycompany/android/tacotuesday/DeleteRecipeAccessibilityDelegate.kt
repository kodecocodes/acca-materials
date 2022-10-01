package com.mycompany.android.tacotuesday

import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import androidx.core.view.AccessibilityDelegateCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.mycompany.android.tacotuesday.R

class DeleteRecipeAccessibilityDelegate(
    private val recipeName: String
) : AccessibilityDelegateCompat() {

  override fun onInitializeAccessibilityNodeInfo(
      host: View,
      info: AccessibilityNodeInfoCompat
  ) {
    super.onInitializeAccessibilityNodeInfo(host, info)
    val longClick =
        AccessibilityNodeInfoCompat.AccessibilityActionCompat(
            AccessibilityNodeInfo.ACTION_LONG_CLICK,
            host.context.getString(
                R.string.try_it_description_discard_recipe,
                recipeName))
    info.addAction(longClick)
  }
}