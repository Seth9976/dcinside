package androidx.compose.runtime.collection;

import A3.o;
import A3.p;
import B3.e;
import B3.f;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.b0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import kotlin.y;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1194:1\n48#1:1198\n48#1:1199\n523#1:1200\n53#1:1203\n523#1:1204\n48#1:1205\n523#1:1206\n523#1:1207\n523#1:1208\n48#1:1209\n523#1:1210\n48#1:1211\n523#1:1212\n523#1:1213\n523#1:1214\n48#1:1215\n523#1:1216\n48#1:1219\n48#1:1220\n48#1:1221\n523#1:1222\n1864#2,3:1195\n1855#2,2:1201\n1855#2,2:1217\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1198\n259#1:1199\n260#1:1200\n292#1:1203\n293#1:1204\n307#1:1205\n308#1:1206\n334#1:1207\n359#1:1208\n595#1:1209\n595#1:1210\n637#1:1211\n637#1:1212\n665#1:1213\n675#1:1214\n768#1:1215\n769#1:1216\n794#1:1219\n821#1:1220\n833#1:1221\n834#1:1222\n185#1:1195,3\n281#1:1201,2\n782#1:1217,2\n*E\n"})
public final class MutableVector implements RandomAccess {
    @s0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1194:1\n523#2:1195\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n941#1:1195\n*E\n"})
    static final class MutableVectorList implements e, List {
        @l
        private final MutableVector a;

        public MutableVectorList(@l MutableVector mutableVector0) {
            L.p(mutableVector0, "vector");
            super();
            this.a = mutableVector0;
        }

        public int a() {
            return this.a.J();
        }

        @Override
        public void add(int v, Object object0) {
            this.a.a(v, object0);
        }

        @Override
        public boolean add(Object object0) {
            return this.a.b(object0);
        }

        @Override
        public boolean addAll(int v, @l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.d(v, collection0);
        }

        @Override
        public boolean addAll(@l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.g(collection0);
        }

        public Object b(int v) {
            MutableVectorKt.f(this, v);
            return this.a.e0(v);
        }

        @Override
        public void clear() {
            this.a.l();
        }

        @Override
        public boolean contains(Object object0) {
            return this.a.m(object0);
        }

        @Override
        public boolean containsAll(@l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.o(collection0);
        }

        @Override
        public Object get(int v) {
            MutableVectorKt.f(this, v);
            return this.a.F()[v];
        }

        @Override
        public int indexOf(Object object0) {
            return this.a.K(object0);
        }

        @Override
        public boolean isEmpty() {
            return this.a.N();
        }

        @Override
        @l
        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override
        public int lastIndexOf(Object object0) {
            return this.a.R(object0);
        }

        @Override
        @l
        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override
        @l
        public ListIterator listIterator(int v) {
            return new VectorListIterator(this, v);
        }

        @Override
        public final Object remove(int v) {
            return this.b(v);
        }

        @Override
        public boolean remove(Object object0) {
            return this.a.a0(object0);
        }

        @Override
        public boolean removeAll(@l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.c0(collection0);
        }

        @Override
        public boolean retainAll(@l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.g0(collection0);
        }

        @Override
        public Object set(int v, Object object0) {
            MutableVectorKt.f(this, v);
            return this.a.i0(v, object0);
        }

        @Override
        public final int size() {
            return this.a();
        }

