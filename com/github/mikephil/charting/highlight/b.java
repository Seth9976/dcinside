package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.c;
import com.github.mikephil.charting.data.m.a;
import java.util.ArrayList;
import java.util.List;
import t1.e;

public class b implements f {
    protected s1.b a;
    protected List b;

    public b(s1.b b0) {
        this.b = new ArrayList();
        this.a = b0;
    }

    @Override  // com.github.mikephil.charting.highlight.f
    public d a(float f, float f1) {
        com.github.mikephil.charting.utils.f f2 = this.j(f, f1);
        float f3 = (float)f2.c;
        com.github.mikephil.charting.utils.f.c(f2);
        return this.f(f3, f, f1);
    }

    protected List b(e e0, int v, float f, a m$a0) {
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
            com.github.mikephil.charting.utils.f f1 = this.a.d(e0.E0()).f(((Entry)object0).l(), ((Entry)object0).d());
            float f2 = (float)f1.c;
            float f3 = (float)f1.d;
            ((ArrayList)list0).add(new d(((Entry)object0).l(), ((Entry)object0).d(), f2, f3, v, e0.E0()));
        }
        return list0;
    }

    public d c(List list0, float f, float f1, com.github.mikephil.charting.components.k.a k$a0, float f2) {
        d d0 = null;
        for(int v = 0; v < list0.size(); ++v) {
            d d1 = (d)list0.get(v);
            if(k$a0 == null || d1.b() == k$a0) {
                float f3 = this.e(f, f1, d1.i(), d1.k());
                if(f3 < f2) {
                    d0 = d1;
                    f2 = f3;
                }
            }
        }
        return d0;
    }

    protected c d() {
        return this.a.getData();
    }

    protected float e(float f, float f1, float f2, float f3) {
        return (float)Math.hypot(f - f2, f1 - f3);
    }

    protected d f(float f, float f1, float f2) {
        List list0 = this.h(f, f1, f2);
        if(list0.isEmpty()) {
            return null;
        }
        return this.i(list0, f2, com.github.mikephil.charting.components.k.a.a) < this.i(list0, f2, com.github.mikephil.charting.components.k.a.b) ? this.c(list0, f1, f2, com.github.mikephil.charting.components.k.a.a, this.a.getMaxHighlightDistance()) : this.c(list0, f1, f2, com.github.mikephil.charting.components.k.a.b, this.a.getMaxHighlightDistance());
    }

    protected float g(d d0) {
        return d0.k();
    }

    protected List h(float f, float f1, float f2) {
        this.b.clear();
        c c0 = this.d();
        if(c0 == null) {
            return this.b;
        }
        int v = c0.m();
        for(int v1 = 0; v1 < v; ++v1) {
            e e0 = c0.k(v1);
            if(e0.f0()) {
                this.b.addAll(this.b(e0, v1, f, a.c));
            }
        }
        return this.b;
    }

    protected float i(List list0, float f, com.github.mikephil.charting.components.k.a k$a0) {
        float f1 = 3.402823E+38f;
        for(int v = 0; v < list0.size(); ++v) {
            d d0 = (d)list0.get(v);
            if(d0.b() == k$a0) {
                float f2 = Math.abs(this.g(d0) - f);
                if(f2 < f1) {
                    f1 = f2;
                }
            }
        }
        return f1;
    }

    protected com.github.mikephil.charting.utils.f j(float f, float f1) {
        return this.a.d(com.github.mikephil.charting.components.k.a.a).j(f, f1);
    }
}

