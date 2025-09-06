package j$.util;

import java.util.Comparator;
import java.util.Spliterator.OfPrimitive;
import java.util.Spliterator;
import java.util.function.Consumer;

public final class b0 implements Spliterator.OfPrimitive {
    public final c0 a;

    private b0(c0 c00) {
        this.a = c00;
    }

    public static Spliterator.OfPrimitive a(c0 c00) {
        if(c00 == null) {
            return null;
        }
        if(c00 instanceof a0) {
            return ((a0)c00).a;
        }
        if(c00 instanceof T) {
            return S.a(((T)c00));
        }
        if(c00 instanceof W) {
            return V.a(((W)c00));
        }
        return c00 instanceof Z ? Y.a(((Z)c00)) : new b0(c00);
    }

    @Override
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override
    public final boolean equals(Object object0) {
        c0 c00 = this.a;
        if(object0 instanceof b0) {
            object0 = ((b0)object0).a;
        }
        return c00.equals(object0);
    }

    @Override
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override
    public final void forEachRemaining(Object object0) {
        this.a.forEachRemaining(object0);
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
    public final boolean tryAdvance(Object object0) {
        return this.a.tryAdvance(object0);
    }

    @Override
    public final boolean tryAdvance(Consumer consumer0) {
        return this.a.tryAdvance(consumer0);
    }

    @Override
    public final Spliterator.OfPrimitive trySplit() {
        return b0.a(this.a.trySplit());
    }

    @Override
    public final Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.a.trySplit());
    }
}

