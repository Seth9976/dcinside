package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.g;
import rx.k.t;
import rx.m;
import rx.n;

public class f0 implements t {
    private final g a;

    public f0(g g0) {
        this.a = g0;
    }

    public void a(m m0) {
        class a extends n {
            private boolean f;
            private boolean g;
            private Object h;
            final m i;
            final f0 j;

            a(m m0) {
                this.i = m0;
                super();
            }

            @Override  // rx.h
            public void d() {
                if(!this.f) {
                    if(this.g) {
                        this.i.e(this.h);
                        return;
                    }
                    NoSuchElementException noSuchElementException0 = new NoSuchElementException("Observable emitted no items");
                    this.i.onError(noSuchElementException0);
                }
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.i.onError(throwable0);
                this.l();
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                if(this.g) {
                    this.f = true;
                    IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Observable emitted too many elements");
                    this.i.onError(illegalArgumentException0);
                    this.l();
                    return;
                }
                this.g = true;
                this.h = object0;
            }

            @Override  // rx.n
            public void onStart() {
                this.v(2L);
            }
        }

        a f0$a0 = new a(this, m0);
        m0.c(f0$a0);
        this.a.N6(f0$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((m)object0));
    }

    public static f0 c(g g0) {
        return new f0(g0);
    }
}

