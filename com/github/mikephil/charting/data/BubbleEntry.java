package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
public class BubbleEntry extends Entry {
    private float e;

    public BubbleEntry(float f, float f1, float f2) {
        super(f, f1);
        this.e = f2;
    }

    public BubbleEntry(float f, float f1, float f2, Drawable drawable0) {
        super(f, f1, drawable0);
        this.e = f2;
    }

    public BubbleEntry(float f, float f1, float f2, Drawable drawable0, Object object0) {
        super(f, f1, drawable0, object0);
        this.e = f2;
    }

    public BubbleEntry(float f, float f1, float f2, Object object0) {
        super(f, f1, object0);
        this.e = f2;
    }

    @Override  // com.github.mikephil.charting.data.Entry
    public Entry h() {
        return this.o();
    }

    public BubbleEntry o() {
        float f = this.e;
        return new BubbleEntry(this.l(), this.d(), f, this.a());
    }

    public float q() {
        return this.e;
    }

    public void r(float f) {
        this.e = f;
    }
}

