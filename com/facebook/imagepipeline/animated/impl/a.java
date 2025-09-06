package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.b;
import com.facebook.imagepipeline.animated.base.e;
import com.facebook.imagepipeline.animated.base.f;
import com.facebook.imagepipeline.animated.base.g;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.imagepipeline.animated.impl.a implements com.facebook.imagepipeline.animated.base.a {
    private final a1.a a;
    private final g b;
    private final e c;
    private final Rect d;
    private final int[] e;
    private final int[] f;
    private final int g;
    private final b[] h;
    private final Rect i;
    private final Rect j;
    private final boolean k;
    private final Paint l;
    @h
    @p3.a("this")
    private Bitmap m;

    public com.facebook.imagepipeline.animated.impl.a(a1.a a0, g g0, @h Rect rect0, boolean z) {
        this.i = new Rect();
        this.j = new Rect();
        this.a = a0;
        this.b = g0;
        e e0 = g0.f();
        this.c = e0;
        int[] arr_v = e0.i();
        this.e = arr_v;
        a0.a(arr_v);
        this.g = a0.e(arr_v);
        this.f = a0.c(arr_v);
        this.d = com.facebook.imagepipeline.animated.impl.a.t(e0, rect0);
        this.k = z;
        this.h = new b[e0.b()];
        for(int v = 0; v < this.c.b(); ++v) {
            this.h[v] = this.c.e(v);
        }
        Paint paint0 = new Paint();
        this.l = paint0;
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int a() {
        return this.c.a();
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int b() {
        return this.c.b();
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public void c() {
        synchronized(this) {
            this.s();
        }
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int d() {
        return this.g;
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public b e(int v) {
        return this.h[v];
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int f(int v) {
        return this.a.b(this.f, v);
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int g(int v) {
        com.facebook.common.internal.n.g(v, this.f.length);
        return this.f[v];
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int getHeight() {
        return this.c.getHeight();
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int getWidth() {
        return this.c.getWidth();
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int h(int v) {
        return this.e[v];
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int i() {
        return this.d.width();
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int j() {
        return this.b.e();
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public g k() {
        return this.b;
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public void l(int v, Canvas canvas0) {
        f f0 = this.c.g(v);
        try {
            if(f0.getWidth() > 0 && f0.getHeight() > 0) {
                if(this.c.d()) {
                    this.x(canvas0, f0);
                }
                else {
                    this.w(canvas0, f0);
                }
                goto label_10;
            }
            goto label_12;
        }
        catch(Throwable throwable0) {
        }
        f0.dispose();
        throw throwable0;
    label_10:
        f0.dispose();
        return;
    label_12:
        f0.dispose();
    }

    // 去混淆评级： 低(20)
    @Override  // com.facebook.imagepipeline.animated.base.a
    public com.facebook.imagepipeline.animated.base.a m(@h Rect rect0) {
        return com.facebook.imagepipeline.animated.impl.a.t(this.c, rect0).equals(this.d) ? this : new com.facebook.imagepipeline.animated.impl.a(this.a, this.b, rect0, this.k);
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public boolean n(int v) {
        return this.b.i(v);
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    @h
    public com.facebook.common.references.a o(int v) {
        return this.b.d(v);
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int p() {
        synchronized(this) {
            int v1 = this.m == null ? 0 : this.a.d(this.m);
            int v2 = this.c.z();
            return v1 + v2;
        }
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public int q() {
        return this.d.height();
    }

    @Override  // com.facebook.imagepipeline.animated.base.a
    public void r(int v, Canvas canvas0) {
        f f0 = this.c.g(v);
        b b0 = this.c.e(v);
        b b1 = v == 0 ? null : this.c.e(v - 1);
        try {
            if(f0.getWidth() > 0 && f0.getHeight() > 0) {
                if(this.c.d()) {
                    this.z(canvas0, f0, b0, b1);
                }
                else {
                    this.y(canvas0, f0, b0, b1);
                }
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable0) {
        }
        f0.dispose();
        throw throwable0;
    label_12:
        f0.dispose();
        return;
    label_14:
        f0.dispose();
    }

    private void s() {
        synchronized(this) {
            Bitmap bitmap0 = this.m;
            if(bitmap0 != null) {
                bitmap0.recycle();
                this.m = null;
            }
        }
    }

    private static Rect t(e e0, @h Rect rect0) {
        return rect0 == null ? new Rect(0, 0, e0.getWidth(), e0.getHeight()) : new Rect(0, 0, Math.min(rect0.width(), e0.getWidth()), Math.min(rect0.height(), e0.getHeight()));
    }

    private void u(Canvas canvas0, float f, float f1, b b0) {
        if(b0.g == com.facebook.imagepipeline.animated.base.b.b.b) {
            int v = (int)Math.ceil(((float)b0.b) * f);
            int v1 = (int)Math.ceil(((float)b0.c) * f1);
            canvas0.drawRect(new Rect(v, v1, ((int)Math.ceil(((float)b0.d) * f)) + v, ((int)Math.ceil(((float)b0.e) * f1)) + v1), this.l);
        }
    }

    private Bitmap v(int v, int v1) {
        synchronized(this) {
            if(this.m != null && (this.m.getWidth() < v || this.m.getHeight() < v1)) {
                this.s();
            }
            if(this.m == null) {
                this.m = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
            }
            this.m.eraseColor(0);
            return this.m;
        }
    }

    private void w(Canvas canvas0, f f0) {
        int v7;
        int v6;
        int v5;
        int v4;
        if(this.k) {
            int v = f0.getWidth();
            int v1 = canvas0.getWidth();
            int v2 = f0.getHeight();
            int v3 = canvas0.getHeight();
            float f1 = Math.max(((float)f0.getWidth()) / ((float)Math.min(v, v1)), ((float)f0.getHeight()) / ((float)Math.min(v2, v3)));
            v4 = (int)(((float)f0.getWidth()) / f1);
            v5 = (int)(((float)f0.getHeight()) / f1);
            v6 = (int)(((float)f0.getXOffset()) / f1);
            v7 = (int)(((float)f0.getYOffset()) / f1);
        }
        else {
            v4 = f0.getWidth();
            v5 = f0.getHeight();
            v6 = f0.getXOffset();
            v7 = f0.getYOffset();
        }
        synchronized(this) {
            Bitmap bitmap0 = this.v(v4, v5);
            this.m = bitmap0;
            f0.a(v4, v5, bitmap0);
            canvas0.save();
            canvas0.translate(((float)v6), ((float)v7));
            canvas0.drawBitmap(this.m, 0.0f, 0.0f, null);
            canvas0.restore();
        }
    }

    private void x(Canvas canvas0, f f0) {
        double f1 = ((double)this.d.width()) / ((double)this.c.getWidth());
        double f2 = ((double)this.d.height()) / ((double)this.c.getHeight());
        int v = (int)Math.round(((double)f0.getWidth()) * f1);
        int v1 = (int)Math.round(((double)f0.getHeight()) * f2);
        int v2 = (int)(((double)f0.getXOffset()) * f1);
        int v3 = (int)(((double)f0.getYOffset()) * f2);
        synchronized(this) {
            int v5 = this.d.width();
            int v6 = this.d.height();
            this.v(v5, v6);
            Bitmap bitmap0 = this.m;
            if(bitmap0 != null) {
                f0.a(v, v1, bitmap0);
            }
            this.i.set(0, 0, v5, v6);
            this.j.set(v2, v3, v5 + v2, v6 + v3);
            Bitmap bitmap1 = this.m;
            if(bitmap1 != null) {
                canvas0.drawBitmap(bitmap1, this.i, this.j, null);
            }
        }
    }

    private void y(Canvas canvas0, f f0, b b0, @h b b1) {
        if(this.d != null && this.d.width() > 0 && this.d.height() > 0) {
            float f1 = ((float)canvas0.getWidth()) / ((float)this.d.width());
            if(b1 != null) {
                this.u(canvas0, f1, f1, b1);
            }
            int v = f0.getWidth();
            int v1 = f0.getHeight();
            Rect rect0 = new Rect(0, 0, v, v1);
            int v2 = (int)(((float)f0.getXOffset()) * f1);
            int v3 = (int)(((float)f0.getYOffset()) * f1);
            Rect rect1 = new Rect(v2, v3, ((int)(((float)v) * f1)) + v2, ((int)(((float)v1) * f1)) + v3);
            if(b0.f == com.facebook.imagepipeline.animated.base.b.a.b) {
                canvas0.drawRect(rect1, this.l);
            }
            synchronized(this) {
                Bitmap bitmap0 = this.v(v, v1);
                f0.a(v, v1, bitmap0);
                canvas0.drawBitmap(bitmap0, rect0, rect1, null);
            }
        }
    }

    private void z(Canvas canvas0, f f0, b b0, @h b b1) {
        float f2;
        float f1;
        float f5;
        float f4;
        int v = this.c.getWidth();
        int v1 = this.c.getHeight();
        int v2 = f0.getWidth();
        int v3 = f0.getHeight();
        int v4 = f0.getXOffset();
        int v5 = f0.getYOffset();
        if(((float)v) > ((float)canvas0.getWidth()) || ((float)v1) > ((float)canvas0.getHeight())) {
            int v6 = Math.min(canvas0.getWidth(), v);
            int v7 = Math.min(canvas0.getHeight(), v1);
            float f3 = ((float)v) / ((float)v1);
            if(v6 > v7) {
                f4 = (float)v6;
                f5 = f4 / f3;
            }
            else {
                f5 = (float)v7;
                f4 = f5 * f3;
            }
            f1 = f4 / ((float)v);
            f2 = f5 / ((float)v1);
            v2 = (int)Math.ceil(((float)f0.getWidth()) * f1);
            v3 = (int)Math.ceil(((float)f0.getHeight()) * f2);
            v4 = (int)Math.ceil(((float)f0.getXOffset()) * f1);
            v5 = (int)Math.ceil(((float)f0.getYOffset()) * f2);
        }
        else {
            f1 = 1.0f;
            f2 = 1.0f;
        }
        Rect rect0 = new Rect(0, 0, v2, v3);
        Rect rect1 = new Rect(v4, v5, v4 + v2, v5 + v3);
        if(b1 != null) {
            this.u(canvas0, f1, f2, b1);
        }
        if(b0.f == com.facebook.imagepipeline.animated.base.b.a.b) {
            canvas0.drawRect(rect1, this.l);
        }
        synchronized(this) {
            Bitmap bitmap0 = this.v(v2, v3);
            f0.a(v2, v3, bitmap0);
            canvas0.drawBitmap(bitmap0, rect0, rect1, null);
        }
    }
}

