package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.a;
import com.beloo.widget.chipslayoutmanager.layouter.j;
import com.beloo.widget.chipslayoutmanager.layouter.o;

public class h extends n implements p, j {
    private boolean b;
    private int c;

    h(a a0, p p0, int v) {
        super(p0);
        this.c = v;
        a0.c(this);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.j
    public void a(com.beloo.widget.chipslayoutmanager.layouter.h h0) {
        if(this.b) {
            return;
        }
        if(h0.f() == 0) {
            return;
        }
        for(Object object0: h0.g()) {
            if(((o)object0).a() == this.c) {
                this.b = true;
                return;
            }
            if(false) {
                break;
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.n, com.beloo.widget.chipslayoutmanager.layouter.criteria.p
    public boolean b(a a0) {
        return super.b(a0) || this.b;
    }
}

