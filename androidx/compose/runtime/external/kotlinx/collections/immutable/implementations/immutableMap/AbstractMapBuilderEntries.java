package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map.Entry;
import kotlin.collections.h;
import kotlin.jvm.internal.L;
import y4.l;

public abstract class AbstractMapBuilderEntries extends h {
    public final boolean b(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        return (map$Entry0 instanceof Object ? map$Entry0 : null) instanceof Map.Entry ? this.c(map$Entry0) : false;
    }

    public abstract boolean c(@l Map.Entry arg1);

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Map.Entry ? this.b(((Map.Entry)object0)) : false;
    }

    public final boolean d(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        return (map$Entry0 instanceof Object ? map$Entry0 : null) instanceof Map.Entry ? this.g(map$Entry0) : false;
    }

    public abstract boolean g(@l Map.Entry arg1);

    @Override
    public final boolean remove(Object object0) {
        return object0 instanceof Map.Entry ? this.d(((Map.Entry)object0)) : false;
    }
}

