package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import B3.a;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPersistentHashMapContentIterators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentIterators.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
public class MapEntry implements a, Map.Entry {
    private final Object a;
    private final Object b;

    public MapEntry(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        Map.Entry map$Entry0 = object0 instanceof Map.Entry ? ((Map.Entry)object0) : null;
        return map$Entry0 != null && L.g(map$Entry0.getKey(), this.getKey()) && L.g(map$Entry0.getValue(), this.getValue());
    }

    @Override
    public Object getKey() {
        return this.a;
    }

    @Override
    public Object getValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        Object object0 = this.getKey();
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        Object object1 = this.getValue();
        if(object1 != null) {
            v = object1.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public Object setValue(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @l
    public String toString() {
        return this.getKey() + '=' + this.getValue();
    }
}

