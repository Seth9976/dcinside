package j$.util.concurrent;

import j..util.Collection.-CC;
import j..util.Collection;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

final class s extends b implements Collection {
    private static final long serialVersionUID = 0x1F364C905893293DL;

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.concurrent.b
    public final boolean contains(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override  // j$.util.Collection
    public final void forEach(Consumer consumer0) {
        consumer0.getClass();
        l[] arr_l = this.a.a;
        if(arr_l != null) {
            p p0 = new p(arr_l, arr_l.length, 0, arr_l.length);
            l l0;
            while((l0 = p0.a()) != null) {
                consumer0.accept(l0.c);
            }
        }
    }

    @Override  // j$.util.concurrent.b
    public final Iterator iterator() {
        l[] arr_l = this.a.a;
        return arr_l == null ? new h(null, 0, 0, this.a, 1) : new h(arr_l, arr_l.length, arr_l.length, this.a, 1);
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
        if(object0 != null) {
            Iterator iterator0 = this.iterator();
            while(((a)iterator0).hasNext()) {
                if(object0.equals(((h)iterator0).next())) {
                    ((a)iterator0).remove();
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // j$.util.concurrent.b
    public final boolean removeAll(java.util.Collection collection0) {
        collection0.getClass();
        Iterator iterator0 = this.iterator();
        boolean z = false;
        while(((a)iterator0).hasNext()) {
            if(collection0.contains(((h)iterator0).next())) {
                ((a)iterator0).remove();
                z = true;
            }
        }
        return z;
    }

    @Override  // j$.util.Collection
    public final boolean removeIf(Predicate predicate0) {
        ConcurrentHashMap concurrentHashMap0 = this.a;
        predicate0.getClass();
        l[] arr_l = concurrentHashMap0.a;
        boolean z = false;
        if(arr_l != null) {
            p p0 = new p(arr_l, arr_l.length, 0, arr_l.length);
            l l0;
            while((l0 = p0.a()) != null) {
                Object object0 = l0.c;
                if(predicate0.test(object0) && concurrentHashMap0.g(l0.b, null, object0) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override  // j$.util.Collection
    public final Spliterator spliterator() {
        long v = this.a.j();
        l[] arr_l = this.a.a;
        int v1 = arr_l == null ? 0 : arr_l.length;
        return v >= 0L ? new j(arr_l, v1, 0, v1, v, 1) : new j(arr_l, v1, 0, v1, 0L, 1);
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

