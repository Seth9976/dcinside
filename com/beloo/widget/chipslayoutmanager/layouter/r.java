package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.beloo.widget.chipslayoutmanager.gravity.w;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.g;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.n;

class r implements l {
    @Override  // com.beloo.widget.chipslayoutmanager.layouter.l
    public com.beloo.widget.chipslayoutmanager.gravity.r a() {
        return new w();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.l
    public i b(LayoutManager recyclerView$LayoutManager0) {
        return new q(recyclerView$LayoutManager0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.l
    public g c() {
        return new n();
    }
}

