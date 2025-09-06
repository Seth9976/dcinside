package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.i;
import io.reactivex.l;
import io.reactivex.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.c;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class v extends l {
    static final class a extends i implements q {
        final d j;
        final c[] k;
        final boolean l;
        final AtomicInteger m;
        int n;
        List o;
        long p;
        private static final long q = 0x8EC7D092AACEAF54L;

        a(c[] arr_c, boolean z, d d0) {
            super(false);
            this.j = d0;
            this.k = arr_c;
            this.l = z;
            this.m = new AtomicInteger();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            this.i(e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.m.getAndIncrement() == 0) {
                c[] arr_c = this.k;
                int v = this.n;
                while(true) {
                    if(v == arr_c.length) {
                        List list0 = this.o;
                        if(list0 != null) {
                            if(list0.size() == 1) {
                                Throwable throwable0 = (Throwable)list0.get(0);
                                this.j.onError(throwable0);
                                return;
                            }
                            io.reactivex.exceptions.a a0 = new io.reactivex.exceptions.a(list0);
                            this.j.onError(a0);
                            return;
                        }
                        this.j.onComplete();
                        return;
                    }
                    c c0 = arr_c[v];
                    if(c0 == null) {
                        NullPointerException nullPointerException0 = new NullPointerException("A Publisher entry is null");
                        if(this.l) {
                            List list1 = this.o;
                            if(list1 == null) {
                                list1 = new ArrayList(arr_c.length - v + 1);
                                this.o = list1;
                            }
                            list1.add(nullPointerException0);
                            ++v;
                            continue;
                        }
                        this.j.onError(nullPointerException0);
                        return;
                    }
                    long v1 = this.p;
                    if(v1 != 0L) {
                        this.p = 0L;
                        this.h(v1);
                    }
                    c0.e(this);
                    ++v;
                    this.n = v;
                    if(this.m.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.l) {
                List list0 = this.o;
                if(list0 == null) {
                    list0 = new ArrayList(this.k.length - this.n + 1);
                    this.o = list0;
                }
                list0.add(throwable0);
                this.onComplete();
                return;
            }
            this.j.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            ++this.p;
            this.j.onNext(object0);
        }
    }

    final c[] b;
    final boolean c;

    public v(c[] arr_c, boolean z) {
        this.b = arr_c;
        this.c = z;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a v$a0 = new a(this.b, this.c, d0);
        d0.g(v$a0);
        v$a0.onComplete();
    }
}

