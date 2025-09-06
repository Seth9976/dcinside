package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.a;
import com.beloo.widget.chipslayoutmanager.layouter.h;
import com.beloo.widget.chipslayoutmanager.layouter.j;

class c extends n implements p, j {
    private int b;
    private int c;

    c(p p0, int v) {
        super(p0);
        this.b = v;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.j
    public void a(h h0) {
        if(super.b(((a)h0))) {
            ++this.c;
        }
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.n, com.beloo.widget.chipslayoutmanager.layouter.criteria.p
    public boolean b(a a0) {
        a0.c(this);
        return super.b(a0) && this.c >= this.b;
    }
}

