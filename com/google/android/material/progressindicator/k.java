package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.math.MathUtils;
import com.google.android.material.color.v;

final class k extends h {
    private float b;
    private float c;
    private float d;
    private boolean e;
    @FloatRange(from = 0.0, to = 1.0)
    private float f;

    k(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        super(linearProgressIndicatorSpec0);
        this.b = 300.0f;
    }

    @Override  // com.google.android.material.progressindicator.h
    void a(@NonNull Canvas canvas0, @NonNull Rect rect0, @FloatRange(from = 0.0, to = 1.0) float f, boolean z, boolean z1) {
        this.b = (float)rect0.width();
        float f1 = (float)((LinearProgressIndicatorSpec)this.a).a;
        canvas0.translate(((float)rect0.left) + ((float)rect0.width()) / 2.0f, ((float)rect0.top) + ((float)rect0.height()) / 2.0f + Math.max(0.0f, (((float)rect0.height()) - f1) / 2.0f));
        if(((LinearProgressIndicatorSpec)this.a).j) {
            canvas0.scale(-1.0f, 1.0f);
        }
        canvas0.clipRect(-(this.b / 2.0f), -(f1 / 2.0f), this.b / 2.0f, f1 / 2.0f);
        c c0 = this.a;
        this.e = ((LinearProgressIndicatorSpec)c0).a / 2 == ((LinearProgressIndicatorSpec)c0).b;
        this.c = ((float)((LinearProgressIndicatorSpec)c0).a) * f;
        this.d = ((float)Math.min(((LinearProgressIndicatorSpec)c0).a / 2, ((LinearProgressIndicatorSpec)c0).b)) * f;
        if(z || z1) {
            if(z && ((LinearProgressIndicatorSpec)this.a).e == 2 || z1 && ((LinearProgressIndicatorSpec)this.a).f == 1) {
                canvas0.scale(1.0f, -1.0f);
            }
            if(z || z1 && ((LinearProgressIndicatorSpec)this.a).f != 3) {
                canvas0.translate(0.0f, ((float)((LinearProgressIndicatorSpec)this.a).a) * (1.0f - f) / 2.0f);
            }
        }
        if(z1 && ((LinearProgressIndicatorSpec)this.a).f == 3) {
            this.f = f;
            return;
        }
        this.f = 1.0f;
    }

    @Override  // com.google.android.material.progressindicator.h
    void b(@NonNull Canvas canvas0, @NonNull Paint paint0, @ColorInt int v, @IntRange(from = 0L, to = 0xFFL) int v1) {
        int v2 = v.a(v, v1);
        if(((LinearProgressIndicatorSpec)this.a).k > 0 && v2 != 0) {
            paint0.setStyle(Paint.Style.FILL);
            paint0.setColor(v2);
            this.i(canvas0, paint0, new PointF(this.b / 2.0f - this.c / 2.0f, 0.0f), ((float)((LinearProgressIndicatorSpec)this.a).k), ((float)((LinearProgressIndicatorSpec)this.a).k));
        }
    }

    @Override  // com.google.android.material.progressindicator.h
    void c(@NonNull Canvas canvas0, @NonNull Paint paint0, @NonNull a h$a0, int v) {
        int v1 = v.a(h$a0.c, v);
        this.h(canvas0, paint0, h$a0.a, h$a0.b, v1, h$a0.d, h$a0.d);
    }

    @Override  // com.google.android.material.progressindicator.h
    void d(@NonNull Canvas canvas0, @NonNull Paint paint0, float f, float f1, int v, int v1, @Px int v2) {
        this.h(canvas0, paint0, f, f1, v.a(v, v1), v2, v2);
    }

    @Override  // com.google.android.material.progressindicator.h
    int e() {
        return ((LinearProgressIndicatorSpec)this.a).a;
    }

    @Override  // com.google.android.material.progressindicator.h
    int f() {
        return -1;
    }

    private void h(@NonNull Canvas canvas0, @NonNull Paint paint0, float f, float f1, @ColorInt int v, @Px int v1, @Px int v2) {
        float f2 = (1.0f - MathUtils.d(f, 0.0f, 1.0f)) * (1.0f - this.f) + MathUtils.d(f, 0.0f, 1.0f) * 1.0f;
        float f3 = (1.0f - MathUtils.d(f1, 0.0f, 1.0f)) * (1.0f - this.f) + MathUtils.d(f1, 0.0f, 1.0f) * 1.0f;
        int v3 = (int)(f2 * this.b + ((float)(((int)(((float)v1) * MathUtils.d(f2, 0.0f, 0.01f) / 0.01f)))));
        int v4 = (int)(f3 * this.b - ((float)(((int)(((float)v2) * (1.0f - MathUtils.d(f3, 0.99f, 1.0f)) / 0.01f)))));
        float f4 = -this.b / 2.0f;
        if(v3 <= v4) {
            float f5 = ((float)v3) + this.d;
            float f6 = ((float)v4) - this.d;
            float f7 = this.d * 2.0f;
            paint0.setColor(v);
            paint0.setAntiAlias(true);
            paint0.setStrokeWidth(this.c);
            if(f5 >= f6) {
                this.j(canvas0, paint0, new PointF(f5 + f4, 0.0f), new PointF(f6 + f4, 0.0f), f7, this.c);
                return;
            }
            paint0.setStyle(Paint.Style.STROKE);
            paint0.setStrokeCap((this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT));
            float f8 = f5 + f4;
            float f9 = f6 + f4;
            canvas0.drawLine(f8, 0.0f, f9, 0.0f, paint0);
            if(!this.e && this.d > 0.0f) {
                paint0.setStyle(Paint.Style.FILL);
                if(f5 > 0.0f) {
                    this.i(canvas0, paint0, new PointF(f8, 0.0f), f7, this.c);
                }
                if(f6 < this.b) {
                    this.i(canvas0, paint0, new PointF(f9, 0.0f), f7, this.c);
                }
            }
        }
    }

    private void i(@NonNull Canvas canvas0, @NonNull Paint paint0, @NonNull PointF pointF0, float f, float f1) {
        this.j(canvas0, paint0, pointF0, null, f, f1);
    }

    private void j(@NonNull Canvas canvas0, @NonNull Paint paint0, @NonNull PointF pointF0, @Nullable PointF pointF1, float f, float f1) {
        float f2 = Math.min(f1, this.c);
        float f3 = Math.min(f / 2.0f, this.d * f2 / this.c);
        RectF rectF0 = new RectF(-f / 2.0f, -f2 / 2.0f, f / 2.0f, f2 / 2.0f);
        paint0.setStyle(Paint.Style.FILL);
        canvas0.save();
        if(pointF1 != null) {
            canvas0.translate(pointF1.x, pointF1.y);
            Path path0 = new Path();
            path0.addRoundRect(rectF0, f3, f3, Path.Direction.CCW);
            canvas0.clipPath(path0);
            canvas0.translate(-pointF1.x, -pointF1.y);
        }
        canvas0.translate(pointF0.x, pointF0.y);
        canvas0.drawRoundRect(rectF0, f3, f3, paint0);
        canvas0.restore();
    }
}

