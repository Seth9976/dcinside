package com.dcinside.app.rx.bus;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class q0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final int a;
    @l
    private final Object[] b;
    @l
    public static final a c = null;
    public static final int d = 1;
    public static final int e = 2;

    static {
        q0.c = new a(null);
    }

    public q0(int v, @l Object[] arr_object) {
        L.p(arr_object, "args");
        super();
        this.a = v;
        this.b = arr_object;
    }

    @l
    public final Object[] a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }
}

