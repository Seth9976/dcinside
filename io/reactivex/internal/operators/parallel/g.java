package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.b;
import org.reactivestreams.c;
import org.reactivestreams.d;

public final class g extends b {
    final c[] a;

    public g(c[] arr_c) {
        this.a = arr_c;
    }

    @Override  // io.reactivex.parallel.b
    public int F() {
        return this.a.length;
    }

    @Override  // io.reactivex.parallel.b
    public void Q(d[] arr_d) {
        if(!this.U(arr_d)) {
            return;
        }
        for(int v = 0; v < arr_d.length; ++v) {
            this.a[v].e(arr_d[v]);
        }
    }
}

