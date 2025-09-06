package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n350#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
final class X implements W {
    @l
    private final Map a;
    @l
    private final Function1 b;

    public X(@l Map map0, @l Function1 function10) {
        L.p(map0, "map");
        L.p(function10, "default");
        super();
        this.a = map0;
        this.b = function10;
    }

    @l
    public Set a() {
        return this.n().entrySet();
    }

    @l
    public Set b() {
        return this.n().keySet();
    }

    public int c() {
        return this.n().size();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.n().containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.n().containsValue(object0);
    }

    @l
    public Collection d() {
        return this.n().values();
    }

    @Override
    public final Set entrySet() {
        return this.a();
    }

    @Override
    public boolean equals(@m Object object0) {
        return this.n().equals(object0);
    }

    @Override
    @m
    public Object get(Object object0) {
        return this.n().get(object0);
    }

    @Override  // kotlin.collections.W
    public Object h1(Object object0) {
        Map map0 = this.n();
        Object object1 = map0.get(object0);
        return object1 != null || map0.containsKey(object0) ? object1 : this.b.invoke(object0);
    }

    @Override
    public int hashCode() {
        return this.n().hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.n().isEmpty();
    }

    @Override
    public final Set keySet() {
        return this.b();
    }

    @Override  // kotlin.collections.W
    @l
    public Map n() {
        return this.a;
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
        return this.c();
    }

    @Override
    @l
    public String toString() {
        return this.n().toString();
    }

    @Override
    public final Collection values() {
        return this.d();
    }
}

