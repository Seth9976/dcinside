package kotlinx.serialization.json;

import B3.a;
import j..util.Map.-CC;
import j..util.Map;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.serialization.i;
import kotlinx.serialization.json.internal.j0;
import kotlinx.serialization.u;
import y4.m;

@u(with = A.class)
public final class y extends l implements a, Map, java.util.Map {
    public static final class kotlinx.serialization.json.y.a {
        private kotlinx.serialization.json.y.a() {
        }

        public kotlinx.serialization.json.y.a(w w0) {
        }

        @y4.l
        public final i a() {
            return A.a;
        }
    }

    @y4.l
    private final java.util.Map b;
    @y4.l
    public static final kotlinx.serialization.json.y.a c;

    static {
        y.c = new kotlinx.serialization.json.y.a(null);
    }

    public y(@y4.l java.util.Map map0) {
        L.p(map0, "content");
        super(null);
        this.b = map0;
    }

    public l a(String s, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public l b(String s, Function function0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public l c(String s, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final boolean containsKey(Object object0) {
        return object0 instanceof String ? this.d(((String)object0)) : false;
    }

    @Override
    public final boolean containsValue(Object object0) {
        return object0 instanceof l ? this.g(((l)object0)) : false;
    }

    public boolean d(@y4.l String s) {
        L.p(s, "key");
        return this.b.containsKey(s);
    }

    @Override
    public final Set entrySet() {
        return this.j();
    }

    @Override
    public boolean equals(@m Object object0) {
        return L.g(this.b, object0);
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    public boolean g(@y4.l l l0) {
        L.p(l0, "value");
        return this.b.containsValue(l0);
    }

    @Override
    public final Object get(Object object0) {
        return !(object0 instanceof String) ? null : this.i(((String)object0));
    }

    @Override  // j$.util.Map
    public Object getOrDefault(Object object0, Object object1) {
        return Map.-CC.$default$getOrDefault(this, object0, object1);
    }

    public final l h(Object object0) {
        return object0 instanceof String ? this.i(((String)object0)) : null;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @m
    public l i(@y4.l String s) {
        L.p(s, "key");
        return (l)this.b.get(s);
    }

    @Override
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @y4.l
    public Set j() {
        return this.b.entrySet();
    }

    @Override
    public final Set keySet() {
        return this.l();
    }

    @y4.l
    public Set l() {
        return this.b.keySet();
    }

    public int m() {
        return this.b.size();
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @y4.l
    public Collection o() {
        return this.b.values();
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

    public l q(String s, l l0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public l r(String s, l l0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(Object object0) {
        return this.u(object0);
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
        return this.m();
    }

    public l t(String s, l l0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @y4.l
    public String toString() {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @y4.l
            public final CharSequence a(@y4.l Map.Entry map$Entry0) {
                L.p(map$Entry0, "<name for destructuring parameter 0>");
                String s = (String)map$Entry0.getKey();
                l l0 = (l)map$Entry0.getValue();
                StringBuilder stringBuilder0 = new StringBuilder();
                j0.e(stringBuilder0, s);
                stringBuilder0.append(':');
                stringBuilder0.append(l0);
                CharSequence charSequence0 = stringBuilder0.toString();
                L.o(charSequence0, "StringBuilder().apply(builderAction).toString()");
                return charSequence0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Map.Entry)object0));
            }
        }

        return kotlin.collections.u.m3(this.b.entrySet(), ",", "{", "}", 0, null, b.e, 24, null);
    }

    public l u(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public l v(String s, l l0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Collection values() {
        return this.o();
    }

    public boolean x(String s, l l0, l l1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

