package androidx.collection;

import B3.e;
import B3.f;
import androidx.annotation.IntRange;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.sequences.p;
import y4.l;
import y4.m;

@s0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1826#4:1633\n1688#4:1637\n1826#4:1683\n1688#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
public final class MutableObjectList extends ObjectList {
    static final class MutableObjectListIterator implements f, ListIterator {
        @l
        private final List a;
        private int b;

        public MutableObjectListIterator(@l List list0, int v) {
            L.p(list0, "list");
            super();
            this.a = list0;
            this.b = v - 1;
        }

        @Override
        public void add(Object object0) {
            int v = this.b + 1;
            this.b = v;
            this.a.add(v, object0);
        }

        @Override
        public boolean hasNext() {
            return this.b < this.a.size() - 1;
        }

        @Override
        public boolean hasPrevious() {
            return this.b >= 0;
        }

        @Override
        public Object next() {
            int v = this.b + 1;
            this.b = v;
            return this.a.get(v);
        }

        @Override
        public int nextIndex() {
            return this.b + 1;
        }

        @Override
        public Object previous() {
            int v = this.b;
            this.b = v - 1;
            return this.a.get(v);
        }

        @Override
        public int previousIndex() {
            return this.b;
        }

        @Override
        public void remove() {
            this.a.remove(this.b);
            --this.b;
        }

        @Override
        public void set(Object object0) {
            this.a.set(this.b, object0);
        }
    }

    static final class ObjectListMutableList implements e, List {
        @l
        private final MutableObjectList a;

        public ObjectListMutableList(@l MutableObjectList mutableObjectList0) {
            L.p(mutableObjectList0, "objectList");
            super();
            this.a = mutableObjectList0;
        }

        public int a() {
            return this.a.C();
        }

        @Override
        public void add(int v, Object object0) {
            this.a.Y(v, object0);
        }

        @Override
        public boolean add(Object object0) {
            return this.a.Z(object0);
        }

        @Override
        public boolean addAll(int v, @l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.b0(v, collection0);
        }

        @Override
        public boolean addAll(@l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.f0(collection0);
        }

        public Object b(int v) {
            ObjectListKt.d(this, v);
            return this.a.I0(v);
        }

        @Override
        public void clear() {
            this.a.k0();
        }

        @Override
        public boolean contains(Object object0) {
            return this.a.d(object0);
        }

        @Override
        public boolean containsAll(@l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.f(collection0);
        }

        @Override
        public Object get(int v) {
            ObjectListKt.d(this, v);
            return this.a.y(v);
        }

        @Override
        public int indexOf(Object object0) {
            return this.a.E(object0);
        }

        @Override
        public boolean isEmpty() {
            return this.a.H();
        }

        @Override
        @l
        public Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override
        public int lastIndexOf(Object object0) {
            return this.a.T(object0);
        }

        @Override
        @l
        public ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override
        @l
        public ListIterator listIterator(int v) {
            return new MutableObjectListIterator(this, v);
        }

        @Override
        public final Object remove(int v) {
            return this.b(v);
        }

        @Override
        public boolean remove(Object object0) {
            return this.a.B0(object0);
        }

        @Override
        public boolean removeAll(@l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.E0(collection0);
        }

        @Override
        public boolean retainAll(@l Collection collection0) {
            L.p(collection0, "elements");
            return this.a.N0(collection0);
        }

        @Override
        public Object set(int v, Object object0) {
            ObjectListKt.d(this, v);
            return this.a.Q0(v, object0);
        }

        @Override
        public final int size() {
            return this.a();
        }

        @Override
        @l
        public List subList(int v, int v1) {
            ObjectListKt.e(this, v, v1);
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

    @s0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n1855#2,2:1619\n1855#2,2:1621\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1395#1:1619,2\n1477#1:1621,2\n*E\n"})
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
            ObjectListKt.d(this, v);
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
            ObjectListKt.d(this, v);
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
            return new MutableObjectListIterator(this, 0);
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
            return new MutableObjectListIterator(this, 0);
        }

