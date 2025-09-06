package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.Spliterator;
import java.util.function.LongConsumer;

final class t1 extends v1 implements m2 {
    private final long[] h;

    t1(Spliterator spliterator0, b b0, long[] arr_v) {
        super(spliterator0, b0, arr_v.length);
        this.h = arr_v;
    }

    t1(t1 t10, Spliterator spliterator0, long v, long v1) {
        super(t10, spliterator0, v, v1, t10.h.length);
        this.h = t10.h;
    }

    @Override  // j$.util.stream.v1, j$.util.stream.m2
    public final void accept(long v) {
        int v1 = this.f;
        if(v1 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        this.f = v1 + 1;
        this.h[v1] = v;
    }

    @Override
    public final void accept(Object object0) {
        x0.j(this, object0);
    }

    @Override
    public final LongConsumer andThen(LongConsumer longConsumer0) {
        return a.c(this, longConsumer0);
    }

    @Override  // j$.util.stream.v1
    final v1 b(Spliterator spliterator0, long v, long v1) {
        return new t1(this, spliterator0, v, v1);
    }

    @Override  // j$.util.stream.m2
    public final void j(Long long0) {
        x0.i(this, long0);
    }
}

