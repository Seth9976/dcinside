package com.beloo.widget.chipslayoutmanager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;

public class n extends ItemDecoration {
    private int a;
    private int b;

    public n(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void d(Rect rect0, View view0, RecyclerView recyclerView0, State recyclerView$State0) {
        rect0.left = this.a / 2;
        rect0.right = this.a / 2;
        rect0.top = this.b / 2;
        rect0.bottom = this.b / 2;
    }
}

