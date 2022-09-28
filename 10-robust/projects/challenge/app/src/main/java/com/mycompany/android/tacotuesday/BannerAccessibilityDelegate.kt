package com.mycompany.android.tacotuesday

import android.view.View
import androidx.core.view.AccessibilityDelegateCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat

class BannerAccessibilityDelegate : AccessibilityDelegateCompat() {
  override fun onInitializeAccessibilityNodeInfo(host: View?, info: AccessibilityNodeInfoCompat?) {
    super.onInitializeAccessibilityNodeInfo(host, info)
    info?.roleDescription =
        host?.context?.getString(R.string.banner_role)  }
}