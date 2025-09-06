package com.github.mikephil.charting.components;

import android.graphics.Paint.Align;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.k;

public class c extends b {
    private String g;
    private g h;
    private Paint.Align i;

    public c() {
        this.g = "Description Label";
        this.i = Paint.Align.RIGHT;
        this.e = k.e(8.0f);
    }

    public g m() {
        return this.h;
    }

    public String n() [...] // 潜在的解密器

    public Paint.Align o() {
        return this.i;
    }

    public void p(float f, float f1) {
        g g0 = this.h;
        if(g0 == null) {
            this.h = g.c(f, f1);
            return;
        }
        g0.c = f;
        g0.d = f1;
    }

    public void q(String s) {
        this.g = s;
    }

    public void r(Paint.Align paint$Align0) {
        this.i = paint$Align0;
    }
}

