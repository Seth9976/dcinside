package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.cache.common.k;
import com.facebook.common.internal.q;
import com.facebook.common.internal.r;
import java.io.File;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class d {
    public static final class b {
        private int a;
        private String b;
        @h
        private q c;
        private long d;
        private long e;
        private long f;
        private j g;
        @h
        private com.facebook.cache.common.b h;
        @h
        private com.facebook.cache.common.d i;
        @h
        private u0.b j;
        private boolean k;
        @h
        private final Context l;

        private b(@h Context context0) {
            this.a = 1;
            this.b = "image_cache";
            this.d = 0x2800000L;
            this.e = 0xA00000L;
            this.f = 0x200000L;
            this.g = new c();
            this.l = context0;
        }

        b(Context context0, e e0) {
            this(context0);
        }

        public d n() {
            return new d(this);
        }

        public b o(String s) {
            this.b = s;
            return this;
        }

        public b p(File file0) {
            this.c = r.a(file0);
            return this;
        }

        public b q(q q0) {
            this.c = q0;
            return this;
        }

        public b r(com.facebook.cache.common.b b0) {
            this.h = b0;
            return this;
        }

        public b s(com.facebook.cache.common.d d0) {
            this.i = d0;
            return this;
        }

        public b t(u0.b b0) {
            this.j = b0;
            return this;
        }

        public b u(j j0) {
            this.g = j0;
            return this;
        }

        public b v(boolean z) {
            this.k = z;
            return this;
        }

        public b w(long v) {
            this.d = v;
            return this;
        }

        public b x(long v) {
            this.e = v;
            return this;
        }

        public b y(long v) {
            this.f = v;
            return this;
        }

        public b z(int v) {
            this.a = v;
            return this;
        }
    }

    private final int a;
    private final String b;
    private final q c;
    private final long d;
    private final long e;
    private final long f;
    private final j g;
    private final com.facebook.cache.common.b h;
    @h
    private final com.facebook.cache.common.d i;
    private final u0.b j;
    @h
    private final Context k;
    private final boolean l;

    protected d(b d$b0) {
        class com.facebook.cache.disk.d.a implements q {
            final d a;

            public File a() {
                com.facebook.common.internal.n.i(d.this.k);
                return d.this.k.getApplicationContext().getCacheDir();
            }

            @Override  // com.facebook.common.internal.q
            public Object get() {
                return this.a();
            }
        }

        Context context0 = d$b0.l;
        this.k = context0;
        com.facebook.common.internal.n.p(d$b0.c != null || context0 != null, "Either a non-null context or a base directory path or supplier must be provided.");
        if(d$b0.c == null && context0 != null) {
            d$b0.c = new com.facebook.cache.disk.d.a(this);
        }
        this.a = d$b0.a;
        this.b = (String)com.facebook.common.internal.n.i(d$b0.b);
        this.c = (q)com.facebook.common.internal.n.i(d$b0.c);
        this.d = d$b0.d;
        this.e = d$b0.e;
        this.f = d$b0.f;
        this.g = (j)com.facebook.common.internal.n.i(d$b0.g);
        com.facebook.cache.common.b b0 = d$b0.h == null ? com.facebook.cache.common.j.b() : d$b0.h;
        this.h = b0;
        com.facebook.cache.common.d d0 = d$b0.i == null ? k.i() : d$b0.i;
        this.i = d0;
        u0.b b1 = d$b0.j == null ? u0.c.c() : d$b0.j;
        this.j = b1;
        this.l = d$b0.k;
    }

    public String b() {
        return this.b;
    }

    public q c() {
        return this.c;
    }

    public com.facebook.cache.common.b d() {
        return this.h;
    }

    @h
    public com.facebook.cache.common.d e() {
        return this.i;
    }

    @h
    public Context f() {
        return this.k;
    }

    public long g() {
        return this.d;
    }

    public u0.b h() {
        return this.j;
    }

    public j i() {
        return this.g;
    }

    public boolean j() {
        return this.l;
    }

    public long k() {
        return this.e;
    }

    public long l() {
        return this.f;
    }

    public int m() {
        return this.a;
    }

    public static b n(@h Context context0) {
        return new b(context0, null);
    }
}

