package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.facebook.imagepipeline.animated.base.g;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class d {
    static class com.facebook.imagepipeline.animated.impl.d.a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            com.facebook.imagepipeline.animated.impl.d.a.a = arr_v;
            try {
                arr_v[c.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.imagepipeline.animated.impl.d.a.a[c.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.imagepipeline.animated.impl.d.a.a[c.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.imagepipeline.animated.impl.d.a.a[c.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public interface b {
        void a(int arg1, Bitmap arg2);

        @h
        com.facebook.common.references.a b(int arg1);
    }

    static enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT;

    }

    private final com.facebook.imagepipeline.animated.base.a a;
    private final b b;
    private final Paint c;
    private final boolean d;

    public d(com.facebook.imagepipeline.animated.base.a a0, boolean z, b d$b0) {
        this.a = a0;
        this.b = d$b0;
        this.d = z;
        Paint paint0 = new Paint();
        this.c = paint0;
        paint0.setColor(0);
        paint0.setStyle(Paint.Style.FILL);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas0, com.facebook.imagepipeline.animated.base.b b0) {
        canvas0.drawRect(((float)b0.b), ((float)b0.c), ((float)(b0.b + b0.d)), ((float)(b0.c + b0.e)), this.c);
    }

    private c b(int v) {
        com.facebook.imagepipeline.animated.base.b b0 = this.a.e(v);
        com.facebook.imagepipeline.animated.base.b.b b$b0 = b0.g;
        if(b$b0 == com.facebook.imagepipeline.animated.base.b.b.a) {
            return c.a;
        }
        if(b$b0 == com.facebook.imagepipeline.animated.base.b.b.b) {
            return this.c(b0) ? c.b : c.a;
        }
        return b$b0 == com.facebook.imagepipeline.animated.base.b.b.c ? c.c : c.d;
    }

    private boolean c(com.facebook.imagepipeline.animated.base.b b0) {
        if(b0.b == 0 && b0.c == 0) {
            int v = this.a.i();
            if(b0.d == v) {
                int v1 = this.a.q();
                return b0.e == v1;
            }
        }
        return false;
    }

    private boolean d(int v) {
        if(v == 0) {
            return true;
        }
        com.facebook.imagepipeline.animated.base.b b0 = this.a.e(v);
        com.facebook.imagepipeline.animated.base.b b1 = this.a.e(v - 1);
        return b0.f != com.facebook.imagepipeline.animated.base.b.a.b || !this.c(b0) ? b1.g == com.facebook.imagepipeline.animated.base.b.b.b && this.c(b1) : true;
    }

    private void e(Bitmap bitmap0) {
        g g0 = this.a.k();
        if(g0 == null) {
            return;
        }
        h1.a a0 = g0.c();
        if(a0 == null) {
            return;
        }
        a0.b(bitmap0);
    }

    private int f(int v, Canvas canvas0) {
        while(v >= 0) {
            switch(this.b(v)) {
                case 1: {
                    com.facebook.imagepipeline.animated.base.b b0 = this.a.e(v);
                    com.facebook.common.references.a a0 = this.b.b(v);
                    if(a0 != null) {
                        try {
                            canvas0.drawBitmap(((Bitmap)a0.n()), 0.0f, 0.0f, null);
                            if(b0.g == com.facebook.imagepipeline.animated.base.b.b.b) {
                                this.a(canvas0, b0);
                            }
                            return v + 1;
                        }
                        finally {
                            if(!this.d) {
                                a0.close();
                            }
                        }
                    }
                    if(this.d(v)) {
                        return v;
                    }
                    break;
                }
                case 2: {
                    return v + 1;
                }
                case 3: {
                    return v;
                }
            }
            --v;
        }
        return 0;
    }

    public void g(int v, Bitmap bitmap0) {
        Canvas canvas0 = new Canvas(bitmap0);
        this.a.r(v, canvas0);
    }

    public void h(int v, Bitmap bitmap0) {
        if(this.d) {
            this.g(v, bitmap0);
            return;
        }
        Canvas canvas0 = new Canvas(bitmap0);
        canvas0.drawColor(0, PorterDuff.Mode.SRC);
        for(int v1 = this.d(v) ? v : this.f(v - 1, canvas0); v1 < v; ++v1) {
            com.facebook.imagepipeline.animated.base.b b0 = this.a.e(v1);
            com.facebook.imagepipeline.animated.base.b.b b$b0 = b0.g;
            if(b$b0 != com.facebook.imagepipeline.animated.base.b.b.c) {
                if(b0.f == com.facebook.imagepipeline.animated.base.b.a.b) {
                    this.a(canvas0, b0);
                }
                this.a.l(v1, canvas0);
                this.b.a(v1, bitmap0);
                if(b$b0 == com.facebook.imagepipeline.animated.base.b.b.b) {
                    this.a(canvas0, b0);
                }
            }
        }
        com.facebook.imagepipeline.animated.base.b b1 = this.a.e(v);
        if(b1.f == com.facebook.imagepipeline.animated.base.b.a.b) {
            this.a(canvas0, b1);
        }
        this.a.l(v, canvas0);
        this.e(bitmap0);
    }
}

