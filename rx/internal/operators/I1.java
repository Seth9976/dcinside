package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.g.b;
import rx.internal.producers.f;
import rx.n;
import rx.plugins.c;

public final class i1 implements b {
    static final class a {
        static final i1 a;

        static {
            a.a = new i1();
        }
    }

    static final class rx.internal.operators.i1.b extends n {
        private final n f;
        private final boolean g;
        private final Object h;
        private Object i;
        private boolean j;
        private boolean k;

        rx.internal.operators.i1.b(n n0, boolean z, Object object0) {
            this.f = n0;
            this.g = z;
            this.h = object0;
            this.v(2L);
        }

        @Override  // rx.h
        public void d() {
            if(!this.k) {
                if(this.j) {
                    f f0 = new f(this.f, this.i);
                    this.f.X(f0);
                    return;
                }
                if(this.g) {
                    f f1 = new f(this.f, this.h);
                    this.f.X(f1);
                    return;
                }
                NoSuchElementException noSuchElementException0 = new NoSuchElementException("Sequence contains no elements");
                this.f.onError(noSuchElementException0);
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.k) {
                c.I(throwable0);
                return;
            }
            this.f.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(!this.k) {
                if(this.j) {
                    this.k = true;
                    IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains too many elements");
                    this.f.onError(illegalArgumentException0);
                    this.l();
                    return;
                }
                this.i = object0;
                this.j = true;
            }
        }
    }

    private final boolean a;
    private final Object b;

    i1() {
        this(false, null);
    }

    public i1(Object object0) {
        this(true, object0);
    }

    private i1(boolean z, Object object0) {
        this.a = z;
        this.b = object0;
    }

    public n a(n n0) {
        n n1 = new rx.internal.operators.i1.b(n0, this.a, this.b);
        n0.q(n1);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }

    public static i1 c() {
        return a.a;
    }
}

