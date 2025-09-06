package rx.observables;

import rx.g.a;
import rx.g;
import rx.n;

public class d extends g {
    private final Object b;

    protected d(Object object0, a g$a0) {
        super(g$a0);
        this.b = object0;
    }

    public static d A7(Object object0, a g$a0) {
        return new d(object0, g$a0);
    }

    public static d B7(Object object0, g g0) {
        static final class rx.observables.d.a implements a {
            final g a;

            rx.observables.d.a(g g0) {
                this.a = g0;
                super();
            }

            public void a(n n0) {
                this.a.N6(n0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }

        return new d(object0, new rx.observables.d.a(g0));
    }

    public Object C7() {
        return this.b;
    }
}

