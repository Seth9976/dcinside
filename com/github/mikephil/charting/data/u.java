package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;
import t1.j;

public class u extends p implements j {
    protected boolean H;
    protected int I;
    protected int J;
    protected int K;
    protected float L;
    protected float M;
    protected float N;

    public u(List list0, String s) {
        super(list0, s);
        this.H = false;
        this.I = -1;
        this.J = 0x112233;
        this.K = 76;
        this.L = 3.0f;
        this.M = 4.0f;
        this.N = 2.0f;
    }

    @Override  // t1.j
    public int G() {
        return this.K;
    }

    @Override  // t1.j
    public float G0() {
        return this.N;
    }

    @Override  // t1.j
    public float J0() {
        return this.L;
    }

    @Override  // com.github.mikephil.charting.data.m
    public m L1() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < this.s.size(); ++v) {
            arrayList0.add(((RadarEntry)this.s.get(v)).o());
        }
        m m0 = new u(arrayList0, "DataSet");
        this.f2(((u)m0));
        return m0;
    }

    @Override  // t1.j
    public boolean N0() {
        return this.H;
    }

    @Override  // t1.j
    public void W(boolean z) {
        this.H = z;
    }

    @Override  // t1.j
    public int c() {
        return this.I;
    }

    protected void f2(u u0) {
        super.a2(u0);
        u0.H = this.H;
        u0.I = this.I;
        u0.L = this.L;
        u0.K = this.K;
        u0.J = this.J;
        u0.N = this.N;
    }

    public void g2(int v) {
        this.I = v;
    }

    public void h2(float f) {
        this.L = f;
    }

    public void i2(float f) {
        this.M = f;
    }

    public void j2(int v) {
        this.K = v;
    }

    public void k2(int v) {
        this.J = v;
    }

    public void l2(float f) {
        this.N = f;
    }

    @Override  // t1.j
    public int m0() {
        return this.J;
    }

    @Override  // t1.j
    public float q0() {
        return this.M;
    }
}

