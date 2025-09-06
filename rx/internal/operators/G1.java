package rx.internal.operators;

import rx.functions.q;
import rx.g;
import rx.internal.util.s;

public final class g1 {
    static final Object a;

    static {
        g1.a = new Object();
    }

    private g1() {
        throw new IllegalStateException("No instances!");
    }

    static g a(g g0) {
        return g.z0(g0, g.Q2(g1.a));
    }

    public static g b(g g0, g g1, q q0) {
        static final class a implements q {
            final q a;

            a(q q0) {
                this.a = q0;
                super();
            }

            public Boolean a(Object object0, Object object1) {
                boolean z = false;
                boolean z1 = object0 == g1.a;
                if(object1 == g1.a) {
                    z = true;
                }
                if(z1 && z) {
                    return true;
                }
                return z1 || z ? false : ((Boolean)this.a.p(object0, object1));
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(object0, object1);
            }
        }

        return g.v7(g1.a(g0), g1.a(g1), new a(q0)).b(s.c());
    }
}

