package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.systrace.b;
import java.util.Arrays;
import k1.n.a;
import k1.n;

@n(a.a)
public abstract class q extends Drawable implements m, u {
    private boolean A;
    private boolean B;
    @Nullable
    private v C;
    private final Drawable a;
    protected boolean b;
    protected boolean c;
    protected float d;
    protected final Path e;
    protected boolean f;
    protected int g;
    protected final Path h;
    private final float[] i;
    @VisibleForTesting
    final float[] j;
    @Nullable
    @VisibleForTesting
    float[] k;
    @VisibleForTesting
    final RectF l;
    @VisibleForTesting
    final RectF m;
    @VisibleForTesting
    final RectF n;
    @VisibleForTesting
    final RectF o;
    @Nullable
    @VisibleForTesting
    RectF p;
    @VisibleForTesting
    final Matrix q;
    @VisibleForTesting
    final Matrix r;
    @VisibleForTesting
    final Matrix s;
    @VisibleForTesting
    final Matrix t;
    @VisibleForTesting
    final Matrix u;
    @Nullable
    @VisibleForTesting
    Matrix v;
    @Nullable
    @VisibleForTesting
    Matrix w;
    @VisibleForTesting
    final Matrix x;
    private float y;
    private boolean z;

    q(Drawable drawable0) {
        this.b = false;
        this.c = false;
        this.d = 0.0f;
        this.e = new Path();
        this.f = true;
        this.g = 0;
        this.h = new Path();
        this.i = new float[8];
        this.j = new float[8];
        this.l = new RectF();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new RectF();
        this.q = new Matrix();
        this.r = new Matrix();
        this.s = new Matrix();
        this.t = new Matrix();
        this.u = new Matrix();
        this.x = new Matrix();
        this.y = 0.0f;
        this.z = false;
        this.A = false;
        this.B = true;
        this.a = drawable0;
    }

    @Nullable
    private static Matrix a(@Nullable Matrix matrix0) {
        return matrix0 == null ? null : new Matrix(matrix0);
    }

