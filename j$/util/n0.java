package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

final class n0 extends P implements Spliterator {
    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        Objects.requireNonNull(consumer0);
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
        Objects.requireNonNull(consumer0);
        return false;
    }
}

