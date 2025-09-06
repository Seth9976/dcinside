package j$.util.concurrent;

import j..util.Collection.-CC;
import j..util.Set;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

final class e extends b implements Set, java.util.Set {
    private static final long serialVersionUID = 0x1F364C905893293DL;

    @Override
    public final boolean add(Object object0) {
        Object object1 = ((Map.Entry)object0).getKey();
        Object object2 = ((Map.Entry)object0).getValue();
        return this.a.f(object1, object2, false) == null;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        boolean z = false;
        for(Object object0: collection0) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            if(this.a.f(object1, object2, false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override  // j$.util.concurrent.b
    public final boolean contains(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            if(object1 != null) {
                Object object2 = this.a.get(object1);
                if(object2 != null) {
                    Object object3 = ((Map.Entry)object0).getValue();
                    return object3 != null && (object3 == object2 || object3.equals(object2));
                }
            }
        }
        return false;
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
                consumer0.accept(new k(l0.b, l0.c, this.a));
            }
        }
    }

    @Override
    public final int hashCode() {
        l[] arr_l = this.a.a;
        int v = 0;
        if(arr_l != null) {
            p p0 = new p(arr_l, arr_l.length, 0, arr_l.length);
            l l0;
            while((l0 = p0.a()) != null) {
                v += l0.hashCode();
            }
        }
        return v;
    }

    @Override  // j$.util.concurrent.b
    public final Iterator iterator() {
        l[] arr_l = this.a.a;
        return arr_l == null ? new d(null, 0, 0, this.a) : new d(arr_l, arr_l.length, arr_l.length, this.a);  // 初始化器: Lj$/util/concurrent/a;-><init>([Lj$/util/concurrent/l;IILj$/util/concurrent/ConcurrentHashMap;)V / 初始化器: Lj$/util/concurrent/a;-><init>([Lj$/util/concurrent/l;IILj$/util/concurrent/ConcurrentHashMap;)V
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
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            if(object1 != null) {
                Object object2 = ((Map.Entry)object0).getValue();
                return object2 != null && this.a.remove(object1, object2);
            }
        }
        return false;
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
                if(predicate0.test(new AbstractMap.SimpleImmutableEntry(l0.b, object0)) && concurrentHashMap0.g(l0.b, null, object0) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override  // j$.util.Set
    public final Spliterator spliterator() {
        long v = this.a.j();
        l[] arr_l = this.a.a;
        int v1 = arr_l == null ? 0 : arr_l.length;
        return new f(arr_l, v1, 0, v1, (v < 0L ? 0L : v), this.a);
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

