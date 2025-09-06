package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.k.a;

public class d {
    private float a;
    private float b;
    private float c;
    private float d;
    private int e;
    private int f;
    private int g;
    private a h;
    private float i;
    private float j;

    public d(float f, float f1, float f2, float f3, int v, int v1, a k$a0) {
        this(f, f1, f2, f3, v, k$a0);
        this.g = v1;
    }

    public d(float f, float f1, float f2, float f3, int v, a k$a0) {
        this.e = -1;
        this.g = -1;
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.f = v;
        this.h = k$a0;
    }

    public d(float f, float f1, int v) {
        this.e = -1;
        this.g = -1;
        this.a = f;
        this.b = f1;
        this.f = v;
    }

    public d(float f, int v, int v1) {
        this(f, NaNf, v);
        this.g = v1;
    }

    public boolean a(d d0) {
        return d0 == null ? false : this.f == d0.f && this.a == d0.a && this.g == d0.g && this.e == d0.e;
    }

    public a b() {
        return this.h;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public float e() {
        return this.i;
    }

    public float f() {
        return this.j;
    }

    public int g() {
        return this.g;
    }

    public float h() {
        return this.a;
    }

    public float i() {
        return this.c;
    }

    public float j() {
        return this.b;
    }

    public float k() {
        return this.d;
    }

    public boolean l() {
        return this.g >= 0;
    }

    public void m(int v) {
        this.e = v;
    }

    public void n(float f, float f1) {
        this.i = f;
        this.j = f1;
    }

    @Override
    public String toString() {
        return "Highlight, x: " + this.a + ", y: " + this.b + ", dataSetIndex: " + this.f + ", stackIndex (only stacked barentry): " + this.g;
    }
}

