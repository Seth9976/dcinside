package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

@RestrictTo({Scope.b})
public class b {
    @NonNull
    private final Paint a;
    @NonNull
    private final Paint b;
    @NonNull
    private final Paint c;
    private int d;
    private int e;
    private int f;
    private final Path g;
    private final Paint h;
    private static final int i = 68;
    private static final int j = 20;
    private static final int k;
    private static final int[] l;
    private static final float[] m;
    private static final int[] n;
    private static final float[] o;

    static {
        b.l = new int[3];
        b.m = new float[]{0.0f, 0.5f, 1.0f};
        b.n = new int[4];
        b.o = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    }

    public b() {
        this(0xFF000000);
    }

    public b(int v) {
        this.g = new Path();
        Paint paint0 = new Paint();
        this.h = paint0;
        this.a = new Paint();
        this.e(v);
        paint0.setColor(0);
        Paint paint1 = new Paint(4);
        this.b = paint1;
        paint1.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint1);
    }

    public void a(@NonNull Canvas canvas0, @Nullable Matrix matrix0, @NonNull RectF rectF0, int v, float f, float f1) {
        Path path0 = this.g;
        if(f1 < 0.0f) {
            b.n[0] = 0;
            b.n[1] = this.f;
            b.n[2] = this.e;
            b.n[3] = this.d;
        }
        else {
            path0.rewind();
            path0.moveTo(rectF0.centerX(), rectF0.centerY());
            path0.arcTo(rectF0, f, f1);
            path0.close();
            float f2 = (float)(-v);
            rectF0.inset(f2, f2);
            b.n[0] = 0;
            b.n[1] = this.d;
            b.n[2] = this.e;
            b.n[3] = this.f;
        }
        float f3 = rectF0.width();
        if(f3 / 2.0f <= 0.0f) {
            return;
        }
        float f4 = 1.0f - ((float)v) / (f3 / 2.0f);
        b.o[1] = f4;
        b.o[2] = (1.0f - f4) / 2.0f + f4;
        RadialGradient radialGradient0 = new RadialGradient(rectF0.centerX(), rectF0.centerY(), f3 / 2.0f, b.n, b.o, Shader.TileMode.CLAMP);
        this.b.setShader(radialGradient0);
        canvas0.save();
        canvas0.concat(matrix0);
        canvas0.scale(1.0f, rectF0.height() / rectF0.width());
        if(f1 >= 0.0f) {
            canvas0.clipPath(path0, Region.Op.DIFFERENCE);
            canvas0.drawPath(path0, this.h);
        }
        canvas0.drawArc(rectF0, f, f1, true, this.b);
        canvas0.restore();
    }

    public void b(@NonNull Canvas canvas0, @Nullable Matrix matrix0, @NonNull RectF rectF0, int v) {
        rectF0.bottom += (float)v;
        rectF0.offset(0.0f, ((float)(-v)));
        b.l[0] = this.f;
        b.l[1] = this.e;
        b.l[2] = this.d;
        LinearGradient linearGradient0 = new LinearGradient(rectF0.left, rectF0.top, rectF0.left, rectF0.bottom, b.l, b.m, Shader.TileMode.CLAMP);
        this.c.setShader(linearGradient0);
        canvas0.save();
        canvas0.concat(matrix0);
        canvas0.drawRect(rectF0, this.c);
        canvas0.restore();
    }

    public void c(@NonNull Canvas canvas0, @Nullable Matrix matrix0, @NonNull RectF rectF0, int v, float f, float f1, @NonNull float[] arr_f) {
        if(f1 > 0.0f) {
            f += f1;
            f1 = -f1;
        }
        this.a(canvas0, matrix0, rectF0, v, f, f1);
        this.g.rewind();
        this.g.moveTo(arr_f[0], arr_f[1]);
        this.g.arcTo(rectF0, f, f1);
        this.g.close();
        canvas0.save();
        canvas0.concat(matrix0);
        canvas0.scale(1.0f, rectF0.height() / rectF0.width());
        canvas0.drawPath(this.g, this.h);
        canvas0.drawPath(this.g, this.a);
        canvas0.restore();
    }

    @NonNull
    public Paint d() {
        return this.a;
    }

    public void e(int v) {
        this.d = ColorUtils.D(v, 68);
        this.e = ColorUtils.D(v, 20);
        this.f = ColorUtils.D(v, 0);
        this.a.setColor(this.d);
    }
}

