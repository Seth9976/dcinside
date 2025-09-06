package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import rx.functions.b;
import rx.internal.operators.x;

public final class a extends f {
    final g b;
    volatile Object c;

    protected a(rx.g.a g$a0, g g0) {
        super(g$a0);
        this.b = g0;
    }

    @Override  // rx.subjects.f
    public boolean A7() {
        return this.b.l().length > 0;
    }

    public static a C7() {
        static final class rx.subjects.a.a implements b {
            final g a;

            rx.subjects.a.a(g g0) {
                this.a = g0;
                super();
            }

            public void a(c g$c0) {
                Object object0 = this.a.e();
                if(object0 != null && !x.f(object0)) {
                    if(x.g(object0)) {
                        g$c0.onError(x.d(object0));
                        return;
                    }
                    Object object1 = x.e(object0);
                    rx.internal.producers.f f0 = new rx.internal.producers.f(g$c0.a, object1);
                    g$c0.a.X(f0);
                    return;
                }
                g$c0.d();
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((c)object0));
            }
        }

        g g0 = new g();
        g0.e = new rx.subjects.a.a(g0);
        return new a(g0, g0);
    }

    public Throwable D7() {
        Object object0 = this.b.e();
        return x.g(object0) ? x.d(object0) : null;
    }

    // 去混淆评级： 低(20)
    public Object E7() {
        return x.g(this.b.e()) || !x.h(this.c) ? null : x.e(this.c);
    }

    public boolean F7() {
        Object object0 = this.b.e();
        return object0 != null && !x.g(object0);
    }

    public boolean G7() {
        return x.g(this.b.e());
    }

    // 去混淆评级： 低(20)
    public boolean H7() {
        return !x.g(this.b.e()) && x.h(this.c);
    }

    @Override  // rx.h
    public void d() {
        if(this.b.b) {
            Object object0 = this.c == null ? x.b() : this.c;
            c[] arr_g$c = this.b.r(object0);
            for(int v = 0; v < arr_g$c.length; ++v) {
                c g$c0 = arr_g$c[v];
                if(object0 == x.b()) {
                    g$c0.d();
                }
                else {
                    Object object1 = x.e(object0);
                    rx.internal.producers.f f0 = new rx.internal.producers.f(g$c0.a, object1);
                    g$c0.a.X(f0);
                }
            }
        }
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        if(this.b.b) {
            Object object0 = x.c(throwable0);
            c[] arr_g$c = this.b.r(object0);
            List list0 = null;
            for(int v = 0; v < arr_g$c.length; ++v) {
                c g$c0 = arr_g$c[v];
                try {
                    g$c0.onError(throwable0);
                }
                catch(Throwable throwable1) {
                    if(list0 == null) {
                        list0 = new ArrayList();
                    }
                    list0.add(throwable1);
                }
            }
            rx.exceptions.c.d(list0);
        }
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.c = x.j(object0);
    }
}

