package io.reactivex.internal.operators.single;

import e3.o;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a0 extends K {
    final class a implements o {
        final a0 a;

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return b.g(a0.this.b.apply(new Object[]{object0}), "The zipper returned a null value");
        }
    }

    final Iterable a;
    final o b;

    public a0(Iterable iterable0, o o0) {
        this.a = iterable0;
        this.b = o0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        int v1;
        Q[] arr_q;
        try {
            arr_q = new Q[8];
            v1 = 0;
            Iterator iterator0 = this.a.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_18;
                }
                Object object0 = iterator0.next();
                if(((Q)object0) == null) {
                    e.m(new NullPointerException("One of the sources is null"), n0);
                    return;
                }
                if(v1 == arr_q.length) {
                    arr_q = (Q[])Arrays.copyOf(arr_q, (v1 >> 2) + v1);
                }
                arr_q[v1] = (Q)object0;
                ++v1;
            }
        }
        catch(Throwable throwable0) {
        }
        io.reactivex.exceptions.b.b(throwable0);
        e.m(throwable0, n0);
        return;
    label_18:
        if(v1 == 0) {
            e.m(new NoSuchElementException(), n0);
            return;
        }
        if(v1 == 1) {
            arr_q[0].e(new io.reactivex.internal.operators.single.K.a(n0, new a(this)));
            return;
        }
        io.reactivex.internal.operators.single.Z.b z$b0 = new io.reactivex.internal.operators.single.Z.b(n0, v1, this.b);
        n0.b(z$b0);
        for(int v = 0; v < v1 && !z$b0.a(); ++v) {
            arr_q[v].e(z$b0.c[v]);
        }
    }
}

