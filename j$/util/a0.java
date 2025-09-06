package j$.util;

import java.util.Comparator;
import java.util.Spliterator.OfDouble;
import java.util.Spliterator.OfInt;
import java.util.Spliterator.OfLong;
import java.util.Spliterator.OfPrimitive;
import java.util.function.Consumer;

public final class a0 implements c0 {
    public final Spliterator.OfPrimitive a;

    private a0(Spliterator.OfPrimitive spliterator$OfPrimitive0) {
        this.a = spliterator$OfPrimitive0;
    }

    public static c0 a(Spliterator.OfPrimitive spliterator$OfPrimitive0) {
        if(spliterator$OfPrimitive0 == null) {
            return null;
        }
        if(spliterator$OfPrimitive0 instanceof b0) {
            return ((b0)spliterator$OfPrimitive0).a;
        }
        if(spliterator$OfPrimitive0 instanceof Spliterator.OfDouble) {
            return Q.a(((Spliterator.OfDouble)spliterator$OfPrimitive0));
        }
        if(spliterator$OfPrimitive0 instanceof Spliterator.OfInt) {
            return U.a(((Spliterator.OfInt)spliterator$OfPrimitive0));
        }
        return spliterator$OfPrimitive0 instanceof Spliterator.OfLong ? X.a(((Spliterator.OfLong)spliterator$OfPrimitive0)) : new a0(spliterator$OfPrimitive0);
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override
    public final boolean equals(Object object0) {
        Spliterator.OfPrimitive spliterator$OfPrimitive0 = this.a;
        if(object0 instanceof a0) {
            object0 = ((a0)object0).a;
        }
        return spliterator$OfPrimitive0.equals(object0);
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        this.a.forEachRemaining(object0);
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

    @Override  // j$.util.c0
    public final boolean tryAdvance(Object object0) {
        return this.a.tryAdvance(object0);
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return this.a.tryAdvance(consumer0);
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        return d0.a(this.a.trySplit());
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return a0.a(this.a.trySplit());
    }
}

