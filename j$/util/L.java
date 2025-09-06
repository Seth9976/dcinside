package j$.util;

import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

class l implements Collection, Serializable, java.util.Collection {
    final java.util.Collection a;
    private static final long serialVersionUID = 0x19420080CB5EF71EL;

    l(java.util.Collection collection0) {
        collection0.getClass();
        this.a = collection0;
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.contains(object0);
    }

    @Override
    public boolean containsAll(java.util.Collection collection0) {
        return this.a.containsAll(collection0);
    }

    @Override  // j$.util.Collection
    public void forEach(Consumer consumer0) {
        Collection.-EL.a(this.a, consumer0);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new k(this);
    }

    @Override  // j$.util.Collection
    public Stream parallelStream() {
        return Collection.-EL.parallelStream(this.a);
    }

    @Override
    public final java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(this.parallelStream());
    }

    @Override
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Collection
    public final boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override  // j$.util.Collection
    public Spliterator spliterator() {
        return Collection.-EL.b(this.a);
    }

    @Override
    public final java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.spliterator());
    }

    @Override  // j$.util.Collection
    public Stream stream() {
        return Collection.-EL.stream(this.a);
    }

    @Override
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(this.stream());
    }

    @Override
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override  // j$.util.Collection
    public final Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return this.a.toArray(arr_object);
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

