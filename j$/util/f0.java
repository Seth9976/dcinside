package j$.util;

import j..com.android.tools.r8.a;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class f0 implements PrimitiveIterator.OfInt, z, IntConsumer {
    boolean a;
    int b;
    final W c;

    f0(W w0) {
        this.c = w0;
        this.a = false;
    }

    @Override
    public final void accept(int v) {
        this.a = true;
        this.b = v;
    }

    @Override
    public final IntConsumer andThen(IntConsumer intConsumer0) {
        return a.b(this, intConsumer0);
    }

    @Override  // j$.util.N
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((IntConsumer)object0));
    }

    @Override  // j$.util.PrimitiveIterator$OfInt, j$.util.z
    public final void forEachRemaining(Consumer consumer0) {
        if(consumer0 instanceof IntConsumer) {
            this.forEachRemaining(((IntConsumer)consumer0));
            return;
        }
        Objects.requireNonNull(consumer0);
        if(!s0.a) {
            Objects.requireNonNull(consumer0);
            this.forEachRemaining(new H(consumer0));
            return;
        }
        s0.a(f0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    @Override  // j$.util.PrimitiveIterator$OfInt
    public final void forEachRemaining(IntConsumer intConsumer0) {
        Objects.requireNonNull(intConsumer0);
        while(this.hasNext()) {
            intConsumer0.accept(this.nextInt());
        }
    }

    @Override
    public final boolean hasNext() {
        if(!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override  // j$.util.PrimitiveIterator$OfInt
    public final Integer next() {
        if(!s0.a) {
            return this.nextInt();
        }
        s0.a(f0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override
    public final Object next() {
        return this.next();
    }

    @Override  // j$.util.PrimitiveIterator$OfInt
    public final int nextInt() {
        if(!this.a && !this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}

