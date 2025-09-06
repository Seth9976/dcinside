package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends B {
    static final class a implements c {
        final I a;
        final b[] b;
        final AtomicInteger c;

        a(I i0, int v) {
            this.c = new AtomicInteger();
            this.a = i0;
            this.b = new b[v];
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.get() == -1;
        }

        public void b(G[] arr_g) {
            b[] arr_h$b = this.b;
            for(int v1 = 0; v1 < arr_h$b.length; ++v1) {
                arr_h$b[v1] = new b(this, v1 + 1, this.a);
            }
            this.c.lazySet(0);
            this.a.b(this);
            for(int v = 0; v < arr_h$b.length && this.c.get() == 0; ++v) {
                arr_g[v].d(arr_h$b[v]);
            }
        }

        public boolean c(int v) {
            int v1 = this.c.get();
            if(v1 == 0) {
                if(this.c.compareAndSet(0, v)) {
                    b[] arr_h$b = this.b;
                    for(int v2 = 0; v2 < arr_h$b.length; ++v2) {
                        if(v2 + 1 != v) {
                            arr_h$b[v2].a();
                        }
                    }
                    return true;
                }
                return false;
            }
            return v1 == v;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.c.get() != -1) {
                this.c.lazySet(-1);
                b[] arr_h$b = this.b;
                for(int v = 0; v < arr_h$b.length; ++v) {
                    arr_h$b[v].a();
                }
            }
        }
    }

    static final class b extends AtomicReference implements I {
        final a a;
        final int b;
        final I c;
        boolean d;
        private static final long e = 0xEF8A929D55EBD234L;

        b(a h$a0, int v, I i0) {
            this.a = h$a0;
            this.b = v;
            this.c = i0;
        }

        public void a() {
            d.b(this);
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            d.g(this, c0);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.d) {
                this.c.onComplete();
                return;
            }
            if(this.a.c(this.b)) {
                this.d = true;
                this.c.onComplete();
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.d) {
                this.c.onError(throwable0);
                return;
            }
            if(this.a.c(this.b)) {
                this.d = true;
                this.c.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.d) {
                this.c.onNext(object0);
                return;
            }
            if(this.a.c(this.b)) {
                this.d = true;
                this.c.onNext(object0);
                return;
            }
            ((c)this.get()).dispose();
        }
    }

    final G[] a;
    final Iterable b;

    public h(G[] arr_g, Iterable iterable0) {
        this.a = arr_g;
        this.b = iterable0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        int v;
        G[] arr_g = this.a;
        if(arr_g == null) {
            try {
                arr_g = new B[8];
                v = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_22;
                    }
                    Object object0 = iterator0.next();
                    if(((G)object0) == null) {
                        e.g(new NullPointerException("One of the sources is null"), i0);
                        return;
                    }
                    if(v == arr_g.length) {
                        G[] arr_g1 = new G[(v >> 2) + v];
                        System.arraycopy(arr_g, 0, arr_g1, 0, v);
                        arr_g = arr_g1;
                    }
                    arr_g[v] = (G)object0;
                    ++v;
                }
            }
            catch(Throwable throwable0) {
            }
            io.reactivex.exceptions.b.b(throwable0);
            e.g(throwable0, i0);
            return;
        }
        else {
            v = arr_g.length;
        }
    label_22:
        if(v == 0) {
            e.d(i0);
            return;
        }
        if(v == 1) {
            arr_g[0].d(i0);
            return;
        }
        new a(i0, v).b(arr_g);
    }
}

