package j$.util.stream;

import j..util.P;
import j..util.Spliterator;
import j..util.T;
import j..util.W;
import j..util.Z;
import j..util.c0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

class p3 implements Spliterator {
    private final Supplier a;
    private Spliterator b;

    p3(Supplier supplier0) {
        this.a = supplier0;
    }

    final Spliterator a() {
        if(this.b == null) {
            this.b = (Spliterator)this.a.get();
        }
        return this.b;
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return this.a().characteristics();
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return this.a().estimateSize();
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        this.a().forEachRemaining(consumer0);
    }

    @Override  // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a().getComparator();
    }

    @Override  // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.a().getExactSizeIfKnown();
    }

    @Override  // j$.util.Spliterator
    public final boolean hasCharacteristics(int v) {
        return P.e(this, v);
    }

    @Override
    public final String toString() {
        return this.getClass().getName() + "[" + this.a() + "]";
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return this.a().tryAdvance(consumer0);
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        return this.a().trySplit();
    }

    public T trySplit() {
        return (T)this.trySplit();
    }

    public W trySplit() {
        return (W)this.trySplit();
    }

    public Z trySplit() {
        return (Z)this.trySplit();
    }

    public c0 trySplit() {
        return (c0)this.trySplit();
    }
}

