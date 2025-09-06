package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

public final class Spliterator.Wrapper implements Spliterator {
    public final j..util.Spliterator a;

    private Spliterator.Wrapper(j..util.Spliterator spliterator0) {
        this.a = spliterator0;
    }

    @Override
    public final int characteristics() {
        return this.a.characteristics();
    }

    public static Spliterator convert(j..util.Spliterator spliterator0) {
        if(spliterator0 == null) {
            return null;
        }
        if(spliterator0 instanceof d0) {
            return ((d0)spliterator0).a;
        }
        return spliterator0 instanceof c0 ? b0.a(((c0)spliterator0)) : new Spliterator.Wrapper(spliterator0);
    }

    @Override
    public final boolean equals(Object object0) {
        j..util.Spliterator spliterator0 = this.a;
        if(object0 instanceof Spliterator.Wrapper) {
            object0 = ((Spliterator.Wrapper)object0).a;
        }
        return spliterator0.equals(object0);
    }

    @Override
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override
    public final void forEachRemaining(Consumer consumer0) {
        this.a.forEachRemaining(consumer0);
    }

    @Override
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override
    public final boolean hasCharacteristics(int v) {
        return this.a.hasCharacteristics(v);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final boolean tryAdvance(Consumer consumer0) {
        return this.a.tryAdvance(consumer0);
    }

    @Override
    public final Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.a.trySplit());
    }
}

