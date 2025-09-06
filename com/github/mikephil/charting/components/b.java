package com.github.mikephil.charting.components;

import android.graphics.Typeface;
import com.github.mikephil.charting.utils.k;

public abstract class b {
    protected boolean a;
    protected float b;
    protected float c;
    protected Typeface d;
    protected float e;
    protected int f;

    public b() {
        this.a = true;
        this.b = 5.0f;
        this.c = 5.0f;
        this.d = null;
        this.e = k.e(10.0f);
        this.f = 0xFF000000;
    }

    public int a() {
        return this.f;
    }

    public float b() {
        return this.e;
    }

    public Typeface c() {
        return this.d;
    }

    public float d() {
        return this.b;
    }

    public float e() {
        return this.c;
    }

    public boolean f() {
        return this.a;
    }

    public void g(boolean z) {
        this.a = z;
    }

    public void h(int v) {
        this.f = v;
    }

    public void i(float f) {
        if(f > 24.0f) {
            f = 24.0f;
        }
        if(f < 6.0f) {
            f = 6.0f;
        }
        this.e = k.e(f);
    }

    public void j(Typeface typeface0) {
        this.d = typeface0;
    }

    public void k(float f) {
        this.b = k.e(f);
    }

    public void l(float f) {
        this.c = k.e(f);
    }
}

