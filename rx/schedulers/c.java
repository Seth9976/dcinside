package rx.schedulers;

import androidx.compose.animation.core.d;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.k;
import rx.internal.schedulers.n;
import rx.j;
import rx.plugins.f;
import rx.plugins.g;

public final class c {
    private final j a;
    private final j b;
    private final j c;
    private static final AtomicReference d;

    static {
        c.d = new AtomicReference();
    }

    private c() {
        f.c().f();
        this.a = g.a();
        this.b = g.c();
        this.c = g.e();
    }

    public static j a() {
        return rx.plugins.c.E(c.c().a);
    }

    public static j b(Executor executor0) {
        return new rx.internal.schedulers.c(executor0);
    }

    private static c c() {
        while(true) {
            AtomicReference atomicReference0 = c.d;
            c c0 = (c)atomicReference0.get();
            if(c0 != null) {
                return c0;
            }
            c c1 = new c();
            if(d.a(atomicReference0, null, c1)) {
                return c1;
            }
            c1.i();
        }
    }

    public static j d() {
        return rx.internal.schedulers.f.a;
    }

    public static j e() {
        return rx.plugins.c.J(c.c().b);
    }

    public static j f() {
        return rx.plugins.c.K(c.c().c);
    }

    public static void g() {
        c c0 = (c)c.d.getAndSet(null);
        if(c0 != null) {
            c0.i();
        }
    }

    public static void h() {
        c c0 = c.c();
        c0.i();
        synchronized(c0) {
            rx.internal.schedulers.d.d.shutdown();
        }
    }

    void i() {
        synchronized(this) {
            j j0 = this.a;
            if(j0 instanceof k) {
                ((k)j0).shutdown();
            }
            j j1 = this.b;
            if(j1 instanceof k) {
                ((k)j1).shutdown();
            }
            j j2 = this.c;
            if(j2 instanceof k) {
                ((k)j2).shutdown();
            }
        }
    }

    public static void j() {
        c c0 = c.c();
        c0.k();
        synchronized(c0) {
            rx.internal.schedulers.d.d.start();
        }
    }

    void k() {
        synchronized(this) {
            j j0 = this.a;
            if(j0 instanceof k) {
                ((k)j0).start();
            }
            j j1 = this.b;
            if(j1 instanceof k) {
                ((k)j1).start();
            }
            j j2 = this.c;
            if(j2 instanceof k) {
                ((k)j2).start();
            }
        }
    }

    public static rx.schedulers.d l() {
        return new rx.schedulers.d();
    }

    public static j m() {
        return n.a;
    }
}

