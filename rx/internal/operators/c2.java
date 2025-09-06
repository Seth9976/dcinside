package rx.internal.operators;

import rx.exceptions.c;
import rx.functions.p;
import rx.k.t;
import rx.k;
import rx.m;

public final class c2 implements t {
    private final k a;
    final p b;

    private c2(k k0, p p0) {
        if(k0 == null) {
            throw new NullPointerException("originalSingle must not be null");
        }
        if(p0 == null) {
            throw new NullPointerException("resumeFunctionInCaseOfError must not be null");
        }
        this.a = k0;
        this.b = p0;
    }

    public void a(m m0) {
        class b extends m {
            final m b;
            final c2 c;

            b(m m0) {
                this.b = m0;
                super();
            }

            @Override  // rx.m
            public void e(Object object0) {
                this.b.e(object0);
            }

            @Override  // rx.m
            public void onError(Throwable throwable0) {
                try {
                    ((k)c2.this.b.b(throwable0)).j0(this.b);
                }
                catch(Throwable throwable1) {
                    c.h(throwable1, this.b);
                }
            }
        }

        b c2$b0 = new b(this, m0);
        m0.c(c2$b0);
        this.a.j0(c2$b0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((m)object0));
    }

    public static c2 c(k k0, p p0) {
        return new c2(k0, p0);
    }

    public static c2 d(k k0, k k1) {
        static final class a implements p {
            final k a;

            a(k k0) {
                this.a = k0;
                super();
            }

            public k a(Throwable throwable0) {
                return this.a;
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        if(k1 == null) {
            throw new NullPointerException("resumeSingleInCaseOfError must not be null");
        }
        return new c2(k0, new a(k1));
    }
}

