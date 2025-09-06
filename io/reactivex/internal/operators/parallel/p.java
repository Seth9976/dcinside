package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class p extends l {
    static final class a extends AtomicReference implements q {
        final b a;
        final int b;
        private static final long c = 6751017204873808094L;

        a(b p$b0, int v) {
            this.a = p$b0;
            this.b = v;
        }

        void a() {
            j.a(this);
        }

        public void b(List list0) {
            this.a.d(list0, this.b);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.c(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.b(((List)object0));
        }
    }

    static final class b extends AtomicInteger implements e {
        final d a;
        final a[] b;
        final List[] c;
        final int[] d;
        final Comparator e;
        final AtomicLong f;
        volatile boolean g;
        final AtomicInteger h;
        final AtomicReference i;
        private static final long j = 0x30527AF9756114D9L;

        b(d d0, int v, Comparator comparator0) {
            this.f = new AtomicLong();
            this.h = new AtomicInteger();
            this.i = new AtomicReference();
            this.a = d0;
            this.e = comparator0;
            a[] arr_p$a = new a[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_p$a[v1] = new a(this, v1);
            }
            this.b = arr_p$a;
            this.c = new List[v];
            this.d = new int[v];
            this.h.lazySet(v);
        }

        void a() {
            a[] arr_p$a = this.b;
            for(int v = 0; v < arr_p$a.length; ++v) {
                arr_p$a[v].a();
            }
        }

        void b() {
            int v3;
            if(this.getAndIncrement() != 0) {
                return;
            }
            d d0 = this.a;
            List[] arr_list = this.c;
            int[] arr_v = this.d;
            int v = 1;
        alab1:
            while(true) {
                long v1 = this.f.get();
                long v2 = 0L;
                while(true) {
                    v3 = 0;
                    if(Long.compare(v2, v1) == 0) {
                        break;
                    }
                    if(this.g) {
                        Arrays.fill(arr_list, null);
                        return;
                    }
                    Throwable throwable0 = (Throwable)this.i.get();
                    if(throwable0 != null) {
                        this.a();
                        Arrays.fill(arr_list, null);
                        d0.onError(throwable0);
                        return;
                    }
                    int v4 = -1;
                    Object object0 = null;
                    while(v3 < arr_v.length) {
                        List list0 = arr_list[v3];
                        int v5 = arr_v[v3];
                        if(list0.size() != v5) {
                            if(object0 == null) {
                                object0 = list0.get(v5);
                            }
                            else {
                                Object object1 = list0.get(v5);
                                try {
                                    if(this.e.compare(object0, object1) > 0) {
                                        goto label_40;
                                    }
                                    goto label_42;
                                }
                                catch(Throwable throwable1) {
                                    io.reactivex.exceptions.b.b(throwable1);
                                    this.a();
                                    Arrays.fill(arr_list, null);
                                    if(!androidx.compose.animation.core.d.a(this.i, null, throwable1)) {
                                        io.reactivex.plugins.a.Y(throwable1);
                                    }
                                    d0.onError(((Throwable)this.i.get()));
                                    return;
                                }
                            label_40:
                                object0 = object1;
                            }
                            v4 = v3;
                        }
                    label_42:
                        ++v3;
                    }
                    if(object0 == null) {
                        Arrays.fill(arr_list, null);
                        d0.onComplete();
                        return;
                    }
                    d0.onNext(object0);
                    ++arr_v[v4];
                    ++v2;
                }
                if(this.g) {
                    Arrays.fill(arr_list, null);
                    return;
                }
                Throwable throwable2 = (Throwable)this.i.get();
                if(throwable2 != null) {
                    this.a();
                    Arrays.fill(arr_list, null);
                    d0.onError(throwable2);
                    return;
                }
                while(true) {
                    if(v3 >= arr_v.length) {
                        break alab1;
                    }
                    if(arr_v[v3] != arr_list[v3].size()) {
                        if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                            this.f.addAndGet(-v2);
                        }
                        int v6 = this.get();
                        if(v6 == v) {
                            v6 = this.addAndGet(-v);
                            if(v6 == 0) {
                                return;
                            }
                        }
                        v = v6;
                        break;
                    }
                    ++v3;
                }
            }
            Arrays.fill(arr_list, null);
            d0.onComplete();
        }

        void c(Throwable throwable0) {
            if(androidx.compose.animation.core.d.a(this.i, null, throwable0)) {
                this.b();
                return;
            }
            if(throwable0 != this.i.get()) {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.g) {
                this.g = true;
                this.a();
                if(this.getAndIncrement() == 0) {
                    Arrays.fill(this.c, null);
                }
            }
        }

        void d(List list0, int v) {
            this.c[v] = list0;
            if(this.h.decrementAndGet() == 0) {
                this.b();
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.f, v);
                if(this.h.get() == 0) {
                    this.b();
                }
            }
        }
    }

    final io.reactivex.parallel.b b;
    final Comparator c;

    public p(io.reactivex.parallel.b b0, Comparator comparator0) {
        this.b = b0;
        this.c = comparator0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        b p$b0 = new b(d0, this.b.F(), this.c);
        d0.g(p$b0);
        this.b.Q(p$b0.b);
    }
}

