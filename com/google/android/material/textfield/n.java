package com.google.android.material.textfield;

import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;

public final class n implements TouchExplorationStateChangeListener {
    public final p a;

    public n(p p0) {
        this.a = p0;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.L(z);
    }
}

