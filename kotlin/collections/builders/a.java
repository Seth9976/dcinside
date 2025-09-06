package kotlin.collections.builders;

import java.util.Map.Entry;
import kotlin.collections.h;
import kotlin.jvm.internal.L;
import y4.l;

public abstract class a extends h {
    public final boolean b(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        return this.c(map$Entry0);
    }

    public abstract boolean c(@l Map.Entry arg1);

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Map.Entry ? this.b(((Map.Entry)object0)) : false;
    }

    public boolean d(Map.Entry map$Entry0) {
        return super.remove(map$Entry0);
    }

    @Override
    public final boolean remove(Object object0) {
        return object0 instanceof Map.Entry ? this.d(((Map.Entry)object0)) : false;
    }
}

