package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.e;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.h;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class c implements e {
    @l
    private final String a;
    @m
    private final g b;
    @l
    private final h c;
    @l
    private final d d;
    @m
    private final e e;
    @m
    private final String f;
    @m
    private Object g;
    private final int h;
    private final long i;

    public c(@l String s, @m g g0, @l h h0, @l d d0, @m e e0, @m String s1) {
        L.p(s, "sourceString");
        L.p(h0, "rotationOptions");
        L.p(d0, "imageDecodeOptions");
        super();
        this.a = s;
        this.b = g0;
        this.c = h0;
        this.d = d0;
        this.e = e0;
        this.f = s1;
        int v = s.hashCode();
        int v1 = 0;
        int v2 = g0 == null ? 0 : g0.hashCode();
        int v3 = h0.hashCode();
        int v4 = d0.hashCode();
        int v5 = e0 == null ? 0 : e0.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        this.h = ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
        this.i = RealtimeSinceBootClock.get().now();
    }

    @Override  // com.facebook.cache.common.e
    @l
    public String a() {
        return this.a;
    }

    @Override  // com.facebook.cache.common.e
    public boolean b() {
        return false;
    }

    @Override  // com.facebook.cache.common.e
    public boolean c(@l Uri uri0) {
        L.p(uri0, "uri");
        String s = uri0.toString();
        L.o(s, "toString(...)");
        return v.W2(this.a(), s, false, 2, null);
    }

    @l
    public final String d() {
        return this.a;
    }

    @m
    public final g e() {
        return this.b;
    }

    @Override  // com.facebook.cache.common.e
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(c.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        return L.g(this.a, ((c)object0).a) && L.g(this.b, ((c)object0).b) && L.g(this.c, ((c)object0).c) && L.g(this.d, ((c)object0).d) && L.g(this.e, ((c)object0).e) && L.g(this.f, ((c)object0).f);
    }

    @l
    public final h f() {
        return this.c;
    }

    @l
    public final d g() {
        return this.d;
    }

    @m
    public final e h() {
        return this.e;
    }

    @Override  // com.facebook.cache.common.e
    public int hashCode() {
        return this.h;
    }

    @m
    public final String i() {
        return this.f;
    }

    @l
    public final c j(@l String s, @m g g0, @l h h0, @l d d0, @m e e0, @m String s1) {
        L.p(s, "sourceString");
        L.p(h0, "rotationOptions");
        L.p(d0, "imageDecodeOptions");
        return new c(s, g0, h0, d0, e0, s1);
    }

    public static c k(c c0, String s, g g0, h h0, d d0, e e0, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = c0.a;
        }
        if((v & 2) != 0) {
            g0 = c0.b;
        }
        if((v & 4) != 0) {
            h0 = c0.c;
        }
        if((v & 8) != 0) {
            d0 = c0.d;
        }
        if((v & 16) != 0) {
            e0 = c0.e;
        }
        if((v & 0x20) != 0) {
            s1 = c0.f;
        }
        return c0.j(s, g0, h0, d0, e0, s1);
    }

    @m
    public final Object l() {
        return this.g;
    }

    @l
    public final d m() {
        return this.d;
    }

    public final long n() {
        return this.i;
    }

    @m
    public final e o() {
        return this.e;
    }

    @m
    public final String p() {
        return this.f;
    }

    @m
    public final g q() {
        return this.b;
    }

    @l
    public final h r() {
        return this.c;
    }

    @l
    public final String s() {
        return this.a;
    }

    public final void t(@m Object object0) {
        this.g = object0;
    }

    @Override  // com.facebook.cache.common.e
    @l
    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}

