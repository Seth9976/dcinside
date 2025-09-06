package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

class b extends AccessibilityDelegateCompat {
    private final AccessibilityActionCompat d;

    public b(Context context0, int v) {
        this.d = new AccessibilityActionCompat(16, context0.getString(v));
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.g(view0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.b(this.d);
    }
}

