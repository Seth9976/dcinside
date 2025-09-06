package rx.observers;

import rx.exceptions.g;
import rx.functions.a;
import rx.functions.b;
import rx.n;

public final class h {
    private h() {
        throw new IllegalStateException("No instances!");
    }

    public static n a(b b0) {
        static final class rx.observers.h.b extends n {
            final b f;

            rx.observers.h.b(b b0) {
                this.f = b0;
                super();
            }

            @Override  // rx.h
            public final void d() {
            }

            @Override  // rx.h
            public final void onError(Throwable throwable0) {
                throw new g(throwable0);
            }

            @Override  // rx.h
            public final void onNext(Object object0) {
                this.f.b(object0);
            }
        }

        if(b0 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        return new rx.observers.h.b(b0);
    }

    public static n b(b b0, b b1) {
        static final class c extends n {
            final b f;
            final b g;

            c(b b0, b b1) {
                this.f = b0;
                this.g = b1;
                super();
            }

            @Override  // rx.h
            public final void d() {
            }

            @Override  // rx.h
            public final void onError(Throwable throwable0) {
                this.f.b(throwable0);
            }

            @Override  // rx.h
            public final void onNext(Object object0) {
                this.g.b(object0);
            }
        }

        if(b0 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if(b1 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        return new c(b1, b0);
    }

    public static n c(b b0, b b1, a a0) {
        static final class d extends n {
            final a f;
            final b g;
            final b h;

            d(a a0, b b0, b b1) {
                this.f = a0;
                this.g = b0;
                this.h = b1;
                super();
            }

            @Override  // rx.h
            public final void d() {
                this.f.call();
            }

            @Override  // rx.h
            public final void onError(Throwable throwable0) {
                this.g.b(throwable0);
            }

            @Override  // rx.h
            public final void onNext(Object object0) {
                this.h.b(object0);
            }
        }

        if(b0 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if(b1 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if(a0 == null) {
            throw new IllegalArgumentException("onComplete can not be null");
        }
        return new d(a0, b1, b0);
    }

    public static n d() {
        return h.e(rx.observers.c.d());
    }

    public static n e(rx.h h0) {
        static final class rx.observers.h.a extends n {
            final rx.h f;

            rx.observers.h.a(rx.h h0) {
                this.f = h0;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.f.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.f.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.f.onNext(object0);
            }
        }

        return new rx.observers.h.a(h0);
    }

    public static n f(n n0) {
        static final class e extends n {
            final n f;

            e(n n0, n n1) {
                this.f = n1;
                super(n0);
            }

            @Override  // rx.h
            public void d() {
                this.f.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.f.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.f.onNext(object0);
            }
        }

        return new e(n0, n0);
    }
}

