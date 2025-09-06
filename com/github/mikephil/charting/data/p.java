package com.github.mikephil.charting.data;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.k;
import java.util.List;
import t1.g;

public abstract class p extends q implements g {
    private int C;
    protected Drawable D;
    private int E;
    private float F;
    private boolean G;

    public p(List list0, String s) {
        super(list0, s);
        this.C = Color.rgb(140, 0xEA, 0xFF);
        this.E = 85;
        this.F = 2.5f;
        this.G = false;
    }

    @Override  // t1.g
    public int F() {
        return this.C;
    }

    @Override  // t1.g
    public boolean V0() {
        return this.G;
    }

    protected void a2(p p0) {
        super.S1(p0);
        p0.G = this.G;
        p0.E = this.E;
        p0.C = this.C;
        p0.D = this.D;
        p0.F = this.F;
    }

    public void b2(int v) {
        this.E = v;
    }

    @Override  // t1.g
    public void c1(boolean z) {
        this.G = z;
    }

    public void c2(int v) {
        this.C = v;
        this.D = null;
    }

    @TargetApi(18)
    public void d2(Drawable drawable0) {
        this.D = drawable0;
    }

    public void e2(float f) {
        if(f < 0.0f) {
            f = 0.0f;
        }
        if(f > 10.0f) {
            f = 10.0f;
        }
        this.F = k.e(f);
    }

    @Override  // t1.g
    public Drawable j() {
        return this.D;
    }

    @Override  // t1.g
    public int k0() {
        return this.E;
    }

    @Override  // t1.g
    public float n0() {
        return this.F;
    }
}

