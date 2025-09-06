package j$.util.concurrent;

import j..util.P;
import j..util.Spliterator;
import j..util.T;
import j..util.c0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

final class x implements T {
    long a;
    final long b;
    final double c;
    final double d;

    x(long v, long v1, double f, double f1) {
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = f1;
    }

    public final x a() {
        long v = this.a;
        long v1 = this.b + v >>> 1;
        if(v1 <= v) {
            return null;
        }
        this.a = v1;
        return new x(v, v1, this.c, this.d);
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return 0x4540;
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((DoubleConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.a(this, consumer0);
    }

    @Override  // j$.util.T
    public final void forEachRemaining(DoubleConsumer doubleConsumer0) {
        doubleConsumer0.getClass();
        long v = this.a;
        long v1 = this.b;
        if(v < v1) {
            this.a = v1;
            ThreadLocalRandom threadLocalRandom0 = ThreadLocalRandom.current();
            while(true) {
                doubleConsumer0.accept(threadLocalRandom0.c(this.c, this.d));
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
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

    @Override  // j$.util.c0
    public final boolean tryAdvance(Object object0) {
        return this.tryAdvance(((DoubleConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.f(this, consumer0);
    }

    @Override  // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer0) {
        doubleConsumer0.getClass();
        long v = this.a;
        if(v < this.b) {
            doubleConsumer0.accept(ThreadLocalRandom.current().c(this.c, this.d));
            this.a = v + 1L;
            return true;
        }
        return false;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        return this.a();
    }

    @Override  // j$.util.T
    public final T trySplit() {
        return this.a();
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return this.a();
    }
}

