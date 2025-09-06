package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.util.Log;
import com.github.mikephil.charting.formatter.l;
import com.github.mikephil.charting.utils.k;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends b {
    protected boolean A;
    protected boolean B;
    protected float C;
    protected float D;
    protected boolean E;
    protected boolean F;
    public float G;
    public float H;
    public float I;
    protected l g;
    private int h;
    private float i;
    private int j;
    private float k;
    public float[] l;
    public float[] m;
    public int n;
    public int o;
    private int p;
    protected float q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected boolean v;
    protected boolean w;
    private DashPathEffect x;
    private DashPathEffect y;
    protected List z;

    public a() {
        this.h = 0xFF888888;
        this.i = 1.0f;
        this.j = 0xFF888888;
        this.k = 1.0f;
        this.l = new float[0];
        this.m = new float[0];
        this.p = 6;
        this.q = 1.0f;
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = false;
        this.x = null;
        this.y = null;
        this.A = false;
        this.B = true;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = false;
        this.F = false;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0.0f;
        this.e = k.e(10.0f);
        this.b = k.e(5.0f);
        this.c = k.e(5.0f);
        this.z = new ArrayList();
    }

    public DashPathEffect A() {
        return this.y;
    }

    public float B() {
        return this.i;
    }

    public int C() {
        return this.p;
    }

    public List D() {
        return this.z;
    }

    public String E() [...] // 潜在的解密器

    public float F() {
        return this.D;
    }

    public float G() {
        return this.C;
    }

    public l H() {
        if(this.g == null || this.g instanceof com.github.mikephil.charting.formatter.b && ((com.github.mikephil.charting.formatter.b)this.g).l() != this.o) {
            this.g = new com.github.mikephil.charting.formatter.b(this.o);
        }
        return this.g;
    }

    public boolean I() {
        return this.x != null;
    }

    public boolean J() {
        return this.F;
    }

    public boolean K() {
        return this.E;
    }

    public boolean L() {
        return this.w && this.n > 0;
    }

    public boolean M() {
        return this.u;
    }

    public boolean N() {
        return this.B;
    }

    public boolean O() {
        return this.t;
    }

    public boolean P() {
        return this.v;
    }

    public boolean Q() {
        return this.A;
    }

    public boolean R() {
        return this.s;
    }

    public boolean S() {
        return this.r;
    }

    public boolean T() {
        return this.y != null;
    }

    public void U() {
        this.z.clear();
    }

    public void V(g g0) {
        this.z.remove(g0);
    }

    public void W() {
        this.F = false;
    }

    public void X() {
        this.E = false;
    }

    public void Y(int v) {
        this.j = v;
    }

    public void Z(DashPathEffect dashPathEffect0) {
        this.x = dashPathEffect0;
    }

    public void a0(float f) {
        this.k = k.e(f);
    }

    @Deprecated
    public void b0(float f) {
        this.c0(f);
    }

    public void c0(float f) {
        this.F = true;
        this.G = f;
        this.I = Math.abs(f - this.H);
    }

    @Deprecated
    public void d0(float f) {
        this.e0(f);
    }

    public void e0(float f) {
        this.E = true;
        this.H = f;
        this.I = Math.abs(this.G - f);
    }

    public void f0(boolean z) {
        this.w = z;
    }

    public void g0(boolean z) {
        this.u = z;
    }

    public void h0(boolean z) {
        this.t = z;
    }

    public void i0(boolean z) {
        this.B = z;
    }

    public void j0(boolean z) {
        this.v = z;
    }

    public void k0(boolean z) {
        this.A = z;
    }

    public void l0(float f) {
        this.q = f;
        this.r = true;
    }

    public void m(g g0) {
        this.z.add(g0);
        if(this.z.size() > 6) {
            Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
        }
    }

    public void m0(boolean z) {
        this.r = z;
    }

    public void n(float f, float f1) {
        float f2 = this.E ? this.H : f - this.C;
        float f3 = this.F ? this.G : f1 + this.D;
        if(Math.abs(f3 - f2) == 0.0f) {
            ++f3;
            --f2;
        }
        this.H = f2;
        this.G = f3;
        this.I = Math.abs(f3 - f2);
    }

    public void n0(int v) {
        this.h = v;
    }

    public void o() {
        this.x = null;
    }

    public void o0(DashPathEffect dashPathEffect0) {
        this.y = dashPathEffect0;
    }

    public void p() {
        this.y = null;
    }

    public void p0(float f) {
        this.i = k.e(f);
    }

    public void q(float f, float f1, float f2) {
        this.x = new DashPathEffect(new float[]{f, f1}, f2);
    }

    public void q0(int v) {
        if(v > 25) {
            v = 25;
        }
        if(v < 2) {
            v = 2;
        }
        this.p = v;
        this.s = false;
    }

    public void r(float f, float f1, float f2) {
        this.y = new DashPathEffect(new float[]{f, f1}, f2);
    }

    public void r0(int v, boolean z) {
        this.q0(v);
        this.s = z;
    }

    public int s() {
        return this.j;
    }

    public void s0(float f) {
        this.D = f;
    }

    public DashPathEffect t() {
        return this.x;
    }

    public void t0(float f) {
        this.C = f;
    }

    public float u() {
        return this.k;
    }

    public void u0(l l0) {
        if(l0 == null) {
            this.g = new com.github.mikephil.charting.formatter.b(this.o);
            return;
        }
        this.g = l0;
    }

    public float v() {
        return this.G;
    }

    public float w() {
        return this.H;
    }

    public String x(int v) {
        return v < 0 || v >= this.l.length ? "" : this.H().c(this.l[v], this);
    }

    public float y() {
        return this.q;
    }

    public int z() {
        return this.h;
    }
}

