package androidx.compose.ui.text.font;

import B3.a;
import androidx.compose.runtime.Immutable;
import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.List.-CC;
import j..util.List;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
public final class FontListFontFamily extends FileBasedFontFamily implements a, List, java.util.List {
    private final java.util.List j;
    @l
    private final java.util.List k;
    public static final int l;

    static {
    }

    public FontListFontFamily(@l java.util.List list0) {
        L.p(list0, "fonts");
        super(null);
        this.j = list0;
        if(list0.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
        this.k = new ArrayList(list0);
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
    public final boolean contains(Object object0) {
        return object0 instanceof Font ? this.l(((Font)object0)) : false;
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.j.containsAll(collection0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FontListFontFamily ? L.g(this.k, ((FontListFontFamily)object0).k) : false;
    }

    @Override  // j$.util.Collection
    public void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    @Override
    public Object get(int v) {
        return this.m(v);
    }

    @Override
    public int hashCode() {
        return this.k.hashCode();
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof Font ? this.q(((Font)object0)) : -1;
    }

    @Override
    public boolean isEmpty() {
        return this.j.isEmpty();
    }

    @Override
    @l
    public Iterator iterator() {
        return this.j.iterator();
    }

    public void j(int v, Font font0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean k(Font font0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean l(@l Font font0) {
        L.p(font0, "element");
        return this.j.contains(font0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof Font ? this.r(((Font)object0)) : -1;
    }

    @Override
    @l
    public ListIterator listIterator() {
        return this.j.listIterator();
    }

    @Override
    @l
    public ListIterator listIterator(int v) {
        return this.j.listIterator(v);
    }

    @l
    public Font m(int v) {
        return (Font)this.j.get(v);
    }

    @l
    public final java.util.List o() {
        return this.k;
    }

    public int p() {
        return this.j.size();
    }

    @Override  // j$.util.Collection
    public Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(this.parallelStream());
    }

    public int q(@l Font font0) {
        L.p(font0, "element");
        return this.j.indexOf(font0);
    }

    public int r(@l Font font0) {
        L.p(font0, "element");
        return this.j.lastIndexOf(font0);
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
        return this.p();
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
        return this.j.subList(v, v1);
    }

    public Font t(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        return "FontListFontFamily(fonts=" + this.k + ')';
    }

    public Font u(int v, Font font0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

