package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.common.i;
import com.google.firebase.crashlytics.internal.concurrency.l;
import com.google.firebase.crashlytics.internal.persistence.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class o {
    class a {
        final AtomicMarkableReference a;
        private final AtomicReference b;
        private final boolean c;
        final o d;

        public a(boolean z) {
            this.b = new AtomicReference(null);
            this.c = z;
            this.a = new AtomicMarkableReference(new d(0x40, (z ? 0x2000 : 0x400)), false);
        }

        public Map b() {
            return ((d)this.a.getReference()).a();
        }

        // 检测为 Lambda 实现
        private void c() [...]

        private void d() {
            n n0 = () -> {
                this.b.set(null);
                this.e();
            };
            if(androidx.compose.animation.core.d.a(this.b, null, n0)) {
                o.this.b.b.q(n0);
            }
        }

        private void e() {
            Map map0;
            synchronized(this) {
                if(this.a.isMarked()) {
                    map0 = ((d)this.a.getReference()).a();
                    d d0 = (d)this.a.getReference();
                    this.a.set(d0, false);
                }
                else {
                    map0 = null;
                }
            }
            if(map0 != null) {
                o.this.a.r(o.this.c, map0, this.c);
            }
        }

        public boolean f(String s, String s1) {
            synchronized(this) {
                if(!((d)this.a.getReference()).d(s, s1)) {
                    return false;
                }
                d d0 = (d)this.a.getReference();
                this.a.set(d0, true);
            }
            this.d();
            return true;
        }

        public void g(Map map0) {
            synchronized(this) {
                ((d)this.a.getReference()).e(map0);
                d d0 = (d)this.a.getReference();
                this.a.set(d0, true);
            }
            this.d();
        }
    }

    private final f a;
    private final l b;
    private String c;
    private final a d;
    private final a e;
    private final j f;
    private final AtomicMarkableReference g;
    public static final String h = "user-data";
    public static final String i = "keys";
    public static final String j = "internal-keys";
    public static final String k = "rollouts-state";
    @VisibleForTesting
    public static final int l = 0x40;
    @VisibleForTesting
    public static final int m = 0x400;
    @VisibleForTesting
    public static final int n = 0x2000;
    @VisibleForTesting
    public static final int o = 0x80;

    public o(String s, g g0, l l0) {
        this.d = new a(this, false);
        this.e = new a(this, true);
        this.f = new j(0x80);
        this.g = new AtomicMarkableReference(null, false);
        this.c = s;
        this.a = new f(g0);
        this.b = l0;
    }

    public Map g() {
        return this.d.b();
    }

    public Map h() {
        return this.e.b();
    }

    public List i() {
        return this.f.a();
    }

    @Nullable
    public String j() {
        return (String)this.g.getReference();
    }

    // 检测为 Lambda 实现
    private void k(String s, Map map0, List list0) [...]

    // 检测为 Lambda 实现
    private void l(List list0) [...]

    public static o m(String s, g g0, l l0) {
        f f0 = new f(g0);
        o o0 = new o(s, g0, l0);
        ((d)o0.d.a.getReference()).e(f0.j(s, false));
        ((d)o0.e.a.getReference()).e(f0.j(s, true));
        String s1 = f0.l(s);
        o0.g.set(s1, false);
        List list0 = f0.k(s);
        o0.f.c(list0);
        return o0;
    }

    @Nullable
    public static String n(String s, g g0) {
        return new f(g0).l(s);
    }

    // 检测为 Lambda 实现
    private void o() [...]

    public boolean p(String s, String s1) {
        return this.d.f(s, s1);
    }

    public void q(Map map0) {
        this.d.g(map0);
    }

    public boolean r(String s, String s1) {
        return this.e.f(s, s1);
    }

    public void s(String s) {
        synchronized(this.c) {
            this.c = s;
            com.google.firebase.crashlytics.internal.metadata.l l0 = () -> {
                if(this.j() != null) {
                    String s1 = this.j();
                    this.a.t(s, s1);
                }
                if(!this.d.b().isEmpty()) {
                    this.a.q(s, this.d.b());
                }
                if(!this.f.b().isEmpty()) {
                    this.a.s(s, this.f.b());
                }
            };
            this.b.b.q(l0);
        }
    }

    public void t(String s) {
        String s1 = d.c(s, 0x400);
        synchronized(this.g) {
            if(i.A(s1, ((String)this.g.getReference()))) {
                return;
            }
            this.g.set(s1, true);
        }
        m m0 = () -> {
            String s;
            boolean z = false;
            synchronized(this.g) {
                if(this.g.isMarked()) {
                    s = this.j();
                    this.g.set(s, false);
                    z = true;
                }
                else {
                    s = null;
                }
            }
            if(z) {
                this.a.t(this.c, s);
            }
        };
        this.b.b.q(m0);
    }

    @O1.a
    public boolean u(List list0) {
        synchronized(this.f) {
            if(!this.f.c(list0)) {
                return false;
            }
            k k0 = () -> this.a.s(this.c, this.f.b());
            this.b.b.q(k0);
            return true;
        }
    }
}

