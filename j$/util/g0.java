package j$.util;

import j..com.android.tools.r8.a;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

final class g0 implements PrimitiveIterator.OfLong, z, LongConsumer {
    boolean a;
    long b;
    final Z c;

    g0(Z z0) {
        this.c = z0;
        this.a = false;
    }

    @Override
    public final void accept(long v) {
        this.a = true;
        this.b = v;
    }

    @Override
    public final LongConsumer andThen(LongConsumer longConsumer0) {
        return a.c(this, longConsumer0);
    }

    @Override  // j$.util.N
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((LongConsumer)object0));
    }

    @Override  // j$.util.PrimitiveIterator$OfLong, j$.util.z
    public final void forEachRemaining(Consumer consumer0) {
        if(consumer0 instanceof LongConsumer) {
            this.forEachRemaining(((LongConsumer)consumer0));
            return;
        }
        Objects.requireNonNull(consumer0);
        if(!s0.a) {
            Objects.requireNonNull(consumer0);
            this.forEachRemaining(new K(consumer0));
            return;
        }
        s0.a(g0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
        throw null;
    }

    @Override  // j$.util.PrimitiveIterator$OfLong
    public final void forEachRemaining(LongConsumer longConsumer0) {
        Objects.requireNonNull(longConsumer0);
        while(this.hasNext()) {
            longConsumer0.accept(this.nextLong());
        }
    }

    @Override
    public final boolean hasNext() {
        if(!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override  // j$.util.PrimitiveIterator$OfLong
    public final Long next() {
        if(!s0.a) {
            return this.nextLong();
        }
        s0.a(g0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override
    public final Object next() {
        return this.next();
    }

    @Override  // j$.util.PrimitiveIterator$OfLong
    public final long nextLong() {
        if(!this.a && !this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}

