package rx.internal.operators;

import rx.exceptions.c;
import rx.functions.p;
import rx.g.b;
import rx.i;
import rx.n;

public final class v1 implements b {
    final class rx.internal.operators.v1.b extends n {
        private final n f;
        private boolean g;
        final v1 h;

        rx.internal.operators.v1.b(n n0) {
            this.f = n0;
        }

        @Override  // rx.h
        public void d() {
            if(!this.g) {
                this.f.d();
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(!this.g) {
                this.f.onError(throwable0);
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.f.onNext(object0);
            try {
                if(((Boolean)v1.this.a.b(object0)).booleanValue()) {
                    goto label_8;
                }
            }
            catch(Throwable throwable0) {
                this.g = true;
                c.g(throwable0, this.f, object0);
                this.l();
            }
            return;
        label_8:
            this.g = true;
            this.f.d();
            this.l();
        }

        void x(long v) {
            this.v(v);
        }
    }

    final p a;

    public v1(p p0) {
        this.a = p0;
    }

    public n a(n n0) {
        class a implements i {
            final rx.internal.operators.v1.b a;
            final v1 b;

            a(rx.internal.operators.v1.b v1$b0) {
                this.a = v1$b0;
                super();
            }

            @Override  // rx.i
            public void request(long v) {
                this.a.x(v);
            }
        }

        n n1 = new rx.internal.operators.v1.b(this, n0);
        n0.q(n1);
        n0.X(new a(this, ((rx.internal.operators.v1.b)n1)));
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

