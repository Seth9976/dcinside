package com.facebook.fresco.animation.factory;

import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.r;
import com.facebook.fresco.animation.bitmap.preparation.f;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.k;
import com.facebook.fresco.vito.options.e;
import com.facebook.imagepipeline.animated.base.g;
import com.facebook.imagepipeline.animated.impl.b;
import com.facebook.imagepipeline.cache.q;
import com.facebook.imagepipeline.image.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class d implements c1.a, e {
    private final b a;
    private final ScheduledExecutorService b;
    private final ExecutorService c;
    private final com.facebook.common.time.d d;
    private final com.facebook.imagepipeline.bitmaps.e e;
    private final q f;
    private final com.facebook.common.internal.q g;
    private final com.facebook.common.internal.q h;
    private final com.facebook.common.internal.q i;
    private final com.facebook.common.internal.q j;
    private final com.facebook.common.internal.q k;
    private final com.facebook.common.internal.q l;
    private final com.facebook.common.internal.q m;
    private final com.facebook.common.internal.q n;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;

    public d(b b0, ScheduledExecutorService scheduledExecutorService0, ExecutorService executorService0, com.facebook.common.time.d d0, com.facebook.imagepipeline.bitmaps.e e0, q q0, com.facebook.common.internal.q q1, com.facebook.common.internal.q q2, com.facebook.common.internal.q q3, com.facebook.common.internal.q q4, com.facebook.common.internal.q q5, com.facebook.common.internal.q q6, com.facebook.common.internal.q q7) {
        this.n = r.b;
        this.a = b0;
        this.b = scheduledExecutorService0;
        this.c = executorService0;
        this.d = d0;
        this.e = e0;
        this.f = q0;
        this.g = q1;
        this.h = q2;
        this.i = q3;
        this.j = q4;
        this.l = q6;
        this.k = q5;
        this.m = q7;
    }

    @Override  // com.facebook.fresco.vito.options.e
    @h
    public Drawable a(Resources resources0, com.facebook.imagepipeline.image.e e0, com.facebook.fresco.vito.options.d d0) {
        com.facebook.fresco.animation.backend.a a0;
        Bitmap.Config bitmap$Config0 = null;
        if(!this.c(e0)) {
            return null;
        }
        c c0 = (c)e0;
        com.facebook.imagepipeline.animated.base.e e1 = c0.x();
        try {
            g g0 = (g)com.facebook.common.internal.n.i(c0.L());
            if(e1 != null) {
                bitmap$Config0 = e1.h();
            }
            a0 = this.f(g0, bitmap$Config0, d0);
        }
        catch(NullPointerException nullPointerException0) {
            Object object0 = e0.v("uri_source");
            throw object0 == null ? nullPointerException0 : new NullPointerException(nullPointerException0.getMessage() + " uri=" + object0.toString());
        }
        return ((Boolean)this.n.get()).booleanValue() ? new com.facebook.fresco.animation.drawable.h(a0) : new com.facebook.fresco.animation.drawable.b(a0);
    }

    @Override  // c1.a
    @h
    public Drawable b(com.facebook.imagepipeline.image.e e0) {
        if(!this.c(e0)) {
            return null;
        }
        com.facebook.imagepipeline.animated.base.e e1 = ((c)e0).x();
        com.facebook.fresco.animation.backend.a a0 = this.f(((g)com.facebook.common.internal.n.i(((c)e0).L())), (e1 == null ? null : e1.h()), null);
        return ((Boolean)this.n.get()).booleanValue() ? new com.facebook.fresco.animation.drawable.h(a0) : new com.facebook.fresco.animation.drawable.b(a0);
    }

    @Override  // c1.a
    public boolean c(com.facebook.imagepipeline.image.e e0) {
        return e0 instanceof c;
    }

    private com.facebook.imagepipeline.animated.base.a d(g g0) {
        com.facebook.imagepipeline.animated.base.e e0 = g0.f();
        Rect rect0 = new Rect(0, 0, e0.getWidth(), e0.getHeight());
        return this.a.a(g0, rect0);
    }

    private com.facebook.imagepipeline.animated.impl.c e(g g0) {
        return new com.facebook.imagepipeline.animated.impl.c(new J0.a(g0.hashCode(), ((Boolean)this.i.get()).booleanValue()), this.f);
    }

    private com.facebook.fresco.animation.backend.a f(g g0, @h Bitmap.Config bitmap$Config0, @h com.facebook.fresco.vito.options.d d0) {
        f f0;
        com.facebook.fresco.animation.bitmap.preparation.b b1;
        com.facebook.fresco.animation.bitmap.preparation.d d2;
        com.facebook.imagepipeline.animated.base.a a0 = this.d(g0);
        com.facebook.fresco.animation.bitmap.wrapper.a a1 = new com.facebook.fresco.animation.bitmap.wrapper.a(a0);
        I0.d d1 = this.g(g0);
        com.facebook.fresco.animation.bitmap.wrapper.b b0 = new com.facebook.fresco.animation.bitmap.wrapper.b(d1, a0, ((Boolean)this.j.get()).booleanValue());
        int v = (int)(((Integer)this.h.get()));
        if(v > 0) {
            d2 = new com.facebook.fresco.animation.bitmap.preparation.d(v);
            b1 = this.h(b0, bitmap$Config0);
        }
        else {
            b1 = null;
            d2 = null;
        }
        com.facebook.fresco.vito.options.g g1 = d0 == null ? null : d0.s();
        if(((Boolean)this.j.get()).booleanValue()) {
            int v1 = (int)(((Integer)this.l.get()));
            int v2 = (int)(((Integer)this.m.get()));
            f0 = new f(g0.h(), a1, b0, new k(this.e, v1, v2), ((Boolean)this.k.get()).booleanValue());
        }
        else {
            f0 = d2;
        }
        boolean z = ((Boolean)this.j.get()).booleanValue();
        return com.facebook.fresco.animation.backend.c.v(new I0.c(this.e, d1, a1, b0, z, f0, b1, g1), this.d, this.b);
    }

    private I0.d g(g g0) {
        switch(((int)(((Integer)this.g.get())))) {
            case 1: {
                return new J0.b(this.e(g0), true);
            }
            case 2: {
                return new J0.b(this.e(g0), false);
            }
            case 3: {
                return new J0.c();
            }
            default: {
                return new J0.d();
            }
        }
    }

    private com.facebook.fresco.animation.bitmap.preparation.b h(I0.e e0, @h Bitmap.Config bitmap$Config0) {
        com.facebook.imagepipeline.bitmaps.e e1 = this.e;
        if(bitmap$Config0 == null) {
            bitmap$Config0 = Bitmap.Config.ARGB_8888;
        }
        return new com.facebook.fresco.animation.bitmap.preparation.c(e1, e0, bitmap$Config0, this.c);
    }
}

