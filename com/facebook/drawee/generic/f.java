package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.d;
import com.facebook.drawee.drawable.j;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.drawable.p;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.drawable.s;
import com.facebook.imagepipeline.systrace.b;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class f {
    private static final String a = "WrappingUtils";
    private static final Drawable b;

    static {
        f.b = new ColorDrawable(0);
    }

    private static Drawable a(Drawable drawable0, e e0, Resources resources0) {
        if(drawable0 instanceof BitmapDrawable) {
            Drawable drawable1 = new com.facebook.drawee.drawable.n(resources0, ((BitmapDrawable)drawable0).getBitmap(), ((BitmapDrawable)drawable0).getPaint(), e0.l());
            f.b(((m)drawable1), e0);
            return drawable1;
        }
        if(drawable0 instanceof NinePatchDrawable) {
            Drawable drawable2 = new r(((NinePatchDrawable)drawable0));
            f.b(((m)drawable2), e0);
            return drawable2;
        }
        if(drawable0 instanceof ColorDrawable) {
            Drawable drawable3 = o.a(((ColorDrawable)drawable0));
            f.b(((m)drawable3), e0);
            return drawable3;
        }
        x0.a.q0("WrappingUtils", "Don\'t know how to round that drawable: %s", new Object[]{drawable0});
        return drawable0;
    }

    static void b(m m0, e e0) {
        m0.d(e0.m());
        m0.v(e0.g());
        m0.b(e0.e(), e0.f());
        m0.e(e0.j());
        m0.s(e0.o());
        m0.l(e0.k());
        m0.g(e0.l());
    }

    static d c(d d0) {
        while(true) {
            Drawable drawable0 = d0.o();
            if(drawable0 == d0 || !(drawable0 instanceof d)) {
                break;
            }
            d0 = (d)drawable0;
        }
        return d0;
    }

    @h
    static Drawable d(@h Drawable drawable0, @h e e0, Resources resources0) {
        Drawable drawable1;
        try {
            if(b.e()) {
                b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if(drawable0 != null && e0 != null && e0.n() == com.facebook.drawee.generic.e.a.b) {
                if(drawable0 instanceof com.facebook.drawee.drawable.h) {
                    d d0 = f.c(((com.facebook.drawee.drawable.h)drawable0));
                    d0.a(f.a(d0.a(f.b), e0, resources0));
                    goto label_6;
                }
                drawable1 = f.a(drawable0, e0, resources0);
                goto label_15;
            }
            goto label_18;
        }
        catch(Throwable throwable0) {
            goto label_12;
        }
    label_6:
        if(b.e()) {
            b.c();
        }
        return drawable0;
        try {
            drawable1 = f.a(drawable0, e0, resources0);
            goto label_15;
        }
        catch(Throwable throwable0) {
        }
    label_12:
        if(b.e()) {
            b.c();
        }
        throw throwable0;
    label_15:
        if(b.e()) {
            b.c();
        }
        return drawable1;
    label_18:
        if(b.e()) {
            b.c();
        }
        return drawable0;
    }

    @h
    static Drawable e(@h Drawable drawable0, @h Matrix matrix0) {
        return drawable0 != null && matrix0 != null ? new j(drawable0, matrix0) : drawable0;
    }

    @h
    static Drawable f(@h Drawable drawable0, @h e e0) {
        Drawable drawable1;
        try {
            if(b.e()) {
                b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if(drawable0 != null && e0 != null && e0.n() == com.facebook.drawee.generic.e.a.a) {
                drawable1 = new p(drawable0);
                f.b(((m)drawable1), e0);
                ((p)drawable1).B(e0.i());
                goto label_11;
            }
            goto label_14;
        }
        catch(Throwable throwable0) {
        }
        if(b.e()) {
            b.c();
        }
        throw throwable0;
    label_11:
        if(b.e()) {
            b.c();
        }
        return drawable1;
    label_14:
        if(b.e()) {
            b.c();
        }
        return drawable0;
    }

    @h
    static Drawable g(@h Drawable drawable0, @h com.facebook.drawee.drawable.t.d t$d0) {
        return f.h(drawable0, t$d0, null);
    }

    @h
    static Drawable h(@h Drawable drawable0, @h com.facebook.drawee.drawable.t.d t$d0, @h PointF pointF0) {
        if(b.e()) {
            b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if(drawable0 != null && t$d0 != null) {
            Drawable drawable1 = new s(drawable0, t$d0);
            if(pointF0 != null) {
                ((s)drawable1).L(pointF0);
            }
            if(b.e()) {
                b.c();
            }
            return drawable1;
        }
        if(b.e()) {
            b.c();
        }
        return drawable0;
    }

    static void i(m m0) {
        m0.d(false);
        m0.f(0.0f);
        m0.b(0, 0.0f);
        m0.e(0.0f);
        m0.s(false);
        m0.l(false);
        m0.g(false);
    }

    static void j(d d0, @h e e0, Resources resources0) {
        d d1 = f.c(d0);
        Drawable drawable0 = d1.o();
        if(e0 != null && e0.n() == com.facebook.drawee.generic.e.a.b) {
            if(drawable0 instanceof m) {
                f.b(((m)drawable0), e0);
                return;
            }
            if(drawable0 != null) {
                d1.a(f.b);
                d1.a(f.a(drawable0, e0, resources0));
            }
        }
        else if(drawable0 instanceof m) {
            f.i(((m)drawable0));
        }
    }

    static void k(d d0, @h e e0) {
        Drawable drawable0 = d0.o();
        if(e0 != null && e0.n() == com.facebook.drawee.generic.e.a.a) {
            if(drawable0 instanceof p) {
                f.b(((p)drawable0), e0);
                ((p)drawable0).B(e0.i());
                return;
            }
            d0.a(f.f(d0.a(f.b), e0));
            return;
        }
        if(drawable0 instanceof p) {
            d0.a(((p)drawable0).y(f.b));
            f.b.setCallback(null);
        }
    }

    static s l(d d0, com.facebook.drawee.drawable.t.d t$d0) {
        Drawable drawable0 = f.g(d0.a(f.b), t$d0);
        d0.a(drawable0);
        com.facebook.common.internal.n.j(drawable0, "Parent has no child drawable!");
        return (s)drawable0;
    }
}

