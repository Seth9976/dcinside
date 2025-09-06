package io.reactivex.internal.operators.single;

import d3.g;
import e3.o;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.d;

public final class z extends l {
    static final class a extends c implements N {
        final d b;
        final o c;
        final AtomicLong d;
        io.reactivex.disposables.c e;
        volatile Iterator f;
        volatile boolean g;
        boolean h;
        private static final long i = 0x83F2FC6FAA158152L;

        a(d d0, o o0) {
            this.b = d0;
            this.c = o0;
            this.d = new AtomicLong();
        }

        void a(d d0, Iterator iterator0) {
            Object object0;
            while(true) {
                if(this.g) {
                    return;
                }
                try {
                    object0 = iterator0.next();
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    d0.onError(throwable0);
                    return;
                }
                d0.onNext(object0);
                if(this.g) {
                    return;
                }
                try {
                    if(iterator0.hasNext()) {
                        continue;
                    }
                    goto label_17;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            b.b(throwable1);
            d0.onError(throwable1);
            return;
        label_17:
            d0.onComplete();
        }

        @Override  // io.reactivex.N
        public void b(io.reactivex.disposables.c c0) {
            if(io.reactivex.internal.disposables.d.i(this.e, c0)) {
                this.e = c0;
                this.b.g(this);
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.g = true;
            this.e.dispose();
            this.e = io.reactivex.internal.disposables.d.a;
        }

        @Override  // f3.o
        public void clear() {
            this.f = null;
        }

        void d() {
            Object object1;
            if(this.getAndIncrement() != 0) {
                return;
            }
            d d0 = this.b;
            Iterator iterator0 = this.f;
            if(this.h && iterator0 != null) {
                d0.onNext(null);
                d0.onComplete();
                return;
            }
            int v = 1;
            while(true) {
                if(iterator0 != null) {
                    long v1 = this.d.get();
                    if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                        this.a(d0, iterator0);
                        return;
                    }
                    long v2 = 0L;
                    while(v2 != v1) {
                        if(this.g) {
                            return;
                        }
                        try {
                            Object object0 = iterator0.next();
                            object1 = io.reactivex.internal.functions.b.g(object0, "The iterator returned a null value");
                        }
                        catch(Throwable throwable0) {
                            b.b(throwable0);
                            d0.onError(throwable0);
                            return;
                        }
                        d0.onNext(object1);
                        if(this.g) {
                            return;
                        }
                        try {
                            ++v2;
                            if(!iterator0.hasNext()) {
                                goto label_35;
                            }
                            goto label_37;
                        }
                        catch(Throwable throwable1) {
                            b.b(throwable1);
                            d0.onError(throwable1);
                            return;
                        }
                    label_35:
                        d0.onComplete();
                        return;
                    label_37:
                        if(false) {
                            break;
                        }
                    }
                    if(v2 != 0L) {
                        io.reactivex.internal.util.d.e(this.d, v2);
                    }
                }
                v = this.addAndGet(-v);
                if(v == 0) {
                    return;
                }
                if(iterator0 == null) {
                    iterator0 = this.f;
                }
            }
        }

        @Override  // f3.k
        public int i(int v) {
            if((v & 2) != 0) {
                this.h = true;
                return 2;
            }
            return 0;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return this.f == null;
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.e = io.reactivex.internal.disposables.d.a;
            this.b.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            Iterator iterator0;
            try {
                iterator0 = ((Iterable)this.c.apply(object0)).iterator();
                if(!iterator0.hasNext()) {
                    goto label_7;
                }
                goto label_9;
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.b.onError(throwable0);
                return;
            }
        label_7:
            this.b.onComplete();
            return;
        label_9:
            this.f = iterator0;
            this.d();
        }

        @Override  // f3.o
        @g
        public Object poll() throws Exception {
            Iterator iterator0 = this.f;
            if(iterator0 != null) {
                Object object0 = iterator0.next();
                Object object1 = io.reactivex.internal.functions.b.g(object0, "The iterator returned a null value");
                if(!iterator0.hasNext()) {
                    this.f = null;
                }
                return object1;
            }
            return null;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.d, v);
                this.d();
            }
        }
    }

    final Q b;
    final o c;

    public z(Q q0, o o0) {
        this.b = q0;
        this.c = o0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a z$a0 = new a(d0, this.c);
        this.b.e(z$a0);
    }
}

