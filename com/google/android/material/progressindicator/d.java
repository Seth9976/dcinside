package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.color.v;

final class d extends h {
    private float b;
    private float c;
    private float d;
    private boolean e;
    @FloatRange(from = 0.0, to = 1.0)
    private float f;
    private static final float g = 0.01f;

    d(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec0) {
        super(circularProgressIndicatorSpec0);
    }

    @Override  // com.google.android.material.progressindicator.h
    void a(@NonNull Canvas canvas0, @NonNull Rect rect0, @FloatRange(from = 0.0, to = 1.0) float f, boolean z, boolean z1) {
        float f1 = ((float)rect0.width()) / ((float)this.f());
        float f2 = ((float)rect0.height()) / ((float)this.e());
        float f3 = ((float)((CircularProgressIndicatorSpec)this.a).h) / 2.0f + ((float)((CircularProgressIndicatorSpec)this.a).i);
        canvas0.translate(f3 * f1 + ((float)rect0.left), f3 * f2 + ((float)rect0.top));
        canvas0.rotate(-90.0f);
        canvas0.scale(f1, f2);
        if(((CircularProgressIndicatorSpec)this.a).j != 0) {
            canvas0.scale(1.0f, -1.0f);
        }
        canvas0.clipRect(-f3, -f3, f3, f3);
        c c0 = this.a;
        this.e = ((CircularProgressIndicatorSpec)c0).a / 2 <= ((CircularProgressIndicatorSpec)c0).b;
        this.b = ((float)((CircularProgressIndicatorSpec)c0).a) * f;
        this.c = ((float)Math.min(((CircularProgressIndicatorSpec)c0).a / 2, ((CircularProgressIndicatorSpec)c0).b)) * f;
        c c1 = this.a;
        float f4 = ((float)(((CircularProgressIndicatorSpec)c1).h - ((CircularProgressIndicatorSpec)c1).a)) / 2.0f;
        this.d = f4;
        if(z || z1) {
            if(z && ((CircularProgressIndicatorSpec)c1).e == 2 || z1 && ((CircularProgressIndicatorSpec)c1).f == 1) {
                this.d = f4 + (1.0f - f) * ((float)((CircularProgressIndicatorSpec)c1).a) / 2.0f;
            }
            else if(z && ((CircularProgressIndicatorSpec)c1).e == 1 || z1 && ((CircularProgressIndicatorSpec)c1).f == 2) {
                this.d = f4 - (1.0f - f) * ((float)((CircularProgressIndicatorSpec)c1).a) / 2.0f;
            }
        }
        if(z1 && ((CircularProgressIndicatorSpec)c1).f == 3) {
            this.f = f;
            return;
        }
        this.f = 1.0f;
    }

    @Override  // com.google.android.material.progressindicator.h
    void b(@NonNull Canvas canvas0, @NonNull Paint paint0, @ColorInt int v, @IntRange(from = 0L, to = 0xFFL) int v1) {
    }

    @Override  // com.google.android.material.progressindicator.h
    void c(@NonNull Canvas canvas0, @NonNull Paint paint0, @NonNull a h$a0, @IntRange(from = 0L, to = 0xFFL) int v) {
        int v1 = v.a(h$a0.c, v);
        this.h(canvas0, paint0, h$a0.a, h$a0.b, v1, h$a0.d, h$a0.d);
    }

    @Override  // com.google.android.material.progressindicator.h
    void d(@NonNull Canvas canvas0, @NonNull Paint paint0, float f, float f1, @ColorInt int v, @IntRange(from = 0L, to = 0xFFL) int v1, int v2) {
        this.h(canvas0, paint0, f, f1, v.a(v, v1), v2, v2);
    }

    @Override  // com.google.android.material.progressindicator.h
    int e() {
        return this.k();
    }

    @Override  // com.google.android.material.progressindicator.h
    int f() {
        return this.k();
    }

    private void h(@NonNull Canvas canvas0, @NonNull Paint paint0, float f, float f1, @ColorInt int v, @Px int v1, @Px int v2) {
        float f2 = f1 >= f ? f1 - f : f1 + 1.0f - f;
        if(this.f < 1.0f) {
            float f3 = f % 1.0f + f2;
            if(f3 > 1.0f) {
                this.h(canvas0, paint0, f % 1.0f, 1.0f, v, v1, 0);
                this.h(canvas0, paint0, 1.0f, f3, v, 0, v2);
                return;
            }
        }
        float f4 = (float)Math.toDegrees(this.c / this.d);
        if(f % 1.0f == 0.0f && f2 >= 0.99f) {
            f2 += (f2 - 0.99f) * (f4 * 2.0f / 360.0f) / 0.01f;
        }
        float f5 = (1.0f - f % 1.0f) * (1.0f - this.f) + f % 1.0f * 1.0f;
        float f6 = (1.0f - f2) * 0.0f + f2 * this.f;
        float f7 = (float)Math.toDegrees(((float)v1) / this.d);
        float f8 = f6 * 360.0f - f7 - ((float)Math.toDegrees(((float)v2) / this.d));
        float f9 = f5 * 360.0f + f7;
        if(f8 <= 0.0f) {
            return;
        }
        paint0.setAntiAlias(true);
        paint0.setColor(v);
        paint0.setStrokeWidth(this.b);
        if(f8 < f4 * 2.0f) {
            float f10 = f8 / (f4 * 2.0f);
            paint0.setStyle(Paint.Style.FILL);
            this.j(canvas0, paint0, f9 + f4 * f10, this.c * 2.0f, this.b, f10);
            return;
        }
        RectF rectF0 = new RectF(-this.d, -this.d, this.d, this.d);
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeCap((this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT));
        float f11 = f9 + f4;
        canvas0.drawArc(rectF0, f11, f8 - f4 * 2.0f, false, paint0);
        if(!this.e && this.c > 0.0f) {
            paint0.setStyle(Paint.Style.FILL);
            this.i(canvas0, paint0, f11, this.c * 2.0f, this.b);
            this.i(canvas0, paint0, f9 + f8 - f4, this.c * 2.0f, this.b);
        }
    }

    private void i(@NonNull Canvas canvas0, @NonNull Paint paint0, float f, float f1, float f2) {
        this.j(canvas0, paint0, f, f1, f2, 1.0f);
    }

    private void j(@NonNull Canvas canvas0, @NonNull Paint paint0, float f, float f1, float f2, float f3) {
        float f4 = (float)(((int)Math.min(f2, this.b)));
        float f5 = Math.min(f1 / 2.0f, this.c * f4 / this.b);
        RectF rectF0 = new RectF(-f4 / 2.0f, -f1 / 2.0f, f4 / 2.0f, f1 / 2.0f);
        canvas0.save();
        canvas0.translate(((float)(((double)this.d) * Math.cos(Math.toRadians(f)))), ((float)(((double)this.d) * Math.sin(Math.toRadians(f)))));
        canvas0.rotate(f);
        canvas0.scale(f3, f3);
        canvas0.drawRoundRect(rectF0, f5, f5, paint0);
        canvas0.restore();
    }

    private int k() {
        return ((CircularProgressIndicatorSpec)this.a).h + ((CircularProgressIndicatorSpec)this.a).i * 2;
    }
}

