package io.reactivex.internal.operators.parallel;

import e3.o;
import io.reactivex.internal.operators.flowable.a0;
import io.reactivex.parallel.b;
import org.reactivestreams.d;

public final class f extends b {
    final b a;
    final o b;
    final boolean c;
    final int d;
    final int e;

    public f(b b0, o o0, boolean z, int v, int v1) {
        this.a = b0;
        this.b = o0;
        this.c = z;
        this.d = v;
        this.e = v1;
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
            arr_d1[v] = a0.O8(arr_d[v], this.b, this.c, this.d, this.e);
        }
        this.a.Q(arr_d1);
    }
}

