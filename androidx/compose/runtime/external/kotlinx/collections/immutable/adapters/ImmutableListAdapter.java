package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import B3.a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
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
import y4.l;
import y4.m;

public final class ImmutableListAdapter implements a, ImmutableList, List, java.util.List {
    @l
    private final java.util.List a;

    public ImmutableListAdapter(@l java.util.List list0) {
        L.p(list0, "impl");
        super();
        this.a = list0;
    }

    public int a() {
        return this.a.size();
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

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.contains(object0);
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.a.containsAll(collection0);
    }

    @Override
    public boolean equals(@m Object object0) {
        return this.a.equals(object0);
    }

    @Override  // j$.util.Collection
    public void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    @Override
    public Object get(int v) {
        return this.a.get(v);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public int indexOf(Object object0) {
        return this.a.indexOf(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @l
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public int lastIndexOf(Object object0) {
        return this.a.lastIndexOf(object0);
    }

    @Override
    @l
    public ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override
    @l
    public ListIterator listIterator(int v) {
        return this.a.listIterator(v);
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
        return this.a();
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

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    @l
    public ImmutableList subList(int v, int v1) {
        return new ImmutableListAdapter(this.a.subList(v, v1));
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public java.util.List subList(int v, int v1) {
        return this.subList(v, v1);
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
    @l
    public String toString() {
        return this.a.toString();
    }
}

