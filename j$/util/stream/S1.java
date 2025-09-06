package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.Spliterator;
import java.util.function.IntConsumer;

final class s1 extends v1 implements l2 {
    private final int[] h;

    s1(Spliterator spliterator0, b b0, int[] arr_v) {
        super(spliterator0, b0, arr_v.length);
        this.h = arr_v;
    }

    s1(s1 s10, Spliterator spliterator0, long v, long v1) {
        super(s10, spliterator0, v, v1, s10.h.length);
        this.h = s10.h;
    }

    @Override  // j$.util.stream.v1, j$.util.stream.l2
    public final void accept(int v) {
        int v1 = this.f;
        if(v1 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        this.f = v1 + 1;
        this.h[v1] = v;
    }

    @Override
    public final void accept(Object object0) {
        x0.h(this, object0);
    }

    @Override
    public final IntConsumer andThen(IntConsumer intConsumer0) {
        return a.b(this, intConsumer0);
    }

    @Override  // j$.util.stream.v1
    final v1 b(Spliterator spliterator0, long v, long v1) {
        return new s1(this, spliterator0, v, v1);
    }

    @Override  // j$.util.stream.l2
    public final void m(Integer integer0) {
        x0.g(this, integer0);
    }
}

