package com.dcinside.app.span;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class f extends ReplacementSpan implements LineHeightSpan {
    private final int a;
    private final int b;
    private final int c;
    private final float d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public f(int v, int v1, int v2, float f, int v3, int v4, int v5, int v6) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = f;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
    }

    public f(int v, int v1, int v2, float f, int v3, int v4, int v5, int v6, int v7, w w0) {
        this(v, v1, ((v7 & 4) == 0 ? v2 : 16), ((v7 & 8) == 0 ? f : 0.0f), ((v7 & 16) == 0 ? v3 : 0), ((v7 & 0x20) == 0 ? v4 : 0), ((v7 & 0x40) == 0 ? v5 : 0), ((v7 & 0x80) == 0 ? v6 : 0));
    }

    @Override  // android.text.style.LineHeightSpan
    public void chooseHeight(@m CharSequence charSequence0, int v, int v1, int v2, int v3, @m Paint.FontMetricsInt paint$FontMetricsInt0) {
    }

    @Override  // android.text.style.ReplacementSpan
    public void draw(@l Canvas canvas0, @m CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, @l Paint paint0) {
        L.p(canvas0, "canvas");
        L.p(paint0, "paint");
        if(charSequence0 == null) {
            return;
        }
        paint0.setColor(this.a);
        float f1 = paint0.measureText(charSequence0, v, v1);
        canvas0.drawRoundRect(new RectF(f - ((float)this.g), ((float)v2) + ((float)this.e), f + f1 + ((float)(this.c * 2)) + ((float)this.g), ((float)v4) - ((float)this.f)), this.d, this.d, paint0);
        paint0.setColor(this.b);
        canvas0.drawText(charSequence0, v, v1, f + ((float)this.c), ((float)v3) - ((float)this.h), paint0);
    }

    @Override  // android.text.style.ReplacementSpan
    public int getSize(@l Paint paint0, @m CharSequence charSequence0, int v, int v1, @m Paint.FontMetricsInt paint$FontMetricsInt0) {
        L.p(paint0, "paint");
        float f = paint0.measureText(charSequence0, v, v1);
        return (int)(((float)this.c) + f + ((float)this.c));
    }
}

