package io.reactivex.schedulers;

import io.reactivex.J;
import io.reactivex.internal.schedulers.g;
import io.reactivex.internal.schedulers.h;
import io.reactivex.internal.schedulers.p;
import io.reactivex.internal.schedulers.r;
import io.reactivex.internal.schedulers.s;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class b {
    static final class a {
        static final J a;

        static {
            a.a = new io.reactivex.internal.schedulers.b();
        }
    }

    static final class io.reactivex.schedulers.b.b implements Callable {
        public J a() throws Exception {
            return a.a;
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class c implements Callable {
        public J a() throws Exception {
            return d.a;
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class d {
        static final J a;

        static {
            d.a = new g();
        }
    }

    static final class e {
        static final J a;

        static {
            e.a = new h();
        }
    }

    static final class f implements Callable {
        public J a() throws Exception {
            return e.a;
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class io.reactivex.schedulers.b.g {
        static final J a;

        static {
            io.reactivex.schedulers.b.g.a = new r();
        }
    }

    static final class io.reactivex.schedulers.b.h implements Callable {
        public J a() throws Exception {
            return io.reactivex.schedulers.b.g.a;
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    @d3.f
    static final J a;
    @d3.f
    static final J b;
    @d3.f
    static final J c;
    @d3.f
    static final J d;
    @d3.f
    static final J e;

    static {
        b.a = io.reactivex.plugins.a.J(new io.reactivex.schedulers.b.h());
        b.b = io.reactivex.plugins.a.G(new io.reactivex.schedulers.b.b());
        b.c = io.reactivex.plugins.a.H(new c());
        b.d = s.l();
        b.e = io.reactivex.plugins.a.I(new f());
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    @d3.f
    public static J a() {
        return io.reactivex.plugins.a.X(b.b);
    }

    @d3.f
    public static J b(@d3.f Executor executor0) {
        return new io.reactivex.internal.schedulers.d(executor0, false);
    }

    @d3.e
    @d3.f
    public static J c(@d3.f Executor executor0, boolean z) {
        return new io.reactivex.internal.schedulers.d(executor0, z);
    }

    @d3.f
    public static J d() {
        return io.reactivex.plugins.a.Z(b.c);
    }

    @d3.f
    public static J e() {
        return io.reactivex.plugins.a.a0(b.e);
    }

    public static void f() {
        b.a().i();
        b.d().i();
        b.e().i();
        b.g().i();
        b.i().i();
        p.d();
    }

    @d3.f
    public static J g() {
        return io.reactivex.plugins.a.c0(b.a);
    }

    public static void h() {
        b.a().j();
        b.d().j();
        b.e().j();
        b.g().j();
        b.i().j();
        p.e();
    }

    @d3.f
    public static J i() {
        return b.d;
    }
}

