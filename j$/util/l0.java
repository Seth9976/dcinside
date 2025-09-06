package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class l0 extends P implements W {
    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.b(this, consumer0);
    }

    @Override  // j$.util.W
    public final void forEachRemaining(IntConsumer intConsumer0) {
        Objects.requireNonNull(intConsumer0);
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
        return P.g(this, consumer0);
    }

    @Override  // j$.util.W
    public final boolean tryAdvance(IntConsumer intConsumer0) {
        Objects.requireNonNull(intConsumer0);
        return false;
    }

    @Override  // j$.util.W
    public final W trySplit() {
        return null;
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return null;
    }
}

