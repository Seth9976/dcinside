package kotlin.collections;

import B3.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@h0(version = "1.1")
@s0({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1755#2,3:154\n1734#2,3:157\n295#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
public abstract class d implements a, Map {
    @s0({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class kotlin.collections.d.a {
        private kotlin.collections.d.a() {
        }

        public kotlin.collections.d.a(w w0) {
        }

        public final boolean a(@l Map.Entry map$Entry0, @m Object object0) {
            L.p(map$Entry0, "e");
            return object0 instanceof Map.Entry ? L.g(map$Entry0.getKey(), ((Map.Entry)object0).getKey()) && L.g(map$Entry0.getValue(), ((Map.Entry)object0).getValue()) : false;
        }

        public final int b(@l Map.Entry map$Entry0) {
            L.p(map$Entry0, "e");
            Object object0 = map$Entry0.getKey();
            int v = 0;
            int v1 = object0 == null ? 0 : object0.hashCode();
            Object object1 = map$Entry0.getValue();
            if(object1 != null) {
                v = object1.hashCode();
            }
            return v1 ^ v;
        }

        @l
        public final String c(@l Map.Entry map$Entry0) {
            L.p(map$Entry0, "e");
            return map$Entry0.getKey() + '=' + map$Entry0.getValue();
        }
    }

    @m
    private volatile Set a;
    @m
    private volatile Collection b;
    @l
    public static final kotlin.collections.d.a c;

    static {
        d.c = new kotlin.collections.d.a(null);
    }

    public final boolean b(@m Map.Entry map$Entry0) {
        if(map$Entry0 == null) {
            return false;
        }
        Object object0 = map$Entry0.getKey();
        Object object1 = map$Entry0.getValue();
        L.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object object2 = this.get(object0);
        if(!L.g(object1, object2)) {
            return false;
        }
        if(object2 == null) {
            L.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
            return this.containsKey(object0);
        }
        return true;
    }

    public abstract Set c();

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.h(object0) != null;
    }

    @Override
    public boolean containsValue(Object object0) {
        Set set0 = this.entrySet();
        if(!(set0 instanceof Collection) || !set0.isEmpty()) {
            for(Object object1: set0) {
                if(L.g(((Map.Entry)object1).getValue(), object0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @l
    public Set d() {
        public static final class b extends i {
            final d b;

            b(d d0) {
                this.b = d0;
                super();
            }

            @Override  // kotlin.collections.a
            public int a() {
                return this.b.size();
            }

            @Override  // kotlin.collections.a
            public boolean contains(Object object0) {
                return this.b.containsKey(object0);
            }

            @Override  // kotlin.collections.i
            public Iterator iterator() {
                public static final class kotlin.collections.d.b.a implements a, Iterator {
                    final Iterator a;

                    kotlin.collections.d.b.a(Iterator iterator0) {
                        this.a = iterator0;
                        super();
                    }

                    @Override
                    public boolean hasNext() {
                        return this.a.hasNext();
                    }

                    @Override
                    public Object next() {
                        Object object0 = this.a.next();
                        return ((Map.Entry)object0).getKey();
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                return new kotlin.collections.d.b.a(this.b.entrySet().iterator());
            }
        }

        if(this.a == null) {
            this.a = new b(this);
        }
        Set set0 = this.a;
        L.m(set0);
        return set0;
    }

    @Override
    public final Set entrySet() {
        return this.c();
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Map)) {
            return false;
        }
        if(this.size() != ((Map)object0).size()) {
            return false;
        }
        Set set0 = ((Map)object0).entrySet();
        if(!(set0 instanceof Collection) || !set0.isEmpty()) {
            for(Object object1: set0) {
                if(!this.b(((Map.Entry)object1))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public int f() {
        return this.entrySet().size();
    }

    @l
    public Collection g() {
        public static final class kotlin.collections.d.d extends kotlin.collections.a {
            final d a;

            kotlin.collections.d.d(d d0) {
                this.a = d0;
                super();
            }

            @Override  // kotlin.collections.a
            public int a() {
                return this.a.size();
            }

            @Override  // kotlin.collections.a
            public boolean contains(Object object0) {
                return this.a.containsValue(object0);
            }

            @Override  // kotlin.collections.a
            public Iterator iterator() {
                public static final class kotlin.collections.d.d.a implements a, Iterator {
                    final Iterator a;

                    kotlin.collections.d.d.a(Iterator iterator0) {
                        this.a = iterator0;
                        super();
                    }

                    @Override
                    public boolean hasNext() {
                        return this.a.hasNext();
                    }

                    @Override
                    public Object next() {
                        Object object0 = this.a.next();
                        return ((Map.Entry)object0).getValue();
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                return new kotlin.collections.d.d.a(this.a.entrySet().iterator());
            }
        }

        if(this.b == null) {
            this.b = new kotlin.collections.d.d(this);
        }
        Collection collection0 = this.b;
        L.m(collection0);
        return collection0;
    }

    @Override
    @m
    public Object get(Object object0) {
        Map.Entry map$Entry0 = this.h(object0);
        return map$Entry0 == null ? null : map$Entry0.getValue();
    }

    private final Map.Entry h(Object object0) {
        for(Object object1: this.entrySet()) {
            if(L.g(((Map.Entry)object1).getKey(), object0)) {
                return (Map.Entry)object1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return this.entrySet().hashCode();
    }

    private final String i(Object object0) {
        return object0 == this ? "(this Map)" : String.valueOf(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    private final String j(Map.Entry map$Entry0) {
        return this.i(map$Entry0.getKey()) + '=' + this.i(map$Entry0.getValue());
    }

    @Override
    public final Set keySet() {
        return this.d();
    }

    @Override
    public Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map map0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.f();
    }

    @Override
    @l
    public String toString() {
        static final class c extends N implements Function1 {
            final d e;

            c(d d0) {
                this.e = d0;
                super(1);
            }

            public final CharSequence a(Map.Entry map$Entry0) {
                L.p(map$Entry0, "it");
                return this.e.j(map$Entry0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Map.Entry)object0));
            }
        }

        return u.m3(this.entrySet(), ", ", "{", "}", 0, null, new c(this), 24, null);
    }

    @Override
    public final Collection values() {
        return this.g();
    }
}

