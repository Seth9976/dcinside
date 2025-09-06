package androidx.collection;

import B3.g.a;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

final class MutableMapEntry implements a, Map.Entry {
    @l
    private final Object[] a;
    @l
    private final Object[] b;
    private final int c;

    public MutableMapEntry(@l Object[] arr_object, @l Object[] arr_object1, int v) {
        L.p(arr_object, "keys");
        L.p(arr_object1, "values");
        super();
        this.a = arr_object;
        this.b = arr_object1;
        this.c = v;
    }

    public final int a() {
        return this.c;
    }

    public static void b() {
    }

    @l
    public final Object[] c() {
        return this.a;
    }

    public static void d() {
    }

    @l
    public final Object[] f() {
        return this.b;
    }

    @Override
    public Object getKey() {
        return this.a[this.c];
    }

    @Override
    public Object getValue() {
        return this.b[this.c];
    }

    @Override
    public Object setValue(Object object0) {
        Object object1 = this.b[this.c];
        this.b[this.c] = object0;
        return object1;
    }
}

