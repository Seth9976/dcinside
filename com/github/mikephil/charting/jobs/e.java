package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.h.a;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

public abstract class e extends a implements Runnable {
    protected float[] c;
    protected l d;
    protected float e;
    protected float f;
    protected i g;
    protected View h;

    public e(l l0, float f, float f1, i i0, View view0) {
        this.c = new float[2];
        this.d = l0;
        this.e = f;
        this.f = f1;
        this.g = i0;
        this.h = view0;
    }

    public float b() {
        return this.e;
    }

    public float c() {
        return this.f;
    }
}

