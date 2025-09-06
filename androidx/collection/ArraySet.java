package androidx.collection;

import B3.b;
import B3.h;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
public final class ArraySet implements b, h, Collection, Set {
    final class ElementIterator extends IndexBasedArrayIterator {
        final ArraySet d;

        public ElementIterator() {
            super(arraySet0.h());
        }

        @Override  // androidx.collection.IndexBasedArrayIterator
        protected Object a(int v) {
            return ArraySet.this.o(v);
        }

        @Override  // androidx.collection.IndexBasedArrayIterator
        protected void b(int v) {
            ArraySet.this.j(v);
        }
    }

    @l
    private int[] a;
    @l
    private Object[] b;
    private int c;

    @j
    public ArraySet() {
        this(0, 1, null);
    }

    @j
    public ArraySet(int v) {
        this.a = ContainerHelpersKt.a;
        this.b = ContainerHelpersKt.c;
        if(v > 0) {
            ArraySetKt.d(this, v);
        }
    }

    public ArraySet(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public ArraySet(@m ArraySet arraySet0) {
        this(0);
        if(arraySet0 != null) {
            this.a(arraySet0);
        }
    }

    public ArraySet(@m Collection collection0) {
        this(0);
        if(collection0 != null) {
            this.addAll(collection0);
        }
    }

    public ArraySet(@m Object[] arr_object) {
        this(0);
        if(arr_object != null) {
            Iterator iterator0 = i.a(arr_object);
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                this.add(object0);
            }
        }
    }

