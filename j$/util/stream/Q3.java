package j$.util.stream;

import j..util.P;
import j..util.Spliterator;
import j..util.concurrent.ConcurrentHashMap;
import j..util.function.Consumer.-CC;
import java.util.Comparator;
import java.util.function.Consumer;

final class q3 implements Spliterator, Consumer {
    private final Spliterator a;
    private final ConcurrentHashMap b;
    private Object c;
    private static final Object d;

    static {
        q3.d = new Object();
    }

    q3(Spliterator spliterator0) {
        this(spliterator0, new ConcurrentHashMap());
    }

    private q3(Spliterator spliterator0, ConcurrentHashMap concurrentHashMap0) {
        this.a = spliterator0;
        this.b = concurrentHashMap0;
    }

    @Override
    public final void accept(Object object0) {
        this.c = object0;
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    final void b(Consumer consumer0, Object object0) {
        if(this.b.putIfAbsent((object0 == null ? q3.d : object0), Boolean.TRUE) == null) {
            consumer0.accept(object0);
        }
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & 0xFFFFBFAB | 1;
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        k k0 = new k(2, this, consumer0);
        this.a.forEachRemaining(k0);
    }

    @Override  // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
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
        while(this.a.tryAdvance(this)) {
            if(this.b.putIfAbsent((this.c == null ? q3.d : this.c), Boolean.TRUE) == null) {
                consumer0.accept(this.c);
                this.c = null;
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliterator0 = this.a.trySplit();
        return spliterator0 != null ? new q3(spliterator0, this.b) : null;
    }
}

