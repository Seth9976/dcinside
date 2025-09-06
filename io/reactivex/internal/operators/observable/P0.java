package io.reactivex.internal.operators.observable;

import e3.o;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.J;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class p0 {
    static final class a implements Callable {
        private final B a;
        private final int b;

        a(B b0, int v) {
            this.a = b0;
            this.b = v;
        }

        public io.reactivex.observables.a a() {
            return this.a.F4(this.b);
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class b implements Callable {
        private final B a;
        private final int b;
        private final long c;
        private final TimeUnit d;
        private final J e;

        b(B b0, int v, long v1, TimeUnit timeUnit0, J j0) {
            this.a = b0;
            this.b = v;
            this.c = v1;
            this.d = timeUnit0;
            this.e = j0;
        }

        public io.reactivex.observables.a a() {
            return this.a.H4(this.b, this.c, this.d, this.e);
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class c implements o {
        private final o a;

        c(o o0) {
            this.a = o0;
        }

        public G a(Object object0) throws Exception {
            return new g0(((Iterable)io.reactivex.internal.functions.b.g(this.a.apply(object0), "The mapper returned a null Iterable")));
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(object0);
        }
    }

    static final class d implements o {
        private final e3.c a;
        private final Object b;

        d(e3.c c0, Object object0) {
            this.a = c0;
            this.b = object0;
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a.apply(this.b, object0);
        }
    }

    static final class e implements o {
        private final e3.c a;
        private final o b;

        e(e3.c c0, o o0) {
            this.a = c0;
            this.b = o0;
        }

        public G a(Object object0) throws Exception {
            return new x0(((G)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null ObservableSource")), new d(this.a, object0));
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(object0);
        }
    }

    static final class f implements o {
        final o a;

        f(o o0) {
            this.a = o0;
        }

        public G a(Object object0) throws Exception {
            return new q1(((G)io.reactivex.internal.functions.b.g(this.a.apply(object0), "The itemDelay returned a null ObservableSource")), 1L).A3(io.reactivex.internal.functions.a.n(object0)).v1(object0);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(object0);
        }
    }

    static enum g implements o {
        INSTANCE;

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return 0;
        }
    }

    static final class h implements e3.a {
        final I a;

        h(I i0) {
            this.a = i0;
        }

        @Override  // e3.a
        public void run() throws Exception {
            this.a.onComplete();
        }
    }

    static final class i implements e3.g {
        final I a;

        i(I i0) {
            this.a = i0;
        }

        public void a(Throwable throwable0) throws Exception {
            this.a.onError(throwable0);
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((Throwable)object0));
        }
    }

    static final class j implements e3.g {
        final I a;

        j(I i0) {
            this.a = i0;
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a.onNext(object0);
        }
    }

    static final class k implements Callable {
        private final B a;

        k(B b0) {
            this.a = b0;
        }

        public io.reactivex.observables.a a() {
            return this.a.E4();
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class l implements o {
        private final o a;
        private final J b;

        l(o o0, J j0) {
            this.a = o0;
            this.b = j0;
        }

        public G a(B b0) throws Exception {
            return B.P7(((G)io.reactivex.internal.functions.b.g(this.a.apply(b0), "The selector returned a null ObservableSource"))).b4(this.b);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((B)object0));
        }
    }

    static final class m implements e3.c {
        final e3.b a;

        m(e3.b b0) {
            this.a = b0;
        }

        public Object a(Object object0, io.reactivex.k k0) throws Exception {
            this.a.accept(object0, k0);
            return object0;
        }

        @Override  // e3.c
        public Object apply(Object object0, Object object1) throws Exception {
            return this.a(object0, ((io.reactivex.k)object1));
        }
    }

    static final class n implements e3.c {
        final e3.g a;

        n(e3.g g0) {
            this.a = g0;
        }

        public Object a(Object object0, io.reactivex.k k0) throws Exception {
            this.a.accept(k0);
            return object0;
        }

        @Override  // e3.c
        public Object apply(Object object0, Object object1) throws Exception {
            return this.a(object0, ((io.reactivex.k)object1));
        }
    }

    static final class io.reactivex.internal.operators.observable.p0.o implements Callable {
        private final B a;
        private final long b;
        private final TimeUnit c;
        private final J d;

        io.reactivex.internal.operators.observable.p0.o(B b0, long v, TimeUnit timeUnit0, J j0) {
            this.a = b0;
            this.b = v;
            this.c = timeUnit0;
            this.d = j0;
        }

        public io.reactivex.observables.a a() {
            return this.a.K4(this.b, this.c, this.d);
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class p implements o {
        private final o a;

        p(o o0) {
            this.a = o0;
        }

        // 去混淆评级： 低(20)
        public G a(List list0) {
            return B.d8(list0, this.a, false, 0x80);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((List)object0));
        }
    }

    private p0() {
        throw new IllegalStateException("No instances!");
    }

    public static o a(o o0) {
        return new c(o0);
    }

    public static o b(o o0, e3.c c0) {
        return new e(c0, o0);
    }

    public static o c(o o0) {
        return new f(o0);
    }

    public static e3.a d(I i0) {
        return new h(i0);
    }

    public static e3.g e(I i0) {
        return new i(i0);
    }

    public static e3.g f(I i0) {
        return new j(i0);
    }

    public static Callable g(B b0) {
        return new k(b0);
    }

    public static Callable h(B b0, int v) {
        return new a(b0, v);
    }

    public static Callable i(B b0, int v, long v1, TimeUnit timeUnit0, J j0) {
        return new b(b0, v, v1, timeUnit0, j0);
    }

    public static Callable j(B b0, long v, TimeUnit timeUnit0, J j0) {
        return new io.reactivex.internal.operators.observable.p0.o(b0, v, timeUnit0, j0);
    }

    public static o k(o o0, J j0) {
        return new l(o0, j0);
    }

    public static e3.c l(e3.b b0) {
        return new m(b0);
    }

    public static e3.c m(e3.g g0) {
        return new n(g0);
    }

    public static o n(o o0) {
        return new p(o0);
    }
}

