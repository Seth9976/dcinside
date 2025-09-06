package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.util.Log;
import com.github.mikephil.charting.formatter.c;
import com.github.mikephil.charting.utils.k;
import java.util.ArrayList;
import java.util.List;
import t1.f;

public class o extends p implements f {
    public static enum a {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER;

    }

    private a H;
    private List I;
    private int J;
    private float K;
    private float L;
    private float M;
    private DashPathEffect N;
    private com.github.mikephil.charting.formatter.f O;
    private boolean P;
    private boolean Q;

    public o(List list0, String s) {
        super(list0, s);
        this.H = a.a;
        this.I = null;
        this.J = -1;
        this.K = 8.0f;
        this.L = 4.0f;
        this.M = 0.2f;
        this.N = null;
        this.O = new c();
        this.P = true;
        this.Q = true;
        if(this.I == null) {
            this.I = new ArrayList();
        }
        this.I.clear();
        this.I.add(Color.rgb(140, 0xEA, 0xFF));
    }

    @Override  // t1.f
    public int E() {
        return this.I.size();
    }

    @Override  // t1.f
    @Deprecated
    public boolean F0() {
        return this.H == a.b;
    }

    @Override  // t1.f
    public com.github.mikephil.charting.formatter.f I() {
        return this.O;
    }

    @Override  // com.github.mikephil.charting.data.m
    public m L1() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < this.s.size(); ++v) {
            arrayList0.add(((Entry)this.s.get(v)).h());
        }
        m m0 = new o(arrayList0, "DataSet");
        this.f2(((o)m0));
        return m0;
    }

    @Override  // t1.f
    public DashPathEffect O() {
        return this.N;
    }

    @Override  // t1.f
    public float U0() {
        return this.K;
    }

    @Override  // t1.f
    public a X0() {
        return this.H;
    }

    @Override  // t1.f
    public int d0(int v) {
        return (int)(((Integer)this.I.get(v)));
    }

    @Override  // t1.f
    public boolean e0() {
        return this.P;
    }

    @Override  // t1.f
    @Deprecated
    public boolean f() {
        return this.H == a.c;
    }

    protected void f2(o o0) {
        super.a2(o0);
        o0.I = this.I;
        o0.J = this.J;
        o0.L = this.L;
        o0.K = this.K;
        o0.M = this.M;
        o0.N = this.N;
        o0.Q = this.Q;
        o0.P = this.Q;
        o0.O = this.O;
        o0.H = this.H;
    }

    @Override  // t1.f
    public boolean g() {
        return this.N != null;
    }

    @Override  // t1.f
    public float g0() {
        return this.L;
    }

    public void g2() {
        this.N = null;
    }

    public void h2(float f, float f1, float f2) {
        this.N = new DashPathEffect(new float[]{f, f1}, f2);
    }

    @Override  // t1.f
    public int i() {
        return this.J;
    }

    public List i2() {
        return this.I;
    }

    @Deprecated
    public float j2() {
        return this.U0();
    }

    public void k2() {
        if(this.I == null) {
            this.I = new ArrayList();
        }
        this.I.clear();
    }

    public void l2(int v) {
        this.k2();
        this.I.add(v);
    }

    public void m2(List list0) {
        this.I = list0;
    }

    public void n2(int[] arr_v) {
        this.I = com.github.mikephil.charting.utils.a.c(arr_v);
    }

    public void o2(int[] arr_v, Context context0) {
        List list0 = this.I;
        if(list0 == null) {
            list0 = new ArrayList();
        }
        list0.clear();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            list0.add(context0.getResources().getColor(v1));
        }
        this.I = list0;
    }

    public void p2(int v) {
        this.J = v;
    }

    @Override  // t1.f
    public boolean q1() {
        return this.Q;
    }

    public void q2(float f) {
        if(f >= 0.5f) {
            this.L = k.e(f);
            return;
        }
        Log.e("LineDataSet", "Circle radius cannot be < 0.5");
    }

    @Override  // t1.f
    public float r0() {
        return this.M;
    }

    public void r2(float f) {
        if(f >= 1.0f) {
            this.K = k.e(f);
            return;
        }
        Log.e("LineDataSet", "Circle radius cannot be < 1");
    }

    @Deprecated
    public void s2(float f) {
        this.r2(f);
    }

    public void t2(float f) {
        if(f > 1.0f) {
            f = 1.0f;
        }
        if(f < 0.05f) {
            f = 0.05f;
        }
        this.M = f;
    }

    public void u2(boolean z) {
        this.Q = z;
    }

    public void v2(boolean z) {
        this.P = z;
    }

    public void w2(com.github.mikephil.charting.formatter.f f0) {
        if(f0 == null) {
            this.O = new c();
            return;
        }
        this.O = f0;
    }

    public void x2(a o$a0) {
        this.H = o$a0;
    }
}

