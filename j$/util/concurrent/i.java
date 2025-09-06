package j$.util.concurrent;

import j..util.Collection.-CC;
import j..util.Set;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class i extends b implements Set, java.util.Set {
    private static final long serialVersionUID = 0x6499DE129D87293DL;

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.concurrent.b
    public final boolean contains(Object object0) {
        return this.a.containsKey(object0);
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof java.util.Set && (((java.util.Set)object0) == this || this.containsAll(((java.util.Set)object0)) && ((java.util.Set)object0).containsAll(this));
    }

    @Override  // j$.util.Collection
    public final void forEach(Consumer consumer0) {
        consumer0.getClass();
        l[] arr_l = this.a.a;
        if(arr_l != null) {
            p p0 = new p(arr_l, arr_l.length, 0, arr_l.length);
            l l0;
            while((l0 = p0.a()) != null) {
                consumer0.accept(l0.b);
            }
        }
    }

    @Override
    public final int hashCode() {
        Iterator iterator0 = this.iterator();
        int v;
        for(v = 0; ((a)iterator0).hasNext(); v += ((h)iterator0).next().hashCode()) {
        }
        return v;
    }

    @Override  // j$.util.concurrent.b
    public final Iterator iterator() {
        l[] arr_l = this.a.a;
        return arr_l == null ? new h(null, 0, 0, this.a, 0) : new h(arr_l, arr_l.length, arr_l.length, this.a, 0);
    }

    @Override  // j$.util.Collection
    public final Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public final java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.-CC.$default$parallelStream(this));
    }

    @Override  // j$.util.concurrent.b
    public final boolean remove(Object object0) {
        return this.a.remove(object0) != null;
    }

    @Override  // j$.util.Collection
    public final boolean removeIf(Predicate predicate0) {
        return Collection.-CC.$default$removeIf(this, predicate0);
    }

    @Override  // j$.util.Set
    public final Spliterator spliterator() {
        long v = this.a.j();
        l[] arr_l = this.a.a;
        int v1 = arr_l == null ? 0 : arr_l.length;
        return v >= 0L ? new j(arr_l, v1, 0, v1, v, 0) : new j(arr_l, v1, 0, v1, 0L, 0);
    }

    @Override
    public final java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.spliterator());
    }

    @Override  // j$.util.Collection
    public final Stream stream() {
        return Collection.-CC.$default$stream(this);
    }

    @Override
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.-CC.$default$stream(this));
    }

    @Override  // j$.util.Collection
    public final Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }
}

