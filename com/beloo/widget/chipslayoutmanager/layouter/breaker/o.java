package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.a;

public class o extends s {
    private int b;

    o(int v, h h0) {
        super(h0);
        this.b = v;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.breaker.s
    public boolean a(a a0) {
        return super.a(a0) || a0.f() >= this.b;
    }
}

