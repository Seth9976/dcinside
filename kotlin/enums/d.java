package kotlin.enums;

import java.io.Serializable;
import kotlin.collections.c;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

@h0(version = "1.8")
final class d extends c implements Serializable, a {
    @l
    private final Enum[] c;

    public d(@l Enum[] arr_enum) {
        L.p(arr_enum, "entries");
        super();
        this.c = arr_enum;
    }

    @Override  // kotlin.collections.c
    public int a() {
        return this.c.length;
    }

    public boolean b(@l Enum enum0) {
        L.p(enum0, "element");
        return ((Enum)kotlin.collections.l.Pe(this.c, enum0.ordinal())) == enum0;
    }

    @l
    public Enum c(int v) {
        c.a.b(v, this.c.length);
        return this.c[v];
    }

    @Override  // kotlin.collections.a
    public final boolean contains(Object object0) {
        return object0 instanceof Enum ? this.b(((Enum)object0)) : false;
    }

    public int d(@l Enum enum0) {
        L.p(enum0, "element");
        int v = enum0.ordinal();
        return ((Enum)kotlin.collections.l.Pe(this.c, v)) == enum0 ? v : -1;
    }

    public int g(@l Enum enum0) {
        L.p(enum0, "element");
        return this.indexOf(enum0);
    }

    @Override  // kotlin.collections.c
    public Object get(int v) {
        return this.c(v);
    }

    private final Object h() {
        return new e(this.c);
    }

    @Override  // kotlin.collections.c
    public final int indexOf(Object object0) {
        return object0 instanceof Enum ? this.d(((Enum)object0)) : -1;
    }

    @Override  // kotlin.collections.c
    public final int lastIndexOf(Object object0) {
        return object0 instanceof Enum ? this.g(((Enum)object0)) : -1;
    }
}

