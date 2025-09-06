package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class o extends Drawable implements m {
    private final float[] a;
    @VisibleForTesting
    final float[] b;
    @VisibleForTesting
    @h
    float[] c;
    @VisibleForTesting
    final Paint d;
    private boolean e;
    private float f;
    private float g;
    private int h;
    private boolean i;
    private boolean j;
    @VisibleForTesting
    final Path k;
    @VisibleForTesting
    final Path l;
    private int m;
    private final RectF n;
    private int o;

    public o(float f, int v) {
        this(v);
        this.f(f);
    }

    public o(int v) {
        this.a = new float[8];
        this.b = new float[8];
        this.d = new Paint(1);
        this.e = false;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.k = new Path();
        this.l = new Path();
        this.m = 0;
        this.n = new RectF();
        this.o = 0xFF;
        this.n(v);
    }

    public o(float[] arr_f, int v) {
        this(v);
        this.v(arr_f);
    }

    public static o a(ColorDrawable colorDrawable0) {
        return new o(colorDrawable0.getColor());
    }

    @Override  // com.facebook.drawee.drawable.m
    public void b(int v, float f) {
        if(this.h != v) {
            this.h = v;
            this.invalidateSelf();
        }
        if(this.f != f) {
            this.f = f;
            this.o();
            this.invalidateSelf();
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public boolean c() {
        return this.i;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void d(boolean z) {
        this.e = z;
        this.o();
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        this.d.setColor(f.d(this.m, this.o));
        this.d.setStyle(Paint.Style.FILL);
        this.d.setFilterBitmap(this.i());
        canvas0.drawPath(this.k, this.d);
        if(this.f != 0.0f) {
            this.d.setColor(f.d(this.h, this.o));
            this.d.setStyle(Paint.Style.STROKE);
            this.d.setStrokeWidth(this.f);
            canvas0.drawPath(this.l, this.d);
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public void e(float f) {
        if(this.g != f) {
            this.g = f;
            this.o();
            this.invalidateSelf();
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public void f(float f) {
        com.facebook.common.internal.n.e(f >= 0.0f, "radius should be non negative");
        Arrays.fill(this.a, f);
        this.o();
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.m
    public void g(boolean z) {
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.o;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return f.c(f.d(this.m, this.o));
    }

    public int h() {
        return this.m;
    }

    @Override  // com.facebook.drawee.drawable.m
    public boolean i() {
        return this.j;
    }

    @Override  // com.facebook.drawee.drawable.m
    public boolean j() {
        return this.e;
    }

    @Override  // com.facebook.drawee.drawable.m
    public int k() {
        return this.h;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void l(boolean z) {
        if(this.j != z) {
            this.j = z;
            this.invalidateSelf();
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public float m() {
        return this.f;
    }

    public void n(int v) {
        if(this.m != v) {
            this.m = v;
            this.invalidateSelf();
        }
    }

    private void o() {
        float[] arr_f1;
        float[] arr_f;
        this.k.reset();
        this.l.reset();
        Rect rect0 = this.getBounds();
        this.n.set(rect0);
        this.n.inset(this.f / 2.0f, this.f / 2.0f);
        if(this.e) {
            float f = Math.min(this.n.width(), this.n.height());
            float f1 = this.n.centerX();
            float f2 = this.n.centerY();
            this.l.addCircle(f1, f2, f / 2.0f, Path.Direction.CW);
        }
        else {
            for(int v1 = 0; true; ++v1) {
                arr_f = this.b;
                if(v1 >= arr_f.length) {
                    break;
                }
                arr_f[v1] = this.a[v1] + this.g - this.f / 2.0f;
            }
            this.l.addRoundRect(this.n, arr_f, Path.Direction.CW);
        }
        this.n.inset(-this.f / 2.0f, -this.f / 2.0f);
        float f3 = this.g + (this.i ? this.f : 0.0f);
        this.n.inset(f3, f3);
        if(this.e) {
            float f4 = Math.min(this.n.width(), this.n.height());
            float f5 = this.n.centerX();
            float f6 = this.n.centerY();
            this.k.addCircle(f5, f6, f4 / 2.0f, Path.Direction.CW);
        }
        else if(this.i) {
            if(this.c == null) {
                this.c = new float[8];
            }
            for(int v = 0; true; ++v) {
                arr_f1 = this.c;
                if(v >= arr_f1.length) {
                    break;
                }
                arr_f1[v] = this.a[v] - this.f;
            }
            this.k.addRoundRect(this.n, arr_f1, Path.Direction.CW);
        }
        else {
            this.k.addRoundRect(this.n, this.a, Path.Direction.CW);
        }
        this.n.inset(-f3, -f3);
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.o();
    }

    @Override  // com.facebook.drawee.drawable.m
    public float[] r() {
        return this.a;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void s(boolean z) {
        if(this.i != z) {
            this.i = z;
            this.o();
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(v != this.o) {
            this.o = v;
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
    }

    @Override  // com.facebook.drawee.drawable.m
    public float u() {
        return this.g;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void v(float[] arr_f) {
        if(arr_f == null) {
            Arrays.fill(this.a, 0.0f);
        }
        else {
            com.facebook.common.internal.n.e(arr_f.length == 8, "radii should have exactly 8 values");
            System.arraycopy(arr_f, 0, this.a, 0, 8);
        }
        this.o();
        this.invalidateSelf();
    }
}

