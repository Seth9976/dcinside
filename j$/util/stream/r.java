package j$.util.stream;

import j..util.Objects;
import j..util.Spliterator;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

final class r extends e2 {
    @Override  // j$.util.stream.b
    final J0 P(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        if(c3.DISTINCT.q(b0.K())) {
            return b0.C(spliterator0, false, intFunction0);
        }
        if(c3.ORDERED.q(b0.K())) {
            return r.Z(b0, spliterator0);
        }
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        k k0 = new k(3, atomicBoolean0, concurrentHashMap0);
        Objects.requireNonNull(k0);
        new Q(k0, false).e(b0, spliterator0);
        Set set0 = concurrentHashMap0.keySet();
        if(atomicBoolean0.get()) {
            HashSet hashSet0 = new HashSet(set0);
            hashSet0.add(null);
            set0 = hashSet0;
        }
        return new N0(set0);
    }

    @Override  // j$.util.stream.b
    final Spliterator Q(b b0, Spliterator spliterator0) {
        if(c3.DISTINCT.q(b0.K())) {
            return b0.Y(spliterator0);
        }
        return c3.ORDERED.q(b0.K()) ? r.Z(b0, spliterator0).spliterator() : new q3(b0.Y(spliterator0));
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        Objects.requireNonNull(n20);
        if(c3.DISTINCT.q(v)) {
            return n20;
        }
        return c3.SORTED.q(v) ? new p(n20) : new q(n20);
    }

    static N0 Z(b b0, Spliterator spliterator0) {
        n n0 = new n(3);
        n n1 = new n(4);
        n n2 = new n(5);
        Objects.requireNonNull(n0);
        Objects.requireNonNull(n1);
        Objects.requireNonNull(n2);
        return new N0(((Collection)new D1(d3.REFERENCE, n2, n1, n0, 3).c(b0, spliterator0)));
    }
}

