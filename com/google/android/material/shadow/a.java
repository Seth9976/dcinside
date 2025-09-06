package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.R.color;

@Deprecated
public class a extends DrawableWrapperCompat {
    @NonNull
    final Paint b;
    @NonNull
    final Paint c;
    @NonNull
    final RectF d;
    float e;
    Path f;
    float g;
    float h;
    float i;
    float j;
    private boolean k;
    private final int l;
    private final int m;
    private final int n;
    private boolean o;
    private float p;
    private boolean q;
    static final double r = 0.0;
    static final float s = 1.5f;
    static final float t = 0.25f;
    static final float u = 0.5f;
    static final float v = 1.0f;

    static {
        a.r = 0.707107;
    }

    public a(Context context0, Drawable drawable0, float f, float f1, float f2) {
        super(drawable0);
        this.k = true;
        this.o = true;
        this.q = false;
        this.l = ContextCompat.getColor(context0, color.design_fab_shadow_start_color);
        this.m = ContextCompat.getColor(context0, color.design_fab_shadow_mid_color);
        this.n = ContextCompat.getColor(context0, color.design_fab_shadow_end_color);
        Paint paint0 = new Paint(5);
        this.b = paint0;
        paint0.setStyle(Paint.Style.FILL);
        this.e = (float)Math.round(f);
        this.d = new RectF();
        Paint paint1 = new Paint(paint0);
        this.c = paint1;
        paint1.setAntiAlias(false);
        this.r(f1, f2);
    }

    private void c(@NonNull Rect rect0) {
        this.d.set(((float)rect0.left) + this.h, ((float)rect0.top) + 1.5f * this.h, ((float)rect0.right) - this.h, ((float)rect0.bottom) - 1.5f * this.h);
        this.a().setBounds(((int)this.d.left), ((int)this.d.top), ((int)this.d.right), ((int)this.d.bottom));
        this.d();
    }

