package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

final class i0 implements Spliterator {
    private final Object[] a;
    private int b;
    private final int c;
    private final int d;

    public i0(Object[] arr_object, int v, int v1, int v2) {
        this.a = arr_object;
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

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        consumer0.getClass();
        Object[] arr_object = this.a;
        int v = this.c;
        if(arr_object.length >= v) {
            int v1 = this.b;
            if(v1 >= 0) {
                this.b = v;
                if(v1 < v) {
                    while(true) {
                        consumer0.accept(arr_object[v1]);
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

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        consumer0.getClass();
        int v = this.b;
        if(v >= 0 && v < this.c) {
            this.b = v + 1;
            consumer0.accept(this.a[v]);
            return true;
        }
        return false;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        int v = this.b;
        int v1 = this.c + v >>> 1;
        if(v >= v1) {
            return null;
        }
        this.b = v1;
        return new i0(this.a, v, v1, this.d);
    }
}

