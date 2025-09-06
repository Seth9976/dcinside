package com.beloo.widget.chipslayoutmanager.layouter.breaker;

class a extends s {
    private i b;

    a(i i0, h h0) {
        super(h0);
        this.b = i0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.layouter.breaker.s
    public boolean a(com.beloo.widget.chipslayoutmanager.layouter.a a0) {
        return super.a(a0) || this.b.a(a0.K());
    }
}

