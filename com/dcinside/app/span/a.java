package com.dcinside.app.span;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a extends ImageSpan {
    private final float a;

    public a(@l Drawable drawable0, float f) {
        L.p(drawable0, "drawable");
        super(drawable0);
        this.a = f;
    }

    public final float a() {
        return this.a;
    }

    @Override  // android.text.style.DynamicDrawableSpan
    public void draw(@l Canvas canvas0, @l CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, @l Paint paint0) {
        L.p(canvas0, "canvas");
        L.p(charSequence0, "text");
        L.p(paint0, "paint");
        canvas0.save();
        Rect rect0 = this.getDrawable().getBounds();
        L.o(rect0, "getBounds(...)");
        int v5 = rect0.height();
        int v6 = paint0.getFontMetricsInt().ascent;
        int v7 = paint0.getFontMetricsInt().descent;
        canvas0.translate(f, ((float)(v4 - this.getDrawable().getBounds().bottom)) + ((float)(v5 - v7 + v6)) / 2.0f + -this.a);
        this.getDrawable().draw(canvas0);
        canvas0.restore();
    }

    @Override  // android.text.style.DynamicDrawableSpan
    public int getSize(@l Paint paint0, @l CharSequence charSequence0, int v, int v1, @m Paint.FontMetricsInt paint$FontMetricsInt0) {
        L.p(paint0, "paint");
        L.p(charSequence0, "text");
        if(paint$FontMetricsInt0 != null) {
            Paint.FontMetricsInt paint$FontMetricsInt1 = paint0.getFontMetricsInt();
            paint$FontMetricsInt0.ascent = paint$FontMetricsInt1.ascent;
            paint$FontMetricsInt0.descent = paint$FontMetricsInt1.descent;
            paint$FontMetricsInt0.top = paint$FontMetricsInt1.top;
            paint$FontMetricsInt0.bottom = paint$FontMetricsInt1.bottom;
        }
        return this.getDrawable().getBounds().right;
    }
}

