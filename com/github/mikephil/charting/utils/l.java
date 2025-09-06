package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

public class l {
    protected final Matrix a;
    protected RectF b;
    protected float c;
    protected float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    protected float[] o;
    protected Matrix p;
    protected final float[] q;

    public l() {
        this.a = new Matrix();
        this.b = new RectF();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 1.0f;
        this.f = 3.402823E+38f;
        this.g = 1.0f;
        this.h = 3.402823E+38f;
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = new float[9];
        this.p = new Matrix();
        this.q = new float[9];
    }

    public float A() {
        return this.l;
    }

    public boolean B() {
        return this.d > 0.0f && this.c > 0.0f;
    }

    public boolean C() {
        return this.m <= 0.0f && this.n <= 0.0f;
    }

    // 去混淆评级： 低(20)
    public boolean D() {
        return this.E() && this.F();
    }

    public boolean E() {
        return this.i <= this.g && this.g <= 1.0f;
    }

    public boolean F() {
        return this.j <= this.e && this.e <= 1.0f;
    }

    // 去混淆评级： 低(20)
    public boolean G(float f, float f1) {
        return this.L(f) && this.M(f1);
    }

    public boolean H(float f) {
        return this.b.bottom >= ((float)(((int)(f * 100.0f)))) / 100.0f;
    }

    public boolean I(float f) {
        return this.b.left <= f + 1.0f;
    }

    public boolean J(float f) {
        return this.b.right >= ((float)(((int)(f * 100.0f)))) / 100.0f - 1.0f;
    }

    public boolean K(float f) {
        return this.b.top <= f;
    }

    // 去混淆评级： 低(20)
    public boolean L(float f) {
        return this.I(f) && this.J(f);
    }

    // 去混淆评级： 低(20)
    public boolean M(float f) {
        return this.K(f) && this.H(f);
    }

