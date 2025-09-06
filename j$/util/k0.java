package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

final class k0 extends P implements T {
    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.a(this, consumer0);
    }

    @Override  // j$.util.T
    public final void forEachRemaining(DoubleConsumer doubleConsumer0) {
        Objects.requireNonNull(doubleConsumer0);
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
        return P.f(this, consumer0);
    }

    @Override  // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer0) {
        Objects.requireNonNull(doubleConsumer0);
        return false;
    }

    @Override  // j$.util.T
    public final T trySplit() {
        return null;
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return null;
    }
}

