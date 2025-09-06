package com.facebook.widget.text.span;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class a extends ReplacementSpan {
    @Retention(RetentionPolicy.SOURCE)
    public @interface com.facebook.widget.text.span.a.a {
    }

    protected int a;
    protected int b;
    private Rect c;
    private final int d;
    private final Paint.FontMetricsInt e;
    private final Drawable f;
    private final Rect g;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;

    public a(Drawable drawable0) {
        this(drawable0, 1);
    }

    public a(Drawable drawable0, int v) {
        this(drawable0, v, new Rect());
    }

    public a(Drawable drawable0, int v, Rect rect0) {
        this.e = new Paint.FontMetricsInt();
        this.f = drawable0;
        this.d = v;
        this.g = rect0;
        this.h();
    }

    protected int a(Paint.FontMetricsInt paint$FontMetricsInt0) {
        int v2;
        int v = this.e(paint$FontMetricsInt0.ascent, paint$FontMetricsInt0.descent);
        int v1 = this.b + v;
        if(this.d == 2) {
            v2 = v - this.g.top;
            v1 += this.g.bottom;
        }
        else {
            v2 = v - this.g.top;
        }
        this.i(paint$FontMetricsInt0, v2, v1);
        return this.a;
    }

    public Drawable b() {
        return this.f;
    }

    protected int c(int v, int v1, int v2, int v3, int v4) {
        return v + this.e(this.e.ascent, this.e.descent);
    }

    public Rect d() {
        return this.g;
    }

    @Override  // android.text.style.ReplacementSpan
    public void draw(Canvas canvas0, CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, Paint paint0) {
        paint0.getFontMetricsInt(this.e);
        int v5 = this.c(v3, this.e.ascent, this.e.descent, v2, v4);
        float f1 = f + ((float)this.g.left);
        canvas0.translate(f1, ((float)v5));
        this.f.draw(canvas0);
        canvas0.translate(-f1, ((float)(-v5)));
    }

    protected int e(int v, int v1) {
        switch(this.d) {
            case 0: {
                return v1 - this.b - this.g.bottom;
            }
            case 2: {
                return v + (v1 - v + this.g.top + this.g.bottom - this.b) / 2 - this.g.bottom;
            }
            default: {
                return -this.b - this.g.bottom;
            }
        }
    }

    public int f() {
        return this.d;
    }

    public static final int g(int v) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 2: {
                return 2;
            }
            default: {
                return 1;
            }
        }
    }

    @Override  // android.text.style.ReplacementSpan
    public int getSize(Paint paint0, CharSequence charSequence0, int v, int v1, @Nullable Paint.FontMetricsInt paint$FontMetricsInt0) {
        this.h();
        return paint$FontMetricsInt0 == null ? this.a : this.a(paint$FontMetricsInt0);
    }

    public void h() {
        Rect rect0 = this.f.getBounds();
        this.c = rect0;
        this.a = rect0.width() + this.g.left + this.g.right;
        this.b = this.c.height();
    }

    protected void i(Paint.FontMetricsInt paint$FontMetricsInt0, int v, int v1) {
        if(v < paint$FontMetricsInt0.ascent) {
            paint$FontMetricsInt0.ascent = v;
        }
        if(v < paint$FontMetricsInt0.top) {
            paint$FontMetricsInt0.top = v;
        }
        if(v1 > paint$FontMetricsInt0.descent) {
            paint$FontMetricsInt0.descent = v1;
        }
        if(v1 > paint$FontMetricsInt0.bottom) {
            paint$FontMetricsInt0.bottom = v1;
        }
    }
}

