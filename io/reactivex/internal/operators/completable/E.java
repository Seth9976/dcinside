package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicInteger;

public final class e extends c {
    static final class a extends AtomicInteger implements f {
        final f a;
        final i[] b;
        int c;
        final h d;
        private static final long e = -7965400327305809232L;

        a(f f0, i[] arr_i) {
            this.a = f0;
            this.b = arr_i;
            this.d = new h();
        }

        void a() {
            if(this.d.a()) {
                return;
            }
            if(this.getAndIncrement() != 0) {
                return;
            }
            i[] arr_i = this.b;
            do {
                if(this.d.a()) {
                    return;
                }
                int v = this.c;
                this.c = v + 1;
                if(v == arr_i.length) {
                    this.a.onComplete();
                    return;
                }
                arr_i[v].e(this);
            }
            while(this.decrementAndGet() != 0);
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            this.d.b(c0);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            this.a();
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }
    }

    final i[] a;

    public e(i[] arr_i) {
        this.a = arr_i;
    }

    @Override  // io.reactivex.c
    public void J0(f f0) {
        a e$a0 = new a(f0, this.a);
        f0.b(e$a0.d);
        e$a0.a();
    }
}

