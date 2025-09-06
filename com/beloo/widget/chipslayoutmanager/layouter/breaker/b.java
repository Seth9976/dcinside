package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.cache.a;

class b extends s {
    private a b;

    b(a a0, h h0) {
        super(h0);
        this.b = a0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.breaker.s
    public boolean a(com.beloo.widget.chipslayoutmanager.layouter.a a0) {
        boolean z = this.b.b(a0.K());
        return super.a(a0) || z;
    }
}

