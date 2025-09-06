package io.reactivex.internal.disposables;

import d3.g;
import f3.j;
import io.reactivex.I;
import io.reactivex.N;
import io.reactivex.f;
import io.reactivex.v;

public enum e implements j {
    INSTANCE,
    NEVER;

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this == e.a;
    }

    public static void b(f f0) {
        f0.b(e.a);
        f0.onComplete();
    }

    public static void c(v v0) {
        v0.b(e.a);
        v0.onComplete();
    }

    @Override  // f3.o
    public void clear() {
    }

    public static void d(I i0) {
        i0.b(e.a);
        i0.onComplete();
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
    }

    public static void e(Throwable throwable0, f f0) {
        f0.b(e.a);
        f0.onError(throwable0);
    }

    public static void f(Throwable throwable0, v v0) {
        v0.b(e.a);
        v0.onError(throwable0);
    }

    public static void g(Throwable throwable0, I i0) {
        i0.b(e.a);
        i0.onError(throwable0);
    }

    @Override  // f3.k
    public int i(int v) {
        return v & 2;
    }

    @Override  // f3.o
    public boolean isEmpty() {
        return true;
    }

    @Override  // f3.o
    public boolean j(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void m(Throwable throwable0, N n0) {
        n0.b(e.a);
        n0.onError(throwable0);
    }

    @Override  // f3.o
    public boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // f3.o
    @g
    public Object poll() throws Exception {
        return null;
    }
}

