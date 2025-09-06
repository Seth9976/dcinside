package com.google.android.material.search;

import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;

public final class c implements TouchExplorationStateChangeListener {
    public final SearchBar a;

    public c(SearchBar searchBar0) {
        this.a = searchBar0;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.s0(z);
    }
}

