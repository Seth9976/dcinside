package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import com.beloo.widget.chipslayoutmanager.layouter.a;

class f extends s {
    private i b;

    f(i i0, h h0) {
        super(h0);
        this.b = i0;
    }

    // 去混淆评级： 低(30)
    @Override  // com.beloo.widget.chipslayoutmanager.layouter.breaker.s
    public boolean a(a a0) {
        return super.a(a0) || a0.K() != 0 && this.b.a(a0.K() - 1);
    }
}

