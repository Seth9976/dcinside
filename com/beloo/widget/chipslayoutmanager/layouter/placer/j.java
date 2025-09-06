package com.beloo.widget.chipslayoutmanager.layouter.placer;

import androidx.recyclerview.widget.RecyclerView.LayoutManager;

class j implements f {
    private LayoutManager a;

    j(LayoutManager recyclerView$LayoutManager0) {
        this.a = recyclerView$LayoutManager0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.placer.f
    public e a() {
        return new h(this.a);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.placer.f
    public e b() {
        return new i(this.a);
    }
}