    public void N(Matrix matrix0, RectF rectF0) {
        float f4;
        float f3;
        matrix0.getValues(this.q);
        float f = this.q[2];
        float f1 = this.q[0];
        float f2 = this.q[5];
        this.i = Math.min(Math.max(this.g, f1), this.h);
        this.j = Math.min(Math.max(this.e, this.q[4]), this.f);
        if(rectF0 == null) {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        else {
            f3 = rectF0.width();
            f4 = rectF0.height();
        }
        this.k = Math.min(Math.max(f, -f3 * (this.i - 1.0f) - this.m), this.m);
        float f5 = Math.max(Math.min(f2, f4 * (this.j - 1.0f) + this.n), -this.n);
        this.l = f5;
        this.q[2] = this.k;
        this.q[0] = this.i;
        this.q[5] = f5;
        this.q[4] = this.j;
        matrix0.setValues(this.q);
    }

    public float O() {
        return this.d - this.b.bottom;
    }

    public float P() {
        return this.b.left;
    }

    public float Q() {
        return this.c - this.b.right;
    }

    public float R() {
        return this.b.top;
    }

    public Matrix S(Matrix matrix0, View view0, boolean z) {
        this.a.set(matrix0);
        this.N(this.a, this.b);
        if(z) {
            view0.invalidate();
        }
        matrix0.set(this.a);
        return matrix0;
    }

    public void T(Matrix matrix0) {
        matrix0.reset();
        matrix0.set(this.a);
        matrix0.postScale(1.0f, 1.0f, 0.0f, 0.0f);
    }

    public void U(float f, float f1, float f2, float f3) {
        this.b.set(f, f1, this.c - f2, this.d - f3);
    }

    public void V(float f, float f1) {
        this.d = f1;
        this.c = f;
        this.U(this.P(), this.R(), this.Q(), this.O());
    }

    public void W(float f) {
        this.m = k.e(f);
    }

    public void X(float f) {
        this.n = k.e(f);
    }

    public void Y(float f) {
        if(f == 0.0f) {
            f = 3.402823E+38f;
        }
        this.h = f;
        this.N(this.a, this.b);
    }

    public void Z(float f) {
        if(f == 0.0f) {
            f = 3.402823E+38f;
        }
        this.f = f;
        this.N(this.a, this.b);
    }

    public boolean a() {
        return this.i < this.h;
    }

    public void a0(float f, float f1) {
        if(f < 1.0f) {
            f = 1.0f;
        }
        if(f1 == 0.0f) {
            f1 = 3.402823E+38f;
        }
        this.g = f;
        this.h = f1;
        this.N(this.a, this.b);
    }

    public boolean b() {
        return this.j < this.f;
    }

    public void b0(float f, float f1) {
        if(f < 1.0f) {
            f = 1.0f;
        }
        if(f1 == 0.0f) {
            f1 = 3.402823E+38f;
        }
        this.e = f;
        this.f = f1;
        this.N(this.a, this.b);
    }

    public boolean c() {
        return this.i > this.g;
    }

    public void c0(float f) {
        if(f < 1.0f) {
            f = 1.0f;
        }
        this.g = f;
        this.N(this.a, this.b);
    }

    public boolean d() {
        return this.j > this.e;
    }

    public void d0(float f) {
        if(f < 1.0f) {
            f = 1.0f;
        }
        this.e = f;
        this.N(this.a, this.b);
    }

    public void e(float[] arr_f, View view0) {
        Matrix matrix0 = this.p;
        matrix0.reset();
        matrix0.set(this.a);
        matrix0.postTranslate(-(arr_f[0] - this.P()), -(arr_f[1] - this.R()));
        this.S(matrix0, view0, true);
    }

    public Matrix e0(float f, float f1) {
        Matrix matrix0 = new Matrix();
        this.g0(f, f1, matrix0);
        return matrix0;
    }

    public float f() {
        return this.b.bottom;
    }

    public Matrix f0(float f, float f1, float f2, float f3) {
        Matrix matrix0 = new Matrix();
        matrix0.set(this.a);
        matrix0.setScale(f, f1, f2, f3);
        return matrix0;
    }

    public float g() {
        return this.b.height();
    }

    public void g0(float f, float f1, Matrix matrix0) {
        matrix0.reset();
        matrix0.set(this.a);
        matrix0.setScale(f, f1);
    }

    public float h() {
        return this.b.left;
    }

    public Matrix h0(float[] arr_f) {
        Matrix matrix0 = new Matrix();
        this.i0(arr_f, matrix0);
        return matrix0;
    }

    public float i() {
        return this.b.right;
    }

    public void i0(float[] arr_f, Matrix matrix0) {
        matrix0.reset();
        matrix0.set(this.a);
        matrix0.postTranslate(-(arr_f[0] - this.P()), -(arr_f[1] - this.R()));
    }

    public float j() {
        return this.b.top;
    }

    public Matrix j0(float f, float f1) {
        Matrix matrix0 = new Matrix();
        this.m0(f, f1, matrix0);
        return matrix0;
    }

    public float k() {
        return this.b.width();
    }

    public Matrix k0(float f, float f1, float f2, float f3) {
        Matrix matrix0 = new Matrix();
        this.l0(f, f1, f2, f3, matrix0);
        return matrix0;
    }

    public Matrix l() {
        Matrix matrix0 = new Matrix();
        this.m(matrix0);
        return matrix0;
    }

    public void l0(float f, float f1, float f2, float f3, Matrix matrix0) {
        matrix0.reset();
        matrix0.set(this.a);
        matrix0.postScale(f, f1, f2, f3);
    }

    public void m(Matrix matrix0) {
        this.g = 1.0f;
        this.e = 1.0f;
        matrix0.set(this.a);
        float[] arr_f = this.o;
        for(int v = 0; v < 9; ++v) {
            arr_f[v] = 0.0f;
        }
        matrix0.getValues(arr_f);
        arr_f[2] = 0.0f;
        arr_f[5] = 0.0f;
        arr_f[0] = 1.0f;
        arr_f[4] = 1.0f;
        matrix0.setValues(arr_f);
    }

    public void m0(float f, float f1, Matrix matrix0) {
        matrix0.reset();
        matrix0.set(this.a);
        matrix0.postScale(f, f1);
    }

    public float n() {
        return this.d;
    }

    public Matrix n0(float f, float f1) {
        Matrix matrix0 = new Matrix();
        this.o0(f, f1, matrix0);
        return matrix0;
    }

    public float o() {
        return this.c;
    }

    public void o0(float f, float f1, Matrix matrix0) {
        matrix0.reset();
        matrix0.set(this.a);
        matrix0.postScale(1.4f, 1.4f, f, f1);
    }

    public g p() {
        return g.c(this.b.centerX(), this.b.centerY());
    }

    public Matrix p0(float f, float f1) {
        Matrix matrix0 = new Matrix();
        this.q0(f, f1, matrix0);
        return matrix0;
    }

    public RectF q() {
        return this.b;
    }

    public void q0(float f, float f1, Matrix matrix0) {
        matrix0.reset();
        matrix0.set(this.a);
        matrix0.postScale(0.7f, 0.7f, f, f1);
    }

    public Matrix r() {
        return this.a;
    }

    public float s() {
        return this.h;
    }

    public float t() {
        return this.f;
    }

    public float u() {
        return this.g;
    }

    public float v() {
        return this.e;
    }

    public float w() {
        return this.i;
    }

    public float x() {
        return this.j;
    }

    public float y() {
        return Math.min(this.b.width(), this.b.height());
    }

    public float z() {
        return this.k;
    }
}

