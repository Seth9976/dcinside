package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.c;
import com.github.mikephil.charting.utils.f;

public class a extends b {
    public a(s1.a a0) {
        super(a0);
    }

    @Override  // com.github.mikephil.charting.highlight.b
    public d a(float f, float f1) {
        d d0 = super.a(f, f1);
        if(d0 == null) {
            return null;
        }
        f f2 = this.j(f, f1);
        t1.a a0 = (t1.a)((s1.a)this.a).getBarData().k(d0.d());
        if(a0.b0()) {
            return this.l(d0, a0, ((float)f2.c), ((float)f2.d));
        }
        f.c(f2);
        return d0;
    }

    @Override  // com.github.mikephil.charting.highlight.b
    protected c d() {
        return ((s1.a)this.a).getBarData();
    }

    @Override  // com.github.mikephil.charting.highlight.b
    protected float e(float f, float f1, float f2, float f3) {
        return Math.abs(f - f2);
    }

    protected int k(j[] arr_j, float f) {
        if(arr_j != null && arr_j.length != 0) {
            int v1 = 0;
            for(int v = 0; v < arr_j.length; ++v) {
                if(arr_j[v].a(f)) {
                    return v1;
                }
                ++v1;
            }
            int v2 = Math.max(arr_j.length - 1, 0);
            return f > arr_j[v2].b ? v2 : 0;
        }
        return 0;
    }

    public d l(d d0, t1.a a0, float f, float f1) {
        BarEntry barEntry0 = (BarEntry)a0.M0(f, f1);
        if(barEntry0 == null) {
            return null;
        }
        if(barEntry0.y() == null) {
            return d0;
        }
        j[] arr_j = barEntry0.w();
        if(arr_j.length > 0) {
            int v = this.k(arr_j, f1);
            f f2 = ((s1.a)this.a).d(a0.E0()).f(d0.h(), arr_j[v].b);
            d d1 = new d(barEntry0.l(), barEntry0.d(), ((float)f2.c), ((float)f2.d), d0.d(), v, d0.b());
            f.c(f2);
            return d1;
        }
        return null;
    }
}

