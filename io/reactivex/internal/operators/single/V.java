package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;

public final class v extends K {
    static class a implements N {
        final int a;
        final b b;
        final Object[] c;
        final N d;
        final AtomicInteger e;

        a(int v, b b0, Object[] arr_object, N n0, AtomicInteger atomicInteger0) {
            this.a = v;
            this.b = b0;
            this.c = arr_object;
            this.d = n0;
            this.e = atomicInteger0;
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            this.b.d(c0);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            do {
                int v = this.e.get();
                if(v >= 2) {
                    io.reactivex.plugins.a.Y(throwable0);
                    return;
                }
            }
            while(!this.e.compareAndSet(v, 2));
            this.b.dispose();
            this.d.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            this.c[this.a] = object0;
            if(this.e.incrementAndGet() == 2) {
                Boolean boolean0 = Boolean.valueOf(io.reactivex.internal.functions.b.c(this.c[0], this.c[1]));
                this.d.onSuccess(boolean0);
            }
        }
    }

    final Q a;
    final Q b;

    public v(Q q0, Q q1) {
        this.a = q0;
        this.b = q1;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        AtomicInteger atomicInteger0 = new AtomicInteger();
        Object[] arr_object = {null, null};
        b b0 = new b();
        n0.b(b0);
        a v$a0 = new a(0, b0, arr_object, n0, atomicInteger0);
        this.a.e(v$a0);
        a v$a1 = new a(1, b0, arr_object, n0, atomicInteger0);
        this.b.e(v$a1);
    }
}

