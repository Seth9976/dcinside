package com.dcinside.app.image;

import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.request.i;
import java.io.File;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class o {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final void a(@l ImageView imageView0) {
            L.p(imageView0, "view");
            s.b(imageView0);
        }

        @l
        @n
        public final r b(@l ImageView imageView0, int v) {
            L.p(imageView0, "view");
            return s.e(imageView0, v);
        }

        @l
        @n
        public final r c(@l ImageView imageView0, @m Uri uri0) {
            L.p(imageView0, "view");
            return s.f(imageView0, uri0);
        }

        @l
        @n
        public final r d(@l ImageView imageView0, @m File file0) {
            L.p(imageView0, "view");
            return s.g(imageView0, file0);
        }

        @l
        @n
        public final r e(@l ImageView imageView0, @m String s) {
            L.p(imageView0, "view");
            return s.h(imageView0, s);
        }

        @l
        @n
        public final r f(@l ImageView imageView0, @m String s) {
            L.p(imageView0, "view");
            return s.i(imageView0, s);
        }

        @l
        @n
        public final r g(@l ImageView imageView0, int v, int v1) {
            L.p(imageView0, "view");
            return s.l(imageView0, v, v1);
        }

        @l
        @n
        public final r h(@l ImageView imageView0, @m String s, int v) {
            L.p(imageView0, "view");
            return s.m(imageView0, s, v);
        }
    }

    public static final class b {
        static final class com.dcinside.app.image.o.b.a extends N implements A3.a {
            public static final com.dcinside.app.image.o.b.a e;

            static {
                com.dcinside.app.image.o.b.a.e = new com.dcinside.app.image.o.b.a();
            }

            com.dcinside.app.image.o.b.a() {
                super(0);
            }

            @l
            public final i b() {
                com.bumptech.glide.request.a a0 = new i().r(j.c);
                L.o(a0, "diskCacheStrategy(...)");
                return (i)a0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        static final class com.dcinside.app.image.o.b.b extends N implements A3.a {
            public static final com.dcinside.app.image.o.b.b e;

            static {
                com.dcinside.app.image.o.b.b.e = new com.dcinside.app.image.o.b.b();
            }

            com.dcinside.app.image.o.b.b() {
                super(0);
            }

            @l
            public final i b() {
                com.bumptech.glide.request.a a0 = new i().r(j.d);
                L.o(a0, "diskCacheStrategy(...)");
                return (i)a0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        static final class c extends N implements A3.a {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(0);
            }

            @l
            public final i b() {
                com.bumptech.glide.request.a a0 = new i().x(0x7F08044F);  // drawable:not_import_img
                L.o(a0, "error(...)");
                return (i)a0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        static final class d extends N implements A3.a {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(0);
            }

            @l
            public final i b() {
                com.bumptech.glide.request.a a0 = new i().x(0x7F0801F7);  // drawable:fly640
                L.o(a0, "error(...)");
                return (i)a0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        static final class e extends N implements A3.a {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(0);
            }

            @l
            public final i b() {
                com.bumptech.glide.request.a a0 = ((i)((i)new i().r(j.c)).I0(true)).v0(0);
                L.o(a0, "override(...)");
                return (i)a0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        static final class f extends N implements A3.a {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
                super(0);
            }

            @l
            public final i b() {
                com.bumptech.glide.request.a a0 = new i().w0(0x80000000, 0x80000000);
                L.o(a0, "override(...)");
                return (i)a0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        static final class g extends N implements A3.a {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(0);
            }

            @l
            public final i b() {
                com.bumptech.glide.request.a a0 = new i().z0(com.bumptech.glide.j.b);
                L.o(a0, "priority(...)");
                return (i)a0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        static final class h extends N implements A3.a {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(0);
            }

            @l
            public final i b() {
                com.bumptech.glide.request.a a0 = ((i)new i().I0(true)).r(j.b);
                L.o(a0, "diskCacheStrategy(...)");
                return (i)a0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        @l
        public static final b a;
        @l
        @z3.f
        public static final com.dcinside.app.glide.b b;
        @l
        @z3.f
        public static final i c;
        @l
        private static final D d;
        @l
        private static final D e;
        @l
        private static final D f;
        @l
        private static final D g;
        @l
        private static final D h;
        @l
        private static final D i;
        @l
        private static final D j;
        @l
        private static final D k;

        static {
            b.a = new b();
            com.dcinside.app.glide.b b0 = com.dcinside.app.glide.b.G2(true).f2();
            L.o(b0, "lock(...)");
            b.b = b0;
            com.bumptech.glide.request.a a0 = ((i)i.t1(true).r(j.b)).l0();
            L.o(a0, "lock(...)");
            b.c = (i)a0;
            b.d = E.a(g.e);
            b.e = E.a(e.e);
            b.f = E.a(f.e);
            b.g = E.a(h.e);
            b.h = E.a(com.dcinside.app.image.o.b.b.e);
            b.i = E.a(com.dcinside.app.image.o.b.a.e);
            b.j = E.a(c.e);
            b.k = E.a(d.e);
        }

        @l
        public static final i a() {
            return (i)b.i.getValue();
        }

        @n
        public static void b() {
        }

        @l
        public static final i c() {
            return (i)b.h.getValue();
        }

        @n
        public static void d() {
        }

        @l
        public final i e() {
            return (i)b.j.getValue();
        }

        @l
        public final i f() {
            return (i)b.k.getValue();
        }

        @l
        public static final i g() {
            return (i)b.e.getValue();
        }

        @n
        public static void h() {
        }

        @l
        public final i i() {
            return (i)b.f.getValue();
        }

        @l
        public static final i j() {
            return (i)b.d.getValue();
        }

        @n
        public static void k() {
        }

        @l
        public static final i l() {
            return (i)b.g.getValue();
        }

        @n
        public static void m() {
        }
    }

    @l
    public static final a a;

    static {
        o.a = new a(null);
    }

    @n
    public static final void a(@l ImageView imageView0) {
        o.a.a(imageView0);
    }

    @l
    @n
    public static final r b(@l ImageView imageView0, int v) {
        return o.a.b(imageView0, v);
    }

    @l
    @n
    public static final r c(@l ImageView imageView0, @m Uri uri0) {
        return o.a.c(imageView0, uri0);
    }

    @l
    @n
    public static final r d(@l ImageView imageView0, @m File file0) {
        return o.a.d(imageView0, file0);
    }

    @l
    @n
    public static final r e(@l ImageView imageView0, @m String s) {
        return o.a.e(imageView0, s);
    }

    @l
    @n
    public static final r f(@l ImageView imageView0, @m String s) {
        return o.a.f(imageView0, s);
    }

    @l
    @n
    public static final r g(@l ImageView imageView0, int v, int v1) {
        return o.a.g(imageView0, v, v1);
    }

    @l
    @n
    public static final r h(@l ImageView imageView0, @m String s, int v) {
        return o.a.h(imageView0, s, v);
    }
}

