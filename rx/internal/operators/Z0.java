package rx.internal.operators;

import rx.exceptions.h;
import rx.g.b;
import rx.i;
import rx.n;
import rx.plugins.c;

public class z0 implements b {
    static final class a extends n {
        final n f;
        final Class g;
        boolean h;

        public a(n n0, Class class0) {
            this.f = n0;
            this.g = class0;
        }

        @Override  // rx.n
        public void X(i i0) {
            this.f.X(i0);
        }

        @Override  // rx.h
        public void d() {
            if(this.h) {
                return;
            }
            this.f.d();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.h) {
                c.I(throwable0);
                return;
            }
            this.h = true;
            this.f.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            Object object1;
            try {
                object1 = this.g.cast(object0);
            }
            catch(Throwable throwable0) {
                rx.exceptions.c.e(throwable0);
                this.l();
                this.onError(h.a(throwable0, object0));
                return;
            }
            this.f.onNext(object1);
        }
    }

    final Class a;

    public z0(Class class0) {
        this.a = class0;
    }

    public n a(n n0) {
        n n1 = new a(n0, this.a);
        n0.q(n1);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

