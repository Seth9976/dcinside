package com.bumptech.glide;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.bitmap_recycle.f;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.cache.l;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.i;
import com.bumptech.glide.util.m;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class d {
    class a implements com.bumptech.glide.c.a {
        final d a;

        @Override  // com.bumptech.glide.c$a
        @NonNull
        public i build() {
            return new i();
        }
    }

    static final class c implements b {
    }

    public static final class com.bumptech.glide.d.d implements b {
    }

    static final class e implements b {
        final int a;

        e(int v) {
            this.a = v;
        }
    }

    private final Map a;
    private final com.bumptech.glide.f.a b;
    private k c;
    private com.bumptech.glide.load.engine.bitmap_recycle.e d;
    private com.bumptech.glide.load.engine.bitmap_recycle.b e;
    private j f;
    private com.bumptech.glide.load.engine.executor.a g;
    private com.bumptech.glide.load.engine.executor.a h;
    private com.bumptech.glide.load.engine.cache.a.a i;
    private l j;
    private com.bumptech.glide.manager.c k;
    private int l;
    private com.bumptech.glide.c.a m;
    @Nullable
    private com.bumptech.glide.manager.o.b n;
    private com.bumptech.glide.load.engine.executor.a o;
    private boolean p;
    @Nullable
    private List q;

    public d() {
        this.a = new ArrayMap();
        this.b = new com.bumptech.glide.f.a();
        this.l = 4;
        this.m = new a(this);
    }

    @NonNull
    public d a(@NonNull h h0) {
        if(this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(h0);
        return this;
    }

    @NonNull
    com.bumptech.glide.c b(@NonNull Context context0, List list0, com.bumptech.glide.module.a a0) {
        if(this.g == null) {
            this.g = com.bumptech.glide.load.engine.executor.a.k();
        }
        if(this.h == null) {
            this.h = com.bumptech.glide.load.engine.executor.a.g();
        }
        if(this.o == null) {
            this.o = com.bumptech.glide.load.engine.executor.a.d();
        }
        if(this.j == null) {
            this.j = new com.bumptech.glide.load.engine.cache.l.a(context0).a();
        }
        if(this.k == null) {
            this.k = new com.bumptech.glide.manager.e();
        }
        if(this.d == null) {
            int v = this.j.b();
            this.d = v > 0 ? new com.bumptech.glide.load.engine.bitmap_recycle.k(((long)v)) : new f();
        }
        if(this.e == null) {
            this.e = new com.bumptech.glide.load.engine.bitmap_recycle.j(this.j.a());
        }
        if(this.f == null) {
            this.f = new com.bumptech.glide.load.engine.cache.i(((long)this.j.d()));
        }
        if(this.i == null) {
            this.i = new com.bumptech.glide.load.engine.cache.h(context0);
        }
        if(this.c == null) {
            this.c = new k(this.f, this.i, this.h, this.g, com.bumptech.glide.load.engine.executor.a.n(), this.o, this.p);
        }
        List list1 = this.q;
        this.q = list1 == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(list1);
        com.bumptech.glide.f f0 = this.b.c();
        o o0 = new o(this.n);
        return new com.bumptech.glide.c(context0, this.c, this.f, this.d, this.e, o0, this.k, this.l, this.m, this.a, this.q, list0, a0, f0);
    }

    @NonNull
    public d c(@Nullable com.bumptech.glide.load.engine.executor.a a0) {
        this.o = a0;
        return this;
    }

    @NonNull
    public d d(@Nullable com.bumptech.glide.load.engine.bitmap_recycle.b b0) {
        this.e = b0;
        return this;
    }

    @NonNull
    public d e(@Nullable com.bumptech.glide.load.engine.bitmap_recycle.e e0) {
        this.d = e0;
        return this;
    }

    @NonNull
    public d f(@Nullable com.bumptech.glide.manager.c c0) {
        this.k = c0;
        return this;
    }

    @NonNull
    public d g(@NonNull com.bumptech.glide.c.a c$a0) {
        this.m = (com.bumptech.glide.c.a)m.e(c$a0);
        return this;
    }

    @NonNull
    public d h(@Nullable i i0) {
        class com.bumptech.glide.d.b implements com.bumptech.glide.c.a {
            final i a;
            final d b;

            com.bumptech.glide.d.b(i i0) {
                this.a = i0;
                super();
            }

            @Override  // com.bumptech.glide.c$a
            @NonNull
            public i build() {
                return this.a == null ? new i() : this.a;
            }
        }

        return this.g(new com.bumptech.glide.d.b(this, i0));
    }

    @NonNull
    public d i(@NonNull Class class0, @Nullable com.bumptech.glide.o o0) {
        this.a.put(class0, o0);
        return this;
    }

    @Deprecated
    public d j(boolean z) {
        return this;
    }

    @NonNull
    public d k(@Nullable com.bumptech.glide.load.engine.cache.a.a a$a0) {
        this.i = a$a0;
        return this;
    }

    @NonNull
    public d l(@Nullable com.bumptech.glide.load.engine.executor.a a0) {
        this.h = a0;
        return this;
    }

    d m(k k0) {
        this.c = k0;
        return this;
    }

    public d n(boolean z) {
        c d$c0 = new c();
        this.b.d(d$c0, z && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @NonNull
    public d o(boolean z) {
        this.p = z;
        return this;
    }

    @NonNull
    public d p(int v) {
        if(v < 2 || v > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.l = v;
        return this;
    }

    public d q(boolean z) {
        com.bumptech.glide.d.d d$d0 = new com.bumptech.glide.d.d();
        this.b.d(d$d0, z);
        return this;
    }

    @NonNull
    public d r(@Nullable j j0) {
        this.f = j0;
        return this;
    }

    @NonNull
    public d s(@NonNull com.bumptech.glide.load.engine.cache.l.a l$a0) {
        return this.t(l$a0.a());
    }

    @NonNull
    public d t(@Nullable l l0) {
        this.j = l0;
        return this;
    }

    void u(@Nullable com.bumptech.glide.manager.o.b o$b0) {
        this.n = o$b0;
    }

    @Deprecated
    public d v(@Nullable com.bumptech.glide.load.engine.executor.a a0) {
        return this.w(a0);
    }

    @NonNull
    public d w(@Nullable com.bumptech.glide.load.engine.executor.a a0) {
        this.g = a0;
        return this;
    }
}

