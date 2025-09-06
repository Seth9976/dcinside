package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class t1 extends a {
    static final class io.reactivex.internal.operators.observable.t1.a extends AtomicBoolean implements I, c {
        final I a;
        final long b;
        final long c;
        final TimeUnit d;
        final J e;
        final io.reactivex.internal.queue.c f;
        final boolean g;
        c h;
        volatile boolean i;
        Throwable j;
        private static final long k = -5677354903406201275L;

        io.reactivex.internal.operators.observable.t1.a(I i0, long v, long v1, TimeUnit timeUnit0, J j0, int v2, boolean z) {
            this.a = i0;
            this.b = v;
            this.c = v1;
            this.d = timeUnit0;
            this.e = j0;
            this.f = new io.reactivex.internal.queue.c(v2);
            this.g = z;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.i;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.h, c0)) {
                this.h = c0;
                this.a.b(this);
            }
        }

        void c() {
            if(!this.compareAndSet(false, true)) {
                return;
            }
            I i0 = this.a;
            io.reactivex.internal.queue.c c0 = this.f;
            boolean z = this.g;
            long v = this.e.e(this.d) - this.c;
            while(true) {
                if(this.i) {
                    c0.clear();
                    return;
                }
                if(!z) {
                    Throwable throwable0 = this.j;
                    if(throwable0 != null) {
                        c0.clear();
                        i0.onError(throwable0);
                        return;
                    }
                }
                Object object0 = c0.poll();
                if(object0 == null) {
                    Throwable throwable1 = this.j;
                    if(throwable1 != null) {
                        i0.onError(throwable1);
                        return;
                    }
                    i0.onComplete();
                    return;
                }
                Object object1 = c0.poll();
                if(((long)(((Long)object0))) >= v) {
                    i0.onNext(object1);
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.i) {
                this.i = true;
                this.h.dispose();
                if(this.compareAndSet(false, true)) {
                    this.f.clear();
                }
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.j = throwable0;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            io.reactivex.internal.queue.c c0 = this.f;
            long v = this.e.e(this.d);
            long v1 = this.c;
            long v2 = this.b;
            c0.j(v, object0);
            while(!c0.isEmpty() && (((long)(((Long)c0.peek()))) <= v - v1 || v2 != 0x7FFFFFFFFFFFFFFFL && ((long)(c0.r() >> 1)) > v2)) {
                c0.poll();
                c0.poll();
            }
        }
    }

    final long b;
    final long c;
    final TimeUnit d;
    final J e;
    final int f;
    final boolean g;

    public t1(G g0, long v, long v1, TimeUnit timeUnit0, J j0, int v2, boolean z) {
        super(g0);
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.e = j0;
        this.f = v2;
        this.g = z;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.t1.a t1$a0 = new io.reactivex.internal.operators.observable.t1.a(i0, this.b, this.c, this.d, this.e, this.f, this.g);
        this.a.d(t1$a0);
    }
}

