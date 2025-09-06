package io.reactivex.internal.operators.single;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.e;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a extends K {
    static final class io.reactivex.internal.operators.single.a.a implements N {
        final b a;
        final N b;
        final AtomicBoolean c;
        c d;

        io.reactivex.internal.operators.single.a.a(N n0, b b0, AtomicBoolean atomicBoolean0) {
            this.b = n0;
            this.a = b0;
            this.c = atomicBoolean0;
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            this.d = c0;
            this.a.d(c0);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            if(this.c.compareAndSet(false, true)) {
                this.a.c(this.d);
                this.a.dispose();
                this.b.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            if(this.c.compareAndSet(false, true)) {
                this.a.c(this.d);
                this.a.dispose();
                this.b.onSuccess(object0);
            }
        }
    }

    private final Q[] a;
    private final Iterable b;

    public a(Q[] arr_q, Iterable iterable0) {
        this.a = arr_q;
        this.b = iterable0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        int v;
        Q[] arr_q = this.a;
        if(arr_q == null) {
            try {
                arr_q = new Q[8];
                v = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_22;
                    }
                    Object object0 = iterator0.next();
                    if(((Q)object0) == null) {
                        e.m(new NullPointerException("One of the sources is null"), n0);
                        return;
                    }
                    if(v == arr_q.length) {
                        Q[] arr_q1 = new Q[(v >> 2) + v];
                        System.arraycopy(arr_q, 0, arr_q1, 0, v);
                        arr_q = arr_q1;
                    }
                    arr_q[v] = (Q)object0;
                    ++v;
                }
            }
            catch(Throwable throwable0) {
            }
            io.reactivex.exceptions.b.b(throwable0);
            e.m(throwable0, n0);
            return;
        }
        else {
            v = arr_q.length;
        }
    label_22:
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        b b0 = new b();
        n0.b(b0);
        for(int v1 = 0; v1 < v; ++v1) {
            Q q0 = arr_q[v1];
            if(b0.a()) {
                return;
            }
            if(q0 == null) {
                b0.dispose();
                NullPointerException nullPointerException0 = new NullPointerException("One of the sources is null");
                if(atomicBoolean0.compareAndSet(false, true)) {
                    n0.onError(nullPointerException0);
                    return;
                }
                io.reactivex.plugins.a.Y(nullPointerException0);
                return;
            }
            q0.e(new io.reactivex.internal.operators.single.a.a(n0, b0, atomicBoolean0));
        }
    }
}