    private void d() {
        RectF rectF0 = new RectF(-this.e, -this.e, this.e, this.e);
        RectF rectF1 = new RectF(rectF0);
        rectF1.inset(-this.i, -this.i);
        Path path0 = this.f;
        if(path0 == null) {
            this.f = new Path();
        }
        else {
            path0.reset();
        }
        this.f.setFillType(Path.FillType.EVEN_ODD);
        this.f.moveTo(-this.e, 0.0f);
        this.f.rLineTo(-this.i, 0.0f);
        this.f.arcTo(rectF1, 180.0f, 90.0f, false);
        this.f.arcTo(rectF0, 270.0f, -90.0f, false);
        this.f.close();
        float f = -rectF1.top;
        if(f > 0.0f) {
            float f1 = this.e / f;
            RadialGradient radialGradient0 = new RadialGradient(0.0f, 0.0f, f, new int[]{0, this.l, this.m, this.n}, new float[]{0.0f, f1, (1.0f - f1) / 2.0f + f1, 1.0f}, Shader.TileMode.CLAMP);
            this.b.setShader(radialGradient0);
        }
        LinearGradient linearGradient0 = new LinearGradient(0.0f, rectF0.top, 0.0f, rectF1.top, new int[]{this.l, this.m, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.c.setShader(linearGradient0);
        this.c.setAntiAlias(false);
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public void draw(@NonNull Canvas canvas0) {
        if(this.k) {
            this.c(this.getBounds());
            this.k = false;
        }
        this.g(canvas0);
        super.draw(canvas0);
    }

    // 去混淆评级： 低(20)
    public static float e(float f, float f1, boolean z) {
        return z ? ((float)(((double)f) + (1.0 - a.r) * ((double)f1))) : f;
    }

    // 去混淆评级： 低(20)
    public static float f(float f, float f1, boolean z) {
        return z ? ((float)(((double)(f * 1.5f)) + (1.0 - a.r) * ((double)f1))) : f * 1.5f;
    }

    private void g(@NonNull Canvas canvas0) {
        int v = canvas0.save();
        canvas0.rotate(this.p, this.d.centerX(), this.d.centerY());
        float f = this.e;
        float f1 = -f - this.i;
        boolean z = this.d.width() - f * 2.0f > 0.0f;
        boolean z1 = this.d.height() - f * 2.0f > 0.0f;
        float f2 = this.j - 0.25f * this.j;
        float f3 = this.j - this.j * 1.0f;
        float f4 = f / (this.j - 0.5f * this.j + f);
        float f5 = f / (f2 + f);
        float f6 = f / (f3 + f);
        int v1 = canvas0.save();
        canvas0.translate(this.d.left + f, this.d.top + f);
        canvas0.scale(f4, f5);
        canvas0.drawPath(this.f, this.b);
        if(z) {
            canvas0.scale(1.0f / f4, 1.0f);
            canvas0.drawRect(0.0f, f1, this.d.width() - f * 2.0f, -this.e, this.c);
        }
        canvas0.restoreToCount(v1);
        int v2 = canvas0.save();
        canvas0.translate(this.d.right - f, this.d.bottom - f);
        canvas0.scale(f4, f6);
        canvas0.rotate(180.0f);
        canvas0.drawPath(this.f, this.b);
        if(z) {
            canvas0.scale(1.0f / f4, 1.0f);
            canvas0.drawRect(0.0f, f1, this.d.width() - f * 2.0f, this.i - this.e, this.c);
        }
        canvas0.restoreToCount(v2);
        int v3 = canvas0.save();
        canvas0.translate(this.d.left + f, this.d.bottom - f);
        canvas0.scale(f4, f6);
        canvas0.rotate(270.0f);
        canvas0.drawPath(this.f, this.b);
        if(z1) {
            canvas0.scale(1.0f / f6, 1.0f);
            canvas0.drawRect(0.0f, f1, this.d.height() - f * 2.0f, -this.e, this.c);
        }
        canvas0.restoreToCount(v3);
        int v4 = canvas0.save();
        canvas0.translate(this.d.right - f, this.d.top + f);
        canvas0.scale(f4, f5);
        canvas0.rotate(90.0f);
        canvas0.drawPath(this.f, this.b);
        if(z1) {
            canvas0.scale(1.0f / f5, 1.0f);
            canvas0.drawRect(0.0f, f1, this.d.height() - f * 2.0f, -this.e, this.c);
        }
        canvas0.restoreToCount(v4);
        canvas0.restoreToCount(v);
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public int getOpacity() {
        return -3;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public boolean getPadding(@NonNull Rect rect0) {
        int v = (int)Math.ceil(a.f(this.h, this.e, this.o));
        int v1 = (int)Math.ceil(a.e(this.h, this.e, this.o));
        rect0.set(v1, v, v1, v);
        return true;
    }

    public float h() {
        return this.e;
    }

    public float i() {
        return this.h;
    }

    public float j() {
        return Math.max(this.h, this.e + this.h * 1.5f / 2.0f) * 2.0f + this.h * 3.0f;
    }

    public float k() {
        return Math.max(this.h, this.e + this.h / 2.0f) * 2.0f + this.h * 2.0f;
    }

    public float l() {
        return this.j;
    }

    public void m(boolean z) {
        this.o = z;
        this.invalidateSelf();
    }

    public void n(float f) {
        float f1 = (float)Math.round(f);
        if(this.e == f1) {
            return;
        }
        this.e = f1;
        this.k = true;
        this.invalidateSelf();
    }

    public void o(float f) {
        this.r(this.j, f);
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    protected void onBoundsChange(Rect rect0) {
        this.k = true;
    }

    public final void p(float f) {
        if(this.p != f) {
            this.p = f;
            this.invalidateSelf();
        }
    }

    public void q(float f) {
        this.r(f, this.h);
    }

    public void r(float f, float f1) {
        if(f < 0.0f || f1 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float f2 = (float)a.s(f);
        float f3 = (float)a.s(f1);
        if(f2 > f3) {
            if(!this.q) {
                this.q = true;
            }
            f2 = f3;
        }
        if(this.j == f2 && this.h == f3) {
            return;
        }
        this.j = f2;
        this.h = f3;
        this.i = (float)Math.round(f2 * 1.5f);
        this.g = f3;
        this.k = true;
        this.invalidateSelf();
    }

    private static int s(float f) {
        int v = Math.round(f);
        return v % 2 == 1 ? v - 1 : v;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public void setAlpha(int v) {
        super.setAlpha(v);
        this.b.setAlpha(v);
        this.c.setAlpha(v);
    }
}

