package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.k;
import io.reactivex.internal.util.q;
import io.reactivex.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterable {
    static final class a extends io.reactivex.subscribers.a {
        final class io.reactivex.internal.operators.flowable.d.a.a implements Iterator {
            private Object a;
            final a b;

            @Override
            public boolean hasNext() {
                this.a = a.this.b;
                return !q.l(a.this.b);
            }

            @Override
            public Object next() {
                try {
                    if(this.a == null) {
                        this.a = a.this.b;
                    }
                    if(q.l(this.a)) {
                        throw new NoSuchElementException();
                    }
                    if(q.n(this.a)) {
                        throw k.f(q.i(this.a));
                    }
                    Object object0 = this.a;
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

        volatile Object b;

        a(Object object0) {
            this.b = object0;
        }

        public io.reactivex.internal.operators.flowable.d.a.a d() {
            return new io.reactivex.internal.operators.flowable.d.a.a(this);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.b = q.e();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.b = q.g(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.b = object0;
        }
    }

    final l a;
    final Object b;

    public d(l l0, Object object0) {
        this.a = l0;
        this.b = object0;
    }

    @Override
    public Iterator iterator() {
        a d$a0 = new a(this.b);
        this.a.l6(d$a0);
        return d$a0.d();
    }
}

