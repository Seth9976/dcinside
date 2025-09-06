package com.github.mikephil.charting.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint.Style;
import com.github.mikephil.charting.utils.k;

public class g extends b {
    public static enum a {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM;

    }

    private float g;
    private float h;
    private int i;
    private Paint.Style j;
    private String k;
    private DashPathEffect l;
    private a m;

    public g(float f) {
        this.g = 0.0f;
        this.h = 2.0f;
        this.i = Color.rgb(0xED, 91, 91);
        this.j = Paint.Style.FILL_AND_STROKE;
        this.k = "";
        this.l = null;
        this.m = a.c;
        this.g = f;
    }

    public g(float f, String s) {
        this.g = 0.0f;
        this.h = 2.0f;
        this.i = Color.rgb(0xED, 91, 91);
        this.j = Paint.Style.FILL_AND_STROKE;
        this.l = null;
        this.m = a.c;
        this.g = f;
        this.k = s;
    }

    public void A(Paint.Style paint$Style0) {
        this.j = paint$Style0;
    }

    public void m() {
        this.l = null;
    }

    public void n(float f, float f1, float f2) {
        this.l = new DashPathEffect(new float[]{f, f1}, f2);
    }

    public DashPathEffect o() {
        return this.l;
    }

    public String p() {
        return this.k;
    }

    public a q() {
        return this.m;
    }

    public float r() {
        return this.g;
    }

    public int s() {
        return this.i;
    }

    public float t() {
        return this.h;
    }

    public Paint.Style u() {
        return this.j;
    }

    public boolean v() {
        return this.l != null;
    }

    public void w(String s) {
        this.k = s;
    }

    public void x(a g$a0) {
        this.m = g$a0;
    }

    public void y(int v) {
        this.i = v;
    }

    public void z(float f) {
        if(f < 0.2f) {
            f = 0.2f;
        }
        if(f > 12.0f) {
            f = 12.0f;
        }
        this.h = k.e(f);
    }
}

