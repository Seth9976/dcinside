package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import y4.l;

@h0(version = "1.1")
@s0({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1755#2,3:51\n1734#2,3:54\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:51,3\n22#1:54,3\n*E\n"})
public abstract class a implements B3.a, Collection {
    public abstract int a();

    @Override
    public boolean add(Object object0) {
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
        if(!this.isEmpty()) {
            for(Object object1: this) {
                if(L.g(object1, object0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
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
        return this.size() == 0;
    }

    @Override
    @l
    public abstract Iterator iterator();

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
    public Object[] toArray() {
        return v.a(this);
    }

    @Override
    @l
    public Object[] toArray(@l Object[] arr_object) {
        L.p(arr_object, "array");
        return v.b(this, arr_object);
    }

    @Override
    @l
    public String toString() {
        static final class kotlin.collections.a.a extends N implements Function1 {
            final a e;

            kotlin.collections.a.a(a a0) {
                this.e = a0;
                super(1);
            }

            public final CharSequence a(Object object0) {
                return object0 == this.e ? "(this Collection)" : String.valueOf(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }

        return u.m3(this, ", ", "[", "]", 0, null, new kotlin.collections.a.a(this), 24, null);
    }
}

