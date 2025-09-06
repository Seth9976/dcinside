package j$.util.concurrent;

import j..util.P;
import j..util.Spliterator;
import j..util.Z;
import j..util.c0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

final class z implements Z {
    long a;
    final long b;
    final long c;
    final long d;

    z(long v, long v1, long v2, long v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public final z a() {
        long v = this.a;
        long v1 = this.b + v >>> 1;
        if(v1 <= v) {
            return null;
        }
        this.a = v1;
        return new z(v, v1, this.c, this.d);
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
        this.forEachRemaining(((LongConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.c(this, consumer0);
    }

    @Override  // j$.util.Z
    public final void forEachRemaining(LongConsumer longConsumer0) {
        longConsumer0.getClass();
        long v = this.a;
        long v1 = this.b;
        if(v < v1) {
            this.a = v1;
            ThreadLocalRandom threadLocalRandom0 = ThreadLocalRandom.current();
            while(true) {
                longConsumer0.accept(threadLocalRandom0.e(this.c, this.d));
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
        return this.tryAdvance(((LongConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.h(this, consumer0);
    }

    @Override  // j$.util.Z
    public final boolean tryAdvance(LongConsumer longConsumer0) {
        longConsumer0.getClass();
        long v = this.a;
        if(v < this.b) {
            longConsumer0.accept(ThreadLocalRandom.current().e(this.c, this.d));
            this.a = v + 1L;
            return true;
        }
        return false;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        return this.a();
    }

    @Override  // j$.util.Z
    public final Z trySplit() {
        return this.a();
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return this.a();
    }
}

