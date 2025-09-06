package j$.util.stream;

import j..util.Spliterator;

final class u1 extends v1 {
    private final Object[] h;

    u1(Spliterator spliterator0, b b0, Object[] arr_object) {
        super(spliterator0, b0, arr_object.length);
        this.h = arr_object;
    }

    u1(u1 u10, Spliterator spliterator0, long v, long v1) {
        super(u10, spliterator0, v, v1, u10.h.length);
        this.h = u10.h;
    }

    @Override
    public final void accept(Object object0) {
        int v = this.f;
        if(v >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        this.f = v + 1;
        this.h[v] = object0;
    }

    @Override  // j$.util.stream.v1
    final v1 b(Spliterator spliterator0, long v, long v1) {
        return new u1(this, spliterator0, v, v1);
    }
}

