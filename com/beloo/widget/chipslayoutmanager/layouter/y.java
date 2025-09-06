package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.beloo.widget.chipslayoutmanager.gravity.C;
import com.beloo.widget.chipslayoutmanager.gravity.r;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.g;

class y implements l {
    @Override  // com.beloo.widget.chipslayoutmanager.layouter.l
    public r a() {
        return new C();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.l
    public i b(LayoutManager recyclerView$LayoutManager0) {
        return new x(recyclerView$LayoutManager0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.l
    public g c() {
        return new com.beloo.widget.chipslayoutmanager.layouter.breaker.r();
    }
}

