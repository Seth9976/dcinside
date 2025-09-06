package com.github.mikephil.charting.components;

import com.github.mikephil.charting.utils.k;

public class j extends a {
    public static enum com.github.mikephil.charting.components.j.a {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE;

    }

    public int J;
    public int K;
    public int L;
    public int M;
    protected float N;
    private boolean O;
    private com.github.mikephil.charting.components.j.a P;

    public j() {
        this.J = 1;
        this.K = 1;
        this.L = 1;
        this.M = 1;
        this.N = 0.0f;
        this.O = false;
        this.P = com.github.mikephil.charting.components.j.a.a;
        this.c = k.e(4.0f);
    }

    public void A0(com.github.mikephil.charting.components.j.a j$a0) {
        this.P = j$a0;
    }

    public float v0() {
        return this.N;
    }

    public com.github.mikephil.charting.components.j.a w0() {
        return this.P;
    }

    public boolean x0() {
        return this.O;
    }

    public void y0(boolean z) {
        this.O = z;
    }

    public void z0(float f) {
        this.N = f;
    }
}

