package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.Spliterator;
import java.util.function.DoubleConsumer;

final class r1 extends v1 implements k2 {
    private final double[] h;

    r1(Spliterator spliterator0, b b0, double[] arr_f) {
        super(spliterator0, b0, arr_f.length);
        this.h = arr_f;
    }

    r1(r1 r10, Spliterator spliterator0, long v, long v1) {
        super(r10, spliterator0, v, v1, r10.h.length);
        this.h = r10.h;
    }

    @Override  // j$.util.stream.v1, j$.util.stream.k2
    public final void accept(double f) {
        int v = this.f;
        if(v >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        this.f = v + 1;
        this.h[v] = f;
    }

    @Override
    public final void accept(Object object0) {
        x0.f(this, object0);
    }

    @Override
    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return a.a(this, doubleConsumer0);
    }

    @Override  // j$.util.stream.v1
    final v1 b(Spliterator spliterator0, long v, long v1) {
        return new r1(this, spliterator0, v, v1);
    }

    @Override  // j$.util.stream.k2
    public final void p(Double double0) {
        x0.e(this, double0);
    }
}

