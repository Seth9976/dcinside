package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class e {
    static class com.facebook.imagepipeline.bitmaps.e.a {
        static final int[] a;

        static {
            int[] arr_v = new int[Bitmap.Config.values().length];
            com.facebook.imagepipeline.bitmaps.e.a.a = arr_v;
            try {
                arr_v[Bitmap.Config.RGB_565.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.imagepipeline.bitmaps.e.a.a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.imagepipeline.bitmaps.e.a.a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.imagepipeline.bitmaps.e.a.a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public com.facebook.common.references.a A(Bitmap bitmap0, int v, int v1, boolean z) {
        return this.B(bitmap0, v, v1, z, null);
    }

    public com.facebook.common.references.a B(Bitmap bitmap0, int v, int v1, boolean z, @h Object object0) {
        e.b(v, v1);
        Matrix matrix0 = new Matrix();
        int v2 = bitmap0.getWidth();
        int v3 = bitmap0.getHeight();
        matrix0.setScale(((float)v) / ((float)v2), ((float)v1) / ((float)v3));
        return this.m(bitmap0, 0, 0, v2, v3, matrix0, z, object0);
    }

    private static Bitmap.Config C(Bitmap bitmap0) {
        Bitmap.Config bitmap$Config0 = Bitmap.Config.ARGB_8888;
        Bitmap.Config bitmap$Config1 = bitmap0.getConfig();
        if(bitmap$Config1 != null) {
            switch(com.facebook.imagepipeline.bitmaps.e.a.a[bitmap$Config1.ordinal()]) {
                case 1: {
                    return Bitmap.Config.RGB_565;
                }
                case 2: {
                    return Bitmap.Config.ALPHA_8;
                }
                default: {
                    return bitmap$Config0;
                }
            }
        }
        return bitmap$Config0;
    }

    private static void D(Bitmap bitmap0, Bitmap bitmap1) {
        bitmap1.setDensity(bitmap0.getDensity());
        bitmap1.setHasAlpha(bitmap0.hasAlpha());
        bitmap1.setPremultiplied(bitmap0.isPremultiplied());
    }

    private static void a(Bitmap bitmap0, int v, int v1, int v2, int v3) {
        boolean z = false;
        com.facebook.common.internal.n.e(v + v2 <= bitmap0.getWidth(), "x + width must be <= bitmap.width()");
        if(v1 + v3 <= bitmap0.getHeight()) {
            z = true;
        }
        com.facebook.common.internal.n.e(z, "y + height must be <= bitmap.height()");
    }

    private static void b(int v, int v1) {
        boolean z = false;
        com.facebook.common.internal.n.e(v > 0, "width must be > 0");
        if(v1 > 0) {
            z = true;
        }
        com.facebook.common.internal.n.e(z, "height must be > 0");
    }

    private static void c(int v, int v1) {
        boolean z = false;
        com.facebook.common.internal.n.e(v >= 0, "x must be >= 0");
        if(v1 >= 0) {
            z = true;
        }
        com.facebook.common.internal.n.e(z, "y must be >= 0");
    }

    public com.facebook.common.references.a d(int v, int v1) {
        return this.e(v, v1, Bitmap.Config.ARGB_8888);
    }

    public com.facebook.common.references.a e(int v, int v1, Bitmap.Config bitmap$Config0) {
        return this.f(v, v1, bitmap$Config0, null);
    }

    public com.facebook.common.references.a f(int v, int v1, Bitmap.Config bitmap$Config0, @h Object object0) {
        return this.z(v, v1, bitmap$Config0);
    }

    private com.facebook.common.references.a g(int v, int v1, Bitmap.Config bitmap$Config0, boolean z) {
        return this.h(v, v1, bitmap$Config0, z, null);
    }

    private com.facebook.common.references.a h(int v, int v1, Bitmap.Config bitmap$Config0, boolean z, @h Object object0) {
        return this.s(null, v, v1, bitmap$Config0, z, object0);
    }

    public com.facebook.common.references.a i(int v, int v1, @h Object object0) {
        return this.f(v, v1, Bitmap.Config.ARGB_8888, object0);
    }

    public com.facebook.common.references.a j(Bitmap bitmap0) {
        return this.o(bitmap0, null);
    }

    public com.facebook.common.references.a k(Bitmap bitmap0, int v, int v1, int v2, int v3) {
        return this.n(bitmap0, v, v1, v2, v3, null);
    }

    public com.facebook.common.references.a l(Bitmap bitmap0, int v, int v1, int v2, int v3, @h Matrix matrix0, boolean z) {
        return this.m(bitmap0, v, v1, v2, v3, matrix0, z, null);
    }

    public com.facebook.common.references.a m(Bitmap bitmap0, int v, int v1, int v2, int v3, @h Matrix matrix0, boolean z, @h Object object0) {
        Paint paint0;
        Canvas canvas0;
        com.facebook.common.references.a a0;
        com.facebook.common.internal.n.j(bitmap0, "Source bitmap cannot be null");
        e.c(v, v1);
        e.b(v2, v3);
        e.a(bitmap0, v, v1, v2, v3);
        Rect rect0 = new Rect(v, v1, v + v2, v1 + v3);
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v2), ((float)v3));
        Bitmap.Config bitmap$Config0 = e.C(bitmap0);
        if(matrix0 == null || matrix0.isIdentity()) {
            a0 = this.h(v2, v3, bitmap$Config0, bitmap0.hasAlpha(), object0);
            e.D(bitmap0, ((Bitmap)a0.n()));
            canvas0 = new Canvas(((Bitmap)a0.n()));
            paint0 = null;
        }
        else {
            boolean z1 = matrix0.rectStaysRect();
            RectF rectF1 = new RectF();
            matrix0.mapRect(rectF1, rectF0);
            int v4 = Math.round(rectF1.width());
            int v5 = Math.round(rectF1.height());
            if(!z1) {
                bitmap$Config0 = Bitmap.Config.ARGB_8888;
            }
            a0 = this.h(v4, v5, bitmap$Config0, !z1 || bitmap0.hasAlpha(), object0);
            e.D(bitmap0, ((Bitmap)a0.n()));
            canvas0 = new Canvas(((Bitmap)a0.n()));
            canvas0.translate(-rectF1.left, -rectF1.top);
            canvas0.concat(matrix0);
            paint0 = new Paint();
            paint0.setFilterBitmap(z);
            if(!z1) {
                paint0.setAntiAlias(true);
            }
        }
        canvas0.drawBitmap(bitmap0, rect0, rectF0, paint0);
        canvas0.setBitmap(null);
        return a0;
    }

    public com.facebook.common.references.a n(Bitmap bitmap0, int v, int v1, int v2, int v3, @h Object object0) {
        return this.m(bitmap0, v, v1, v2, v3, null, false, object0);
    }

    public com.facebook.common.references.a o(Bitmap bitmap0, @h Object object0) {
        return this.n(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), object0);
    }

    public com.facebook.common.references.a p(DisplayMetrics displayMetrics0, int v, int v1, Bitmap.Config bitmap$Config0) {
        return this.q(displayMetrics0, v, v1, bitmap$Config0, null);
    }

    public com.facebook.common.references.a q(DisplayMetrics displayMetrics0, int v, int v1, Bitmap.Config bitmap$Config0, @h Object object0) {
        return this.s(displayMetrics0, v, v1, bitmap$Config0, true, object0);
    }

    private com.facebook.common.references.a r(DisplayMetrics displayMetrics0, int v, int v1, Bitmap.Config bitmap$Config0, boolean z) {
        return this.s(displayMetrics0, v, v1, bitmap$Config0, z, null);
    }

    private com.facebook.common.references.a s(@h DisplayMetrics displayMetrics0, int v, int v1, Bitmap.Config bitmap$Config0, boolean z, @h Object object0) {
        e.b(v, v1);
        com.facebook.common.references.a a0 = this.z(v, v1, bitmap$Config0);
        Bitmap bitmap0 = (Bitmap)a0.n();
        if(displayMetrics0 != null) {
            bitmap0.setDensity(displayMetrics0.densityDpi);
        }
        bitmap0.setHasAlpha(z);
        if(bitmap$Config0 == Bitmap.Config.ARGB_8888 && !z) {
            bitmap0.eraseColor(0xFF000000);
        }
        return a0;
    }

    public com.facebook.common.references.a t(DisplayMetrics displayMetrics0, int[] arr_v, int v, int v1, int v2, int v3, Bitmap.Config bitmap$Config0) {
        return this.u(displayMetrics0, arr_v, v, v1, v2, v3, bitmap$Config0, null);
    }

    public com.facebook.common.references.a u(DisplayMetrics displayMetrics0, int[] arr_v, int v, int v1, int v2, int v3, Bitmap.Config bitmap$Config0, @h Object object0) {
        com.facebook.common.references.a a0 = this.q(displayMetrics0, v2, v3, bitmap$Config0, object0);
        ((Bitmap)a0.n()).setPixels(arr_v, v, v1, 0, 0, v2, v3);
        return a0;
    }

    public com.facebook.common.references.a v(DisplayMetrics displayMetrics0, int[] arr_v, int v, int v1, Bitmap.Config bitmap$Config0) {
        return this.w(displayMetrics0, arr_v, v, v1, bitmap$Config0, null);
    }

    public com.facebook.common.references.a w(DisplayMetrics displayMetrics0, int[] arr_v, int v, int v1, Bitmap.Config bitmap$Config0, @h Object object0) {
        return this.u(displayMetrics0, arr_v, 0, v, v, v1, bitmap$Config0, object0);
    }

    public com.facebook.common.references.a x(int[] arr_v, int v, int v1, Bitmap.Config bitmap$Config0) {
        return this.y(arr_v, v, v1, bitmap$Config0, null);
    }

    public com.facebook.common.references.a y(int[] arr_v, int v, int v1, Bitmap.Config bitmap$Config0, @h Object object0) {
        com.facebook.common.references.a a0 = this.z(v, v1, bitmap$Config0);
        ((Bitmap)a0.n()).setPixels(arr_v, 0, v, 0, 0, v, v1);
        return a0;
    }

    public abstract com.facebook.common.references.a z(int arg1, int arg2, Bitmap.Config arg3);
}

