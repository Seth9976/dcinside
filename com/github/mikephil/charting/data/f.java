package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

public abstract class f {
    private float a;
    private Object b;
    private Drawable c;

    public f() {
        this.a = 0.0f;
        this.b = null;
        this.c = null;
    }

    public f(float f) {
        this.b = null;
        this.c = null;
        this.a = f;
    }

    public f(float f, Drawable drawable0) {
        this(f);
        this.c = drawable0;
    }

    public f(float f, Drawable drawable0, Object object0) {
        this(f);
        this.c = drawable0;
        this.b = object0;
    }

    public f(float f, Object object0) {
        this(f);
        this.b = object0;
    }

    public Object a() {
        return this.b;
    }

    public Drawable c() {
        return this.c;
    }

    public float d() {
        return this.a;
    }

    public void e(Object object0) {
        this.b = object0;
    }

    public void f(Drawable drawable0) {
        this.c = drawable0;
    }

    public void g(float f) {
        this.a = f;
    }
}

