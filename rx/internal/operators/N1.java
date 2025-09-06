package rx.internal.operators;

import rx.exceptions.c;
import rx.functions.p;
import rx.functions.q;
import rx.g.b;
import rx.n;

public final class n1 implements b {
    final q a;

    public n1(q q0) {
        this.a = q0;
    }

    public n a(n n0) {
        class a extends n {
            boolean f;
            int g;
            final n h;
            final n1 i;

            a(n n0, n n1) {
                this.h = n1;
                super(n0);
                this.f = true;
            }

            @Override  // rx.h
            public void d() {
                this.h.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.h.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                if(!this.f) {
                    this.h.onNext(object0);
                    return;
                }
                try {
                    int v = this.g;
                    this.g = v + 1;
                    if(!((Boolean)n1.this.a.p(object0, v)).booleanValue()) {
                        goto label_10;
                    }
                    goto label_13;
                }
                catch(Throwable throwable0) {
                    c.g(throwable0, this.h, object0);
                    return;
                }
            label_10:
                this.f = false;
                this.h.onNext(object0);
                return;
            label_13:
                this.v(1L);
            }
        }

        return new a(this, n0, n0);
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }

    public static q c(p p0) {
        static final class rx.internal.operators.n1.b implements q {
            final p a;

            rx.internal.operators.n1.b(p p0) {
                this.a = p0;
                super();
            }

            public Boolean a(Object object0, Integer integer0) {
                return (Boolean)this.a.b(object0);
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(object0, ((Integer)object1));
            }
        }

        return new rx.internal.operators.n1.b(p0);
    }
}

