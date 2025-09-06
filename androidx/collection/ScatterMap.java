package androidx.collection;

import A3.o;
import B3.a;
import androidx.collection.internal.ContainerHelpersKt;
import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.Map.-CC;
import j..util.Map;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.sequences.p;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@s0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n633#1:1851\n634#1:1855\n636#1,2:1857\n638#1,4:1860\n642#1:1867\n643#1:1871\n644#1:1873\n645#1,4:1876\n651#1:1881\n652#1,8:1883\n633#1:1891\n634#1:1895\n636#1,2:1897\n638#1,4:1900\n642#1:1907\n643#1:1911\n644#1:1913\n645#1,4:1916\n651#1:1921\n652#1,8:1923\n363#1,6:1933\n373#1,3:1940\n376#1,9:1944\n363#1,6:1953\n373#1,3:1960\n376#1,9:1964\n363#1,6:1973\n373#1,3:1980\n376#1,9:1984\n391#1,4:1993\n363#1,6:1997\n373#1,3:2004\n376#1,2:2008\n396#1,2:2010\n379#1,6:2012\n398#1:2018\n391#1,4:2019\n363#1,6:2023\n373#1,3:2030\n376#1,2:2034\n396#1,2:2036\n379#1,6:2038\n398#1:2044\n391#1,4:2045\n363#1,6:2049\n373#1,3:2056\n376#1,2:2060\n396#1,2:2062\n379#1,6:2064\n398#1:2070\n633#1:2071\n634#1:2075\n636#1,2:2077\n638#1,4:2080\n642#1:2087\n643#1:2091\n644#1:2093\n645#1,4:2096\n651#1:2101\n652#1,8:2103\n633#1:2111\n634#1:2115\n636#1,2:2117\n638#1,4:2120\n642#1:2127\n643#1:2131\n644#1:2133\n645#1,4:2136\n651#1:2141\n652#1,8:2143\n418#1,3:2151\n363#1,6:2154\n373#1,3:2161\n376#1,2:2165\n422#1,2:2167\n379#1,6:2169\n424#1:2175\n391#1,4:2176\n363#1,6:2180\n373#1,3:2187\n376#1,2:2191\n396#1,2:2193\n379#1,6:2195\n398#1:2201\n391#1,4:2202\n363#1,6:2206\n373#1,3:2213\n376#1,2:2217\n396#1,2:2219\n379#1,6:2221\n398#1:2227\n391#1,4:2228\n363#1,6:2232\n373#1,3:2239\n376#1,2:2243\n396#1,2:2245\n379#1,6:2247\n398#1:2253\n391#1,4:2254\n363#1,6:2258\n373#1,3:2265\n376#1,2:2269\n396#1,2:2271\n379#1,6:2273\n398#1:2279\n1605#2,3:1852\n1619#2:1856\n1615#2:1859\n1795#2,3:1864\n1809#2,3:1868\n1733#2:1872\n1721#2:1874\n1715#2:1875\n1728#2:1880\n1818#2:1882\n1605#2,3:1892\n1619#2:1896\n1615#2:1899\n1795#2,3:1904\n1809#2,3:1908\n1733#2:1912\n1721#2:1914\n1715#2:1915\n1728#2:1920\n1818#2:1922\n1826#2:1931\n1688#2:1932\n1826#2:1939\n1688#2:1943\n1826#2:1959\n1688#2:1963\n1826#2:1979\n1688#2:1983\n1826#2:2003\n1688#2:2007\n1826#2:2029\n1688#2:2033\n1826#2:2055\n1688#2:2059\n1605#2,3:2072\n1619#2:2076\n1615#2:2079\n1795#2,3:2084\n1809#2,3:2088\n1733#2:2092\n1721#2:2094\n1715#2:2095\n1728#2:2100\n1818#2:2102\n1605#2,3:2112\n1619#2:2116\n1615#2:2119\n1795#2,3:2124\n1809#2,3:2128\n1733#2:2132\n1721#2:2134\n1715#2:2135\n1728#2:2140\n1818#2:2142\n1826#2:2160\n1688#2:2164\n1826#2:2186\n1688#2:2190\n1826#2:2212\n1688#2:2216\n1826#2:2238\n1688#2:2242\n1826#2:2264\n1688#2:2268\n1661#2:2280\n1605#2,3:2281\n1619#2:2284\n1615#2:2285\n1795#2,3:2286\n1809#2,3:2289\n1733#2:2292\n1721#2:2293\n1715#2:2294\n1728#2:2295\n1818#2:2296\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n330#1:1851\n330#1:1855\n330#1:1857,2\n330#1:1860,4\n330#1:1867\n330#1:1871\n330#1:1873\n330#1:1876,4\n330#1:1881\n330#1:1883,8\n340#1:1891\n340#1:1895\n340#1:1897,2\n340#1:1900,4\n340#1:1907\n340#1:1911\n340#1:1913\n340#1:1916,4\n340#1:1921\n340#1:1923,8\n394#1:1933,6\n394#1:1940,3\n394#1:1944,9\n407#1:1953,6\n407#1:1960,3\n407#1:1964,9\n420#1:1973,6\n420#1:1980,3\n420#1:1984,9\n430#1:1993,4\n430#1:1997,6\n430#1:2004,3\n430#1:2008,2\n430#1:2010,2\n430#1:2012,6\n430#1:2018\n440#1:2019,4\n440#1:2023,6\n440#1:2030,3\n440#1:2034,2\n440#1:2036,2\n440#1:2038,6\n440#1:2044\n456#1:2045,4\n456#1:2049,6\n456#1:2056,3\n456#1:2060,2\n456#1:2062,2\n456#1:2064,6\n456#1:2070\n466#1:2071\n466#1:2075\n466#1:2077,2\n466#1:2080,4\n466#1:2087\n466#1:2091\n466#1:2093\n466#1:2096,4\n466#1:2101\n466#1:2103,8\n472#1:2111\n472#1:2115\n472#1:2117,2\n472#1:2120,4\n472#1:2127\n472#1:2131\n472#1:2133\n472#1:2136,4\n472#1:2141\n472#1:2143,8\n479#1:2151,3\n479#1:2154,6\n479#1:2161,3\n479#1:2165,2\n479#1:2167,2\n479#1:2169,6\n479#1:2175\n506#1:2176,4\n506#1:2180,6\n506#1:2187,3\n506#1:2191,2\n506#1:2193,2\n506#1:2195,6\n506#1:2201\n533#1:2202,4\n533#1:2206,6\n533#1:2213,3\n533#1:2217,2\n533#1:2219,2\n533#1:2221,6\n533#1:2227\n562#1:2228,4\n562#1:2232,6\n562#1:2239,3\n562#1:2243,2\n562#1:2245,2\n562#1:2247,6\n562#1:2253\n588#1:2254,4\n588#1:2258,6\n588#1:2265,3\n588#1:2269,2\n588#1:2271,2\n588#1:2273,6\n588#1:2279\n330#1:1852,3\n330#1:1856\n330#1:1859\n330#1:1864,3\n330#1:1868,3\n330#1:1872\n330#1:1874\n330#1:1875\n330#1:1880\n330#1:1882\n340#1:1892,3\n340#1:1896\n340#1:1899\n340#1:1904,3\n340#1:1908,3\n340#1:1912\n340#1:1914\n340#1:1915\n340#1:1920\n340#1:1922\n368#1:1931\n375#1:1932\n394#1:1939\n394#1:1943\n407#1:1959\n407#1:1963\n420#1:1979\n420#1:1983\n430#1:2003\n430#1:2007\n440#1:2029\n440#1:2033\n456#1:2055\n456#1:2059\n466#1:2072,3\n466#1:2076\n466#1:2079\n466#1:2084,3\n466#1:2088,3\n466#1:2092\n466#1:2094\n466#1:2095\n466#1:2100\n466#1:2102\n472#1:2112,3\n472#1:2116\n472#1:2119\n472#1:2124,3\n472#1:2128,3\n472#1:2132\n472#1:2134\n472#1:2135\n472#1:2140\n472#1:2142\n479#1:2160\n479#1:2164\n506#1:2186\n506#1:2190\n533#1:2212\n533#1:2216\n562#1:2238\n562#1:2242\n588#1:2264\n588#1:2268\n605#1:2280\n633#1:2281,3\n634#1:2284\n637#1:2285\n641#1:2286,3\n642#1:2289,3\n643#1:2292\n644#1:2293\n644#1:2294\n648#1:2295\n651#1:2296\n*E\n"})
public abstract class ScatterMap {
    public class MapWrapper implements a, Map, java.util.Map {
        final ScatterMap a;

