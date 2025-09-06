package com.beloo.widget.chipslayoutmanager.anchor;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.beloo.widget.chipslayoutmanager.layouter.g;

abstract class a implements c {
    LayoutManager a;
    private g b;

    a(LayoutManager recyclerView$LayoutManager0, g g0) {
        this.a = recyclerView$LayoutManager0;
        this.b = g0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.anchor.c
    public AnchorViewState a() {
        return AnchorViewState.c();
    }

    AnchorViewState d(View view0) {
        return new AnchorViewState(this.a.K0(view0), this.b.i(view0));
    }

    g e() {
        return this.b;
    }
}

