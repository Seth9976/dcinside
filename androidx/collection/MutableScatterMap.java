package androidx.collection;

import A3.a;
import A3.o;
import B3.g;
import j..util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.S0;
import kotlin.V;
import kotlin.b0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.sequences.p;
import y4.l;
import y4.m;

@s0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1850:1\n1284#1,2:2019\n1288#1,5:2027\n1284#1,2:2058\n1288#1,5:2066\n1284#1,2:2083\n1288#1,5:2091\n1284#1,2:2097\n1288#1,5:2105\n1#2:1851\n1672#3,6:1852\n1826#3:1870\n1688#3:1874\n1605#3,3:1887\n1619#3:1891\n1615#3:1894\n1795#3,3:1899\n1809#3,3:1903\n1733#3:1907\n1721#3:1909\n1715#3:1910\n1728#3:1915\n1818#3:1917\n1605#3,3:1927\n1619#3:1931\n1615#3:1934\n1795#3,3:1939\n1809#3,3:1943\n1733#3:1947\n1721#3:1949\n1715#3:1950\n1728#3:1955\n1818#3:1957\n1826#3:1972\n1688#3:1976\n1826#3:1997\n1688#3:2001\n1672#3,6:2021\n1672#3,6:2032\n1605#3,3:2038\n1615#3:2041\n1619#3:2042\n1795#3,3:2043\n1809#3,3:2046\n1733#3:2049\n1721#3:2050\n1715#3:2051\n1728#3:2052\n1818#3:2053\n1682#3:2054\n1661#3:2055\n1680#3:2056\n1661#3:2057\n1672#3,6:2060\n1795#3,3:2071\n1826#3:2074\n1715#3:2075\n1685#3:2076\n1661#3:2077\n1605#3,3:2078\n1615#3:2081\n1619#3:2082\n1672#3,6:2085\n1661#3:2096\n1672#3,6:2099\n1672#3,6:2110\n1672#3,6:2116\n215#4,2:1858\n391#5,4:1860\n363#5,6:1864\n373#5,3:1871\n376#5,2:1875\n396#5,2:1877\n379#5,6:1879\n398#5:1885\n633#5:1886\n634#5:1890\n636#5,2:1892\n638#5,4:1895\n642#5:1902\n643#5:1906\n644#5:1908\n645#5,4:1911\n651#5:1916\n652#5,8:1918\n633#5:1926\n634#5:1930\n636#5,2:1932\n638#5,4:1935\n642#5:1942\n643#5:1946\n644#5:1948\n645#5,4:1951\n651#5:1956\n652#5,8:1958\n363#5,6:1966\n373#5,3:1973\n376#5,9:1977\n267#6,4:1986\n237#6,7:1990\n248#6,3:1998\n251#6,2:2002\n272#6,2:2004\n254#6,6:2006\n274#6:2012\n305#7,6:2013\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1113#1:2019,2\n1113#1:2027,5\n1180#1:2058,2\n1180#1:2066,5\n1254#1:2083,2\n1254#1:2091,5\n1270#1:2097,2\n1270#1:2105,5\n848#1:1852,6\n972#1:1870\n972#1:1874\n1021#1:1887,3\n1021#1:1891\n1021#1:1894\n1021#1:1899,3\n1021#1:1903,3\n1021#1:1907\n1021#1:1909\n1021#1:1910\n1021#1:1915\n1021#1:1917\n1033#1:1927,3\n1033#1:1931\n1033#1:1934\n1033#1:1939,3\n1033#1:1943,3\n1033#1:1947\n1033#1:1949\n1033#1:1950\n1033#1:1955\n1033#1:1957\n1047#1:1972\n1047#1:1976\n1093#1:1997\n1093#1:2001\n1113#1:2021,6\n1129#1:2032,6\n1145#1:2038,3\n1146#1:2041\n1147#1:2042\n1154#1:2043,3\n1155#1:2046,3\n1156#1:2049\n1157#1:2050\n1157#1:2051\n1161#1:2052\n1164#1:2053\n1173#1:2054\n1173#1:2055\n1179#1:2056\n1179#1:2057\n1180#1:2060,6\n1195#1:2071,3\n1196#1:2074\n1198#1:2075\n1249#1:2076\n1249#1:2077\n1251#1:2078,3\n1252#1:2081\n1254#1:2082\n1254#1:2085,6\n1268#1:2096\n1270#1:2099,6\n1285#1:2110,6\n1291#1:2116,6\n963#1:1858,2\n972#1:1860,4\n972#1:1864,6\n972#1:1871,3\n972#1:1875,2\n972#1:1877,2\n972#1:1879,6\n972#1:1885\n1021#1:1886\n1021#1:1890\n1021#1:1892,2\n1021#1:1895,4\n1021#1:1902\n1021#1:1906\n1021#1:1908\n1021#1:1911,4\n1021#1:1916\n1021#1:1918,8\n1033#1:1926\n1033#1:1930\n1033#1:1932,2\n1033#1:1935,4\n1033#1:1942\n1033#1:1946\n1033#1:1948\n1033#1:1951,4\n1033#1:1956\n1033#1:1958,8\n1047#1:1966,6\n1047#1:1973,3\n1047#1:1977,9\n1093#1:1986,4\n1093#1:1990,7\n1093#1:1998,3\n1093#1:2002,2\n1093#1:2004,2\n1093#1:2006,6\n1093#1:2012\n1102#1:2013,6\n*E\n"})
public final class MutableScatterMap extends ScatterMap {
    @s0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1850:1\n215#2,2:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n*L\n1590#1:1851,2\n*E\n"})
    final class MutableMapWrapper extends MapWrapper implements g, Map, java.util.Map {
        final MutableScatterMap b;

