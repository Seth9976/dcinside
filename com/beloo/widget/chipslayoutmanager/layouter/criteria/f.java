package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.a;

class f extends n {
    private int b;

    f(p p0, int v) {
        super(p0);
        this.b = v;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.n
    public boolean b(a a0) {
        int v = a0.d();
        return super.b(a0) && a0.S() < v - this.b;
    }
}

