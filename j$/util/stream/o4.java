package j$.util.stream;

import j..util.P;
import j..util.Spliterator;
import j..util.T;
import j..util.W;
import j..util.Z;
import j..util.c0;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

abstract class o4 implements Spliterator {
    final Spliterator a;
    final AtomicBoolean b;
    boolean c;
    int d;

    o4(Spliterator spliterator0) {
        this.c = true;
        this.a = spliterator0;
        this.b = new AtomicBoolean();
    }

    o4(Spliterator spliterator0, o4 o40) {
        this.c = true;
        this.a = spliterator0;
        o40.getClass();
        this.b = o40.b;
    }

    final boolean b() {
        return this.d != 0 || !this.b.get();
    }

    abstract Spliterator c(Spliterator arg1);

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & 0xFFFFBFBF;
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override  // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer0) {
        while(this.tryAdvance(consumer0)) {
        }
    }

    @Override  // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override  // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override  // j$.util.Spliterator
    public final boolean hasCharacteristics(int v) {
        return P.e(this, v);
    }

    @Override  // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliterator0 = this.a.trySplit();
        return spliterator0 == null ? null : this.c(spliterator0);
    }

    public T trySplit() {
        return (T)this.trySplit();
    }

    public W trySplit() {
        return (W)this.trySplit();
    }

    public Z trySplit() {
        return (Z)this.trySplit();
    }

    public c0 trySplit() {
        return (c0)this.trySplit();
    }
}

