package rx.subjects;

import java.util.concurrent.TimeUnit;
import rx.functions.b;
import rx.internal.operators.x;
import rx.j.a;
import rx.schedulers.d;

public final class h extends f {
    private final g b;
    private final a c;

    protected h(rx.g.a g$a0, g g0, d d0) {
        super(g$a0);
        this.b = g0;
        this.c = d0.a();
    }

    @Override  // rx.subjects.f
    public boolean A7() {
        return this.b.l().length > 0;
    }

    public static h C7(d d0) {
        static final class rx.subjects.h.a implements b {
            final g a;

            rx.subjects.h.a(g g0) {
                this.a = g0;
                super();
            }

            public void a(c g$c0) {
                g$c0.f(this.a.e());
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((c)object0));
            }
        }

        g g0 = new g();
        rx.subjects.h.a h$a0 = new rx.subjects.h.a(g0);
        g0.d = h$a0;
        g0.e = h$a0;
        return new h(g0, g0, d0);
    }

    // 检测为 Lambda 实现
    void D7() [...]

    void E7(Throwable throwable0) {
        g g0 = this.b;
        if(g0.b) {
            c[] arr_g$c = g0.r(x.c(throwable0));
            for(int v = 0; v < arr_g$c.length; ++v) {
                arr_g$c[v].onError(throwable0);
            }
        }
    }

    void F7(Object object0) {
        c[] arr_g$c = this.b.l();
        for(int v = 0; v < arr_g$c.length; ++v) {
            arr_g$c[v].onNext(object0);
        }
    }

    public void G7(long v) {
        class rx.subjects.h.b implements rx.functions.a {
            final h a;

            @Override  // rx.functions.a
            public void call() {
                h.this.D7();
            }
        }

        rx.subjects.h.b h$b0 = () -> {
            g g0 = h.this.b;
            if(g0.b) {
                c[] arr_g$c = g0.r(x.b());
                for(int v = 0; v < arr_g$c.length; ++v) {
                    arr_g$c[v].d();
                }
            }
        };
        this.c.d(h$b0, v, TimeUnit.MILLISECONDS);
    }

    public void H7(Throwable throwable0, long v) {
        class rx.subjects.h.c implements rx.functions.a {
            final Throwable a;
            final h b;

            rx.subjects.h.c(Throwable throwable0) {
                this.a = throwable0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                h.this.E7(this.a);
            }
        }

        rx.subjects.h.c h$c0 = new rx.subjects.h.c(this, throwable0);
        this.c.d(h$c0, v, TimeUnit.MILLISECONDS);
    }

    public void I7(Object object0, long v) {
        class rx.subjects.h.d implements rx.functions.a {
            final Object a;
            final h b;

            rx.subjects.h.d(Object object0) {
                this.a = object0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                h.this.F7(this.a);
            }
        }

        rx.subjects.h.d h$d0 = new rx.subjects.h.d(this, object0);
        this.c.d(h$d0, v, TimeUnit.MILLISECONDS);
    }

    @Override  // rx.h
    public void d() {
        this.G7(0L);
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.H7(throwable0, 0L);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.I7(object0, 0L);
    }
}

