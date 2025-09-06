package kotlinx.serialization.json;

import B3.a;
import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.List.-CC;
import j..util.List;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlinx.serialization.i;
import kotlinx.serialization.u;
import y4.m;

@u(with = e.class)
public final class c extends l implements a, List, java.util.List {
    public static final class kotlinx.serialization.json.c.a {
        private kotlinx.serialization.json.c.a() {
        }

        public kotlinx.serialization.json.c.a(w w0) {
        }

        @y4.l
        public final i a() {
            return e.a;
        }
    }

    @y4.l
    private final java.util.List b;
    @y4.l
    public static final kotlinx.serialization.json.c.a c;

    static {
        c.c = new kotlinx.serialization.json.c.a(null);
    }

    public c(@y4.l java.util.List list0) {
        L.p(list0, "content");
        super(null);
        this.b = list0;
    }

    public void a(int v, l l0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(l l0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(@y4.l l l0) {
        L.p(l0, "element");
        return this.b.contains(l0);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof l ? this.c(((l)object0)) : false;
    }

    @Override
    public boolean containsAll(@y4.l Collection collection0) {
        L.p(collection0, "elements");
        return this.b.containsAll(collection0);
    }

    @y4.l
    public l d(int v) {
        return (l)this.b.get(v);
    }

    @Override
    public boolean equals(@m Object object0) {
        return L.g(this.b, object0);
    }

    @Override  // j$.util.Collection
    public void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    public int g() {
        return this.b.size();
    }

    @Override
    public Object get(int v) {
        return this.d(v);
    }

    public int h(@y4.l l l0) {
        L.p(l0, "element");
        return this.b.indexOf(l0);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    public int i(@y4.l l l0) {
        L.p(l0, "element");
        return this.b.lastIndexOf(l0);
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof l ? this.h(((l)object0)) : -1;
    }

    @Override
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override
    @y4.l
    public Iterator iterator() {
        return this.b.iterator();
    }

    public l j(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public l l(int v, l l0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof l ? this.i(((l)object0)) : -1;
    }

    @Override
    @y4.l
    public ListIterator listIterator() {
        return this.b.listIterator();
    }

    @Override
    @y4.l
    public ListIterator listIterator(int v) {
        return this.b.listIterator(v);
    }

    @Override  // j$.util.Collection
    public Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(this.parallelStream());
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Collection
    public boolean removeIf(Predicate predicate0) {
        return Collection.-CC.$default$removeIf(this, predicate0);
    }

    @Override  // j$.util.List
    public void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.g();
    }

    @Override  // j$.util.List
    public void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.List
    public Spliterator spliterator() {
        return List.-CC.$default$spliterator(this);
    }

    @Override
    public java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.spliterator());
    }

    @Override  // j$.util.Collection
    public Stream stream() {
        return Collection.-CC.$default$stream(this);
    }

    @Override
    public java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(this.stream());
    }

    @Override
    @y4.l
    public java.util.List subList(int v, int v1) {
        return this.b.subList(v, v1);
    }

    @Override
    public Object[] toArray() {
        return v.a(this);
    }

    @Override  // j$.util.Collection
    public Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        L.p(arr_object, "array");
        return v.b(this, arr_object);
    }

    @Override
    @y4.l
    public String toString() {
        return kotlin.collections.u.m3(this.b, ",", "[", "]", 0, null, null, 56, null);
    }
}

