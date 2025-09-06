package com.facebook.imagepipeline.animated.factory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import com.facebook.common.memory.i;
import com.facebook.imagepipeline.animated.base.g;
import com.facebook.imagepipeline.animated.impl.b;
import com.facebook.imagepipeline.image.f;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.image.q;
import java.util.ArrayList;
import java.util.List;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class e implements d {
    private final b a;
    private final com.facebook.imagepipeline.bitmaps.e b;
    private final boolean c;
    private final boolean d;
    @h
    static c e;
    @h
    static c f;

    static {
        e.e = e.g("com.facebook.animated.gif.GifImage");
        e.f = e.g("com.facebook.animated.webp.WebPImage");
    }

    public e(b b0, com.facebook.imagepipeline.bitmaps.e e0, boolean z) {
        this(b0, e0, z, true);
    }

    public e(b b0, com.facebook.imagepipeline.bitmaps.e e0, boolean z, boolean z1) {
        this.a = b0;
        this.b = e0;
        this.c = z;
        this.d = z1;
    }

    @Override  // com.facebook.imagepipeline.animated.factory.d
    public com.facebook.imagepipeline.image.e a(l l0, com.facebook.imagepipeline.common.d d0, Bitmap.Config bitmap$Config0) {
        if(e.e != null) {
            com.facebook.common.references.a a0 = l0.f();
            com.facebook.common.internal.n.i(a0);
            try {
                i i0 = (i)a0.n();
                return this.f(l0.s(), d0, (i0.F() == null ? e.e.f(i0.getNativePtr(), i0.size(), d0) : e.e.c(i0.F(), d0)), bitmap$Config0);
            }
            finally {
                com.facebook.common.references.a.j(a0);
            }
        }
        throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
    }

    @Override  // com.facebook.imagepipeline.animated.factory.d
    public com.facebook.imagepipeline.image.e b(l l0, com.facebook.imagepipeline.common.d d0, Bitmap.Config bitmap$Config0) {
        if(e.f != null) {
            com.facebook.common.references.a a0 = l0.f();
            com.facebook.common.internal.n.i(a0);
            try {
                i i0 = (i)a0.n();
                return this.f(l0.s(), d0, (i0.F() == null ? e.f.f(i0.getNativePtr(), i0.size(), d0) : e.f.c(i0.F(), d0)), bitmap$Config0);
            }
            finally {
                com.facebook.common.references.a.j(a0);
            }
        }
        throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
    }

    @SuppressLint({"NewApi"})
    private com.facebook.common.references.a c(int v, int v1, Bitmap.Config bitmap$Config0) {
        com.facebook.common.references.a a0 = this.b.z(v, v1, bitmap$Config0);
        ((Bitmap)a0.n()).eraseColor(0);
        ((Bitmap)a0.n()).setHasAlpha(true);
        return a0;
    }

    private com.facebook.common.references.a d(com.facebook.imagepipeline.animated.base.e e0, Bitmap.Config bitmap$Config0, int v) {
        class com.facebook.imagepipeline.animated.factory.e.a implements com.facebook.imagepipeline.animated.impl.d.b {
            final e a;

            @Override  // com.facebook.imagepipeline.animated.impl.d$b
            public void a(int v, Bitmap bitmap0) {
            }

            @Override  // com.facebook.imagepipeline.animated.impl.d$b
            @h
            public com.facebook.common.references.a b(int v) {
                return null;
            }
        }

        com.facebook.common.references.a a0 = this.c(e0.getWidth(), e0.getHeight(), bitmap$Config0);
        g g0 = g.b(e0);
        com.facebook.imagepipeline.animated.base.a a1 = this.a.a(g0, null);
        com.facebook.imagepipeline.animated.factory.e.a e$a0 = new com.facebook.imagepipeline.animated.factory.e.a(this);
        new com.facebook.imagepipeline.animated.impl.d(a1, this.c, e$a0).h(v, ((Bitmap)a0.n()));
        return a0;
    }

    private List e(com.facebook.imagepipeline.animated.base.e e0, Bitmap.Config bitmap$Config0) {
        class com.facebook.imagepipeline.animated.factory.e.b implements com.facebook.imagepipeline.animated.impl.d.b {
            final List a;
            final e b;

            com.facebook.imagepipeline.animated.factory.e.b(List list0) {
                this.a = list0;
                super();
            }

            @Override  // com.facebook.imagepipeline.animated.impl.d$b
            public void a(int v, Bitmap bitmap0) {
            }

            @Override  // com.facebook.imagepipeline.animated.impl.d$b
            @h
            public com.facebook.common.references.a b(int v) {
                return com.facebook.common.references.a.e(((com.facebook.common.references.a)this.a.get(v)));
            }
        }

        g g0 = g.b(e0);
        com.facebook.imagepipeline.animated.base.a a0 = this.a.a(g0, null);
        List list0 = new ArrayList(a0.b());
        com.facebook.imagepipeline.animated.factory.e.b e$b0 = new com.facebook.imagepipeline.animated.factory.e.b(this, list0);
        com.facebook.imagepipeline.animated.impl.d d0 = new com.facebook.imagepipeline.animated.impl.d(a0, this.c, e$b0);
        for(int v = 0; v < a0.b(); ++v) {
            com.facebook.common.references.a a1 = this.c(a0.getWidth(), a0.getHeight(), bitmap$Config0);
            d0.h(v, ((Bitmap)a1.n()));
            list0.add(a1);
        }
        return list0;
    }

    private com.facebook.imagepipeline.image.e f(@h String s, com.facebook.imagepipeline.common.d d0, com.facebook.imagepipeline.animated.base.e e0, Bitmap.Config bitmap$Config0) {
        com.facebook.imagepipeline.image.e e2;
        Iterable iterable0;
        com.facebook.imagepipeline.image.e e1;
        int v;
        com.facebook.common.references.a a0 = null;
        try {
            v = d0.d ? e0.b() - 1 : 0;
            if(d0.g) {
                e1 = f.c(this.d(e0, bitmap$Config0, v), q.d, 0);
                goto label_4;
            }
            goto label_7;
        }
        catch(Throwable throwable0) {
            iterable0 = null;
            com.facebook.common.references.a.j(a0);
            com.facebook.common.references.a.k(iterable0);
            throw throwable0;
        }
    label_4:
        com.facebook.common.references.a.j(null);
        com.facebook.common.references.a.k(null);
        return e1;
        try {
        label_7:
            if(d0.f) {
                iterable0 = this.e(e0, bitmap$Config0);
                a0 = com.facebook.common.references.a.e(((com.facebook.common.references.a)((List)iterable0).get(v)));
            }
            else {
                goto label_15;
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
            iterable0 = null;
            com.facebook.common.references.a.j(a0);
            com.facebook.common.references.a.k(iterable0);
            throw throwable0;
        }
        try {
            a0 = com.facebook.common.references.a.e(((com.facebook.common.references.a)((List)iterable0).get(v)));
            goto label_16;
        label_15:
            iterable0 = null;
        label_16:
            if(d0.c && a0 == null) {
                a0 = this.d(e0, bitmap$Config0, v);
            }
            e2 = new com.facebook.imagepipeline.image.c(g.j(e0).k(a0).j(v).i(((List)iterable0)).h(d0.k).l(s).a(), this.d);
        }
        catch(Throwable throwable0) {
            com.facebook.common.references.a.j(a0);
            com.facebook.common.references.a.k(iterable0);
            throw throwable0;
        }
        com.facebook.common.references.a.j(a0);
        com.facebook.common.references.a.k(iterable0);
        return e2;
    }

    @h
    private static c g(String s) {
        try {
            return (c)Class.forName(s).newInstance();
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }
}

