package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.a;

class k extends n {
    private int b;

    k(p p0, int v) {
        super(p0);
        this.b = v;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.n
    public boolean b(a a0) {
        int v = a0.m();
        return super.b(a0) && a0.u() < v - this.b;
    }
}

