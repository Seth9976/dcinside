package j$.util.stream;

import java.util.function.IntFunction;

final class w1 extends X2 implements B0, J0 {
    @Override  // j$.util.stream.B0
    public final J0 a() {
        return this;
    }

    @Override  // j$.util.stream.n2
    public final void accept(double f) {
        x0.a();
        throw null;
    }

    @Override  // j$.util.stream.n2
    public final void accept(int v) {
        x0.k();
        throw null;
    }

    @Override  // j$.util.stream.n2
    public final void accept(long v) {
        x0.l();
        throw null;
    }

    @Override  // j$.util.stream.J0
    public final J0 b(int v) {
        throw new IndexOutOfBoundsException();
    }

    @Override  // j$.util.stream.J0
    public final J0 h(long v, long v1, IntFunction intFunction0) {
        return x0.w(this, v, v1, intFunction0);
    }

    @Override  // j$.util.stream.J0
    public final void i(Object[] arr_object, int v) {
        long v1 = this.count() + ((long)v);
        if(v1 > ((long)arr_object.length) || v1 < ((long)v)) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if(this.c == 0) {
            System.arraycopy(this.e, 0, arr_object, v, this.b);
            return;
        }
        for(int v2 = 0; v2 < this.c; ++v2) {
            Object[] arr_object1 = this.f[v2];
            System.arraycopy(arr_object1, 0, arr_object, v, arr_object1.length);
            v += this.f[v2].length;
        }
        int v3 = this.b;
        if(v3 > 0) {
            System.arraycopy(this.e, 0, arr_object, v, v3);
        }
    }

    @Override  // j$.util.stream.n2
    public final void k() {
    }

    @Override  // j$.util.stream.n2
    public final void l(long v) {
        this.clear();
        this.s(v);
    }

    @Override  // j$.util.stream.n2
    public final boolean n() {
        return false;
    }

    @Override  // j$.util.stream.J0
    public final Object[] o(IntFunction intFunction0) {
        long v = this.count();
        if(v >= 0x7FFFFFF7L) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] arr_object = (Object[])intFunction0.apply(((int)v));
        this.i(arr_object, 0);
        return arr_object;
    }

    @Override  // j$.util.stream.J0
    public final int q() {
        return 0;
    }
}

