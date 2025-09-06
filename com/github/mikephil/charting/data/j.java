package com.github.mikephil.charting.data;

import android.graphics.Paint.Style;
import com.github.mikephil.charting.utils.k;
import java.util.ArrayList;
import java.util.List;
import t1.d;

public class j extends q implements d {
    private float C;
    private boolean D;
    private float E;
    private boolean F;
    protected Paint.Style G;
    protected Paint.Style H;
    protected int I;
    protected int J;
    protected int K;
    protected int L;

    public j(List list0, String s) {
        super(list0, s);
        this.C = 3.0f;
        this.D = true;
        this.E = 0.1f;
        this.F = false;
        this.G = Paint.Style.STROKE;
        this.H = Paint.Style.FILL;
        this.I = 0x112234;
        this.J = 0x112234;
        this.K = 0x112234;
        this.L = 0x112234;
    }

    @Override  // t1.d
    public boolean B() {
        return this.D;
    }

    @Override  // t1.d
    public int H0() {
        return this.I;
    }

    @Override  // com.github.mikephil.charting.data.m
    protected void I1(Entry entry0) {
        this.a2(((CandleEntry)entry0));
    }

    @Override  // com.github.mikephil.charting.data.m
    protected void K1(Entry entry0) {
        this.b2(((CandleEntry)entry0));
    }

    @Override  // t1.d
    public float L0() {
        return this.C;
    }

    @Override  // com.github.mikephil.charting.data.m
    public m L1() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < this.s.size(); ++v) {
            arrayList0.add(((CandleEntry)this.s.get(v)).o());
        }
        m m0 = new j(arrayList0, "DataSet");
        this.c2(((j)m0));
        return m0;
    }

    @Override  // t1.d
    public Paint.Style R0() {
        return this.H;
    }

    @Override  // t1.d
    public Paint.Style S() {
        return this.G;
    }

    @Override  // t1.d
    public float T0() {
        return this.E;
    }

    protected void a2(CandleEntry candleEntry0) {
        if(candleEntry0.t() < this.u) {
            this.u = candleEntry0.t();
        }
        if(candleEntry0.s() > this.t) {
            this.t = candleEntry0.s();
        }
        this.J1(candleEntry0);
    }

    protected void b2(CandleEntry candleEntry0) {
        if(candleEntry0.s() < this.u) {
            this.u = candleEntry0.s();
        }
        if(candleEntry0.s() > this.t) {
            this.t = candleEntry0.s();
        }
        if(candleEntry0.t() < this.u) {
            this.u = candleEntry0.t();
        }
        if(candleEntry0.t() > this.t) {
            this.t = candleEntry0.t();
        }
    }

    protected void c2(j j0) {
        super.S1(j0);
        j0.C = this.C;
        j0.D = this.D;
        j0.E = this.E;
        j0.F = this.F;
        j0.x = this.x;
        j0.G = this.G;
        j0.H = this.H;
        j0.I = this.I;
        j0.J = this.J;
        j0.K = this.K;
        j0.L = this.L;
    }

    public void d2(float f) {
        if(f < 0.0f) {
            f = 0.0f;
        }
        if(f > 0.45f) {
            f = 0.45f;
        }
        this.E = f;
    }

    public void e2(int v) {
        this.K = v;
    }

    public void f2(Paint.Style paint$Style0) {
        this.H = paint$Style0;
    }

    public void g2(int v) {
        this.J = v;
    }

    public void h2(Paint.Style paint$Style0) {
        this.G = paint$Style0;
    }

    public void i2(int v) {
        this.I = v;
    }

    @Override  // t1.d
    public int j0() {
        return this.K;
    }

    public void j2(int v) {
        this.L = v;
    }

    @Override  // t1.d
    public int k1() {
        return this.L;
    }

    public void k2(boolean z) {
        this.F = z;
    }

    public void l2(float f) {
        this.C = k.e(f);
    }

    public void m2(boolean z) {
        this.D = z;
    }

    @Override  // t1.d
    public int y() {
        return this.J;
    }

    @Override  // t1.d
    public boolean y0() {
        return this.F;
    }
}

