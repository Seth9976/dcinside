package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;

public final class i implements AccessibilityManager.AccessibilityStateChangeListener {
    public final AndroidComposeViewAccessibilityDelegateCompat a;

    public i(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        this.a = androidComposeViewAccessibilityDelegateCompat0;
    }

    @Override  // android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat.I(this.a, z);
    }
}

