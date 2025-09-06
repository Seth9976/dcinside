package com.github.mikephil.charting.data;

import com.github.mikephil.charting.renderer.scatter.b;
import com.github.mikephil.charting.renderer.scatter.c;
import com.github.mikephil.charting.renderer.scatter.d;
import com.github.mikephil.charting.renderer.scatter.e;
import com.github.mikephil.charting.renderer.scatter.f;
import com.github.mikephil.charting.renderer.scatter.g;
import com.github.mikephil.charting.renderer.scatter.h;
import java.util.ArrayList;
import java.util.List;
import t1.k;

public class w extends q implements k {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.github.mikephil.charting.charts.ScatterChart.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.github.mikephil.charting.charts.ScatterChart.a.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.ScatterChart.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.ScatterChart.a.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.ScatterChart.a.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.ScatterChart.a.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.ScatterChart.a.g.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.ScatterChart.a.h.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private float C;
    protected e D;
    private float E;
    private int F;

    public w(List list0, String s) {
        super(list0, s);
        this.C = 15.0f;
        this.D = new f();
        this.E = 0.0f;
        this.F = 0x112233;
    }

    @Override  // t1.k
    public int A0() {
        return this.F;
    }

    @Override  // com.github.mikephil.charting.data.m
    public m L1() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < this.s.size(); ++v) {
            arrayList0.add(((Entry)this.s.get(v)).h());
        }
        m m0 = new w(arrayList0, "DataSet");
        this.a2(((w)m0));
        return m0;
    }

    @Override  // t1.k
    public e Y() {
        return this.D;
    }

    protected void a2(w w0) {
        super.S1(w0);
        w0.C = this.C;
        w0.D = this.D;
        w0.E = this.E;
        w0.F = this.F;
    }

    public static e b2(com.github.mikephil.charting.charts.ScatterChart.a scatterChart$a0) {
        switch(scatterChart$a0) {
            case 1: {
                return new f();
            }
            case 2: {
                return new c();
            }
            case 3: {
                return new g();
            }
            case 4: {
                return new d();
            }
            case 5: {
                return new h();
            }
            case 6: {
                return new b();
            }
            case 7: {
                return new com.github.mikephil.charting.renderer.scatter.a();
            }
            default: {
                return null;
            }
        }
    }

    public void c2(com.github.mikephil.charting.charts.ScatterChart.a scatterChart$a0) {
        this.D = w.b2(scatterChart$a0);
    }

    public void d2(int v) {
        this.F = v;
    }

    public void e2(float f) {
        this.E = f;
    }

    public void f2(float f) {
        this.C = f;
    }

    public void g2(e e0) {
        this.D = e0;
    }

    @Override  // t1.k
    public float p() {
        return this.C;
    }

    @Override  // t1.k
    public float p1() {
        return this.E;
    }
}

