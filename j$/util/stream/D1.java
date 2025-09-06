package j$.util.stream;

import java.util.function.IntFunction;

abstract class d1 implements J0 {
    @Override  // j$.util.stream.J0
    public J0 b(int v) {
        throw new IndexOutOfBoundsException();
    }

    @Override  // j$.util.stream.J0
    public final long count() {
        return 0L;
    }

    public final void e(Object object0) {
    }

    @Override  // j$.util.stream.J0
    public J0 h(long v, long v1, IntFunction intFunction0) {
        return x0.w(this, v, v1, intFunction0);
    }

    @Override  // j$.util.stream.J0
    public final Object[] o(IntFunction intFunction0) {
        return (Object[])intFunction0.apply(0);
    }

    @Override  // j$.util.stream.J0
    public final int q() {
        return 0;
    }

    public final void r(int v, Object object0) {
    }
}

