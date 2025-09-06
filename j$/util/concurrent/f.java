package j$.util.concurrent;

import j..util.P;
import j..util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

final class f extends p implements Spliterator {
    final ConcurrentHashMap i;
    long j;

    f(l[] arr_l, int v, int v1, int v2, long v3, ConcurrentHashMap concurrentHashMap0) {
        super(arr_l, v, v1, v2);
        this.i = concurrentHashMap0;
        this.j = v3;
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return 0x1101;
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        consumer0.getClass();
        l l0;
        while((l0 = this.a()) != null) {
            consumer0.accept(new k(l0.b, l0.c, this.i));
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

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        consumer0.getClass();
        l l0 = this.a();
        if(l0 == null) {
            return false;
        }
        consumer0.accept(new k(l0.b, l0.c, this.i));
        return true;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        int v = this.g;
        int v1 = this.f + v >>> 1;
        if(v1 <= this.f) {
            return null;
        }
        this.g = v1;
        long v2 = this.j >>> 1;
        this.j = v2;
        return new f(this.a, this.h, v1, v, v2, this.i);
    }
}

