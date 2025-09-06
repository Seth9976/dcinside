package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

@SuppressLint({"ParcelCreator"})
public class RadarEntry extends Entry {
    public RadarEntry(float f) {
        super(0.0f, f);
    }

    public RadarEntry(float f, Object object0) {
        super(0.0f, f, object0);
    }

    @Override  // com.github.mikephil.charting.data.Entry
    public Entry h() {
        return this.o();
    }

    @Override  // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float l() {
        return super.l();
    }

    @Override  // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void m(float f) {
        super.m(f);
    }

    public RadarEntry o() {
        return new RadarEntry(this.d(), this.a());
    }

    public float q() {
        return this.d();
    }
}