        @Override  // androidx.collection.ScatterMap$MapWrapper
        @l
        public Set a() {
            return new Object() {
                public boolean a(@l Map.Entry map$Entry0) {
                    L.p(map$Entry0, "element");
                    throw new UnsupportedOperationException();
                }

                @Override
                public boolean add(Object object0) {
                    return this.a(((Map.Entry)object0));
                }

                @Override
                public boolean addAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    throw new UnsupportedOperationException();
                }

                public boolean b(@l Map.Entry map$Entry0) {
                    L.p(map$Entry0, "element");
                    Object object0 = map$Entry0.getKey();
                    return L.g(this.a.p(object0), map$Entry0.getValue());
                }

                public int c() {
                    return this.a.e;
                }

                @Override
                public void clear() {
                    this.a.K();
                }

                @Override
                public final boolean contains(Object object0) {
                    return v0.I(object0) ? this.b(((Map.Entry)object0)) : false;
                }

                @Override
                public boolean containsAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    if(!collection0.isEmpty()) {
                        for(Object object0: collection0) {
                            if(!L.g(mutableScatterMap0.p(((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue())) {
                                return false;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    return true;
                }

                public boolean d(@l Map.Entry map$Entry0) {
                    int v10;
                    L.p(map$Entry0, "element");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    Object object0 = map$Entry0.getKey();
                    int v = object0 == null ? 0 : object0.hashCode();
                    int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
                    int v2 = mutableScatterMap0.d;
                    int v3 = v1 >>> 7 & v2;
                    int v4 = 0;
                    while(true) {
                        int v5 = (v3 & 7) << 3;
                        long v6 = mutableScatterMap0.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | mutableScatterMap0.a[v3 >> 3] >>> v5;
                        long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
                        long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
                        while(v8 != 0L) {
                            int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                            if(L.g(mutableScatterMap0.b[v9], object0)) {
                                v10 = v9;
                                goto label_21;
                            }
                            v8 &= v8 - 1L;
                        }
                        if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                            goto label_25;
                        }
                        else {
                            v10 = -1;
                        }
                    label_21:
                        if(v10 >= 0 && L.g(this.a.c[v10], map$Entry0.getValue())) {
                            this.a.o0(v10);
                            return true;
                        }
                        return false;
                    label_25:
                        v4 += 8;
                        v3 = v3 + v4 & v2;
                    }
                }

                @Override
                public boolean isEmpty() {
                    return this.a.x();
                }

                @Override
                @l
                public Iterator iterator() {
                    return new Object() {
                        @l
                        private Iterator a;
                        private int b;

                        {
                            this.b = -1;
                            this.a = p.a(new o(this, null) {
                                Object l;
                                Object m;
                                Object n;
                                int o;
                                int p;
                                int q;
                                int r;
                                long s;
                                int t;
                                private Object u;
                                final MutableScatterMap v;
                                final androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1 w;

                                {
                                    this.v = mutableScatterMap0;
                                    this.w = mutableScatterMap$MutableMapWrapper$entries$1$iterator$10;
                                    super(2, d0);
                                }

                                @m
                                public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                                    return ((androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    d d1 = new androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1.1(this.v, this.w, d0);
                                    d1.u = object0;
                                    return d1;
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.a(((kotlin.sequences.o)object0), ((d)object1));
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    int v1;
                                    int v;
                                    long[] arr_v;
                                    androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$10;
                                    MutableScatterMap mutableScatterMap0;
                                    kotlin.sequences.o o0;
                                    Object object1 = b.l();
                                    switch(this.t) {
                                        case 0: {
                                            f0.n(object0);
                                            o0 = (kotlin.sequences.o)this.u;
                                            mutableScatterMap0 = this.v;
                                            mutableScatterMap$MutableMapWrapper$entries$1$iterator$10 = this.w;
                                            arr_v = mutableScatterMap0.a;
                                            v = arr_v.length - 2;
                                            if(v >= 0) {
                                                v1 = 0;
                                                goto label_49;
                                            }
                                            break;
                                        }
                                        case 1: {
                                            int v2 = this.r;
                                            int v3 = this.q;
                                            long v4 = this.s;
                                            int v5 = this.p;
                                            int v6 = this.o;
                                            long[] arr_v1 = (long[])this.n;
                                            MutableScatterMap mutableScatterMap1 = (MutableScatterMap)this.m;
                                            androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$11 = (androidx.collection.MutableScatterMap.MutableMapWrapper.entries.1.iterator.1)this.l;
                                            kotlin.sequences.o o1 = (kotlin.sequences.o)this.u;
                                            f0.n(object0);
                                        alab1:
                                            while(true) {
                                                while(true) {
                                                    v4 >>= 8;
                                                    ++v2;
                                                label_24:
                                                    if(v2 >= v3) {
                                                        break alab1;
                                                    }
                                                    if((0xFFL & v4) >= 0x80L) {
                                                        break;
                                                    }
                                                    mutableScatterMap$MutableMapWrapper$entries$1$iterator$11.d((v5 << 3) + v2);
                                                    MutableMapEntry mutableMapEntry0 = new MutableMapEntry(mutableScatterMap1.b, mutableScatterMap1.c, mutableScatterMap$MutableMapWrapper$entries$1$iterator$11.a());
                                                    this.u = o1;
                                                    this.l = mutableScatterMap$MutableMapWrapper$entries$1$iterator$11;
                                                    this.m = mutableScatterMap1;
                                                    this.n = arr_v1;
                                                    this.o = v6;
                                                    this.p = v5;
                                                    this.s = v4;
                                                    this.q = v3;
                                                    this.r = v2;
                                                    this.t = 1;
                                                    if(o1.a(mutableMapEntry0, this) != object1) {
                                                        break;
                                                    }
                                                    return object1;
                                                }
                                            }
                                            if(v3 == 8) {
                                                arr_v = arr_v1;
                                                mutableScatterMap0 = mutableScatterMap1;
                                                mutableScatterMap$MutableMapWrapper$entries$1$iterator$10 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$11;
                                                o0 = o1;
                                                v1 = v5;
                                                v = v6;
                                                while(true) {
                                                    if(v1 == v) {
                                                        break;
                                                    }
                                                    ++v1;
                                                label_49:
                                                    long v7 = arr_v[v1];
                                                    if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                        continue;
                                                    }
                                                    o1 = o0;
                                                    v2 = 0;
                                                    mutableScatterMap1 = mutableScatterMap0;
                                                    arr_v1 = arr_v;
                                                    v3 = 8 - (~(v1 - v) >>> 0x1F);
                                                    mutableScatterMap$MutableMapWrapper$entries$1$iterator$11 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$10;
                                                    v4 = v7;
                                                    v6 = v;
                                                    v5 = v1;
                                                    goto label_24;
                                                }
                                            }
                                            break;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }
                                    return S0.a;
                                }
                            });
                        }

                        public final int a() {
                            return this.b;
                        }

                        @l
                        public final Iterator b() {
                            return this.a;
                        }

                        @l
                        public Map.Entry c() {
                            return this.a.next();
                        }

                        public final void d(int v) {
                            this.b = v;
                        }

                        public final void f(@l Iterator iterator0) {
                            L.p(iterator0, "<set-?>");
                            this.a = iterator0;
                        }

                        @Override
                        public boolean hasNext() {
                            return this.a.hasNext();
                        }

                        @Override
                        public Object next() {
                            return this.c();
                        }

                        @Override
                        public void remove() {
                            int v = this.b;
                            if(v != -1) {
                                this.c.o0(v);
                                this.b = -1;
                            }
                        }
                    };
                }

                @Override
                public final boolean remove(Object object0) {
                    return v0.I(object0) ? this.d(((Map.Entry)object0)) : false;
                }

                @Override
                public boolean removeAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    long[] arr_v = mutableScatterMap0.a;
                    int v = arr_v.length - 2;
                    if(v >= 0) {
                        boolean z = false;
                        for(int v1 = 0; true; ++v1) {
                            long v2 = arr_v[v1];
                            if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                                for(int v4 = 0; v4 < v3; ++v4) {
                                    if((0xFFL & v2) < 0x80L) {
                                        int v5 = (v1 << 3) + v4;
                                        for(Object object0: collection0) {
                                            if(L.g(((Map.Entry)object0).getKey(), mutableScatterMap0.b[v5]) && L.g(((Map.Entry)object0).getValue(), mutableScatterMap0.c[v5])) {
                                                mutableScatterMap0.o0(v5);
                                                z = true;
                                                break;
                                            }
                                            if(false) {
                                                break;
                                            }
                                        }
                                    }
                                    v2 >>= 8;
                                }
                                if(v3 != 8) {
                                    return z;
                                }
                            }
                            if(v1 == v) {
                                break;
                            }
                        }
                        return z;
                    }
                    return false;
                }

                @Override
                public boolean retainAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    long[] arr_v = mutableScatterMap0.a;
                    int v = arr_v.length - 2;
                    if(v >= 0) {
                        int v1 = 0;
                        boolean z = false;
                        while(true) {
                            long v2 = arr_v[v1];
                            if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                                int v4 = 0;
                                while(v4 < v3) {
                                    if((0xFFL & v2) < 0x80L) {
                                        int v5 = (v1 << 3) + v4;
                                        Iterator iterator0 = collection0.iterator();
                                        while(true) {
                                            if(iterator0.hasNext()) {
                                                Object object0 = iterator0.next();
                                                if(L.g(((Map.Entry)object0).getKey(), mutableScatterMap0.b[v5]) && L.g(((Map.Entry)object0).getValue(), mutableScatterMap0.c[v5])) {
                                                    break;
                                                }
                                                else {
                                                    continue;
                                                }
                                            }
                                            mutableScatterMap0.o0(v5);
                                            z = true;
                                            break;
                                        }
                                    }
                                    v2 >>= 8;
                                    ++v4;
                                }
                                if(v3 != 8) {
                                    return z;
                                }
                            }
                            if(v1 == v) {
                                break;
                            }
                            ++v1;
                        }
                        return z;
                    }
                    return false;
                }

                @Override
                public final int size() {
                    return this.c();
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
            };
        }

        @Override  // androidx.collection.ScatterMap$MapWrapper
        @l
        public Set b() {
            return new Object() {
                public int a() {
                    return this.a.e;
                }

                @Override
                public boolean add(Object object0) {
                    throw new UnsupportedOperationException();
                }

                @Override
                public boolean addAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    throw new UnsupportedOperationException();
                }

                @Override
                public void clear() {
                    this.a.K();
                }

                @Override
                public boolean contains(Object object0) {
                    return this.a.g(object0);
                }

                @Override
                public boolean containsAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    if(!collection0.isEmpty()) {
                        for(Object object0: collection0) {
                            if(!mutableScatterMap0.g(object0)) {
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
                    return this.a.x();
                }

                @Override
                @l
                public Iterator iterator() {
                    return new Object() {
                        @l
                        private final Iterator a;
                        private int b;

                        {
                            this.a = p.a(new o(null) {
                                Object l;
                                int m;
                                int n;
                                int o;
                                int p;
                                long q;
                                int r;
                                private Object s;
                                final MutableScatterMap t;

                                {
                                    this.t = mutableScatterMap0;
                                    super(2, d0);
                                }

                                @m
                                public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                                    return ((androidx.collection.MutableScatterMap.MutableMapWrapper.keys.1.iterator.1.iterator.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    d d1 = new androidx.collection.MutableScatterMap.MutableMapWrapper.keys.1.iterator.1.iterator.1(this.t, d0);
                                    d1.s = object0;
                                    return d1;
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.a(((kotlin.sequences.o)object0), ((d)object1));
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    int v1;
                                    int v;
                                    long[] arr_v;
                                    kotlin.sequences.o o0;
                                    Object object1 = b.l();
                                    switch(this.r) {
                                        case 0: {
                                            f0.n(object0);
                                            o0 = (kotlin.sequences.o)this.s;
                                            arr_v = this.t.a;
                                            v = arr_v.length - 2;
                                            if(v >= 0) {
                                                v1 = 0;
                                                goto label_39;
                                            }
                                            break;
                                        }
                                        case 1: {
                                            int v2 = this.p;
                                            int v3 = this.o;
                                            long v4 = this.q;
                                            int v5 = this.n;
                                            int v6 = this.m;
                                            long[] arr_v1 = (long[])this.l;
                                            kotlin.sequences.o o1 = (kotlin.sequences.o)this.s;
                                            f0.n(object0);
                                        alab1:
                                            while(true) {
                                                while(true) {
                                                    v4 >>= 8;
                                                    ++v2;
                                                label_20:
                                                    if(v2 >= v3) {
                                                        break alab1;
                                                    }
                                                    if((0xFFL & v4) >= 0x80L) {
                                                        break;
                                                    }
                                                    this.s = o1;
                                                    this.l = arr_v1;
                                                    this.m = v6;
                                                    this.n = v5;
                                                    this.q = v4;
                                                    this.o = v3;
                                                    this.p = v2;
                                                    this.r = 1;
                                                    if(o1.a(kotlin.coroutines.jvm.internal.b.f((v5 << 3) + v2), this) != object1) {
                                                        break;
                                                    }
                                                    return object1;
                                                }
                                            }
                                            if(v3 == 8) {
                                                v1 = v5;
                                                v = v6;
                                                arr_v = arr_v1;
                                                o0 = o1;
                                                while(true) {
                                                    if(v1 == v) {
                                                        break;
                                                    }
                                                    ++v1;
                                                label_39:
                                                    long v7 = arr_v[v1];
                                                    if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                        continue;
                                                    }
                                                    o1 = o0;
                                                    v2 = 0;
                                                    arr_v1 = arr_v;
                                                    v3 = 8 - (~(v1 - v) >>> 0x1F);
                                                    v6 = v;
                                                    v5 = v1;
                                                    v4 = v7;
                                                    goto label_20;
                                                }
                                            }
                                            break;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }
                                    return S0.a;
                                }
                            });
                            this.b = -1;
                        }

                        @Override
                        public boolean hasNext() {
                            return this.a.hasNext();
                        }

                        @Override
                        public Object next() {
                            Object object0 = this.a.next();
                            int v = ((Number)object0).intValue();
                            this.b = v;
                            return this.c.b[v];
                        }

                        @Override
                        public void remove() {
                            int v = this.b;
                            if(v >= 0) {
                                this.c.o0(v);
                                this.b = -1;
                            }
                        }
                    };
                }

                @Override
                public boolean remove(Object object0) {
                    int v10;
                    MutableScatterMap mutableScatterMap0 = this.a;
                    int v = object0 == null ? 0 : object0.hashCode();
                    int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
                    int v2 = mutableScatterMap0.d;
                    int v3 = v1 >>> 7 & v2;
                    int v4 = 0;
                    while(true) {
                        int v5 = (v3 & 7) << 3;
                        long v6 = mutableScatterMap0.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | mutableScatterMap0.a[v3 >> 3] >>> v5;
                        long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
                        long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
                        while(v8 != 0L) {
                            int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                            if(L.g(mutableScatterMap0.b[v9], object0)) {
                                v10 = v9;
                                goto label_19;
                            }
                            v8 &= v8 - 1L;
                        }
                        if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                            goto label_23;
                        }
                        else {
                            v10 = -1;
                        }
                    label_19:
                        if(v10 >= 0) {
                            this.a.o0(v10);
                            return true;
                        }
                        return false;
                    label_23:
                        v4 += 8;
                        v3 = v3 + v4 & v2;
                    }
                }

                @Override
                public boolean removeAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    long[] arr_v = mutableScatterMap0.a;
                    int v = arr_v.length - 2;
                    if(v >= 0) {
                        boolean z = false;
                        for(int v1 = 0; true; ++v1) {
                            long v2 = arr_v[v1];
                            if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                                for(int v4 = 0; v4 < v3; ++v4) {
                                    if((0xFFL & v2) < 0x80L) {
                                        int v5 = (v1 << 3) + v4;
                                        if(u.W1(collection0, mutableScatterMap0.b[v5])) {
                                            mutableScatterMap0.o0(v5);
                                            z = true;
                                        }
                                    }
                                    v2 >>= 8;
                                }
                                if(v3 != 8) {
                                    return z;
                                }
                            }
                            if(v1 == v) {
                                break;
                            }
                        }
                        return z;
                    }
                    return false;
                }

                @Override
                public boolean retainAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    long[] arr_v = mutableScatterMap0.a;
                    int v = arr_v.length - 2;
                    if(v >= 0) {
                        boolean z = false;
                        for(int v1 = 0; true; ++v1) {
                            long v2 = arr_v[v1];
                            if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                                for(int v4 = 0; v4 < v3; ++v4) {
                                    if((0xFFL & v2) < 0x80L) {
                                        int v5 = (v1 << 3) + v4;
                                        if(!u.W1(collection0, mutableScatterMap0.b[v5])) {
                                            mutableScatterMap0.o0(v5);
                                            z = true;
                                        }
                                    }
                                    v2 >>= 8;
                                }
                                if(v3 != 8) {
                                    return z;
                                }
                            }
                            if(v1 == v) {
                                break;
                            }
                        }
                        return z;
                    }
                    return false;
                }

