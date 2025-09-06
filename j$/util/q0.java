package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

final class q0 implements Z {
    private final long[] a;
    private int b;
    private final int c;
    private final int d;

    public q0(long[] arr_v, int v, int v1, int v2) {
        this.a = arr_v;
        this.b = v;
        this.c = v1;
        this.d = v2 | 0x4040;
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return this.d;
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return (long)(this.c - this.b);
    }

    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((LongConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.c(this, consumer0);
    }

    @Override  // j$.util.Z
    public final void forEachRemaining(LongConsumer longConsumer0) {
        longConsumer0.getClass();
        long[] arr_v = this.a;
        int v = this.c;
        if(arr_v.length >= v) {
            int v1 = this.b;
            if(v1 >= 0) {
                this.b = v;
                if(v1 < v) {
                    while(true) {
                        longConsumer0.accept(arr_v[v1]);
                        ++v1;
                        if(v1 >= v) {
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override  // j$.util.Spliterator
    public final Comparator getComparator() {
        if(!P.e(this, 4)) {
            throw new IllegalStateException();
        }
        return null;
    }

    @Override  // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return P.d(this);
    }

    @Override  // j$.util.Spliterator
    public final boolean hasCharacteristics(int v) {
        return P.e(this, v);
    }

    @Override  // j$.util.c0
    public final boolean tryAdvance(Object object0) {
        return this.tryAdvance(((LongConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.h(this, consumer0);
    }

    @Override  // j$.util.Z
    public final boolean tryAdvance(LongConsumer longConsumer0) {
        longConsumer0.getClass();
        int v = this.b;
        if(v >= 0 && v < this.c) {
            this.b = v + 1;
            longConsumer0.accept(this.a[v]);
            return true;
        }
        return false;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        return this.trySplit();
    }

    @Override  // j$.util.Z
    public final Z trySplit() {
        int v = this.b;
        int v1 = this.c + v >>> 1;
        if(v >= v1) {
            return null;
        }
        this.b = v1;
        return new q0(this.a, v, v1, this.d);
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return this.trySplit();
    }
}

