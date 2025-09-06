package io.reactivex.internal.operators.observable;

import d3.g;
import e3.o;
import f3.j;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class a1 {
    public static final class a extends AtomicInteger implements j, Runnable {
        final I a;
        final Object b;
        private static final long c = 3880992722410194083L;
        static final int d = 0;
        static final int e = 1;
        static final int f = 2;
        static final int g = 3;

        public a(I i0, Object object0) {
            this.a = i0;
            this.b = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == 3;
        }

        @Override  // f3.o
        public void clear() {
            this.lazySet(3);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.set(3);
        }

        @Override  // f3.k
        public int i(int v) {
            if((v & 1) != 0) {
                this.lazySet(1);
                return 1;
            }
            return 0;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return this.get() != 1;
        }

        @Override  // f3.o
        public boolean j(Object object0, Object object1) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override  // f3.o
        public boolean offer(Object object0) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override  // f3.o
        @g
        public Object poll() throws Exception {
            if(this.get() == 1) {
                this.lazySet(3);
                return this.b;
            }
            return null;
        }

        @Override
        public void run() {
            if(this.get() == 0 && this.compareAndSet(0, 2)) {
                this.a.onNext(this.b);
                if(this.get() == 2) {
                    this.lazySet(3);
                    this.a.onComplete();
                }
            }
        }
    }

    static final class b extends B {
        final Object a;
        final o b;

        b(Object object0, o o0) {
            this.a = object0;
            this.b = o0;
        }

        @Override  // io.reactivex.B
        public void I5(I i0) {
            Object object0;
            G g0;
            try {
                g0 = (G)io.reactivex.internal.functions.b.g(this.b.apply(this.a), "The mapper returned a null ObservableSource");
            }
            catch(Throwable throwable0) {
                e.g(throwable0, i0);
                return;
            }
            if(g0 instanceof Callable) {
                try {
                    object0 = ((Callable)g0).call();
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    e.g(throwable1, i0);
                    return;
                }
                if(object0 == null) {
                    e.d(i0);
                    return;
                }
                a a1$a0 = new a(i0, object0);
                i0.b(a1$a0);
                a1$a0.run();
                return;
            }
            g0.d(i0);
        }
    }

    private a1() {
        throw new IllegalStateException("No instances!");
    }

    public static B a(Object object0, o o0) {
        return io.reactivex.plugins.a.R(new b(object0, o0));
    }

    public static boolean b(G g0, I i0, o o0) {
        Object object1;
        G g1;
        Object object0;
        if(g0 instanceof Callable) {
            try {
                object0 = ((Callable)g0).call();
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                e.g(throwable0, i0);
                return true;
            }
            if(object0 == null) {
                e.d(i0);
                return true;
            }
            try {
                g1 = (G)io.reactivex.internal.functions.b.g(o0.apply(object0), "The mapper returned a null ObservableSource");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                e.g(throwable1, i0);
                return true;
            }
            if(g1 instanceof Callable) {
                try {
                    object1 = ((Callable)g1).call();
                }
                catch(Throwable throwable2) {
                    io.reactivex.exceptions.b.b(throwable2);
                    e.g(throwable2, i0);
                    return true;
                }
                if(object1 == null) {
                    e.d(i0);
                    return true;
                }
                a a1$a0 = new a(i0, object1);
                i0.b(a1$a0);
                a1$a0.run();
                return true;
            }
            g1.d(i0);
            return true;
        }
        return false;
    }
}