    public final void a(@l ArraySet arraySet0) {
        L.p(arraySet0, "array");
        int v = arraySet0.h();
        this.b(this.h() + v);
        if(this.h() != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.add(arraySet0.o(v1));
            }
        }
        else if(v > 0) {
            kotlin.collections.l.I0(arraySet0.d(), this.d(), 0, 0, v, 6, null);
            kotlin.collections.l.K0(arraySet0.c(), this.c(), 0, 0, v, 6, null);
            if(this.h() != 0) {
                throw new ConcurrentModificationException();
            }
            this.m(v);
        }
    }

    @Override
    public boolean add(Object object0) {
        int v2;
        int v1;
        int v = this.h();
        if(object0 == null) {
            v1 = ArraySetKt.p(this);
            v2 = 0;
        }
        else {
            int v3 = object0.hashCode();
            v2 = v3;
            v1 = ArraySetKt.n(this, object0, v3);
        }
        int v4 = 8;
        if(v1 < 0) {
            if(v >= this.d().length) {
                if(v >= 8) {
                    v4 = (v >> 1) + v;
                }
                else if(v < 4) {
                    v4 = 4;
                }
                int[] arr_v = this.d();
                Object[] arr_object = this.c();
                ArraySetKt.d(this, v4);
                if(v != this.h()) {
                    throw new ConcurrentModificationException();
                }
                if(this.d().length != 0) {
                    kotlin.collections.l.I0(arr_v, this.d(), 0, 0, arr_v.length, 6, null);
                    kotlin.collections.l.K0(arr_object, this.c(), 0, 0, arr_object.length, 6, null);
                }
            }
            if(~v1 < v) {
                kotlin.collections.l.z0(this.d(), this.d(), -v1, ~v1, v);
                kotlin.collections.l.B0(this.c(), this.c(), -v1, ~v1, v);
            }
            if(v != this.h() || ~v1 >= this.d().length) {
                throw new ConcurrentModificationException();
            }
            this.d()[~v1] = v2;
            this.c()[~v1] = object0;
            this.m(this.h() + 1);
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.b(this.h() + collection0.size());
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.add(object0);
        }
        return z;
    }

    public final void b(int v) {
        int v1 = this.h();
        if(this.d().length < v) {
            int[] arr_v = this.d();
            Object[] arr_object = this.c();
            ArraySetKt.d(this, v);
            if(this.h() > 0) {
                kotlin.collections.l.I0(arr_v, this.d(), 0, 0, this.h(), 6, null);
                kotlin.collections.l.K0(arr_object, this.c(), 0, 0, this.h(), 6, null);
            }
        }
        if(this.h() != v1) {
            throw new ConcurrentModificationException();
        }
    }

    @l
    public final Object[] c() {
        return this.b;
    }

    @Override
    public void clear() {
        if(this.h() != 0) {
            this.l(ContainerHelpersKt.a);
            this.k(ContainerHelpersKt.c);
            this.m(0);
        }
        if(this.h() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @l
    public final int[] d() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof Set && this.size() == ((Set)object0).size()) {
            try {
                int v = this.h();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(!((Set)object0).contains(this.o(v1))) {
                        return false;
                    }
                }
                return true;
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    public int g() {
        return this.c;
    }

    public final int h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.d();
        int v = this.h();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1];
        }
        return v2;
    }

    public final boolean i(@l ArraySet arraySet0) {
        L.p(arraySet0, "array");
        int v = arraySet0.h();
        int v1 = this.h();
        for(int v2 = 0; v2 < v; ++v2) {
            this.remove(arraySet0.o(v2));
        }
        return v1 != this.h();
    }

    public final int indexOf(@m Object object0) {
        return object0 == null ? ArraySetKt.p(this) : ArraySetKt.n(this, object0, object0.hashCode());
    }

    @Override
    public boolean isEmpty() {
        return this.h() <= 0;
    }

    @Override
    @l
    public Iterator iterator() {
        return new ElementIterator(this);
    }

    public final Object j(int v) {
        int v1 = 8;
        int v2 = this.h();
        Object object0 = this.c()[v];
        if(v2 <= 1) {
            this.clear();
            return object0;
        }
        if(this.d().length <= 8 || this.h() >= this.d().length / 3) {
            if(v < v2 - 1) {
                kotlin.collections.l.z0(this.d(), this.d(), v, v + 1, v2);
                kotlin.collections.l.B0(this.c(), this.c(), v, v + 1, v2);
            }
            this.c()[v2 - 1] = null;
        }
        else {
            if(this.h() > 8) {
                v1 = this.h() + (this.h() >> 1);
            }
            int[] arr_v = this.d();
            Object[] arr_object = this.c();
            ArraySetKt.d(this, v1);
            if(v > 0) {
                kotlin.collections.l.I0(arr_v, this.d(), 0, 0, v, 6, null);
                kotlin.collections.l.K0(arr_object, this.c(), 0, 0, v, 6, null);
            }
            if(v < v2 - 1) {
                kotlin.collections.l.z0(arr_v, this.d(), v, v + 1, v2);
                kotlin.collections.l.B0(arr_object, this.c(), v, v + 1, v2);
            }
        }
        if(v2 != this.h()) {
            throw new ConcurrentModificationException();
        }
        this.m(v2 - 1);
        return object0;
    }

    public final void k(@l Object[] arr_object) {
        L.p(arr_object, "<set-?>");
        this.b = arr_object;
    }

    public final void l(@l int[] arr_v) {
        L.p(arr_v, "<set-?>");
        this.a = arr_v;
    }

    public final void m(int v) {
        this.c = v;
    }

    public final Object o(int v) {
        return this.c()[v];
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.j(v);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        L.p(collection0, "elements");
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.remove(object0);
        }
        return z;
    }

    @Override
    public boolean retainAll(@l Collection collection0) {
        L.p(collection0, "elements");
        int v = this.h() - 1;
        boolean z = false;
        while(-1 < v) {
            if(!u.W1(collection0, this.c()[v])) {
                this.j(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    @Override
    public final int size() {
        return this.g();
    }

    @Override
    @l
    public final Object[] toArray() {
        return kotlin.collections.l.l1(this.b, 0, this.c);
    }

    @Override
    @l
    public final Object[] toArray(@l Object[] arr_object) {
        L.p(arr_object, "array");
        Object[] arr_object1 = ArraySetJvmUtil.a(arr_object, this.c);
        kotlin.collections.l.B0(this.b, arr_object1, 0, 0, this.c);
        L.o(arr_object1, "result");
        return arr_object1;
    }

    @Override
    @l
    public String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.h() * 14);
        stringBuilder0.append('{');
        int v = this.h();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.o(v1);
            if(object0 == this) {
                stringBuilder0.append("(this Set)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder(capacity).…builderAction).toString()");
        return s;
    }
}

