package com.facebook.drawee.backends.pipeline;

import S0.g;
import android.content.Context;
import android.net.Uri;
import com.facebook.cache.common.e;
import com.facebook.common.internal.i;
import com.facebook.drawee.backends.pipeline.info.d;
import com.facebook.drawee.controller.b.c;
import com.facebook.drawee.controller.b;
import com.facebook.imagepipeline.core.x;
import java.util.Set;
import k1.n.a;
import k1.n;

@n(a.a)
public class f extends b {
    static class com.facebook.drawee.backends.pipeline.f.a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            com.facebook.drawee.backends.pipeline.f.a.a = arr_v;
            try {
                arr_v[c.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.backends.pipeline.f.a.a[c.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.backends.pipeline.f.a.a[c.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final x v;
    private final h w;
    @o3.h
    private i x;
    @o3.h
    private d y;
    @o3.h
    private g z;

    public f(Context context0, h h0, x x0, Set set0, Set set1) {
        super(context0, set0, set1);
        this.v = x0;
        this.w = h0;
    }

    @Override  // com.facebook.drawee.controller.b
    protected com.facebook.drawee.controller.a F() {
        return this.c0();
    }

    public static com.facebook.imagepipeline.request.d.d Y(c b$c0) {
        switch(b$c0) {
            case 1: {
                return com.facebook.imagepipeline.request.d.d.b;
            }
            case 2: {
                return com.facebook.imagepipeline.request.d.d.c;
            }
            case 3: {
                return com.facebook.imagepipeline.request.d.d.e;
            }
            default: {
                throw new RuntimeException("Cache level" + b$c0 + "is not supported. ");
            }
        }
    }

    @o3.h
    private e Z() {
        com.facebook.imagepipeline.request.d d0 = (com.facebook.imagepipeline.request.d)this.t();
        com.facebook.imagepipeline.cache.n n0 = this.v.A();
        if(n0 != null && d0 != null) {
            return d0.p() == null ? n0.c(d0, this.i()) : n0.a(d0, this.i());
        }
        return null;
    }

    protected com.facebook.datasource.d a0(E0.a a0, String s, com.facebook.imagepipeline.request.d d0, Object object0, c b$c0) {
        com.facebook.imagepipeline.request.d.d d$d0 = f.Y(b$c0);
        f1.f f0 = this.b0(a0);
        return this.v.q(d0, object0, d$d0, f0, s);
    }

    // 去混淆评级： 低(20)
    @o3.h
    protected f1.f b0(E0.a a0) {
        return a0 instanceof com.facebook.drawee.backends.pipeline.e ? ((com.facebook.drawee.backends.pipeline.e)a0).x0() : null;
    }

    @Override  // E0.d
    public E0.d c(@o3.h Uri uri0) {
        return this.i0(uri0);
    }

    protected com.facebook.drawee.backends.pipeline.e c0() {
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            E0.a a0 = this.w();
            com.facebook.drawee.backends.pipeline.e e0 = a0 instanceof com.facebook.drawee.backends.pipeline.e ? ((com.facebook.drawee.backends.pipeline.e)a0) : this.w.c();
            e0.A0(this.G(e0, "0"), "0", this.Z(), this.i(), this.x);
            e0.B0(this.z, this);
            return e0;
        }
        finally {
            if(com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    @Override  // E0.d
    public E0.d d(@o3.h String s) {
        return this.j0(s);
    }

    public f d0(@o3.h i i0) {
        this.x = i0;
        return this;
    }

    public f e0(c1.a[] arr_a) {
        com.facebook.common.internal.n.i(arr_a);
        return this.d0(i.b(arr_a));
    }

    public f f0(c1.a a0) {
        com.facebook.common.internal.n.i(a0);
        return this.d0(i.b(new c1.a[]{a0}));
    }

    public f g0(@o3.h d d0) {
        this.y = d0;
        return this;
    }

    public f h0(@o3.h g g0) {
        this.z = g0;
        return this;
    }

    public f i0(@o3.h Uri uri0) {
        return uri0 == null ? ((f)super.Q(null)) : ((f)super.Q(com.facebook.imagepipeline.request.e.B(uri0).T(com.facebook.imagepipeline.common.h.e()).b()));
    }

    public f j0(@o3.h String s) {
        return s == null || s.isEmpty() ? ((f)super.Q(com.facebook.imagepipeline.request.d.c(s))) : this.i0(Uri.parse(s));
    }

    @Override  // com.facebook.drawee.controller.b
    protected com.facebook.datasource.d n(E0.a a0, String s, Object object0, Object object1, c b$c0) {
        return this.a0(a0, s, ((com.facebook.imagepipeline.request.d)object0), object1, b$c0);
    }
}

