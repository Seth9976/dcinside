package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.a;

class e implements p {
    private boolean a;

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.p
    public boolean b(a a0) {
        boolean z = this.a || a0.C() >= a0.A();
        this.a = z;
        return z;
    }
}

