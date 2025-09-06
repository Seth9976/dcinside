package com.github.mikephil.charting.data;

import java.util.List;

public class a extends c {
    private float j;

    public a() {
        this.j = 0.85f;
    }

    public a(List list0) {
        super(list0);
        this.j = 0.85f;
    }

    public a(t1.a[] arr_a) {
        super(arr_a);
        this.j = 0.85f;
    }

    public float Q() {
        return this.j;
    }

    public float R(float f, float f1) {
        return ((float)this.i.size()) * (this.j + f1) + f;
    }

    public void S(float f, float f1, float f2) {
        if(this.i.size() <= 1) {
            throw new RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
        }
        int v = ((t1.a)this.w()).N();
        float f3 = this.j / 2.0f;
        float f4 = this.R(f1, f2);
        for(int v1 = 0; v1 < v; ++v1) {
            float f5 = f + f1 / 2.0f;
            for(Object object0: this.i) {
                t1.a a0 = (t1.a)object0;
                float f6 = f5 + f2 / 2.0f + f3;
                if(v1 < a0.N()) {
                    BarEntry barEntry0 = (BarEntry)a0.l(v1);
                    if(barEntry0 != null) {
                        barEntry0.m(f6);
                    }
                }
                f5 = f6 + f3 + f2 / 2.0f;
            }
            float f7 = f5 + f1 / 2.0f;
            float f8 = f4 - (f7 - f);
            if(f8 > 0.0f || f8 < 0.0f) {
                f7 += f8;
            }
            f = f7;
        }
        this.E();
    }

    public void T(float f) {
        this.j = f;
    }
}

