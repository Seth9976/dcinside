package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.J;
import io.reactivex.k;
import io.reactivex.l;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class t0 {
    static final class a implements Callable {
        private final l a;
        private final int b;

        a(l l0, int v) {
            this.a = l0;
            this.b = v;
        }

        public io.reactivex.flowables.a a() {
            return this.a.i5(this.b);
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class b implements Callable {
        private final l a;
        private final int b;
        private final long c;
        private final TimeUnit d;
        private final J e;

        b(l l0, int v, long v1, TimeUnit timeUnit0, J j0) {
            this.a = l0;
            this.b = v;
            this.c = v1;
            this.d = timeUnit0;
            this.e = j0;
        }

        public io.reactivex.flowables.a a() {
            return this.a.k5(this.b, this.c, this.d, this.e);
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

        public org.reactivestreams.c a(Object object0) throws Exception {
            return new k0(((Iterable)io.reactivex.internal.functions.b.g(this.a.apply(object0), "The mapper returned a null Iterable")));
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

        public org.reactivestreams.c a(Object object0) throws Exception {
            return new E0(((org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null Publisher")), new d(this.a, object0));
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

        public org.reactivestreams.c a(Object object0) throws Exception {
            return new H1(((org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.a.apply(object0), "The itemDelay returned a null Publisher")), 1L).M3(io.reactivex.internal.functions.a.n(object0)).C1(object0);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(object0);
        }
    }

    static final class g implements Callable {
        private final l a;

        g(l l0) {
            this.a = l0;
        }

        public io.reactivex.flowables.a a() {
            return this.a.h5();
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class h implements o {
        private final o a;
        private final J b;

        h(o o0, J j0) {
            this.a = o0;
            this.b = j0;
        }

        public org.reactivestreams.c a(l l0) throws Exception {
            return l.a3(((org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.a.apply(l0), "The selector returned a null Publisher"))).n4(this.b);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((l)object0));
        }
    }

    public static enum i implements e3.g {
        INSTANCE;

        public void a(org.reactivestreams.e e0) throws Exception {
            e0.request(0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((org.reactivestreams.e)object0));
        }
    }

    static final class j implements e3.c {
        final e3.b a;

        j(e3.b b0) {
            this.a = b0;
        }

        public Object a(Object object0, k k0) throws Exception {
            this.a.accept(object0, k0);
            return object0;
        }

        @Override  // e3.c
        public Object apply(Object object0, Object object1) throws Exception {
            return this.a(object0, ((k)object1));
        }
    }

    static final class io.reactivex.internal.operators.flowable.t0.k implements e3.c {
        final e3.g a;

        io.reactivex.internal.operators.flowable.t0.k(e3.g g0) {
            this.a = g0;
        }

        public Object a(Object object0, k k0) throws Exception {
            this.a.accept(k0);
            return object0;
        }

        @Override  // e3.c
        public Object apply(Object object0, Object object1) throws Exception {
            return this.a(object0, ((k)object1));
        }
    }

    static final class io.reactivex.internal.operators.flowable.t0.l implements e3.a {
        final org.reactivestreams.d a;

        io.reactivex.internal.operators.flowable.t0.l(org.reactivestreams.d d0) {
            this.a = d0;
        }

        @Override  // e3.a
        public void run() throws Exception {
            this.a.onComplete();
        }
    }

    static final class m implements e3.g {
        final org.reactivestreams.d a;

        m(org.reactivestreams.d d0) {
            this.a = d0;
        }

        public void a(Throwable throwable0) throws Exception {
            this.a.onError(throwable0);
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((Throwable)object0));
        }
    }

    static final class n implements e3.g {
        final org.reactivestreams.d a;

        n(org.reactivestreams.d d0) {
            this.a = d0;
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a.onNext(object0);
        }
    }

    static final class io.reactivex.internal.operators.flowable.t0.o implements Callable {
        private final l a;
        private final long b;
        private final TimeUnit c;
        private final J d;

        io.reactivex.internal.operators.flowable.t0.o(l l0, long v, TimeUnit timeUnit0, J j0) {
            this.a = l0;
            this.b = v;
            this.c = timeUnit0;
            this.d = j0;
        }

        public io.reactivex.flowables.a a() {
            return this.a.n5(this.b, this.c, this.d);
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
        public org.reactivestreams.c a(List list0) {
            return l.J8(list0, this.a, false, 0x80);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((List)object0));
        }
    }

    private t0() {
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

    public static Callable d(l l0) {
        return new g(l0);
    }

    public static Callable e(l l0, int v) {
        return new a(l0, v);
    }

    public static Callable f(l l0, int v, long v1, TimeUnit timeUnit0, J j0) {
        return new b(l0, v, v1, timeUnit0, j0);
    }

    public static Callable g(l l0, long v, TimeUnit timeUnit0, J j0) {
        return new io.reactivex.internal.operators.flowable.t0.o(l0, v, timeUnit0, j0);
    }

    public static o h(o o0, J j0) {
        return new h(o0, j0);
    }

    public static e3.c i(e3.b b0) {
        return new j(b0);
    }

    public static e3.c j(e3.g g0) {
        return new io.reactivex.internal.operators.flowable.t0.k(g0);
    }

    public static e3.a k(org.reactivestreams.d d0) {
        return new io.reactivex.internal.operators.flowable.t0.l(d0);
    }

    public static e3.g l(org.reactivestreams.d d0) {
        return new m(d0);
    }

    public static e3.g m(org.reactivestreams.d d0) {
        return new n(d0);
    }

    public static o n(o o0) {
        return new p(o0);
    }
}

