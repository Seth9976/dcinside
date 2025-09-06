package com.github.mikephil.charting.buffer;

public abstract class a {
    protected int a;
    public final float[] b;
    protected float c;
    protected float d;
    protected int e;
    protected int f;

    public a(int v) {
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0;
        this.f = 0;
        this.a = 0;
        this.b = new float[v];
    }

    public abstract void a(Object arg1);

    public void b(int v) {
        if(v < 0) {
            v = 0;
        }
        this.e = v;
    }

    public void c(int v) {
        if(v < 0) {
            v = 0;
        }
        this.f = v;
    }

    public void d() {
        this.a = 0;
    }

    public void e(float f, float f1) {
        this.c = f;
        this.d = f1;
    }

    public int f() {
        return this.b.length;
    }
}

