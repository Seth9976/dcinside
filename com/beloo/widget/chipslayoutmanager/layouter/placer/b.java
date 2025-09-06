package com.beloo.widget.chipslayoutmanager.layouter.placer;

import androidx.recyclerview.widget.RecyclerView.LayoutManager;

class b implements f {
    private LayoutManager a;

    b(LayoutManager recyclerView$LayoutManager0) {
        this.a = recyclerView$LayoutManager0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.placer.f
    public e a() {
        return new c(this.a);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.placer.f
    public e b() {
        return new d(this.a);
    }
}

