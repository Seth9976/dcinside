package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

public final class j implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final AndroidComposeViewAccessibilityDelegateCompat a;

    public j(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        this.a = androidComposeViewAccessibilityDelegateCompat0;
    }

    @Override  // android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat.Q0(this.a, z);
    }
}

