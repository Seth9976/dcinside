package io.reactivex.internal.operators.maybe;

import e3.g;
import e3.o;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

public final class t0 extends s {
    static final class a extends AtomicReference implements c, v {
        final v a;
        final g b;
        final boolean c;
        c d;
        private static final long e = 0xF6A408A287304F11L;

        a(v v0, Object object0, g g0, boolean z) {
            super(object0);
            this.a = v0;
            this.b = g0;
            this.c = z;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d.a();
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.i(this.d, c0)) {
                this.d = c0;
                this.a.b(this);
            }
        }

        void c() {
            Object object0 = this.getAndSet(this);
            if(object0 != this) {
                try {
                    this.b.accept(object0);
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    io.reactivex.plugins.a.Y(throwable0);
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.d.dispose();
            this.d = d.a;
            this.c();
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.d = d.a;
            if(this.c) {
                Object object0 = this.getAndSet(this);
                if(object0 != this) {
                    try {
                        this.b.accept(object0);
                        goto label_10;
                    }
                    catch(Throwable throwable0) {
                        b.b(throwable0);
                        this.a.onError(throwable0);
                    }
                }
                return;
            }
        label_10:
            this.a.onComplete();
            if(!this.c) {
                this.c();
            }
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.d = d.a;
            if(this.c) {
                Object object0 = this.getAndSet(this);
                if(object0 != this) {
                    try {
                        this.b.accept(object0);
                    }
                    catch(Throwable throwable1) {
                        b.b(throwable1);
                        throwable0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
                    }
                    goto label_11;
                }
                return;
            }
        label_11:
            this.a.onError(throwable0);
            if(!this.c) {
                this.c();
            }
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.d = d.a;
            if(this.c) {
                Object object1 = this.getAndSet(this);
                if(object1 != this) {
                    try {
                        this.b.accept(object1);
                        goto label_10;
                    }
                    catch(Throwable throwable0) {
                        b.b(throwable0);
                        this.a.onError(throwable0);
                    }
                }
                return;
            }
        label_10:
            this.a.onSuccess(object0);
            if(!this.c) {
                this.c();
            }
        }
    }

    final Callable a;
    final o b;
    final g c;
    final boolean d;

    public t0(Callable callable0, o o0, g g0, boolean z) {
        this.a = callable0;
        this.b = o0;
        this.c = g0;
        this.d = z;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        y y0;
        Object object0;
        try {
            object0 = this.a.call();
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            e.f(throwable0, v0);
            return;
        }
        try {
            y0 = (y)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The sourceSupplier returned a null MaybeSource");
        }
        catch(Throwable throwable1) {
            b.b(throwable1);
            if(this.d) {
                try {
                    this.c.accept(object0);
                }
                catch(Throwable throwable2) {
                    b.b(throwable2);
                    e.f(new io.reactivex.exceptions.a(new Throwable[]{throwable1, throwable2}), v0);
                    return;
                }
            }
            e.f(throwable1, v0);
            if(!this.d) {
                try {
                    this.c.accept(object0);
                    return;
                }
                catch(Throwable throwable3) {
                    b.b(throwable3);
                    io.reactivex.plugins.a.Y(throwable3);
                }
            }
            return;
        }
        y0.a(new a(v0, object0, this.c, this.d));
    }
}

