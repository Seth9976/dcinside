package rx.internal.operators;

import rx.exceptions.c;
import rx.functions.p;
import rx.functions.q;
import rx.g.b;
import rx.n;

public final class w1 implements b {
    final q a;

    public w1(p p0) {
        class a implements q {
            final p a;

            a(p p0) {
            }

            public Boolean a(Object object0, Integer integer0) {
                return (Boolean)this.a.b(object0);
            }

            @Override  // rx.functions.q
            public Object p(Object object0, Object object1) {
                return this.a(object0, ((Integer)object1));
            }
        }

        this(new a(p0));
    }

    public w1(q q0) {
        this.a = q0;
    }

    public n a(n n0) {
        class rx.internal.operators.w1.b extends n {
            private int f;
            private boolean g;
            final n h;
            final w1 i;

            rx.internal.operators.w1.b(n n0, boolean z, n n1) {
                this.h = n1;
                super(n0, z);
            }

            @Override  // rx.h
            public void d() {
                if(!this.g) {
                    this.h.d();
                }
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                if(!this.g) {
                    this.h.onError(throwable0);
                }
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                try {
                    int v = this.f;
                    this.f = v + 1;
                    if(((Boolean)w1.this.a.p(object0, v)).booleanValue()) {
                        goto label_9;
                    }
                    goto label_11;
                }
                catch(Throwable throwable0) {
                    this.g = true;
                    c.g(throwable0, this.h, object0);
                    this.l();
                    return;
                }
            label_9:
                this.h.onNext(object0);
                return;
            label_11:
                this.g = true;
                this.h.d();
                this.l();
            }
        }

        n n1 = new rx.internal.operators.w1.b(this, n0, false, n0);
        n0.q(n1);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