    @Override  // com.facebook.drawee.drawable.m
    public void b(int v, float f) {
        if(this.g != v || this.d != f) {
            this.g = v;
            this.d = f;
            this.B = true;
            this.invalidateSelf();
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public boolean c() {
        return this.z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.a.clearColorFilter();
    }

    @Override  // com.facebook.drawee.drawable.m
    public void d(boolean z) {
        this.b = z;
        this.B = true;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        if(b.e()) {
            b.a("RoundedDrawable#draw");
        }
        this.a.draw(canvas0);
        if(b.e()) {
            b.c();
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public void e(float f) {
        if(this.y != f) {
            this.y = f;
            this.B = true;
            this.invalidateSelf();
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public void f(float f) {
        boolean z = false;
        int v = Float.compare(f, 0.0f);
        com.facebook.common.internal.n.o(v >= 0);
        Arrays.fill(this.i, f);
        if(v != 0) {
            z = true;
        }
        this.c = z;
        this.B = true;
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.m
    public void g(boolean z) {
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
        return this.a.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.getOpacity();
    }

    @Override  // com.facebook.drawee.drawable.u
    public void h(@Nullable v v0) {
        this.C = v0;
    }

    @Override  // com.facebook.drawee.drawable.m
    public boolean i() {
        return this.A;
    }

    @Override  // com.facebook.drawee.drawable.m
    public boolean j() {
        return this.b;
    }

    @Override  // com.facebook.drawee.drawable.m
    public int k() {
        return this.g;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void l(boolean z) {
        if(this.A != z) {
            this.A = z;
            this.invalidateSelf();
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public float m() {
        return this.d;
    }

    private static boolean n(@Nullable Matrix matrix0, @Nullable Matrix matrix1) {
        if(matrix0 == null && matrix1 == null) {
            return true;
        }
        return matrix0 == null || matrix1 == null ? false : matrix0.equals(matrix1);
    }

    // 去混淆评级： 低(20)
    @VisibleForTesting
    boolean o() {
        return this.b || this.c || this.d > 0.0f;
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        this.a.setBounds(rect0);
    }

    protected void p() {
        float[] arr_f;
        if(this.B) {
            this.h.reset();
            this.l.inset(this.d / 2.0f, this.d / 2.0f);
            if(this.b) {
                float f = Math.min(this.l.width(), this.l.height());
                float f1 = this.l.centerX();
                float f2 = this.l.centerY();
                this.h.addCircle(f1, f2, f / 2.0f, Path.Direction.CW);
            }
            else {
                for(int v = 0; true; ++v) {
                    arr_f = this.j;
                    if(v >= arr_f.length) {
                        break;
                    }
                    arr_f[v] = this.i[v] + this.y - this.d / 2.0f;
                }
                this.h.addRoundRect(this.l, arr_f, Path.Direction.CW);
            }
            this.l.inset(-this.d / 2.0f, -this.d / 2.0f);
            this.e.reset();
            float f3 = this.y + (this.z ? this.d : 0.0f);
            this.l.inset(f3, f3);
            if(this.b) {
                float f4 = this.l.centerX();
                float f5 = this.l.centerY();
                float f6 = Math.min(this.l.width(), this.l.height());
                this.e.addCircle(f4, f5, f6 / 2.0f, Path.Direction.CW);
            }
            else if(this.z) {
                if(this.k == null) {
                    this.k = new float[8];
                }
                for(int v1 = 0; v1 < this.j.length; ++v1) {
                    this.k[v1] = this.i[v1] - this.d;
                }
                this.e.addRoundRect(this.l, this.k, Path.Direction.CW);
            }
            else {
                this.e.addRoundRect(this.l, this.i, Path.Direction.CW);
            }
            this.l.inset(-f3, -f3);
            this.e.setFillType(Path.FillType.WINDING);
            this.B = false;
        }
    }

    protected void q() {
        v v0 = this.C;
        if(v0 == null) {
            this.s.reset();
            Rect rect0 = this.getBounds();
            this.l.set(rect0);
        }
        else {
            v0.q(this.s);
            this.C.n(this.l);
        }
        float f = (float)this.getIntrinsicWidth();
        float f1 = (float)this.getIntrinsicHeight();
        this.n.set(0.0f, 0.0f, f, f1);
        Rect rect1 = this.a.getBounds();
        this.o.set(rect1);
        Matrix.ScaleToFit matrix$ScaleToFit0 = Matrix.ScaleToFit.FILL;
        this.q.setRectToRect(this.n, this.o, matrix$ScaleToFit0);
        if(this.z) {
            RectF rectF0 = this.p;
            if(rectF0 == null) {
                this.p = new RectF(this.l);
            }
            else {
                rectF0.set(this.l);
            }
            this.p.inset(this.d, this.d);
            if(this.v == null) {
                this.v = new Matrix();
            }
            this.v.setRectToRect(this.l, this.p, matrix$ScaleToFit0);
        }
        else {
            Matrix matrix0 = this.v;
            if(matrix0 != null) {
                matrix0.reset();
            }
        }
        if(!this.s.equals(this.t) || !this.q.equals(this.r) || this.v != null && !q.n(this.v, this.w)) {
            this.f = true;
            this.s.invert(this.u);
            this.x.set(this.s);
            if(this.z) {
                Matrix matrix1 = this.v;
                if(matrix1 != null) {
                    this.x.postConcat(matrix1);
                }
            }
            this.x.preConcat(this.q);
            this.t.set(this.s);
            this.r.set(this.q);
            if(this.z) {
                Matrix matrix2 = this.w;
                if(matrix2 == null) {
                    this.w = q.a(this.v);
                }
                else {
                    matrix2.set(this.v);
                }
            }
            else {
                Matrix matrix3 = this.w;
                if(matrix3 != null) {
                    matrix3.reset();
                }
            }
        }
        if(!this.l.equals(this.m)) {
            this.B = true;
            this.m.set(this.l);
        }
    }

    @Override  // com.facebook.drawee.drawable.m
    public float[] r() {
        return this.i;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void s(boolean z) {
        if(this.z != z) {
            this.z = z;
            this.B = true;
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(int v, PorterDuff.Mode porterDuff$Mode0) {
        this.a.setColorFilter(v, porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
    }

    @Override  // com.facebook.drawee.drawable.m
    public float u() {
        return this.y;
    }

    @Override  // com.facebook.drawee.drawable.m
    public void v(float[] arr_f) {
        if(arr_f == null) {
            Arrays.fill(this.i, 0.0f);
            this.c = false;
        }
        else {
            com.facebook.common.internal.n.e(arr_f.length == 8, "radii should have exactly 8 values");
            System.arraycopy(arr_f, 0, this.i, 0, 8);
            this.c = false;
            for(int v = 0; v < 8; ++v) {
                this.c |= arr_f[v] > 0.0f;
            }
        }
        this.B = true;
        this.invalidateSelf();
    }
}

