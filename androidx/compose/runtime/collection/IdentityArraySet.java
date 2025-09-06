package androidx.compose.runtime.collection;

import B3.a;
import androidx.compose.runtime.ActualJvm_jvmKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import y4.l;
import y4.m;

@s0({"SMAP\nIdentityArraySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1726#2,3:245\n*S KotlinDebug\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n232#1:245,3\n*E\n"})
public final class IdentityArraySet implements a, Set {
    private int a;
    @l
    private Object[] b;

    public IdentityArraySet() {
        this.b = new Object[16];
    }

    private final void a(int v) {
        if(v < 0 || v >= this.size()) {
            throw new IndexOutOfBoundsException("Index " + v + ", size " + this.size());
        }
    }

    @Override
    public final boolean add(@l Object object0) {
        int v;
        L.p(object0, "value");
        if(this.size() > 0) {
            v = this.c(object0);
            if(v >= 0) {
                return false;
            }
        }
        else {
            v = -1;
        }
        Object[] arr_object = this.b;
        if(this.size() == arr_object.length) {
            Object[] arr_object1 = new Object[arr_object.length * 2];
            kotlin.collections.l.B0(arr_object, arr_object1, -v, -(v + 1), this.size());
            kotlin.collections.l.K0(this.b, arr_object1, 0, 0, -(v + 1), 6, null);
            this.b = arr_object1;
        }
        else {
            kotlin.collections.l.B0(arr_object, arr_object, -v, -(v + 1), this.size());
        }
        this.b[-(v + 1)] = object0;
        this.l(this.size() + 1);
        return true;
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(@l Function1 function10) {
        L.p(function10, "block");
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(this.get(v1));
        }
    }

    private final int c(Object object0) {
        int v = this.size() - 1;
        int v1 = ActualJvm_jvmKt.b(object0);
        int v2 = 0;
        while(v2 <= v) {
            int v3 = v2 + v >>> 1;
            Object object1 = this.get(v3);
            int v4 = ActualJvm_jvmKt.b(object1);
            if(v4 < v1) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > v1) {
                v = v3 - 1;
                continue;
            }
            return object1 == object0 ? v3 : this.d(v3, object0, v1);
        }
        return -(v2 + 1);
    }

    @Override
    public final void clear() {
        kotlin.collections.l.V1(this.b, null, 0, 0, 6, null);
        this.l(0);
    }

    @Override
    public boolean contains(@m Object object0) {
        return object0 == null ? false : this.c(object0) >= 0;
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

    private final int d(int v, Object object0, int v1) {
        for(int v2 = v - 1; -1 < v2; --v2) {
            Object object1 = this.b[v2];
            if(object1 == object0) {
                return v2;
            }
            if(ActualJvm_jvmKt.b(object1) != v1) {
                break;
            }
        }
        int v3 = v + 1;
        int v4 = this.size();
        while(v3 < v4) {
            Object object2 = this.b[v3];
            if(object2 == object0) {
                return v3;
            }
            if(ActualJvm_jvmKt.b(object2) != v1) {
                return -(v3 + 1);
            }
            ++v3;
        }
        return -(this.size() + 1);
    }

    public int g() {
        return this.a;
    }

    @l
    public final Object get(int v) {
        this.a(v);
        Object object0 = this.b[v];
        L.n(object0, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return object0;
    }

    @l
    public final Object[] h() {
        return this.b;
    }

    @b0
    public static void i() {
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    @l
    public Iterator iterator() {
        return new Object() {
            private int a;

            public final int a() {
                return this.a;
            }

            public final void b(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < this.b.size();
            }

            @Override
            @l
            public Object next() {
                int v = this.a;
                this.a = v + 1;
                Object object0 = this.b.h()[v];
                L.n(object0, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                return object0;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

    public final boolean j() {
        return this.size() > 0;
    }

    public final void k(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.h()[v1];
            L.n(object0, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                if(v2 != v1) {
                    this.h()[v2] = object0;
                }
                ++v2;
            }
        }
        int v3 = this.size();
        for(int v4 = v2; v4 < v3; ++v4) {
            this.h()[v4] = null;
        }
        this.l(v2);
    }

    public void l(int v) {
        this.a = v;
    }

    public final void m(@l Object[] arr_object) {
        L.p(arr_object, "<set-?>");
        this.b = arr_object;
    }

    @Override
    public final boolean remove(@m Object object0) {
        if(object0 == null) {
            return false;
        }
        int v = this.c(object0);
        if(v >= 0) {
            if(v < this.size() - 1) {
                kotlin.collections.l.B0(this.b, this.b, v, v + 1, this.size());
            }
            this.l(this.size() - 1);
            this.b[this.size()] = null;
            return true;
        }
        return false;
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
        return this.g();
    }

    @Override
    public Object[] toArray() {
        return v.a(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        L.p(arr_object, "array");
        return v.b(this, arr_object);
    }
}

