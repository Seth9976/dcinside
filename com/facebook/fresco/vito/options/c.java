package com.facebook.fresco.vito.options;

import com.facebook.imagepipeline.common.f;
import com.facebook.imagepipeline.request.d.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

public class c {
    @s0({"SMAP\nEncodedImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EncodedImageOptions.kt\ncom/facebook/fresco/vito/options/EncodedImageOptions$Builder\n*L\n1#1,91:1\n86#1,2:92\n86#1,2:94\n86#1,2:96\n*S KotlinDebug\n*F\n+ 1 EncodedImageOptions.kt\ncom/facebook/fresco/vito/options/EncodedImageOptions$Builder\n*L\n75#1:92,2\n77#1:94,2\n79#1:96,2\n*E\n"})
    public static class a {
        @m
        private f a;
        @m
        private b b;
        @m
        private String c;

        protected a() {
        }

        protected a(@l c c0) {
            L.p(c0, "defaultOptions");
            super();
            this.a = c0.d();
            this.b = c0.b();
            this.c = c0.c();
        }

        @l
        public c a() {
            return new c(this);
        }

        @l
        public final a b(@m b d$b0) {
            this.b = d$b0;
            return this.g();
        }

        @l
        public final a c(@m String s) {
            this.c = s;
            return this.g();
        }

        @m
        public final b d() {
            return this.b;
        }

        @m
        public final String e() {
            return this.c;
        }

        @m
        public final f f() {
            return this.a;
        }

        @l
        protected final a g() {
            L.n(this, "null cannot be cast to non-null type T of com.facebook.fresco.vito.options.EncodedImageOptions.Builder");
            return this;
        }

        private final a h(Function1 function10) {
            function10.invoke(this);
            return this.g();
        }

        @l
        public final a i(@m f f0) {
            this.a = f0;
            return this.g();
        }

        public final void j(@m b d$b0) {
            this.b = d$b0;
        }

        public final void k(@m String s) {
            this.c = s;
        }

        public final void l(@m f f0) {
            this.a = f0;
        }
    }

    @m
    private final f a;
    @m
    private final b b;
    @m
    private final String c;

    public c(@l a c$a0) {
        L.p(c$a0, "builder");
        super();
        this.a = c$a0.f();
        this.b = c$a0.d();
        String s = c$a0.e();
        this.c = s;
        if(c$a0.d() == b.c) {
            if(s == null) {
                throw new com.facebook.imagepipeline.request.e.a("Disk cache id must be set for dynamic cache choice");
            }
        }
        else if(s != null && s.length() != 0) {
            throw new com.facebook.imagepipeline.request.e.a("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
        }
    }

    protected final boolean a(@l c c0) {
        L.p(c0, "other");
        return com.facebook.common.internal.l.a(this.a, c0.a) && com.facebook.common.internal.l.a(this.b, c0.b) && com.facebook.common.internal.l.a(this.c, c0.c);
    }

    @m
    public final b b() {
        return this.b;
    }

    @m
    public final String c() {
        return this.c;
    }

    @m
    public final f d() {
        return this.a;
    }

    @l
    protected com.facebook.common.internal.l.a e() {
        com.facebook.common.internal.l.a l$a0 = com.facebook.common.internal.l.e(this).f("priority", this.a).f("cacheChoice", this.b).f("diskCacheId", this.c);
        L.o(l$a0, "add(...)");
        return l$a0;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || !L.g(this.getClass(), object0.getClass()) ? false : this.a(((c)object0));
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        String s = this.e().toString();
        L.o(s, "toString(...)");
        return s;
    }
}

