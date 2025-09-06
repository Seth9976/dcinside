package kotlin.collections;

import B3.a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,526:1\n1734#2,3:527\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n62#1:527,3\n*E\n"})
final class j implements a, Collection {
    @l
    private final Object[] a;
    private final boolean b;

    public j(@l Object[] arr_object, boolean z) {
        L.p(arr_object, "values");
        super();
        this.a = arr_object;
        this.b = z;
    }

    public int a() {
        return this.a.length;
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @l
    public final Object[] b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object0) {
        return kotlin.collections.l.s8(this.a, object0);
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override
    @l
    public Iterator iterator() {
        return i.a(this.a);
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.a();
    }

    @Override
    @l
    public final Object[] toArray() {
        return v.h(this.a, this.b);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        L.p(arr_object, "array");
        return kotlin.jvm.internal.v.b(this, arr_object);
    }
}

