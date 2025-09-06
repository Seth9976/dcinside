package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;

final class a implements Spliterator {
    private final List a;
    private int b;
    private int c;

    private a(a a0, int v, int v1) {
        this.a = a0.a;
        this.b = v;
        this.c = v1;
    }

    a(List list0) {
        this.a = list0;
        this.b = 0;
        this.c = -1;
    }

    private int a() {
        int v = this.c;
        if(v < 0) {
            v = this.a.size();
            this.c = v;
        }
        return v;
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return 0x4050;
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return (long)(this.a() - this.b);
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        Object object0;
        Objects.requireNonNull(consumer0);
        int v = this.a();
        int v1 = this.b;
        this.b = v;
        while(v1 < v) {
            try {
                object0 = this.a.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw new ConcurrentModificationException();
            }
            consumer0.accept(object0);
            ++v1;
        }
    }

    @Override  // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
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
        Object object0;
        consumer0.getClass();
        int v = this.a();
        int v1 = this.b;
        if(v1 < v) {
            try {
                this.b = v1 + 1;
                object0 = this.a.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw new ConcurrentModificationException();
            }
            consumer0.accept(object0);
            return true;
        }
        return false;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        int v = this.a();
        int v1 = this.b;
        int v2 = v + v1 >>> 1;
        if(v1 >= v2) {
            return null;
        }
        this.b = v2;
        return new a(this, v1, v2);
    }
}

