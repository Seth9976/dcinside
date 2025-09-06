package j$.util.stream;

import j..util.Spliterator;
import j..util.Spliterators;
import j..util.c0;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

class f1 implements F0 {
    final int[] a;
    int b;

    f1(long v) {
        if(v >= 0x7FFFFFF7L) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new int[((int)v)];
        this.b = 0;
    }

    f1(int[] arr_v) {
        this.a = arr_v;
        this.b = arr_v.length;
    }

    @Override  // j$.util.stream.I0
    public final I0 b(int v) {
        throw new IndexOutOfBoundsException();
    }

    @Override  // j$.util.stream.J0
    public final J0 b(int v) {
        this.b(v);
        throw null;
    }

    @Override  // j$.util.stream.J0
    public final long count() {
        return (long)this.b;
    }

    @Override  // j$.util.stream.I0
    public final Object d() {
        return this.a.length == this.b ? this.a : Arrays.copyOf(this.a, this.b);
    }

    @Override  // j$.util.stream.I0
    public final void e(Object object0) {
        for(int v = 0; v < this.b; ++v) {
            ((IntConsumer)object0).accept(this.a[v]);
        }
    }

    @Override  // j$.util.stream.J0
    public final void forEach(Consumer consumer0) {
        x0.r(this, consumer0);
    }

    @Override  // j$.util.stream.J0
    public final J0 h(long v, long v1, IntFunction intFunction0) {
        return x0.u(this, v, v1);
    }

    @Override  // j$.util.stream.J0
    public final void i(Object[] arr_object, int v) {
        x0.o(this, ((Integer[])arr_object), v);
    }

    @Override  // j$.util.stream.J0
    public final Object[] o(IntFunction intFunction0) {
        return x0.m(this, intFunction0);
    }

    @Override  // j$.util.stream.J0
    public final int q() {
        return 0;
    }

    @Override  // j$.util.stream.I0
    public final void r(int v, Object object0) {
        System.arraycopy(this.a, 0, ((int[])object0), v, this.b);
    }

    @Override  // j$.util.stream.J0
    public final Spliterator spliterator() {
        return Spliterators.k(this.a, 0, this.b);
    }

    @Override  // j$.util.stream.I0
    public final c0 spliterator() {
        return Spliterators.k(this.a, 0, this.b);
    }

    @Override
    public String toString() {
        return String.format("IntArrayNode[%d][%s]", ((int)(this.a.length - this.b)), Arrays.toString(this.a));
    }
}

