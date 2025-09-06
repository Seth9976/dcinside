package io.reactivex.internal.operators.parallel;

import e3.o;
import io.reactivex.internal.operators.flowable.w;
import io.reactivex.internal.util.j;
import org.reactivestreams.d;

public final class b extends io.reactivex.parallel.b {
    final io.reactivex.parallel.b a;
    final o b;
    final int c;
    final j d;

    public b(io.reactivex.parallel.b b0, o o0, int v, j j0) {
        this.a = b0;
        this.b = (o)io.reactivex.internal.functions.b.g(o0, "mapper");
        this.c = v;
        this.d = (j)io.reactivex.internal.functions.b.g(j0, "errorMode");
    }

    @Override  // io.reactivex.parallel.b
    public int F() {
        return this.a.F();
    }

    @Override  // io.reactivex.parallel.b
    public void Q(d[] arr_d) {
        if(!this.U(arr_d)) {
            return;
        }
        d[] arr_d1 = new d[arr_d.length];
        for(int v = 0; v < arr_d.length; ++v) {
            arr_d1[v] = w.O8(arr_d[v], this.b, this.c, this.d);
        }
        this.a.Q(arr_d1);
    }
}

