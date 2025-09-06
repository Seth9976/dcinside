package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

final class q implements Spliterator {
    final Spliterator a;

    q(Spliterator spliterator0) {
        this.a = spliterator0;
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        Objects.requireNonNull(consumer0);
        o o0 = new o(consumer0);
        this.a.forEachRemaining(o0);
    }

    @Override  // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override  // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override  // j$.util.Spliterator
    public final boolean hasCharacteristics(int v) {
        return this.a.hasCharacteristics(v);
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        Objects.requireNonNull(consumer0);
        o o0 = new o(consumer0);
        return this.a.tryAdvance(o0);
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliterator0 = this.a.trySplit();
        return spliterator0 == null ? null : new q(spliterator0);
    }
}

