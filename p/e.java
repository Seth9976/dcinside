package P;

import kotlin.jvm.internal.w;
import y4.m;

public final class e {
    @m
    private Object a;

    public e() {
        this(null, 1, null);
    }

    public e(@m Object object0) {
        this.a = object0;
    }

    public e(Object object0, int v, w w0) {
        if((v & 1) != 0) {
            object0 = null;
        }
        this(object0);
    }

    @m
    public final Object a() {
        return this.a;
    }

    @m
    public final Object b() {
        return this.a;
    }

    public final void c(@m Object object0) {
        this.a = object0;
    }

    public static void d(e e0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = null;
        }
        e0.c(object0);
    }

    public final void e(@m Object object0) {
        this.a = object0;
    }
}