                @Override
                public final int size() {
                    return this.a();
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
            };
        }

        @Override  // androidx.collection.ScatterMap$MapWrapper
        public void clear() {
            MutableScatterMap.this.K();
        }

        @Override  // androidx.collection.ScatterMap$MapWrapper
        @l
        public Collection d() {
            return new Object() {
                public int a() {
                    return this.a.e;
                }

                @Override
                public boolean add(Object object0) {
                    throw new UnsupportedOperationException();
                }

                @Override
                public boolean addAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    throw new UnsupportedOperationException();
                }

                @Override
                public void clear() {
                    this.a.K();
                }

                @Override
                public boolean contains(Object object0) {
                    return this.a.h(object0);
                }

                @Override
                public boolean containsAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    if(!collection0.isEmpty()) {
                        for(Object object0: collection0) {
                            if(!mutableScatterMap0.h(object0)) {
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
                    return this.a.x();
                }

                @Override
                @l
                public Iterator iterator() {
                    return new Object() {
                        @l
                        private final Iterator a;
                        private int b;

                        {
                            this.a = p.a(new o(null) {
                                Object l;
                                int m;
                                int n;
                                int o;
                                int p;
                                long q;
                                int r;
                                private Object s;
                                final MutableScatterMap t;

                                {
                                    this.t = mutableScatterMap0;
                                    super(2, d0);
                                }

                                @m
                                public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                                    return ((androidx.collection.MutableScatterMap.MutableMapWrapper.values.1.iterator.1.iterator.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    d d1 = new androidx.collection.MutableScatterMap.MutableMapWrapper.values.1.iterator.1.iterator.1(this.t, d0);
                                    d1.s = object0;
                                    return d1;
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.a(((kotlin.sequences.o)object0), ((d)object1));
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    int v1;
                                    int v;
                                    long[] arr_v;
                                    kotlin.sequences.o o0;
                                    Object object1 = b.l();
                                    switch(this.r) {
                                        case 0: {
                                            f0.n(object0);
                                            o0 = (kotlin.sequences.o)this.s;
                                            arr_v = this.t.a;
                                            v = arr_v.length - 2;
                                            if(v >= 0) {
                                                v1 = 0;
                                                goto label_39;
                                            }
                                            break;
                                        }
                                        case 1: {
                                            int v2 = this.p;
                                            int v3 = this.o;
                                            long v4 = this.q;
                                            int v5 = this.n;
                                            int v6 = this.m;
                                            long[] arr_v1 = (long[])this.l;
                                            kotlin.sequences.o o1 = (kotlin.sequences.o)this.s;
                                            f0.n(object0);
                                        alab1:
                                            while(true) {
                                                while(true) {
                                                    v4 >>= 8;
                                                    ++v2;
                                                label_20:
                                                    if(v2 >= v3) {
                                                        break alab1;
                                                    }
                                                    if((0xFFL & v4) >= 0x80L) {
                                                        break;
                                                    }
                                                    this.s = o1;
                                                    this.l = arr_v1;
                                                    this.m = v6;
                                                    this.n = v5;
                                                    this.q = v4;
                                                    this.o = v3;
                                                    this.p = v2;
                                                    this.r = 1;
                                                    if(o1.a(kotlin.coroutines.jvm.internal.b.f((v5 << 3) + v2), this) != object1) {
                                                        break;
                                                    }
                                                    return object1;
                                                }
                                            }
                                            if(v3 == 8) {
                                                v1 = v5;
                                                v = v6;
                                                arr_v = arr_v1;
                                                o0 = o1;
                                                while(true) {
                                                    if(v1 == v) {
                                                        break;
                                                    }
                                                    ++v1;
                                                label_39:
                                                    long v7 = arr_v[v1];
                                                    if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                        continue;
                                                    }
                                                    o1 = o0;
                                                    v2 = 0;
                                                    arr_v1 = arr_v;
                                                    v3 = 8 - (~(v1 - v) >>> 0x1F);
                                                    v6 = v;
                                                    v5 = v1;
                                                    v4 = v7;
                                                    goto label_20;
                                                }
                                            }
                                            break;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }
                                    return S0.a;
                                }
                            });
                            this.b = -1;
                        }

                        @Override
                        public boolean hasNext() {
                            return this.a.hasNext();
                        }

                        @Override
                        public Object next() {
                            Object object0 = this.a.next();
                            int v = ((Number)object0).intValue();
                            this.b = v;
                            return this.c.c[v];
                        }

                        @Override
                        public void remove() {
                            int v = this.b;
                            if(v >= 0) {
                                this.c.o0(v);
                                this.b = -1;
                            }
                        }
                    };
                }

                @Override
                public boolean remove(Object object0) {
                    MutableScatterMap mutableScatterMap0 = this.a;
                    long[] arr_v = mutableScatterMap0.a;
                    int v = arr_v.length - 2;
                    if(v >= 0) {
                        int v1 = 0;
                        while(true) {
                            long v2 = arr_v[v1];
                            if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                                for(int v4 = 0; v4 < v3; ++v4) {
                                    if((0xFFL & v2) < 0x80L) {
                                        int v5 = (v1 << 3) + v4;
                                        if(L.g(mutableScatterMap0.c[v5], object0)) {
                                            mutableScatterMap0.o0(v5);
                                            return true;
                                        }
                                    }
                                    v2 >>= 8;
                                }
                                if(v3 == 8) {
                                    goto label_19;
                                }
                                break;
                            }
                        label_19:
                            if(v1 == v) {
                                break;
                            }
                            ++v1;
                        }
                    }
                    return false;
                }

                @Override
                public boolean removeAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    long[] arr_v = mutableScatterMap0.a;
                    int v = arr_v.length - 2;
                    if(v >= 0) {
                        boolean z = false;
                        for(int v1 = 0; true; ++v1) {
                            long v2 = arr_v[v1];
                            if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                                for(int v4 = 0; v4 < v3; ++v4) {
                                    if((0xFFL & v2) < 0x80L) {
                                        int v5 = (v1 << 3) + v4;
                                        if(u.W1(collection0, mutableScatterMap0.c[v5])) {
                                            mutableScatterMap0.o0(v5);
                                            z = true;
                                        }
                                    }
                                    v2 >>= 8;
                                }
                                if(v3 != 8) {
                                    return z;
                                }
                            }
                            if(v1 == v) {
                                break;
                            }
                        }
                        return z;
                    }
                    return false;
                }

                @Override
                public boolean retainAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    MutableScatterMap mutableScatterMap0 = this.a;
                    long[] arr_v = mutableScatterMap0.a;
                    int v = arr_v.length - 2;
                    if(v >= 0) {
                        boolean z = false;
                        for(int v1 = 0; true; ++v1) {
                            long v2 = arr_v[v1];
                            if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                                for(int v4 = 0; v4 < v3; ++v4) {
                                    if((0xFFL & v2) < 0x80L) {
                                        int v5 = (v1 << 3) + v4;
                                        if(!u.W1(collection0, mutableScatterMap0.c[v5])) {
                                            mutableScatterMap0.o0(v5);
                                            z = true;
                                        }
                                    }
                                    v2 >>= 8;
                                }
                                if(v3 != 8) {
                                    return z;
                                }
                            }
                            if(v1 == v) {
                                break;
                            }
                        }
                        return z;
                    }
                    return false;
                }

                @Override
                public final int size() {
                    return this.a();
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
            };
        }

        @Override  // androidx.collection.ScatterMap$MapWrapper
        @m
        public Object put(Object object0, Object object1) {
            return MutableScatterMap.this.e0(object0, object1);
        }

        @Override  // androidx.collection.ScatterMap$MapWrapper
        public void putAll(@l java.util.Map map0) {
            L.p(map0, "from");
            for(Object object0: map0.entrySet()) {
                this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            }
        }

        @Override  // androidx.collection.ScatterMap$MapWrapper
        @m
        public Object remove(Object object0) {
            return MutableScatterMap.this.k0(object0);
        }
    }

    private int f;

    public MutableScatterMap() {
        this(0, 1, null);
    }

    public MutableScatterMap(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.R(ScatterMapKt.z(v));
    }

    public MutableScatterMap(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    private final void I() {
        if(this.d > 8 && androidx.collection.b.a(((long)this.e) * 0x20L, ((long)this.d) * 25L) <= 0) {
            this.p0(this.d);
            return;
        }
        this.p0(ScatterMapKt.w(this.d));
    }

    @l
    public final java.util.Map J() {
        return new MutableMapWrapper(this);
    }

    public final void K() {
        this.e = 0;
        long[] arr_v = this.a;
        if(arr_v != ScatterMapKt.e) {
            kotlin.collections.l.U1(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this.d >> 3;
            this.a[v] |= 0xFFL << ((this.d & 7) << 3);
        }
        kotlin.collections.l.M1(this.c, null, 0, this.d);
        kotlin.collections.l.M1(this.b, null, 0, this.d);
        this.P();
    }

    public final Object L(Object object0, @l o o0) {
        L.p(o0, "computeBlock");
        int v = this.N(object0);
        Object object1 = o0.invoke(object0, (v >= 0 ? null : this.c[v]));
        if(v < 0) {
            this.b[~v] = object0;
            this.c[~v] = object1;
            return object1;
        }
        this.c[v] = object1;
        return object1;
    }

    private final int M(int v) {
        long v6;
        int v1 = this.d;
        int v2 = v & v1;
        int v3 = 0;
        while(true) {
            int v4 = (v2 & 7) << 3;
            long v5 = this.a[(v2 >> 3) + 1] << 0x40 - v4 & -((long)v4) >> 0x3F | this.a[v2 >> 3] >>> v4;
            v6 = v5 & ~v5 << 7 & 0x8080808080808080L;
            if(v6 != 0L) {
                break;
            }
            v3 += 8;
            v2 = v2 + v3 & v1;
        }
        return v2 + (Long.numberOfTrailingZeros(v6) >> 3) & v1;
    }

    @b0
    public final int N(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = v6 ^ ((long)(v1 & 0x7F)) * 0x101010101010101L;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = v3 + (Long.numberOfTrailingZeros(v8) >> 3) & v2;
                if(L.g(this.b[v9], object0)) {
                    return v9;
                }
            }
            if((~v6 << 6 & v6 & 0x8080808080808080L) != 0L) {
                int v10 = this.M(v1 >>> 7);
                if(this.f == 0 && (this.a[v10 >> 3] >> ((v10 & 7) << 3) & 0xFFL) != 0xFEL) {
                    this.I();
                    v10 = this.M(v1 >>> 7);
                }
                ++this.e;
                int v11 = this.f;
                long[] arr_v = this.a;
                long v12 = arr_v[v10 >> 3];
                int v13 = (v10 & 7) << 3;
                this.f = v11 - ((v12 >> v13 & 0xFFL) == 0x80L ? 1 : 0);
                arr_v[v10 >> 3] = v12 & ~(0xFFL << v13) | ((long)(v1 & 0x7F)) << v13;
                int v14 = (v10 - 7 & this.d) + (this.d & 7);
                int v15 = (v14 & 7) << 3;
                arr_v[v14 >> 3] = ~(0xFFL << v15) & arr_v[v14 >> 3] | ((long)(v1 & 0x7F)) << v15;
                return ~v10;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final Object O(Object object0, @l a a0) {
        L.p(a0, "defaultValue");
        Object object1 = this.p(object0);
        if(object1 == null) {
            object1 = a0.invoke();
            this.q0(object0, object1);
        }
        return object1;
    }

    private final void P() {
        this.f = ScatterMapKt.o(this.q()) - this.e;
    }

    private final void Q(int v) {
        long[] arr_v;
        if(v == 0) {
            arr_v = ScatterMapKt.e;
        }
        else {
            arr_v = new long[(v + 15 & -8) >> 3];
            kotlin.collections.l.U1(arr_v, 0x8080808080808080L, 0, 0, 6, null);
        }
        this.a = arr_v;
        arr_v[v >> 3] |= 0xFFL << ((v & 7) << 3);
        this.P();
    }

    private final void R(int v) {
        int v1 = v <= 0 ? 0 : Math.max(7, ScatterMapKt.x(v));
        this.d = v1;
        this.Q(v1);
        this.b = new Object[v1];
        this.c = new Object[v1];
    }

    public final void S(@l ObjectList objectList0) {
        L.p(objectList0, "keys");
        Object[] arr_object = objectList0.a;
        int v = objectList0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            this.k0(arr_object[v1]);
        }
    }

    public final void T(@l ScatterSet scatterSet0) {
        L.p(scatterSet0, "keys");
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
                            this.k0(arr_object[(v1 << 3) + v4]);
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

    public final void U(@l Iterable iterable0) {
        L.p(iterable0, "keys");
        for(Object object0: iterable0) {
            this.k0(object0);
        }
    }

    public final void V(Object object0) {
        this.k0(object0);
    }

    public final void W(@l kotlin.sequences.m m0) {
        L.p(m0, "keys");
        for(Object object0: m0) {
            this.k0(object0);
        }
    }

    public final void X(@l Object[] arr_object) {
        L.p(arr_object, "keys");
        for(int v = 0; v < arr_object.length; ++v) {
            this.k0(arr_object[v]);
        }
    }

    public final void Y(@l ScatterMap scatterMap0) {
        L.p(scatterMap0, "from");
        this.f0(scatterMap0);
    }

    public final void Z(@l Iterable iterable0) {
        L.p(iterable0, "pairs");
        this.g0(iterable0);
    }

    public final void a0(@l java.util.Map map0) {
        L.p(map0, "from");
        this.h0(map0);
    }

    public final void b0(@l V v0) {
        L.p(v0, "pair");
        this.q0(v0.e(), v0.f());
    }

    public final void c0(@l kotlin.sequences.m m0) {
        L.p(m0, "pairs");
        this.i0(m0);
    }

    public final void d0(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        this.j0(arr_v);
    }

    @m
    public final Object e0(Object object0, Object object1) {
        int v = this.N(object0);
        if(v < 0) {
            v = ~v;
        }
        Object[] arr_object = this.c;
        Object object2 = arr_object[v];
        this.b[v] = object0;
        arr_object[v] = object1;
        return object2;
    }

    public final void f0(@l ScatterMap scatterMap0) {
        L.p(scatterMap0, "from");
        Object[] arr_object = scatterMap0.b;
        Object[] arr_object1 = scatterMap0.c;
        long[] arr_v = scatterMap0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            this.q0(arr_object[v5], arr_object1[v5]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_19;
                    }
                    break;
                }
            label_19:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void g0(@l Iterable iterable0) {
        L.p(iterable0, "pairs");
        for(Object object0: iterable0) {
            this.q0(((V)object0).a(), ((V)object0).b());
        }
    }

    public final void h0(@l java.util.Map map0) {
        L.p(map0, "from");
        for(Object object0: map0.entrySet()) {
            this.q0(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    public final void i0(@l kotlin.sequences.m m0) {
        L.p(m0, "pairs");
        for(Object object0: m0) {
            this.q0(((V)object0).a(), ((V)object0).b());
        }
    }

    public final void j0(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            this.q0(v1.a(), v1.b());
        }
    }

    @m
    public final Object k0(Object object0) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this.d;
        for(int v4 = v2 >>> 7; true; v4 = v5 + v) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.a[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(L.g(this.b[v10], object0)) {
                    return v10 < 0 ? null : this.o0(v10);
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return null;
            }
            v += 8;
        }
    }

    public final boolean l0(Object object0, Object object1) {
        int v10;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(L.g(this.b[v9], object0)) {
                    v10 = v9;
                    goto label_18;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_22;
            }
            else {
                v10 = -1;
            }
        label_18:
            if(v10 >= 0 && L.g(this.c[v10], object1)) {
                this.o0(v10);
                return true;
            }
            return false;
        label_22:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    private final void m0() {
        long[] arr_v = this.a;
        int v = this.d;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = (v1 & 7) << 3;
            if((arr_v[v1 >> 3] >> v3 & 0xFFL) == 0xFEL) {
                long[] arr_v1 = this.a;
                arr_v1[v1 >> 3] = 0x80L << v3 | arr_v1[v1 >> 3] & ~(0xFFL << v3);
                int v4 = (v1 - 7 & this.d) + (this.d & 7);
                int v5 = (v4 & 7) << 3;
                arr_v1[v4 >> 3] = ~(0xFFL << v5) & arr_v1[v4 >> 3] | 0x80L << v5;
                ++v2;
            }
        }
        this.f += v2;
    }

    public final void n0(@l o o0) {
        L.p(o0, "predicate");
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(((Boolean)o0.invoke(this.b[v5], this.c[v5])).booleanValue()) {
                                this.o0(v5);
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_18;
                    }
                    break;
                }
            label_18:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @b0
    @m
    public final Object o0(int v) {
        --this.e;
        long[] arr_v = this.a;
        int v1 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v1) | 0xFEL << v1;
        int v2 = (v - 7 & this.d) + (this.d & 7);
        int v3 = (v2 & 7) << 3;
        arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~(0xFFL << v3) | 0xFEL << v3;
        this.b[v] = null;
        Object[] arr_object = this.c;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        return object0;
    }

    private final void p0(int v) {
        int v7;
        long[] arr_v = this.a;
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
        int v1 = this.d;
        this.R(v);
        Object[] arr_object2 = this.b;
        Object[] arr_object3 = this.c;
        for(int v2 = 0; v2 < v1; v2 = v7 + 1) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                Object object0 = arr_object[v2];
                int v3 = object0 == null ? 0 : object0.hashCode();
                int v4 = v3 * 0xCC9E2D51 ^ v3 * 0xCC9E2D51 << 16;
                int v5 = this.M(v4 >>> 7);
                long[] arr_v1 = this.a;
                int v6 = (v5 & 7) << 3;
                v7 = v2;
                arr_v1[v5 >> 3] = arr_v1[v5 >> 3] & ~(0xFFL << v6) | ((long)(v4 & 0x7F)) << v6;
                int v8 = (v5 - 7 & this.d) + (this.d & 7);
                int v9 = (v8 & 7) << 3;
                arr_v1[v8 >> 3] = arr_v1[v8 >> 3] & ~(0xFFL << v9) | ((long)(v4 & 0x7F)) << v9;
                arr_object2[v5] = object0;
                arr_object3[v5] = arr_object1[v7];
            }
            else {
                v7 = v2;
            }
        }
    }

    public final void q0(Object object0, Object object1) {
        int v = this.N(object0);
        if(v < 0) {
            v = ~v;
        }
        this.b[v] = object0;
        this.c[v] = object1;
    }

    public final int r0() {
        int v = this.d;
        int v1 = ScatterMapKt.x(ScatterMapKt.z(this.e));
        if(v1 < v) {
            this.p0(v1);
            return v - this.d;
        }
        return 0;
    }

    private final void s0(int v, long v1) {
        long[] arr_v = this.a;
        int v2 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v2) | v1 << v2;
        int v3 = (v - 7 & this.d) + (this.d & 7);
        int v4 = (v3 & 7) << 3;
        arr_v[v3 >> 3] = v1 << v4 | arr_v[v3 >> 3] & ~(0xFFL << v4);
    }
}

