package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.f;
import java.util.ArrayList;
import java.util.List;

public class e extends a {
    public e(s1.a a0) {
        super(a0);
    }

    @Override  // com.github.mikephil.charting.highlight.a
    public d a(float f, float f1) {
        com.github.mikephil.charting.data.a a0 = ((s1.a)this.a).getBarData();
        f f2 = this.j(f1, f);
        d d0 = this.f(((float)f2.d), f1, f);
        if(d0 == null) {
            return null;
        }
        t1.a a1 = (t1.a)a0.k(d0.d());
        if(a1.b0()) {
            return this.l(d0, a1, ((float)f2.d), ((float)f2.c));
        }
        f.c(f2);
        return d0;
    }

    @Override  // com.github.mikephil.charting.highlight.b
    protected List b(t1.e e0, int v, float f, com.github.mikephil.charting.data.m.a m$a0) {
        List list0 = new ArrayList();
        List list1 = e0.v(f);
        if(list1.size() == 0) {
            Entry entry0 = e0.d1(f, NaNf, m$a0);
            if(entry0 != null) {
                list1 = e0.v(entry0.l());
            }
        }
        if(list1.size() == 0) {
            return list0;
        }
        for(Object object0: list1) {
            f f1 = ((s1.a)this.a).d(e0.E0()).f(((Entry)object0).d(), ((Entry)object0).l());
            float f2 = (float)f1.c;
            float f3 = (float)f1.d;
            ((ArrayList)list0).add(new d(((Entry)object0).l(), ((Entry)object0).d(), f2, f3, v, e0.E0()));
        }
        return list0;
    }

    @Override  // com.github.mikephil.charting.highlight.a
    protected float e(float f, float f1, float f2, float f3) {
        return Math.abs(f1 - f3);
    }
}

