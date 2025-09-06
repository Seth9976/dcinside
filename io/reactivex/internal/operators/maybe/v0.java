package io.reactivex.internal.operators.maybe;

import e3.o;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.Arrays;
import java.util.Iterator;

public final class v0 extends s {
    final class a implements o {
        final v0 a;

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return b.g(v0.this.b.apply(new Object[]{object0}), "The zipper returned a null value");
        }
    }

    final Iterable a;
    final o b;

    public v0(Iterable iterable0, o o0) {
        this.a = iterable0;
        this.b = o0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        int v2;
        y[] arr_y;
        try {
            arr_y = new y[8];
            v2 = 0;
            Iterator iterator0 = this.a.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_18;
                }
                Object object0 = iterator0.next();
                if(((y)object0) == null) {
                    e.f(new NullPointerException("One of the sources is null"), v0);
                    return;
                }
                if(v2 == arr_y.length) {
                    arr_y = (y[])Arrays.copyOf(arr_y, (v2 >> 2) + v2);
                }
                arr_y[v2] = (y)object0;
                ++v2;
            }
        }
        catch(Throwable throwable0) {
        }
        io.reactivex.exceptions.b.b(throwable0);
        e.f(throwable0, v0);
        return;
    label_18:
        if(v2 == 0) {
            e.c(v0);
            return;
        }
        if(v2 == 1) {
            arr_y[0].a(new io.reactivex.internal.operators.maybe.W.a(v0, new a(this)));
            return;
        }
        io.reactivex.internal.operators.maybe.u0.b u0$b0 = new io.reactivex.internal.operators.maybe.u0.b(v0, v2, this.b);
        v0.b(u0$b0);
        for(int v1 = 0; v1 < v2 && !u0$b0.a(); ++v1) {
            arr_y[v1].a(u0$b0.c[v1]);
        }
    }
}

