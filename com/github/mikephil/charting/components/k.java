package com.github.mikephil.charting.components;

import android.graphics.Paint;

public class k extends a {
    public static enum com.github.mikephil.charting.components.k.a {
        LEFT,
        RIGHT;

    }

    public static enum b {
        OUTSIDE_CHART,
        INSIDE_CHART;

    }

    private boolean J;
    private boolean K;
    protected boolean L;
    protected boolean M;
    private boolean N;
    private boolean O;
    protected int P;
    protected float Q;
    protected float R;
    protected float S;
    private b T;
    private com.github.mikephil.charting.components.k.a U;
    protected float V;
    protected float W;

    public k() {
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 0xFF888888;
        this.Q = 1.0f;
        this.R = 10.0f;
        this.S = 10.0f;
        this.T = b.a;
        this.V = 0.0f;
        this.W = Infinityf;
        this.U = com.github.mikephil.charting.components.k.a.a;
        this.c = 0.0f;
    }

    public k(com.github.mikephil.charting.components.k.a k$a0) {
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 0xFF888888;
        this.Q = 1.0f;
        this.R = 10.0f;
        this.S = 10.0f;
        this.T = b.a;
        this.V = 0.0f;
        this.W = Infinityf;
        this.U = k$a0;
        this.c = 0.0f;
    }

    public float A0(Paint paint0) {
        paint0.setTextSize(this.e);
        float f = ((float)com.github.mikephil.charting.utils.k.d(paint0, "")) + this.d() * 2.0f;
        float f1 = this.y0();
        float f2 = this.x0();
        if(f1 > 0.0f) {
            f1 = com.github.mikephil.charting.utils.k.e(f1);
        }
        if(f2 > 0.0f && f2 != Infinityf) {
            f2 = com.github.mikephil.charting.utils.k.e(f2);
        }
        if(((double)f2) <= 0.0) {
            f2 = f;
        }
        return Math.max(f1, Math.min(f, f2));
    }

    public float B0() {
        return this.S;
    }

    public float C0() {
        return this.R;
    }

    public int D0() {
        return this.P;
    }

    public float E0() {
        return this.Q;
    }

    public boolean F0() {
        return this.J;
    }

    public boolean G0() {
        return this.K;
    }

    public boolean H0() {
        return this.M;
    }

    public boolean I0() {
        return this.L;
    }

    @Deprecated
    public boolean J0() {
        return this.O;
    }

    @Deprecated
    public boolean K0() {
        return this.N;
    }

    // 去混淆评级： 低(20)
    public boolean L0() {
        return this.f() && this.P() && this.w0() == b.a;
    }

    public void M0(boolean z) {
        this.K = z;
    }

    public void N0(boolean z) {
        this.M = z;
    }

    public void O0(boolean z) {
        this.L = z;
    }

    public void P0(float f) {
        this.W = f;
    }

    public void Q0(float f) {
        this.V = f;
    }

    public void R0(b k$b0) {
        this.T = k$b0;
    }

    public void S0(float f) {
        this.S = f;
    }

    public void T0(float f) {
        this.R = f;
    }

    @Deprecated
    public void U0(boolean z) {
        if(z) {
            this.e0(0.0f);
            return;
        }
        this.X();
    }

    @Deprecated
    public void V0(boolean z) {
        this.O = z;
    }

    @Deprecated
    public void W0(boolean z) {
        this.N = z;
    }

    public void X0(int v) {
        this.P = v;
    }

    public void Y0(float f) {
        this.Q = com.github.mikephil.charting.utils.k.e(f);
    }

    @Override  // com.github.mikephil.charting.components.a
    public void n(float f, float f1) {
        if(Math.abs(f1 - f) == 0.0f) {
            ++f1;
            --f;
        }
        float f2 = Math.abs(f1 - f);
        this.H = this.E ? this.H : f - f2 / 100.0f * this.B0();
        float f3 = this.F ? this.G : f1 + f2 / 100.0f * this.C0();
        this.G = f3;
        this.I = Math.abs(this.H - f3);
    }

    public com.github.mikephil.charting.components.k.a v0() {
        return this.U;
    }

    public b w0() {
        return this.T;
    }

    public float x0() {
        return this.W;
    }

    public float y0() {
        return this.V;
    }

    public float z0(Paint paint0) {
        paint0.setTextSize(this.e);
        return ((float)com.github.mikephil.charting.utils.k.a(paint0, "")) + this.e() * 2.0f;
    }
}

