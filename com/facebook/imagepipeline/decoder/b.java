package com.facebook.imagepipeline.decoder;

import android.graphics.ColorSpace;
import com.facebook.common.internal.q;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.image.e;
import com.facebook.imagepipeline.image.f;
import com.facebook.imagepipeline.image.g;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.image.r;
import java.io.InputStream;
import java.util.Map;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class b implements c {
    class com.facebook.imagepipeline.decoder.b.a implements c {
        final b a;

        @Override  // com.facebook.imagepipeline.decoder.c
        @h
        public e a(l l0, int v, r r0, d d0) {
            ColorSpace colorSpace0;
            X0.c c0 = l0.n();
            if(((Boolean)b.this.e.get()).booleanValue()) {
                colorSpace0 = d0.l;
                if(colorSpace0 == null) {
                    colorSpace0 = l0.j();
                }
            }
            else {
                colorSpace0 = d0.l;
            }
            if(c0 == X0.b.b) {
                return b.this.f(l0, v, r0, d0, colorSpace0);
            }
            if(c0 == X0.b.d) {
                return b.this.e(l0, v, r0, d0);
            }
            if(c0 == X0.b.k) {
                return b.this.d(l0, v, r0, d0);
            }
            if(c0 == X0.b.n) {
                return b.this.h(l0, v, r0, d0);
            }
            if(c0 == X0.c.d) {
                throw new com.facebook.imagepipeline.decoder.a("unknown image format", l0);
            }
            return b.this.g(l0, d0);
        }
    }

    @h
    private final c a;
    @h
    private final c b;
    @h
    private final c c;
    private final com.facebook.imagepipeline.platform.d d;
    private final q e;
    private final c f;
    @h
    private final Map g;

    public b(@h c c0, @h c c1, @h c c2, com.facebook.imagepipeline.platform.d d0) {
        this(c0, c1, c2, d0, null);
    }

    public b(@h c c0, @h c c1, @h c c2, com.facebook.imagepipeline.platform.d d0, @h Map map0) {
        this(c0, c1, c2, d0, map0, com.facebook.common.internal.r.b);
    }

    public b(@h c c0, @h c c1, @h c c2, com.facebook.imagepipeline.platform.d d0, @h Map map0, q q0) {
        this.f = new com.facebook.imagepipeline.decoder.b.a(this);
        this.a = c0;
        this.b = c1;
        this.c = c2;
        this.d = d0;
        this.g = map0;
        this.e = q0;
    }

    @Override  // com.facebook.imagepipeline.decoder.c
    @h
    public e a(l l0, int v, r r0, d d0) {
        c c0 = d0.j;
        if(c0 != null) {
            return c0.a(l0, v, r0, d0);
        }
        X0.c c1 = l0.n();
        if(c1 == null || c1 == X0.c.d) {
            InputStream inputStream0 = l0.o();
            if(inputStream0 != null) {
                c1 = X0.e.f(inputStream0);
                l0.u0(c1);
            }
        }
        Map map0 = this.g;
        if(map0 != null) {
            c c2 = (c)map0.get(c1);
            return c2 == null ? this.f.a(l0, v, r0, d0) : c2.a(l0, v, r0, d0);
        }
        return this.f.a(l0, v, r0, d0);
    }

    @h
    public e d(l l0, int v, r r0, d d0) {
        if(!d0.g) {
            c c0 = this.b;
            if(c0 != null) {
                return c0.a(l0, v, r0, d0);
            }
        }
        return this.g(l0, d0);
    }

    @h
    public e e(l l0, int v, r r0, d d0) {
        if(l0.getWidth() == -1 || l0.getHeight() == -1) {
            throw new com.facebook.imagepipeline.decoder.a("image width or height is incorrect", l0);
        }
        if(!d0.g) {
            c c0 = this.a;
            if(c0 != null) {
                return c0.a(l0, v, r0, d0);
            }
        }
        return this.g(l0, d0);
    }

    public g f(l l0, int v, r r0, d d0, @h ColorSpace colorSpace0) {
        com.facebook.common.references.a a0 = this.d.b(l0, d0.h, null, v, colorSpace0);
        try {
            boolean z = h1.c.a(d0.k, a0);
            com.facebook.common.internal.n.i(a0);
            g g0 = f.d(a0, r0, l0.k3(), l0.A0());
            g0.f("is_rounded", Boolean.valueOf(z && d0.k instanceof h1.b));
            return g0;
        }
        finally {
            com.facebook.common.references.a.j(a0);
        }
    }

    public g g(l l0, d d0) {
        com.facebook.common.references.a a0 = this.d.c(l0, d0.h, null, d0.l);
        try {
            boolean z = h1.c.a(d0.k, a0);
            com.facebook.common.internal.n.i(a0);
            int v1 = l0.k3();
            int v2 = l0.A0();
            g g0 = f.d(a0, com.facebook.imagepipeline.image.q.d, v1, v2);
            g0.f("is_rounded", Boolean.valueOf(z && d0.k instanceof h1.b));
            return g0;
        }
        finally {
            com.facebook.common.references.a.j(a0);
        }
    }

    @h
    private e h(l l0, int v, r r0, d d0) {
        return this.c == null ? null : this.c.a(l0, v, r0, d0);
    }
}