        @Override
        @l
        public ListIterator listIterator(int v) {
            return new MutableObjectListIterator(this, v);
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
            ObjectListKt.d(this, v);
            return this.a.set(v + this.b, object0);
        }

        @Override
        public final int size() {
            return this.a();
        }

        @Override
        @l
        public List subList(int v, int v1) {
            ObjectListKt.e(this, v, v1);
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

    @m
    private ObjectListMutableList c;

    public MutableObjectList() {
        this(0, 1, null);
    }

    public MutableObjectList(int v) {
        super(v, null);
    }

    public MutableObjectList(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        this(v);
    }

    public final void A0(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        if(arr_object.length == 0) {
            return;
        }
        this.l0(this.b + arr_object.length);
        kotlin.collections.l.K0(arr_object, this.a, this.b, 0, 0, 12, null);
        this.b += arr_object.length;
    }

    public final boolean B0(Object object0) {
        int v = this.E(object0);
        if(v >= 0) {
            this.I0(v);
            return true;
        }
        return false;
    }

    public final boolean C0(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        int v = this.b;
        this.n0(objectList0);
        return v != this.b;
    }

    public final boolean D0(@l ScatterSet scatterSet0) {
        L.p(scatterSet0, "elements");
        int v = this.b;
        this.o0(scatterSet0);
        return v != this.b;
    }

    public final boolean E0(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        int v = this.b;
        this.p0(iterable0);
        return v != this.b;
    }

    public final boolean F0(@l List list0) {
        L.p(list0, "elements");
        int v = this.b;
        this.r0(list0);
        return v != this.b;
    }

    public final boolean G0(@l kotlin.sequences.m m0) {
        L.p(m0, "elements");
        int v = this.b;
        this.s0(m0);
        return v != this.b;
    }

    public final boolean H0(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        int v = this.b;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            this.B0(arr_object[v1]);
        }
        return v != this.b;
    }

    public final Object I0(@IntRange(from = 0L) int v) {
        if(v >= 0) {
            int v1 = this.b;
            if(v < v1) {
                Object[] arr_object = this.a;
                Object object0 = arr_object[v];
                if(v != v1 - 1) {
                    kotlin.collections.l.B0(arr_object, arr_object, v, v + 1, v1);
                }
                int v2 = this.b - 1;
                this.b = v2;
                arr_object[v2] = null;
                return object0;
            }
        }
        throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + (this.b - 1));
    }

    public final void J0(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.b;
        Object[] arr_object = this.a;
        int v1 = 0;
        kotlin.ranges.l l0 = s.W1(0, v);
        int v2 = l0.g();
        int v3 = l0.h();
        if(v2 <= v3) {
            while(true) {
                arr_object[v2 - v1] = arr_object[v2];
                if(((Boolean)function10.invoke(arr_object[v2])).booleanValue()) {
                    ++v1;
                }
                if(v2 == v3) {
                    break;
                }
                ++v2;
            }
        }
        kotlin.collections.l.M1(arr_object, null, v - v1, v);
        this.b -= v1;
    }

