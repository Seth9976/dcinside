package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rx.g;
import rx.n;

public final class c {
    static final class b extends n {
        volatile Object f;

        b(Object object0) {
            this.f = x.j(object0);
        }

        @Override  // rx.h
        public void d() {
            this.f = x.b();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.f = x.c(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.f = x.j(object0);
        }

        public Iterator x() {
            class a implements Iterator {
                private Object a;
                final b b;

                @Override
                public boolean hasNext() {
                    this.a = b.this.f;
                    return !x.f(b.this.f);
                }

                @Override
                public Object next() {
                    try {
                        if(this.a == null) {
                            this.a = b.this.f;
                        }
                        if(x.f(this.a)) {
                            throw new NoSuchElementException();
                        }
                        if(x.g(this.a)) {
                            throw rx.exceptions.c.c(x.d(this.a));
                        }
                        Object object0 = x.e(this.a);
                        this.a = null;
                        return object0;
                    }
                    catch(Throwable throwable0) {
                    }
                    this.a = null;
                    throw throwable0;
                }

                @Override
                public void remove() {
                    throw new UnsupportedOperationException("Read only iterator");
                }
            }

            return new a(this);
        }
    }

    private c() {
        throw new IllegalStateException("No instances!");
    }

    public static Iterable a(g g0, Object object0) {
        static final class rx.internal.operators.c.a implements Iterable {
            final Object a;
            final g b;

            rx.internal.operators.c.a(Object object0, g g0) {
                this.a = object0;
                this.b = g0;
                super();
            }

            @Override
            public Iterator iterator() {
                b c$b0 = new b(this.a);
                this.b.v5(c$b0);
                return c$b0.x();
            }
        }

        return new rx.internal.operators.c.a(object0, g0);
    }
}

