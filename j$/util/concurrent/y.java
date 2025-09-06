package j$.util.concurrent;

import j..util.P;
import j..util.Spliterator;
import j..util.W;
import j..util.c0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class y implements W {
    long a;
    final long b;
    final int c;
    final int d;

    y(long v, long v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public final y a() {
        long v = this.a;
        long v1 = this.b + v >>> 1;
        if(v1 <= v) {
            return null;
        }
        this.a = v1;
        return new y(v, v1, this.c, this.d);
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
        this.forEachRemaining(((IntConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.b(this, consumer0);
    }

    @Override  // j$.util.W
    public final void forEachRemaining(IntConsumer intConsumer0) {
        intConsumer0.getClass();
        long v = this.a;
        long v1 = this.b;
        if(v < v1) {
            this.a = v1;
            ThreadLocalRandom threadLocalRandom0 = ThreadLocalRandom.current();
            while(true) {
                intConsumer0.accept(threadLocalRandom0.d(this.c, this.d));
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
        return this.tryAdvance(((IntConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.g(this, consumer0);
    }

    @Override  // j$.util.W
    public final boolean tryAdvance(IntConsumer intConsumer0) {
        intConsumer0.getClass();
        long v = this.a;
        if(v < this.b) {
            intConsumer0.accept(ThreadLocalRandom.current().d(this.c, this.d));
            this.a = v + 1L;
            return true;
        }
        return false;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        return this.a();
    }

    @Override  // j$.util.W
    public final W trySplit() {
        return this.a();
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return this.a();
    }
}

