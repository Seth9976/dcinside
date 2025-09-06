package j$.util.concurrent;

import j..util.P;
import j..util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

final class j extends p implements Spliterator {
    public final int i;
    long j;

    public j(l[] arr_l, int v, int v1, int v2, long v3, int v4) {
        this.i = v4;
        super(arr_l, v, v1, v2);
        this.j = v3;
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return this.i == 0 ? 0x1101 : 0x1100;
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        if(this.i != 0) {
            consumer0.getClass();
            l l0;
            while((l0 = this.a()) != null) {
                consumer0.accept(l0.c);
            }
            return;
        }
        consumer0.getClass();
        l l1;
        while((l1 = this.a()) != null) {
            consumer0.accept(l1.b);
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
        if(this.i != 0) {
            consumer0.getClass();
            l l0 = this.a();
            if(l0 == null) {
                return false;
            }
            consumer0.accept(l0.c);
            return true;
        }
        consumer0.getClass();
        l l1 = this.a();
        if(l1 == null) {
            return false;
        }
        consumer0.accept(l1.b);
        return true;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        if(this.i != 0) {
            int v = this.g;
            int v1 = this.f + v >>> 1;
            if(v1 <= this.f) {
                return null;
            }
            this.g = v1;
            long v2 = this.j >>> 1;
            this.j = v2;
            return new j(this.a, this.h, v1, v, v2, 1);
        }
        int v3 = this.g;
        int v4 = this.f + v3 >>> 1;
        if(v4 <= this.f) {
            return null;
        }
        this.g = v4;
        long v5 = this.j >>> 1;
        this.j = v5;
        return new j(this.a, this.h, v4, v3, v5, 0);
    }
}