        @l
        public Set a() {
            return new Object() {
                public boolean a(Map.Entry map$Entry0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean add(Object object0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean addAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean contains(Object object0) {
                    return object0 instanceof Map.Entry ? this.b(((Map.Entry)object0)) : false;
                }

                @Override
                public boolean containsAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    ScatterMap scatterMap0 = this.a;
                    if(!collection0.isEmpty()) {
                        for(Object object0: collection0) {
                            if(!L.g(scatterMap0.p(((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue())) {
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
                    return p.a(new o(null) {
                        Object l;
                        Object m;
                        int n;
                        int o;
                        int p;
                        int q;
                        long r;
                        int s;
                        private Object t;
                        final ScatterMap u;

                        {
                            this.u = scatterMap0;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                            return ((androidx.collection.ScatterMap.MapWrapper.entries.1.iterator.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.collection.ScatterMap.MapWrapper.entries.1.iterator.1(this.u, d0);
                            d1.t = object0;
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
                            ScatterMap scatterMap0;
                            kotlin.sequences.o o0;
                            Object object1 = b.l();
                            switch(this.s) {
                                case 0: {
                                    f0.n(object0);
                                    o0 = (kotlin.sequences.o)this.t;
                                    scatterMap0 = this.u;
                                    arr_v = scatterMap0.a;
                                    v = arr_v.length - 2;
                                    if(v >= 0) {
                                        v1 = 0;
                                        goto label_44;
                                    }
                                    break;
                                }
                                case 1: {
                                    int v2 = this.q;
                                    int v3 = this.p;
                                    long v4 = this.r;
                                    v1 = this.o;
                                    int v5 = this.n;
                                    long[] arr_v1 = (long[])this.m;
                                    ScatterMap scatterMap1 = (ScatterMap)this.l;
                                    kotlin.sequences.o o1 = (kotlin.sequences.o)this.t;
                                    f0.n(object0);
                                alab1:
                                    while(true) {
                                        while(true) {
                                            v4 >>= 8;
                                            ++v2;
                                        label_22:
                                            if(v2 >= v3) {
                                                break alab1;
                                            }
                                            if((0xFFL & v4) >= 0x80L) {
                                                break;
                                            }
                                            int v6 = (v1 << 3) + v2;
                                            MapEntry mapEntry0 = new MapEntry(scatterMap1.b[v6], scatterMap1.c[v6]);
                                            this.t = o1;
                                            this.l = scatterMap1;
                                            this.m = arr_v1;
                                            this.n = v5;
                                            this.o = v1;
                                            this.r = v4;
                                            this.p = v3;
                                            this.q = v2;
                                            this.s = 1;
                                            if(o1.a(mapEntry0, this) != object1) {
                                                break;
                                            }
                                            return object1;
                                        }
                                    }
                                    if(v3 == 8) {
                                        v = v5;
                                        arr_v = arr_v1;
                                        scatterMap0 = scatterMap1;
                                        o0 = o1;
                                        while(true) {
                                            if(v1 == v) {
                                                break;
                                            }
                                            ++v1;
                                        label_44:
                                            long v7 = arr_v[v1];
                                            if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                continue;
                                            }
                                            o1 = o0;
                                            v2 = 0;
                                            scatterMap1 = scatterMap0;
                                            v3 = 8 - (~(v1 - v) >>> 0x1F);
                                            arr_v1 = arr_v;
                                            v5 = v;
                                            v4 = v7;
                                            goto label_22;
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

        @l
        public Set b() {
            return new Object() {
                public int a() {
                    return this.a.e;
                }

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
                    return this.a.g(object0);
                }

                @Override
                public boolean containsAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    ScatterMap scatterMap0 = this.a;
                    if(!collection0.isEmpty()) {
                        for(Object object0: collection0) {
                            if(!scatterMap0.g(object0)) {
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
                    return p.a(new o(null) {
                        Object l;
                        Object m;
                        int n;
                        int o;
                        int p;
                        int q;
                        long r;
                        int s;
                        private Object t;
                        final ScatterMap u;

                        {
                            this.u = scatterMap0;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                            return ((androidx.collection.ScatterMap.MapWrapper.keys.1.iterator.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.collection.ScatterMap.MapWrapper.keys.1.iterator.1(this.u, d0);
                            d1.t = object0;
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
                            Object[] arr_object;
                            kotlin.sequences.o o0;
                            Object object1 = b.l();
                            switch(this.s) {
                                case 0: {
                                    f0.n(object0);
                                    o0 = (kotlin.sequences.o)this.t;
                                    arr_object = this.u.b;
                                    arr_v = this.u.a;
                                    v = arr_v.length - 2;
                                    if(v >= 0) {
                                        v1 = 0;
                                        goto label_42;
                                    }
                                    break;
                                }
                                case 1: {
                                    int v2 = this.q;
                                    int v3 = this.p;
                                    long v4 = this.r;
                                    v1 = this.o;
                                    int v5 = this.n;
                                    long[] arr_v1 = (long[])this.m;
                                    Object[] arr_object1 = (Object[])this.l;
                                    kotlin.sequences.o o1 = (kotlin.sequences.o)this.t;
                                    f0.n(object0);
                                alab1:
                                    while(true) {
                                        while(true) {
                                            v4 >>= 8;
                                            ++v2;
                                        label_22:
                                            if(v2 >= v3) {
                                                break alab1;
                                            }
                                            if((0xFFL & v4) >= 0x80L) {
                                                break;
                                            }
                                            this.t = o1;
                                            this.l = arr_object1;
                                            this.m = arr_v1;
                                            this.n = v5;
                                            this.o = v1;
                                            this.r = v4;
                                            this.p = v3;
                                            this.q = v2;
                                            this.s = 1;
                                            if(o1.a(arr_object1[(v1 << 3) + v2], this) != object1) {
                                                break;
                                            }
                                            return object1;
                                        }
                                    }
                                    if(v3 == 8) {
                                        v = v5;
                                        arr_v = arr_v1;
                                        arr_object = arr_object1;
                                        o0 = o1;
                                        while(true) {
                                            if(v1 == v) {
                                                break;
                                            }
                                            ++v1;
                                        label_42:
                                            long v6 = arr_v[v1];
                                            if((~v6 << 7 & v6 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                continue;
                                            }
                                            o1 = o0;
                                            v2 = 0;
                                            arr_v1 = arr_v;
                                            v5 = v;
                                            v3 = 8 - (~(v1 - v) >>> 0x1F);
                                            arr_object1 = arr_object;
                                            v4 = v6;
                                            goto label_22;
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

        public int c() {
            return ScatterMap.this.e;
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.Map
        public Object compute(Object object0, BiFunction biFunction0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.Map
        public Object computeIfAbsent(Object object0, Function function0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.Map
        public Object computeIfPresent(Object object0, BiFunction biFunction0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean containsKey(Object object0) {
            return ScatterMap.this.g(object0);
        }

        @Override
        public boolean containsValue(Object object0) {
            return ScatterMap.this.h(object0);
        }

        @l
        public Collection d() {
            return new Object() {
                public int a() {
                    return this.a.e;
                }

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
                    return this.a.h(object0);
                }

                @Override
                public boolean containsAll(@l Collection collection0) {
                    L.p(collection0, "elements");
                    ScatterMap scatterMap0 = this.a;
                    if(!collection0.isEmpty()) {
                        for(Object object0: collection0) {
                            if(!scatterMap0.h(object0)) {
                                return false;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    return true;
                }

                @Override  // j$.util.Collection
                public void forEach(Consumer consumer0) {
                    Iterable.-CC.$default$forEach(this, consumer0);
                }

                @Override
                public boolean isEmpty() {
                    return this.a.x();
                }

                @Override
                @l
                public Iterator iterator() {
                    return p.a(new o(null) {
                        Object l;
                        Object m;
                        int n;
                        int o;
                        int p;
                        int q;
                        long r;
                        int s;
                        private Object t;
                        final ScatterMap u;

                        {
                            this.u = scatterMap0;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                            return ((androidx.collection.ScatterMap.MapWrapper.values.1.iterator.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.collection.ScatterMap.MapWrapper.values.1.iterator.1(this.u, d0);
                            d1.t = object0;
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
                            Object[] arr_object;
                            kotlin.sequences.o o0;
                            Object object1 = b.l();
                            switch(this.s) {
                                case 0: {
                                    f0.n(object0);
                                    o0 = (kotlin.sequences.o)this.t;
                                    arr_object = this.u.c;
                                    arr_v = this.u.a;
                                    v = arr_v.length - 2;
                                    if(v >= 0) {
                                        v1 = 0;
                                        goto label_42;
                                    }
                                    break;
                                }
                                case 1: {
                                    int v2 = this.q;
                                    int v3 = this.p;
                                    long v4 = this.r;
                                    v1 = this.o;
                                    int v5 = this.n;
                                    long[] arr_v1 = (long[])this.m;
                                    Object[] arr_object1 = (Object[])this.l;
                                    kotlin.sequences.o o1 = (kotlin.sequences.o)this.t;
                                    f0.n(object0);
                                alab1:
                                    while(true) {
                                        while(true) {
                                            v4 >>= 8;
                                            ++v2;
                                        label_22:
                                            if(v2 >= v3) {
                                                break alab1;
                                            }
                                            if((0xFFL & v4) >= 0x80L) {
                                                break;
                                            }
                                            this.t = o1;
                                            this.l = arr_object1;
                                            this.m = arr_v1;
                                            this.n = v5;
                                            this.o = v1;
                                            this.r = v4;
                                            this.p = v3;
                                            this.q = v2;
                                            this.s = 1;
                                            if(o1.a(arr_object1[(v1 << 3) + v2], this) != object1) {
                                                break;
                                            }
                                            return object1;
                                        }
                                    }
                                    if(v3 == 8) {
                                        v = v5;
                                        arr_v = arr_v1;
                                        arr_object = arr_object1;
                                        o0 = o1;
                                        while(true) {
                                            if(v1 == v) {
                                                break;
                                            }
                                            ++v1;
                                        label_42:
                                            long v6 = arr_v[v1];
                                            if((~v6 << 7 & v6 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                continue;
                                            }
                                            o1 = o0;
                                            v2 = 0;
                                            arr_v1 = arr_v;
                                            v5 = v;
                                            v3 = 8 - (~(v1 - v) >>> 0x1F);
                                            arr_object1 = arr_object;
                                            v4 = v6;
                                            goto label_22;
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
                public boolean removeAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override  // j$.util.Collection
                public boolean removeIf(Predicate predicate0) {
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
            };
        }

        @Override
        public final Set entrySet() {
            return this.a();
        }

        @Override  // j$.util.Map
        public void forEach(BiConsumer biConsumer0) {
            Map.-CC.$default$forEach(this, biConsumer0);
        }

        @Override
        @m
        public Object get(Object object0) {
            return ScatterMap.this.p(object0);
        }

        @Override  // j$.util.Map
        public Object getOrDefault(Object object0, Object object1) {
            return Map.-CC.$default$getOrDefault(this, object0, object1);
        }

        @Override
        public boolean isEmpty() {
            return ScatterMap.this.x();
        }

        @Override
        public final Set keySet() {
            return this.b();
        }

        @Override  // j$.util.Map
        public Object merge(Object object0, Object object1, BiFunction biFunction0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object put(Object object0, Object object1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public void putAll(java.util.Map map0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.Map
        public Object putIfAbsent(Object object0, Object object1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object remove(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.Map
        public boolean remove(Object object0, Object object1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.Map
        public Object replace(Object object0, Object object1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.Map
        public boolean replace(Object object0, Object object1, Object object2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.Map
        public void replaceAll(BiFunction biFunction0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public final int size() {
            return this.c();
        }

        @Override
        public final Collection values() {
            return this.d();
        }
    }

    @l
    @f
    public long[] a;
    @l
    @f
    public Object[] b;
    @l
    @f
    public Object[] c;
    @f
    public int d;
    @f
    public int e;

    private ScatterMap() {
        this.a = ScatterMapKt.e;
        this.b = ContainerHelpersKt.c;
        this.c = ContainerHelpersKt.c;
    }

    public ScatterMap(w w0) {
    }

    @l
    @j
    public final String A(@l CharSequence charSequence0) {
        L.p(charSequence0, "separator");
        return ScatterMap.G(this, charSequence0, null, null, 0, null, null, 62, null);
    }

    @l
    @j
    public final String B(@l CharSequence charSequence0, @l CharSequence charSequence1) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        return ScatterMap.G(this, charSequence0, charSequence1, null, 0, null, null, 60, null);
    }

    @l
    @j
    public final String C(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return ScatterMap.G(this, charSequence0, charSequence1, charSequence2, 0, null, null, 56, null);
    }

    @l
    @j
    public final String D(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return ScatterMap.G(this, charSequence0, charSequence1, charSequence2, v, null, null, 0x30, null);
    }

    @l
    @j
    public final String E(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        return ScatterMap.G(this, charSequence0, charSequence1, charSequence2, v, charSequence3, null, 0x20, null);
    }

    @l
    @j
    public final String F(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m o o0) {
        Object[] arr_object5;
        Object[] arr_object4;
        Object[] arr_object3;
        Object[] arr_object2;
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
        long[] arr_v = this.a;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v[v2];
                int v5 = v2;
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_object4 = arr_object;
                    arr_object5 = arr_object1;
                    goto label_52;
                }
                int v6 = 8 - (~(v5 - v1) >>> 0x1F);
                int v7 = 0;
                while(v7 < v6) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v8 = (v5 << 3) + v7;
                        Object object0 = arr_object[v8];
                        arr_object2 = arr_object;
                        Object object1 = arr_object1[v8];
                        arr_object3 = arr_object1;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_60;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        if(o0 == null) {
                            stringBuilder0.append(object0);
                            stringBuilder0.append('=');
                            stringBuilder0.append(object1);
                        }
                        else {
                            stringBuilder0.append(((CharSequence)o0.invoke(object0, object1)));
                        }
                        ++v3;
                    }
                    else {
                        arr_object2 = arr_object;
                        arr_object3 = arr_object1;
                    }
                    v4 >>= 8;
                    ++v7;
                    arr_object1 = arr_object3;
                    arr_object = arr_object2;
                }
                arr_object4 = arr_object;
                arr_object5 = arr_object1;
                if(v6 == 8) {
                label_52:
                    if(v5 != v1) {
                        v2 = v5 + 1;
                        arr_object1 = arr_object5;
                        arr_object = arr_object4;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_60;
            }
        }
        stringBuilder0.append(charSequence2);
    label_60:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String G(ScatterMap scatterMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, o o0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            o0 = null;
        }
        return scatterMap0.F(charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, o0);
    }

    public final boolean H() {
        return this.e == 0;
    }

    public final boolean a(@l o o0) {
        L.p(o0, "predicate");
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
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
                            if(!((Boolean)o0.invoke(arr_object[v5], arr_object1[v5])).booleanValue()) {
                                return false;
                            }
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
        return true;
    }

    public final boolean b() {
        return this.e != 0;
    }

    public final boolean c(@l o o0) {
        L.p(o0, "predicate");
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
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
                            if(((Boolean)o0.invoke(arr_object[v5], arr_object1[v5])).booleanValue()) {
                                return true;
                            }
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
        return false;
    }

    @l
    public final String d() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('{');
        stringBuilder0.append("metadata=[");
        int v = this.q();
        for(int v2 = 0; v2 < v; ++v2) {
            long v3 = this.a[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL;
            if(v3 == 0x80L) {
                stringBuilder0.append("Empty");
            }
            else if(v3 == 0xFEL) {
                stringBuilder0.append("Deleted");
            }
            else {
                stringBuilder0.append(v3);
            }
            stringBuilder0.append(", ");
        }
        stringBuilder0.append("], ");
        stringBuilder0.append("keys=[");
        for(int v4 = 0; v4 < this.b.length; ++v4) {
            stringBuilder0.append(this.b[v4]);
            stringBuilder0.append(", ");
        }
        stringBuilder0.append("], ");
        stringBuilder0.append("values=[");
        for(int v1 = 0; v1 < this.c.length; ++v1) {
            stringBuilder0.append(this.c[v1]);
            stringBuilder0.append(", ");
        }
        stringBuilder0.append("]");
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    public final java.util.Map e() {
        return new MapWrapper(this);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ScatterMap)) {
            return false;
        }
        if(((ScatterMap)object0).v() != this.v()) {
            return false;
        }
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
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
                            Object object1 = arr_object[v5];
                            Object object2 = arr_object1[v5];
                            if(object2 == null) {
                                if(((ScatterMap)object0).p(object1) != null || !((ScatterMap)object0).g(object1)) {
                                    return false;
                                }
                            }
                            else if(!L.g(object2, ((ScatterMap)object0).p(object1))) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_30;
                    }
                    break;
                }
            label_30:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final boolean f(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(L.g(this.b[v9], object0)) {
                    return v9 >= 0;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean g(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(L.g(this.b[v9], object0)) {
                    return v9 >= 0;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean h(Object object0) {
        Object[] arr_object = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L && L.g(object0, arr_object[(v1 << 3) + v4])) {
                            return true;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_16;
                    }
                    break;
                }
            label_16:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            Object object0 = arr_object[v6];
                            Object object1 = arr_object1[v6];
                            v2 += (object1 == null ? 0 : object1.hashCode()) ^ (object0 == null ? 0 : object0.hashCode());
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    public final int i() {
        return this.v();
    }

    public final int j(@l o o0) {
        L.p(o0, "predicate");
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            if(((Boolean)o0.invoke(arr_object[v6], arr_object1[v6])).booleanValue()) {
                                ++v2;
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    public final int k(Object object0) {
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
                    return v10;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v += 8;
        }
    }

    public final void l(@l o o0) {
        L.p(o0, "block");
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
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
                            o0.invoke(arr_object[v5], arr_object1[v5]);
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

    @b0
    public final void m(@l Function1 function10) {
        L.p(function10, "block");
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            function10.invoke(((int)((v1 << 3) + v4)));
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    public final void n(@l Function1 function10) {
        L.p(function10, "block");
        Object[] arr_object = this.b;
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
                            function10.invoke(arr_object[(v1 << 3) + v4]);
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

    public final void o(@l Function1 function10) {
        L.p(function10, "block");
        Object[] arr_object = this.c;
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
                            function10.invoke(arr_object[(v1 << 3) + v4]);
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

    @m
    public final Object p(Object object0) {
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
                    return v10 < 0 ? null : this.c[v10];
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                throw new ArrayIndexOutOfBoundsException(-1);
            }
            v += 8;
        }
    }

    public final int q() {
        return this.d;
    }

    @b0
    public static void r() {
    }

    @b0
    public static void s() {
    }

    public final Object t(Object object0, Object object1) {
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
                    return v10 < 0 ? object1 : this.c[v10];
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                throw new ArrayIndexOutOfBoundsException(-1);
            }
            v += 8;
        }
    }

    @Override
    @l
    public String toString() {
        if(this.x()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('{');
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            String s = arr_object[v6];
                            String s1 = arr_object1[v6];
                            if(s == this) {
                                s = "(this)";
                            }
                            stringBuilder0.append(s);
                            stringBuilder0.append("=");
                            if(s1 == this) {
                                s1 = "(this)";
                            }
                            stringBuilder0.append(s1);
                            ++v2;
                            if(v2 < this.e) {
                                stringBuilder0.append(',');
                                stringBuilder0.append(' ');
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_35;
                    }
                    break;
                }
            label_35:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        stringBuilder0.append('}');
        String s2 = stringBuilder0.toString();
        L.o(s2, "s.append(\'}\').toString()");
        return s2;
    }

    public final Object u(Object object0, @l A3.a a0) {
        L.p(a0, "defaultValue");
        Object object1 = this.p(object0);
        return object1 == null ? a0.invoke() : object1;
    }

    public final int v() {
        return this.e;
    }

    @b0
    public static void w() {
    }

    public final boolean x() {
        return this.e == 0;
    }

    public final boolean y() {
        return this.e != 0;
    }

    @l
    @j
    public final String z() {
        return ScatterMap.G(this, null, null, null, 0, null, null, 0x3F, null);
    }
}

