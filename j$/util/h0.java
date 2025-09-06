package j$.util;

import j..com.android.tools.r8.a;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

final class h0 implements PrimitiveIterator.OfDouble, z, DoubleConsumer {
    boolean a;
    double b;
    final T c;

    h0(T t0) {
        this.c = t0;
        this.a = false;
    }

    @Override
    public final void accept(double f) {
        this.a = true;
        this.b = f;
    }

    @Override
    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return a.a(this, doubleConsumer0);
    }

    @Override  // j$.util.N
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((DoubleConsumer)object0));
    }

    @Override  // j$.util.PrimitiveIterator$OfDouble, j$.util.z
    public final void forEachRemaining(Consumer consumer0) {
        if(consumer0 instanceof DoubleConsumer) {
            this.forEachRemaining(((DoubleConsumer)consumer0));
            return;
        }
        Objects.requireNonNull(consumer0);
        if(!s0.a) {
            Objects.requireNonNull(consumer0);
            this.forEachRemaining(new E(consumer0));
            return;
        }
        s0.a(h0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    @Override  // j$.util.PrimitiveIterator$OfDouble
    public final void forEachRemaining(DoubleConsumer doubleConsumer0) {
        Objects.requireNonNull(doubleConsumer0);
        while(this.hasNext()) {
            doubleConsumer0.accept(this.nextDouble());
        }
    }

    @Override
    public final boolean hasNext() {
        if(!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override  // j$.util.PrimitiveIterator$OfDouble
    public final Double next() {
        if(!s0.a) {
            return this.nextDouble();
        }
        s0.a(h0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override
    public final Object next() {
        return this.next();
    }

    @Override  // j$.util.PrimitiveIterator$OfDouble
    public final double nextDouble() {
        if(!this.a && !this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}

