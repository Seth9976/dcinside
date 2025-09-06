package androidx.compose.ui.text.intl;

import B3.a;
import androidx.compose.runtime.Immutable;
import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.Collection;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,84:1\n151#2,3:85\n33#2,4:88\n154#2,2:92\n38#2:94\n156#2:95\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n48#1:85,3\n48#1:88,4\n48#1:92,2\n48#1:94\n48#1:95\n48#1:96,4\n48#1:100,2\n48#1:102\n48#1:103\n*E\n"})
public final class LocaleList implements a, Collection, java.util.Collection {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final LocaleList a() {
            return PlatformLocaleKt.a().a();
        }
    }

    @l
    private final List a;
    private final int b;
    @l
    public static final Companion c;
    public static final int d;

    static {
        LocaleList.c = new Companion(null);
    }

    public LocaleList(@l String s) {
        L.p(s, "languageTags");
        List list0 = v.V4(s, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            arrayList0.add(v.G5(((String)list0.get(v2))).toString());
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v3 = arrayList0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            arrayList1.add(new Locale(((String)arrayList0.get(v1))));
        }
        this(arrayList1);
    }

    public LocaleList(@l List list0) {
        L.p(list0, "localeList");
        super();
        this.a = list0;
        this.b = list0.size();
    }

    public LocaleList(@l Locale[] arr_locale) {
        L.p(arr_locale, "locales");
        this(kotlin.collections.l.Ky(arr_locale));
    }

    public boolean a(Locale locale0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(@l Locale locale0) {
        L.p(locale0, "element");
        return this.a.contains(locale0);
    }

    @l
    public final Locale c(int v) {
        return (Locale)this.a.get(v);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Locale ? this.b(((Locale)object0)) : false;
    }

    @Override
    public boolean containsAll(@l java.util.Collection collection0) {
        L.p(collection0, "elements");
        return this.a.containsAll(collection0);
    }

    @l
    public final List d() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LocaleList ? L.g(this.a, ((LocaleList)object0).a) : false;
    }

    @Override  // j$.util.Collection
    public void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    public int g() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
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

    @Override  // j$.util.Collection
    public Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(this.parallelStream());
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Collection
    public boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.g();
    }

    @Override  // j$.util.Collection
    public Spliterator spliterator() {
        return Collection.-CC.$default$spliterator(this);
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
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @Override  // j$.util.Collection
    public Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        L.p(arr_object, "array");
        return kotlin.jvm.internal.v.b(this, arr_object);
    }

    @Override
    @l
    public String toString() {
        return "LocaleList(localeList=" + this.a + ')';
    }
}

