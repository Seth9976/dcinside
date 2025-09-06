package rx.observers;

import rx.exceptions.g;
import rx.functions.b;
import rx.h;

public final class c {
    static final class a implements h {
        @Override  // rx.h
        public final void d() {
        }

        @Override  // rx.h
        public final void onError(Throwable throwable0) {
            throw new g(throwable0);
        }

        @Override  // rx.h
        public final void onNext(Object object0) {
        }
    }

    private static final h a;

    static {
        c.a = new a();
    }

    private c() {
        throw new IllegalStateException("No instances!");
    }

    public static h a(b b0) {
        static final class rx.observers.c.b implements h {
            final b a;

            rx.observers.c.b(b b0) {
                this.a = b0;
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
                this.a.b(object0);
            }
        }

        if(b0 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        return new rx.observers.c.b(b0);
    }

    public static h b(b b0, b b1) {
        static final class rx.observers.c.c implements h {
            final b a;
            final b b;

            rx.observers.c.c(b b0, b b1) {
                this.a = b0;
                this.b = b1;
                super();
            }

            @Override  // rx.h
            public final void d() {
            }

            @Override  // rx.h
            public final void onError(Throwable throwable0) {
                this.a.b(throwable0);
            }

            @Override  // rx.h
            public final void onNext(Object object0) {
                this.b.b(object0);
            }
        }

        if(b0 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if(b1 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        return new rx.observers.c.c(b1, b0);
    }

    public static h c(b b0, b b1, rx.functions.a a0) {
        static final class d implements h {
            final rx.functions.a a;
            final b b;
            final b c;

            d(rx.functions.a a0, b b0, b b1) {
                this.a = a0;
                this.b = b0;
                this.c = b1;
                super();
            }

            @Override  // rx.h
            public final void d() {
                this.a.call();
            }

            @Override  // rx.h
            public final void onError(Throwable throwable0) {
                this.b.b(throwable0);
            }

            @Override  // rx.h
            public final void onNext(Object object0) {
                this.c.b(object0);
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

    public static h d() {
        return c.a;
    }
}

