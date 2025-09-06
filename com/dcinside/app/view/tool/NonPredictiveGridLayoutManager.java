package com.dcinside.app.view.tool;

import androidx.recyclerview.widget.GridLayoutManager;

public class NonPredictiveGridLayoutManager extends GridLayoutManager {
    public NonPredictiveGridLayoutManager(int v, int v1, boolean z) {
        super(null, v, v1, z);
    }

    @Override  // androidx.recyclerview.widget.GridLayoutManager
    public boolean C2() {
        return false;
    }
}

