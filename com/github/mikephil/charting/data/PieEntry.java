package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.util.Log;

@SuppressLint({"ParcelCreator"})
public class PieEntry extends Entry {
    private String e;

    public PieEntry(float f) {
        super(0.0f, f);
    }

    public PieEntry(float f, Drawable drawable0) {
        super(0.0f, f, drawable0);
    }

    public PieEntry(float f, Drawable drawable0, Object object0) {
        super(0.0f, f, drawable0, object0);
    }

    public PieEntry(float f, Object object0) {
        super(0.0f, f, object0);
    }

    public PieEntry(float f, String s) {
        super(0.0f, f);
        this.e = s;
    }

    public PieEntry(float f, String s, Drawable drawable0) {
        super(0.0f, f, drawable0);
        this.e = s;
    }

    public PieEntry(float f, String s, Drawable drawable0, Object object0) {
        super(0.0f, f, drawable0, object0);
        this.e = s;
    }

    public PieEntry(float f, String s, Object object0) {
        super(0.0f, f, object0);
        this.e = s;
    }

    @Override  // com.github.mikephil.charting.data.Entry
    public Entry h() {
        return this.o();
    }

    @Override  // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float l() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.l();
    }

    @Override  // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void m(float f) {
        super.m(f);
        Log.i("DEPRECATED", "Pie entries do not have x values");
    }

    public PieEntry o() {
        String s = this.e;
        return new PieEntry(this.d(), s, this.a());
    }

    public String q() {
        return this.e;
    }

    public float r() {
        return this.d();
    }

    public void s(String s) {
        this.e = s;
    }
}

