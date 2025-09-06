package androidx.compose.foundation.lazy.layout;

import B3.a;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
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

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
public final class LazyLayoutPinnedItemList implements a, List, java.util.List {
    @ExperimentalFoundationApi
    public interface PinnedItem {
        int getIndex();

        @m
        Object getKey();
    }

    @l
    private final java.util.List a;
    public static final int b = 8;

    static {
    }

    public LazyLayoutPinnedItemList() {
        this(new SnapshotStateList());
    }

    private LazyLayoutPinnedItemList(java.util.List list0) {
        this.a = list0;
    }

    public void a(int v, PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
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

    public boolean b(PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(@l PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        L.p(lazyLayoutPinnedItemList$PinnedItem0, "element");
        return this.a.contains(lazyLayoutPinnedItemList$PinnedItem0);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof PinnedItem ? this.c(((PinnedItem)object0)) : false;
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.a.containsAll(collection0);
    }

    @l
    public PinnedItem d(int v) {
        return (PinnedItem)this.a.get(v);
    }

    @Override  // j$.util.Collection
    public void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    public int g() {
        return this.a.size();
    }

    @Override
    public Object get(int v) {
        return this.d(v);
    }

    public int h(@l PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        L.p(lazyLayoutPinnedItemList$PinnedItem0, "element");
        return this.a.indexOf(lazyLayoutPinnedItemList$PinnedItem0);
    }

    public int i(@l PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        L.p(lazyLayoutPinnedItemList$PinnedItem0, "element");
        return this.a.lastIndexOf(lazyLayoutPinnedItemList$PinnedItem0);
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof PinnedItem ? this.h(((PinnedItem)object0)) : -1;
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

    public final void j(@l PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        L.p(lazyLayoutPinnedItemList$PinnedItem0, "item");
        this.a.add(lazyLayoutPinnedItemList$PinnedItem0);
    }

    public final void k(@l PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        L.p(lazyLayoutPinnedItemList$PinnedItem0, "item");
        this.a.remove(lazyLayoutPinnedItemList$PinnedItem0);
    }

    public PinnedItem l(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof PinnedItem ? this.i(((PinnedItem)object0)) : -1;
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

    public PinnedItem m(int v, PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    @l
    public java.util.List subList(int v, int v1) {
        return this.a.subList(v, v1);
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
}

