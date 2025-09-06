package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import k1.n.a;
import k1.n;

@n(a.a)
public class p extends h implements m {
    static class com.facebook.drawee.drawable.p.a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            com.facebook.drawee.drawable.p.a.a = arr_v;
            try {
                arr_v[b.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.drawable.p.a.a[b.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        OVERLAY_COLOR,
        CLIPPING;

    }

    @VisibleForTesting
    b e;
    private final RectF f;
    @o3.h
    private RectF g;
    @o3.h
    private Matrix h;
    private final float[] i;
    @VisibleForTesting
    final float[] j;
    @VisibleForTesting
    final Paint k;
    private boolean l;
    private float m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private boolean r;
    private final Path s;
    private final Path t;
    private final RectF u;

    public p(Drawable drawable0) {
        super(((Drawable)com.facebook.common.internal.n.i(drawable0)));
        this.e = b.a;
        this.f = new RectF();
        this.i = new float[8];
        this.j = new float[8];
        this.k = new Paint(1);
        this.l = false;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0.0f;
        this.q = false;
        this.r = false;
        this.s = new Path();
        this.t = new Path();
        this.u = new RectF();
    }

    public int A() {
        return this.o;
    }

    public void B(int v) {
        this.o = v;
        this.invalidateSelf();
    }

    public void C(b p$b0) {
        this.e = p$b0;
        this.D();
        this.invalidateSelf();
    }

    private void D() {
        float[] arr_f;
        this.s.reset();
        this.t.reset();
        Rect rect0 = this.getBounds();
        this.u.set(rect0);
        this.u.inset(this.p, this.p);
        if(this.e == b.a) {
            this.s.addRect(this.u, Path.Direction.CW);
        }
        if(this.l) {
            float f = this.u.centerX();
            float f1 = this.u.centerY();
            float f2 = Math.min(this.u.width(), this.u.height());
            this.s.addCircle(f, f1, f2 / 2.0f, Path.Direction.CW);
        }
        else {
            this.s.addRoundRect(this.u, this.i, Path.Direction.CW);
        }
        this.u.inset(-this.p, -this.p);
        this.u.inset(this.m / 2.0f, this.m / 2.0f);
        if(this.l) {
            float f3 = Math.min(this.u.width(), this.u.height());
            float f4 = this.u.centerX();
            float f5 = this.u.centerY();
            this.t.addCircle(f4, f5, f3 / 2.0f, Path.Direction.CW);
        }
        else {
            for(int v = 0; true; ++v) {
                arr_f = this.j;
                if(v >= arr_f.length) {
                    break;
                }
                arr_f[v] = this.i[v] + this.p - this.m / 2.0f;
            }
            this.t.addRoundRect(this.u, arr_f, Path.Direction.CW);
        }
        this.u.inset(-this.m / 2.0f, -this.m / 2.0f);
    }

    @Override  // com.facebook.drawee.drawable.m
    public void b(int v, float f) {
        this.n = v;
        this.m = f;
        this.D();
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.m
    public boolean c() {
        return this.q;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void d(boolean z) {
        this.l = z;
        this.D();
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.h
    public void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        this.f.set(rect0);
        switch(this.e) {
            case 1: {
                int v = canvas0.save();
                canvas0.clipPath(this.s);
                super.draw(canvas0);
                canvas0.restoreToCount(v);
                break;
            }
            case 2: {
                if(this.q) {
                    RectF rectF0 = this.g;
                    if(rectF0 == null) {
                        this.g = new RectF(this.f);
                        this.h = new Matrix();
                    }
                    else {
                        rectF0.set(this.f);
                    }
                    this.g.inset(this.m, this.m);
                    Matrix matrix0 = this.h;
                    if(matrix0 != null) {
                        matrix0.setRectToRect(this.f, this.g, Matrix.ScaleToFit.FILL);
                    }
                    int v1 = canvas0.save();
                    canvas0.clipRect(this.f);
                    canvas0.concat(this.h);
                    super.draw(canvas0);
                    canvas0.restoreToCount(v1);
                }
                else {
                    super.draw(canvas0);
                }
                this.k.setStyle(Paint.Style.FILL);
                this.k.setColor(this.o);
                this.k.setStrokeWidth(0.0f);
                this.k.setFilterBitmap(this.i());
                this.s.setFillType(Path.FillType.EVEN_ODD);
                canvas0.drawPath(this.s, this.k);
                if(this.l) {
                    float f = (this.f.width() - this.f.height() + this.m) / 2.0f;
                    float f1 = (this.f.height() - this.f.width() + this.m) / 2.0f;
                    if(f > 0.0f) {
                        canvas0.drawRect(this.f.left, this.f.top, this.f.left + f, this.f.bottom, this.k);
                        canvas0.drawRect(this.f.right - f, this.f.top, this.f.right, this.f.bottom, this.k);
                    }
                    if(f1 > 0.0f) {
                        canvas0.drawRect(this.f.left, this.f.top, this.f.right, this.f.top + f1, this.k);
                        canvas0.drawRect(this.f.left, this.f.bottom - f1, this.f.right, this.f.bottom, this.k);
                    }
                }
            }
        }
        if(this.n != 0) {
            this.k.setStyle(Paint.Style.STROKE);
            this.k.setColor(this.n);
            this.k.setStrokeWidth(this.m);
            this.s.setFillType(Path.FillType.EVEN_ODD);
            canvas0.drawPath(this.t, this.k);
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public void e(float f) {
        this.p = f;
        this.D();
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.m
    public void f(float f) {
        Arrays.fill(this.i, f);
        this.D();
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.m
    public void g(boolean z) {
    }

    @Override  // com.facebook.drawee.drawable.m
    public boolean i() {
        return this.r;
    }

    @Override  // com.facebook.drawee.drawable.m
    public boolean j() {
        return this.l;
    }

    @Override  // com.facebook.drawee.drawable.m
    public int k() {
        return this.n;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void l(boolean z) {
        if(this.r != z) {
            this.r = z;
            this.invalidateSelf();
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public float m() {
        return this.m;
    }

    @Override  // com.facebook.drawee.drawable.h
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.D();
    }

    @Override  // com.facebook.drawee.drawable.m
    public float[] r() {
        return this.i;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void s(boolean z) {
        this.q = z;
        this.D();
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.m
    public float u() {
        return this.p;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void v(float[] arr_f) {
        if(arr_f == null) {
            Arrays.fill(this.i, 0.0f);
        }
        else {
            com.facebook.common.internal.n.e(arr_f.length == 8, "radii should have exactly 8 values");
            System.arraycopy(arr_f, 0, this.i, 0, 8);
        }
        this.D();
        this.invalidateSelf();
    }
}

