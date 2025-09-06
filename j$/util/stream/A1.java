package j$.util.stream;

import j..util.Spliterator;
import j..util.Spliterators;
import j..util.c0;
import java.util.function.Consumer;
import java.util.function.IntFunction;

final class a1 extends d1 implements F0 {
    @Override  // j$.util.stream.I0
    public final I0 b(int v) {
        throw new IndexOutOfBoundsException();
    }

    @Override  // j$.util.stream.d1, j$.util.stream.J0
    public final J0 b(int v) {
        this.b(v);
        throw null;
    }

    @Override  // j$.util.stream.I0
    public final Object d() {
        return x0.e;
    }

    @Override  // j$.util.stream.J0
    public final void forEach(Consumer consumer0) {
        x0.r(this, consumer0);
    }

    @Override  // j$.util.stream.d1, j$.util.stream.J0
    public final J0 h(long v, long v1, IntFunction intFunction0) {
        return x0.u(this, v, v1);
    }

    @Override  // j$.util.stream.J0
    public final void i(Object[] arr_object, int v) {
        x0.o(this, ((Integer[])arr_object), v);
    }

    @Override  // j$.util.stream.J0
    public final Spliterator spliterator() {
        return Spliterators.c();
    }

    @Override  // j$.util.stream.I0
    public final c0 spliterator() {
        return Spliterators.c();
    }
}

