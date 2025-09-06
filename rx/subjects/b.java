package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import rx.g.a;
import rx.internal.operators.x;

public final class b extends f {
    private final g b;
    private static final Object[] c;

    static {
        b.c = new Object[0];
    }

    protected b(a g$a0, g g0) {
        super(g$a0);
        this.b = g0;
    }

    @Override  // rx.subjects.f
    public boolean A7() {
        return this.b.l().length > 0;
    }

    public static b C7() {
        return b.E7(null, false);
    }

    public static b D7(Object object0) {
        return b.E7(object0, true);
    }

    private static b E7(Object object0, boolean z) {
        static final class rx.subjects.b.a implements rx.functions.b {
            final g a;

            rx.subjects.b.a(g g0) {
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
        if(z) {
            g0.q(x.j(object0));
        }
        rx.subjects.b.a b$a0 = new rx.subjects.b.a(g0);
        g0.d = b$a0;
        g0.e = b$a0;
        return new b(g0, g0);
    }

    public Throwable F7() {
        Object object0 = this.b.e();
        return x.g(object0) ? x.d(object0) : null;
    }

    public Object G7() {
        Object object0 = this.b.e();
        return x.h(object0) ? x.e(object0) : null;
    }

    public Object[] H7() {
        Object[] arr_object = this.I7(b.c);
        return arr_object == b.c ? new Object[0] : arr_object;
    }

    public Object[] I7(Object[] arr_object) {
        Object object0 = this.b.e();
        if(x.h(object0)) {
            if(arr_object.length == 0) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), 1);
            }
            arr_object[0] = x.e(object0);
            if(arr_object.length > 1) {
                arr_object[1] = null;
                return arr_object;
            }
        }
        else if(arr_object.length > 0) {
            arr_object[0] = null;
        }
        return arr_object;
    }

    public boolean J7() {
        return x.f(this.b.e());
    }

    public boolean K7() {
        return x.g(this.b.e());
    }

    public boolean L7() {
        return x.h(this.b.e());
    }

    int M7() {
        return this.b.l().length;
    }

    @Override  // rx.h
    public void d() {
        if(this.b.e() == null || this.b.b) {
            Object object0 = x.b();
            c[] arr_g$c = this.b.r(object0);
            for(int v = 0; v < arr_g$c.length; ++v) {
                arr_g$c[v].h(object0);
            }
        }
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        if(this.b.e() == null || this.b.b) {
            Object object0 = x.c(throwable0);
            c[] arr_g$c = this.b.r(object0);
            List list0 = null;
            for(int v = 0; v < arr_g$c.length; ++v) {
                c g$c0 = arr_g$c[v];
                try {
                    g$c0.h(object0);
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
        if(this.b.e() == null || this.b.b) {
            Object object1 = x.j(object0);
            c[] arr_g$c = this.b.j(object1);
            for(int v = 0; v < arr_g$c.length; ++v) {
                arr_g$c[v].h(object1);
            }
        }
    }
}

