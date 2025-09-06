package j$.util;

import java.util.Comparator;
import java.util.Spliterator.OfPrimitive;
import java.util.function.Consumer;

public final class d0 implements Spliterator {
    public final java.util.Spliterator a;

    private d0(java.util.Spliterator spliterator0) {
        this.a = spliterator0;
    }

    public static Spliterator a(java.util.Spliterator spliterator0) {
        if(spliterator0 == null) {
            return null;
        }
        if(spliterator0 instanceof Spliterator.Wrapper) {
            return ((Spliterator.Wrapper)spliterator0).a;
        }
        return spliterator0 instanceof Spliterator.OfPrimitive ? a0.a(((Spliterator.OfPrimitive)spliterator0)) : new d0(spliterator0);
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override
    public final boolean equals(Object object0) {
        java.util.Spliterator spliterator0 = this.a;
        if(object0 instanceof d0) {
            object0 = ((d0)object0).a;
        }
        return spliterator0.equals(object0);
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        this.a.forEachRemaining(consumer0);
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

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return this.a.tryAdvance(consumer0);
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        return d0.a(this.a.trySplit());
    }
}

