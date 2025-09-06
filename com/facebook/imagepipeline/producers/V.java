package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.d.b;
import com.facebook.imagepipeline.request.d;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class v {
    public static final class a extends Exception {
        public a(@m String s) {
            super(s);
        }
    }

    @l
    public static final v a;

    static {
        v.a = new v();
    }

    @m
    @n
    public static final com.facebook.imagepipeline.cache.m a(@l d d0, @m com.facebook.imagepipeline.cache.m m0, @m com.facebook.imagepipeline.cache.m m1, @m Map map0) {
        L.p(d0, "imageRequest");
        if(d0.f() == b.a) {
            return m0;
        }
        if(d0.f() == b.b) {
            return m1;
        }
        if(d0.f() == b.c && map0 != null) {
            String s = d0.i();
            return s == null ? null : ((com.facebook.imagepipeline.cache.m)map0.get(s));
        }
        return null;
    }
}

