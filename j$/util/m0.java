package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

final class m0 extends P implements Z {
    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.c(this, consumer0);
    }

    @Override  // j$.util.Z
    public final void forEachRemaining(LongConsumer longConsumer0) {
        Objects.requireNonNull(longConsumer0);
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
        return P.h(this, consumer0);
    }

    @Override  // j$.util.Z
    public final boolean tryAdvance(LongConsumer longConsumer0) {
        Objects.requireNonNull(longConsumer0);
        return false;
    }

    @Override  // j$.util.Z
    public final Z trySplit() {
        return null;
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return null;
    }
}