        @Override
        @l
        public List subList(int v, int v1) {
            MutableVectorKt.g(this, v, v1);
            return new SubList(this, v, v1);
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

    @s0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1194:1\n1855#2,2:1195\n1855#2,2:1197\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1013#1:1195,2\n1095#1:1197,2\n*E\n"})
    static final class SubList implements e, List {
        @l
        private final List a;
        private final int b;
        private int c;

        public SubList(@l List list0, int v, int v1) {
            L.p(list0, "list");
            super();
            this.a = list0;
            this.b = v;
            this.c = v1;
        }

        public int a() {
            return this.c - this.b;
        }

        @Override
        public void add(int v, Object object0) {
            this.a.add(v + this.b, object0);
            ++this.c;
        }

        @Override
        public boolean add(Object object0) {
            int v = this.c;
            this.c = v + 1;
            this.a.add(v, object0);
            return true;
        }

        @Override
        public boolean addAll(int v, @l Collection collection0) {
            L.p(collection0, "elements");
            this.a.addAll(v + this.b, collection0);
            this.c += collection0.size();
            return collection0.size() > 0;
        }

        @Override
        public boolean addAll(@l Collection collection0) {
            L.p(collection0, "elements");
            this.a.addAll(this.c, collection0);
            this.c += collection0.size();
            return collection0.size() > 0;
        }

        public Object b(int v) {
            MutableVectorKt.f(this, v);
            Object object0 = this.a.remove(v + this.b);
            --this.c;
            return object0;
        }

        @Override
        public void clear() {
            int v = this.c - 1;
            int v1 = this.b;
            if(v1 <= v) {
                while(true) {
                    this.a.remove(v);
                    if(v == v1) {
                        break;
                    }
                    --v;
                }
            }
            this.c = this.b;
        }

        @Override
        public boolean contains(Object object0) {
            int v = this.b;
            int v1 = this.c;
            while(v < v1) {
                if(L.g(this.a.get(v), object0)) {
                    return true;
                }
                ++v;
            }
            return false;
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

        @Override
        public Object get(int v) {
            MutableVectorKt.f(this, v);
            return this.a.get(v + this.b);
        }

        @Override
        public int indexOf(Object object0) {
            int v = this.b;
            int v1 = this.c;
            while(v < v1) {
                if(L.g(this.a.get(v), object0)) {
                    return v - this.b;
                }
                ++v;
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            return this.c == this.b;
        }

        @Override
        @l
        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override
        public int lastIndexOf(Object object0) {
            int v = this.c - 1;
            int v1 = this.b;
            if(v1 <= v) {
                while(true) {
                    if(L.g(this.a.get(v), object0)) {
                        return v - this.b;
                    }
                    if(v == v1) {
                        break;
                    }
                    --v;
                }
            }
            return -1;
        }

        @Override
        @l
        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override
        @l
        public ListIterator listIterator(int v) {
            return new VectorListIterator(this, v);
        }

        @Override
        public final Object remove(int v) {
            return this.b(v);
        }

        @Override
        public boolean remove(Object object0) {
            int v = this.b;
            int v1 = this.c;
            while(v < v1) {
                if(L.g(this.a.get(v), object0)) {
                    this.a.remove(v);
                    --this.c;
                    return true;
                }
                ++v;
            }
            return false;
        }

        @Override
        public boolean removeAll(@l Collection collection0) {
            L.p(collection0, "elements");
            int v = this.c;
            for(Object object0: collection0) {
                this.remove(object0);
            }
            return v != this.c;
        }

        @Override
        public boolean retainAll(@l Collection collection0) {
            L.p(collection0, "elements");
            int v = this.c;
            int v1 = v - 1;
            int v2 = this.b;
            if(v2 <= v1) {
                while(true) {
                    if(!collection0.contains(this.a.get(v1))) {
                        this.a.remove(v1);
                        --this.c;
                    }
                    if(v1 == v2) {
                        break;
                    }
                    --v1;
                }
            }
            return v != this.c;
        }

        @Override
        public Object set(int v, Object object0) {
            MutableVectorKt.f(this, v);
            return this.a.set(v + this.b, object0);
        }

        @Override
        public final int size() {
            return this.a();
        }

        @Override
        @l
        public List subList(int v, int v1) {
            MutableVectorKt.g(this, v, v1);
            return new SubList(this, v, v1);
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

    static final class VectorListIterator implements f, ListIterator {
        @l
        private final List a;
        private int b;

        public VectorListIterator(@l List list0, int v) {
            L.p(list0, "list");
            super();
            this.a = list0;
            this.b = v;
        }

        @Override
        public void add(Object object0) {
            this.a.add(this.b, object0);
            ++this.b;
        }

        @Override
        public boolean hasNext() {
            return this.b < this.a.size();
        }

        @Override
        public boolean hasPrevious() {
            return this.b > 0;
        }

        @Override
        public Object next() {
            int v = this.b;
            this.b = v + 1;
            return this.a.get(v);
        }

        @Override
        public int nextIndex() {
            return this.b;
        }

        @Override
        public Object previous() {
            int v = this.b - 1;
            this.b = v;
            return this.a.get(v);
        }

        @Override
        public int previousIndex() {
            return this.b - 1;
        }

        @Override
        public void remove() {
            int v = this.b - 1;
            this.b = v;
            this.a.remove(v);
        }

        @Override
        public void set(Object object0) {
            this.a.set(this.b, object0);
        }
    }

    @l
    private Object[] a;
    @m
    private List b;
    private int c;
    public static final int d = 8;

    static {
    }

    @b0
    public MutableVector(@l Object[] arr_object, int v) {
        L.p(arr_object, "content");
        super();
        this.a = arr_object;
        this.c = v;
    }

    public final void A(@l Function1 function10) {
        L.p(function10, "block");
        int v = this.J();
        if(v > 0) {
            Object[] arr_object = this.F();
            int v1 = 0;
            while(true) {
                function10.invoke(arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void B(@l o o0) {
        L.p(o0, "block");
        int v = this.J();
        if(v > 0) {
            Object[] arr_object = this.F();
            int v1 = 0;
            while(true) {
                o0.invoke(v1, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void C(@l Function1 function10) {
        L.p(function10, "block");
        int v = this.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.F();
            while(true) {
                function10.invoke(arr_object[v1]);
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
    }

    public final void D(@l o o0) {
        L.p(o0, "block");
        if(this.J() > 0) {
            int v = this.J() - 1;
            Object[] arr_object = this.F();
            while(true) {
                o0.invoke(v, arr_object[v]);
                --v;
                if(v < 0) {
                    break;
                }
            }
        }
    }

    public final Object E(int v) {
        return this.F()[v];
    }

    @l
    public final Object[] F() {
        return this.a;
    }

    @b0
    public static void G() {
    }

    @l
    public final kotlin.ranges.l H() {
        return new kotlin.ranges.l(0, this.J() - 1);
    }

    public final int I() {
        return this.J() - 1;
    }

    public final int J() {
        return this.c;
    }

    public final int K(Object object0) {
        int v = this.c;
        if(v > 0) {
            Object[] arr_object = this.a;
            int v1 = 0;
            while(true) {
                if(L.g(object0, arr_object[v1])) {
                    return v1;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return -1;
    }

    public final int L(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.J();
        if(v > 0) {
            Object[] arr_object = this.F();
            int v1 = 0;
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return v1;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return -1;
    }

    public final int M(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.F();
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return v1;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return -1;
    }

    public final boolean N() {
        return this.c == 0;
    }

    public final boolean O() {
        return this.c != 0;
    }

    public final Object P() {
        if(this.N()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.F()[this.J() - 1];
    }

    public final Object Q(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.F();
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        this.m0();
        throw new y();
    }

    public final int R(Object object0) {
        int v = this.c;
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.a;
            while(true) {
                if(L.g(object0, arr_object[v1])) {
                    return v1;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return -1;
    }

    // 去混淆评级： 低(20)
    @m
    public final Object S() {
        return this.N() ? null : this.F()[this.J() - 1];
    }

    @m
    public final Object T(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.F();
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final Object[] U(Function1 function10) {
        L.p(function10, "transform");
        int v = this.J();
        L.y(0, "R");
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = function10.invoke(this.F()[v1]);
        }
        return arr_object;
    }

    public final Object[] V(o o0) {
        L.p(o0, "transform");
        int v = this.J();
        L.y(0, "R");
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = o0.invoke(v1, this.F()[v1]);
        }
        return arr_object;
    }

    public final MutableVector W(o o0) {
        L.p(o0, "transform");
        int v = this.J();
        int v1 = 0;
        L.y(0, "R?");
        Object[] arr_object = new Object[v];
        if(v > 0) {
            Object[] arr_object1 = this.F();
            int v2 = 0;
            do {
                Object object0 = o0.invoke(v1, arr_object1[v1]);
                if(object0 != null) {
                    arr_object[v2] = object0;
                    ++v2;
                }
                ++v1;
            }
            while(v1 < v);
            v1 = v2;
        }
        return new MutableVector(arr_object, v1);
    }

    public final MutableVector X(Function1 function10) {
        L.p(function10, "transform");
        int v = this.J();
        int v1 = 0;
        L.y(0, "R?");
        Object[] arr_object = new Object[v];
        if(v > 0) {
            Object[] arr_object1 = this.F();
            int v2 = 0;
            do {
                Object object0 = function10.invoke(arr_object1[v1]);
                if(object0 != null) {
                    arr_object[v2] = object0;
                    ++v2;
                }
                ++v1;
            }
            while(v1 < v);
            v1 = v2;
        }
        return new MutableVector(arr_object, v1);
    }

    public final void Y(Object object0) {
        this.a0(object0);
    }

    public final void Z(Object object0) {
        this.b(object0);
    }

    public final void a(int v, Object object0) {
        this.r(this.c + 1);
        Object[] arr_object = this.a;
        int v1 = this.c;
        if(v != v1) {
            kotlin.collections.l.B0(arr_object, arr_object, v + 1, v, v1);
        }
        arr_object[v] = object0;
        ++this.c;
    }

    public final boolean a0(Object object0) {
        int v = this.K(object0);
        if(v >= 0) {
            this.e0(v);
            return true;
        }
        return false;
    }

    public final boolean b(Object object0) {
        this.r(this.c + 1);
        int v = this.c;
        this.a[v] = object0;
        this.c = v + 1;
        return true;
    }

    public final boolean b0(@l MutableVector mutableVector0) {
        L.p(mutableVector0, "elements");
        int v = this.c;
        int v1 = mutableVector0.J();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                this.a0(mutableVector0.F()[v2]);
                if(v2 == v1 - 1) {
                    break;
                }
            }
        }
        return v != this.c;
    }

    public final boolean c(int v, @l MutableVector mutableVector0) {
        L.p(mutableVector0, "elements");
        if(mutableVector0.N()) {
            return false;
        }
        this.r(this.c + mutableVector0.c);
        Object[] arr_object = this.a;
        int v1 = this.c;
        if(v != v1) {
            kotlin.collections.l.B0(arr_object, arr_object, mutableVector0.c + v, v, v1);
        }
        kotlin.collections.l.B0(mutableVector0.a, arr_object, v, 0, mutableVector0.c);
        this.c += mutableVector0.c;
        return true;
    }

    public final boolean c0(@l Collection collection0) {
        L.p(collection0, "elements");
        if(collection0.isEmpty()) {
            return false;
        }
        int v = this.c;
        for(Object object0: collection0) {
            this.a0(object0);
        }
        return v != this.c;
    }

    public final boolean d(int v, @l Collection collection0) {
        L.p(collection0, "elements");
        int v1 = 0;
        if(collection0.isEmpty()) {
            return false;
        }
        this.r(this.c + collection0.size());
        Object[] arr_object = this.a;
        if(v != this.c) {
            kotlin.collections.l.B0(arr_object, arr_object, collection0.size() + v, v, this.c);
        }
        for(Object object0: collection0) {
            if(v1 < 0) {
                u.Z();
            }
            arr_object[v1 + v] = object0;
            ++v1;
        }
        this.c += collection0.size();
        return true;
    }

    public final boolean d0(@l List list0) {
        L.p(list0, "elements");
        int v = this.c;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.a0(list0.get(v2));
        }
        return v != this.c;
    }

    public final boolean e(int v, @l List list0) {
        L.p(list0, "elements");
        if(list0.isEmpty()) {
            return false;
        }
        this.r(this.c + list0.size());
        Object[] arr_object = this.a;
        if(v != this.c) {
            kotlin.collections.l.B0(arr_object, arr_object, list0.size() + v, v, this.c);
        }
        int v2 = list0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            arr_object[v + v1] = list0.get(v1);
        }
        this.c += list0.size();
        return true;
    }

    public final Object e0(int v) {
        Object[] arr_object = this.a;
        Object object0 = arr_object[v];
        if(v != this.J() - 1) {
            kotlin.collections.l.B0(arr_object, arr_object, v, v + 1, this.c);
        }
        int v1 = this.c - 1;
        this.c = v1;
        arr_object[v1] = null;
        return object0;
    }

    public final boolean f(@l MutableVector mutableVector0) {
        L.p(mutableVector0, "elements");
        return this.c(this.J(), mutableVector0);
    }

    public final void f0(int v, int v1) {
        if(v1 > v) {
            int v2 = this.c;
            if(v1 < v2) {
                kotlin.collections.l.B0(this.a, this.a, v, v1, v2);
            }
            int v3 = this.c - (v1 - v);
            int v4 = this.J();
            if(v3 <= v4 - 1) {
                for(int v5 = v3; true; ++v5) {
                    this.a[v5] = null;
                    if(v5 == v4 - 1) {
                        break;
                    }
                }
            }
            this.c = v3;
        }
    }

    public final boolean g(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.d(this.c, collection0);
    }

    public final boolean g0(@l Collection collection0) {
        L.p(collection0, "elements");
        int v = this.c;
        for(int v1 = this.J() - 1; -1 < v1; --v1) {
            if(!collection0.contains(this.F()[v1])) {
                this.e0(v1);
            }
        }
        return v != this.c;
    }

    public final boolean h(@l List list0) {
        L.p(list0, "elements");
        return this.e(this.J(), list0);
    }

    public final boolean h0(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.F();
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return true;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return false;
    }

    public final boolean i(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        if(arr_object.length == 0) {
            return false;
        }
        this.r(this.c + arr_object.length);
        kotlin.collections.l.K0(arr_object, this.a, this.c, 0, 0, 12, null);
        this.c += arr_object.length;
        return true;
    }

    public final Object i0(int v, Object object0) {
        Object[] arr_object = this.a;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        return object1;
    }

    public final boolean j(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.J();
        if(v > 0) {
            Object[] arr_object = this.F();
            int v1 = 0;
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return true;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return false;
    }

    public final void j0(@l Object[] arr_object) {
        L.p(arr_object, "<set-?>");
        this.a = arr_object;
    }

    @l
    public final List k() {
        List list0 = this.b;
        if(list0 == null) {
            list0 = new MutableVectorList(this);
            this.b = list0;
        }
        return list0;
    }

    public final void k0(@l Comparator comparator0) {
        L.p(comparator0, "comparator");
        kotlin.collections.l.i4(this.a, comparator0, 0, this.c);
    }

    public final void l() {
        Object[] arr_object = this.a;
        for(int v = this.J() - 1; -1 < v; --v) {
            arr_object[v] = null;
        }
        this.c = 0;
    }

    public final int l0(@l Function1 function10) {
        L.p(function10, "selector");
        int v = this.J();
        int v1 = 0;
        if(v > 0) {
            Object[] arr_object = this.F();
            int v2 = 0;
            while(true) {
                v1 += ((Number)function10.invoke(arr_object[v2])).intValue();
                ++v2;
                if(v2 >= v) {
                    break;
                }
            }
        }
        return v1;
    }

    public final boolean m(Object object0) {
        int v = this.J();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(L.g(this.F()[v1], object0)) {
                    return true;
                }
                if(v1 == v - 1) {
                    break;
                }
            }
        }
        return false;
    }

    @b0
    @l
    public final Void m0() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean n(@l MutableVector mutableVector0) {
        L.p(mutableVector0, "elements");
        kotlin.ranges.l l0 = new kotlin.ranges.l(0, mutableVector0.J() - 1);
        int v = l0.g();
        int v1 = l0.h();
        if(v <= v1) {
            while(true) {
                if(!this.m(mutableVector0.F()[v])) {
                    return false;
                }
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        return true;
    }

    public final boolean o(@l Collection collection0) {
        L.p(collection0, "elements");
        for(Object object0: collection0) {
            if(!this.m(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final boolean p(@l List list0) {
        L.p(list0, "elements");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.m(list0.get(v1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean q(@l MutableVector mutableVector0) {
        L.p(mutableVector0, "other");
        if(mutableVector0.c != this.c) {
            return false;
        }
        int v = this.J();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(!L.g(mutableVector0.F()[v1], this.F()[v1])) {
                    return false;
                }
                if(v1 == v - 1) {
                    break;
                }
            }
        }
        return true;
    }

    public final void r(int v) {
        Object[] arr_object = this.a;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, Math.max(v, arr_object.length * 2));
            L.o(arr_object1, "copyOf(this, newSize)");
            this.a = arr_object1;
        }
    }

    public final Object s() {
        if(this.N()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.F()[0];
    }

    public final Object t(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.J();
        if(v > 0) {
            Object[] arr_object = this.F();
            int v1 = 0;
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        this.m0();
        throw new y();
    }

    // 去混淆评级： 低(20)
    @m
    public final Object u() {
        return this.N() ? null : this.F()[0];
    }

    @m
    public final Object v(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.J();
        if(v > 0) {
            Object[] arr_object = this.F();
            int v1 = 0;
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return null;
    }

    public final Object w(Object object0, @l o o0) {
        L.p(o0, "operation");
        int v = this.J();
        if(v > 0) {
            Object[] arr_object = this.F();
            int v1 = 0;
            while(true) {
                object0 = o0.invoke(object0, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return object0;
    }

    public final Object x(Object object0, @l p p0) {
        L.p(p0, "operation");
        int v = this.J();
        if(v > 0) {
            Object[] arr_object = this.F();
            int v1 = 0;
            while(true) {
                object0 = p0.invoke(v1, object0, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return object0;
    }

    public final Object y(Object object0, @l o o0) {
        L.p(o0, "operation");
        int v = this.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.F();
            while(true) {
                object0 = o0.invoke(arr_object[v1], object0);
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return object0;
    }

    public final Object z(Object object0, @l p p0) {
        L.p(p0, "operation");
        int v = this.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.F();
            while(true) {
                object0 = p0.invoke(v1, arr_object[v1], object0);
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return object0;
    }
}