    public final void K0(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        if(v >= 0) {
            int v2 = this.b;
            if(v <= v2 && v1 >= 0 && v1 <= v2) {
                if(v1 < v) {
                    throw new IllegalArgumentException("Start (" + v + ") is more than end (" + v1 + ')');
                }
                if(v1 != v) {
                    if(v1 < v2) {
                        kotlin.collections.l.B0(this.a, this.a, v, v1, v2);
                    }
                    int v3 = this.b - (v1 - v);
                    kotlin.collections.l.M1(this.a, null, v3, this.b);
                    this.b = v3;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("Start (" + v + ") and end (" + v1 + ") must be in 0.." + this.b);
    }

    public final boolean L0(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        int v = this.b;
        Object[] arr_object = this.a;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!objectList0.d(arr_object[v1])) {
                this.I0(v1);
            }
        }
        return v != this.b;
    }

    public final boolean M0(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        int v = this.b;
        Object[] arr_object = this.a;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!u.W1(iterable0, arr_object[v1])) {
                this.I0(v1);
            }
        }
        return v != this.b;
    }

    public final boolean N0(@l Collection collection0) {
        L.p(collection0, "elements");
        int v = this.b;
        Object[] arr_object = this.a;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!collection0.contains(arr_object[v1])) {
                this.I0(v1);
            }
        }
        return v != this.b;
    }

    public final boolean O0(@l kotlin.sequences.m m0) {
        L.p(m0, "elements");
        int v = this.b;
        Object[] arr_object = this.a;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!p.f0(m0, arr_object[v1])) {
                this.I0(v1);
            }
        }
        return v != this.b;
    }

    public final boolean P0(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        int v = this.b;
        Object[] arr_object1 = this.a;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(kotlin.collections.l.If(arr_object, arr_object1[v1]) < 0) {
                this.I0(v1);
            }
        }
        return v != this.b;
    }

    public final Object Q0(@IntRange(from = 0L) int v, Object object0) {
        if(v < 0 || v >= this.b) {
            throw new IndexOutOfBoundsException("set index " + v + " must be between 0 .. " + (this.b - 1));
        }
        Object[] arr_object = this.a;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        return object1;
    }

    public final void R0(int v) {
        int v1 = Math.max(v, this.b);
        Object[] arr_object = this.a;
        if(arr_object.length > v1) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, v1);
            L.o(arr_object1, "copyOf(this, newSize)");
            this.a = arr_object1;
        }
    }

    public static void S0(MutableObjectList mutableObjectList0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = mutableObjectList0.b;
        }
        mutableObjectList0.R0(v);
    }

    public final void Y(@IntRange(from = 0L) int v, Object object0) {
        if(v >= 0) {
            int v1 = this.b;
            if(v <= v1) {
                this.l0(v1 + 1);
                Object[] arr_object = this.a;
                int v2 = this.b;
                if(v != v2) {
                    kotlin.collections.l.B0(arr_object, arr_object, v + 1, v, v2);
                }
                arr_object[v] = object0;
                ++this.b;
                return;
            }
        }
        throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
    }

    public final boolean Z(Object object0) {
        this.l0(this.b + 1);
        int v = this.b;
        this.a[v] = object0;
        this.b = v + 1;
        return true;
    }

    public final boolean a0(@IntRange(from = 0L) int v, @l ObjectList objectList0) {
        L.p(objectList0, "elements");
        if(v < 0 || v > this.b) {
            throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
        }
        if(objectList0.H()) {
            return false;
        }
        this.l0(this.b + objectList0.b);
        Object[] arr_object = this.a;
        int v1 = this.b;
        if(v != v1) {
            kotlin.collections.l.B0(arr_object, arr_object, objectList0.b + v, v, v1);
        }
        kotlin.collections.l.B0(objectList0.a, arr_object, v, 0, objectList0.b);
        this.b += objectList0.b;
        return true;
    }

    public final boolean b0(@IntRange(from = 0L) int v, @l Collection collection0) {
        int v1 = 0;
        L.p(collection0, "elements");
        if(v < 0 || v > this.b) {
            throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
        }
        if(collection0.isEmpty()) {
            return false;
        }
        this.l0(this.b + collection0.size());
        Object[] arr_object = this.a;
        if(v != this.b) {
            kotlin.collections.l.B0(arr_object, arr_object, collection0.size() + v, v, this.b);
        }
        for(Object object0: collection0) {
            if(v1 < 0) {
                u.Z();
            }
            arr_object[v1 + v] = object0;
            ++v1;
        }
        this.b += collection0.size();
        return true;
    }

    @Override  // androidx.collection.ObjectList
    @l
    public List c() {
        return this.j0();
    }

    public final boolean c0(@IntRange(from = 0L) int v, @l Object[] arr_object) {
        L.p(arr_object, "elements");
        if(v >= 0) {
            int v1 = this.b;
            if(v <= v1) {
                if(arr_object.length == 0) {
                    return false;
                }
                this.l0(v1 + arr_object.length);
                Object[] arr_object1 = this.a;
                int v2 = this.b;
                if(v != v2) {
                    kotlin.collections.l.B0(arr_object1, arr_object1, arr_object.length + v, v, v2);
                }
                kotlin.collections.l.K0(arr_object, arr_object1, v, 0, 0, 12, null);
                this.b += arr_object.length;
                return true;
            }
        }
        throw new IndexOutOfBoundsException("Index " + v + " must be in 0.." + this.b);
    }

    public final boolean d0(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        int v = this.b;
        this.u0(objectList0);
        return v != this.b;
    }

    public final boolean e0(@l ScatterSet scatterSet0) {
        L.p(scatterSet0, "elements");
        int v = this.b;
        this.v0(scatterSet0);
        return v != this.b;
    }

    public final boolean f0(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        int v = this.b;
        this.w0(iterable0);
        return v != this.b;
    }

    public final boolean g0(@l List list0) {
        L.p(list0, "elements");
        int v = this.b;
        this.y0(list0);
        return v != this.b;
    }

    public final boolean h0(@l kotlin.sequences.m m0) {
        L.p(m0, "elements");
        int v = this.b;
        this.z0(m0);
        return v != this.b;
    }

    public final boolean i0(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        int v = this.b;
        this.A0(arr_object);
        return v != this.b;
    }

    @l
    public final List j0() {
        ObjectListMutableList mutableObjectList$ObjectListMutableList0 = this.c;
        if(mutableObjectList$ObjectListMutableList0 == null) {
            mutableObjectList$ObjectListMutableList0 = new ObjectListMutableList(this);
            this.c = mutableObjectList$ObjectListMutableList0;
        }
        return mutableObjectList$ObjectListMutableList0;
    }

    public final void k0() {
        kotlin.collections.l.M1(this.a, null, 0, this.b);
        this.b = 0;
    }

    public final void l0(int v) {
        Object[] arr_object = this.a;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, Math.max(v, arr_object.length * 3 / 2));
            L.o(arr_object1, "copyOf(this, newSize)");
            this.a = arr_object1;
        }
    }

    public final int m0() {
        return this.a.length;
    }

    public final void n0(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        Object[] arr_object = objectList0.a;
        int v = objectList0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            this.B0(arr_object[v1]);
        }
    }

    public final void o0(@l ScatterSet scatterSet0) {
        L.p(scatterSet0, "elements");
        Object[] arr_object = scatterSet0.b;
        long[] arr_v = scatterSet0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.B0(arr_object[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void p0(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        for(Object object0: iterable0) {
            this.B0(object0);
        }
    }

    public final void q0(Object object0) {
        this.B0(object0);
    }

    public final void r0(@l List list0) {
        L.p(list0, "elements");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.B0(list0.get(v1));
        }
    }

    public final void s0(@l kotlin.sequences.m m0) {
        L.p(m0, "elements");
        for(Object object0: m0) {
            this.B0(object0);
        }
    }

    public final void t0(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        for(int v = 0; v < arr_object.length; ++v) {
            this.B0(arr_object[v]);
        }
    }

    public final void u0(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        if(objectList0.H()) {
            return;
        }
        this.l0(this.b + objectList0.b);
        kotlin.collections.l.B0(objectList0.a, this.a, this.b, 0, objectList0.b);
        this.b += objectList0.b;
    }

    public final void v0(@l ScatterSet scatterSet0) {
        L.p(scatterSet0, "elements");
        if(scatterSet0.r()) {
            return;
        }
        this.l0(this.b + scatterSet0.q());
        Object[] arr_object = scatterSet0.b;
        long[] arr_v = scatterSet0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.Z(arr_object[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_20;
                    }
                    break;
                }
            label_20:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void w0(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        for(Object object0: iterable0) {
            this.Z(object0);
        }
    }

    public final void x0(Object object0) {
        this.Z(object0);
    }

    public final void y0(@l List list0) {
        L.p(list0, "elements");
        if(list0.isEmpty()) {
            return;
        }
        int v = this.b;
        this.l0(list0.size() + v);
        Object[] arr_object = this.a;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2 + v] = list0.get(v2);
        }
        this.b += list0.size();
    }

    public final void z0(@l kotlin.sequences.m m0) {
        L.p(m0, "elements");
        for(Object object0: m0) {
            this.Z(object0);
        }
    }
}

