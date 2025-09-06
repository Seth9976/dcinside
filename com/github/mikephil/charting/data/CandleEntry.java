package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
public class CandleEntry extends Entry {
    private float e;
    private float f;
    private float g;
    private float h;

    public CandleEntry(float f, float f1, float f2, float f3, float f4) {
        super(f, (f1 + f2) / 2.0f);
        this.e = f1;
        this.f = f2;
        this.h = f3;
        this.g = f4;
    }

    public CandleEntry(float f, float f1, float f2, float f3, float f4, Drawable drawable0) {
        super(f, (f1 + f2) / 2.0f, drawable0);
        this.e = f1;
        this.f = f2;
        this.h = f3;
        this.g = f4;
    }

    public CandleEntry(float f, float f1, float f2, float f3, float f4, Drawable drawable0, Object object0) {
        super(f, (f1 + f2) / 2.0f, drawable0, object0);
        this.e = f1;
        this.f = f2;
        this.h = f3;
        this.g = f4;
    }

    public CandleEntry(float f, float f1, float f2, float f3, float f4, Object object0) {
        super(f, (f1 + f2) / 2.0f, object0);
        this.e = f1;
        this.f = f2;
        this.h = f3;
        this.g = f4;
    }

    @Override  // com.github.mikephil.charting.data.f
    public float d() {
        return super.d();
    }

    @Override  // com.github.mikephil.charting.data.Entry
    public Entry h() {
        return this.o();
    }

    public CandleEntry o() {
        float f = this.e;
        float f1 = this.f;
        float f2 = this.h;
        float f3 = this.g;
        return new CandleEntry(this.l(), f, f1, f2, f3, this.a());
    }

    public float q() {
        return Math.abs(this.h - this.g);
    }

    public float r() {
        return this.g;
    }

    public float s() {
        return this.e;
    }

    public float t() {
        return this.f;
    }

    public float u() {
        return this.h;
    }

    public float v() {
        return Math.abs(this.e - this.f);
    }

    public void w(float f) {
        this.g = f;
    }

    public void x(float f) {
        this.e = f;
    }

    public void y(float f) {
        this.f = f;
    }

    public void z(float f) {
        this.h = f;
    }
}

