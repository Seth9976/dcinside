package kotlinx.serialization;

import A3.o;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import kotlinx.serialization.internal.I0;
import kotlinx.serialization.internal.s0;
import kotlinx.serialization.modules.h;
import y4.l;
import y4.m;

public final class y {
    static final class a extends N implements o {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(2);
        }

        @m
        public final i a(@l d d0, @l List list0) {
            L.p(d0, "clazz");
            L.p(list0, "types");
            List list1 = z.q(h.a(), list0, true);
            L.m(list1);
            return z.d(d0, list0, list1);
        }

        @Override  // A3.o
        public Object invoke(Object object0, Object object1) {
            return this.a(((d)object0), ((List)object1));
        }
    }

    static final class b extends N implements o {
        public static final b e;

        static {
            b.e = new b();
        }

        b() {
            super(2);
        }

        @m
        public final i a(@l d d0, @l List list0) {
            L.p(d0, "clazz");
            L.p(list0, "types");
            List list1 = z.q(h.a(), list0, true);
            L.m(list1);
            i i0 = z.d(d0, list0, list1);
            if(i0 != null) {
                i i1 = P3.a.u(i0);
                return i1 == null ? null : i1;
            }
            return null;
        }

        @Override  // A3.o
        public Object invoke(Object object0, Object object1) {
            return this.a(((d)object0), ((List)object1));
        }
    }

    static final class c extends N implements Function1 {
        public static final c e;

        static {
            c.e = new c();
        }

        c() {
            super(1);
        }

        @m
        public final i a(@l d d0) {
            L.p(d0, "it");
            return z.m(d0);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.a(((d)object0));
        }
    }

    static final class kotlinx.serialization.y.d extends N implements Function1 {
        public static final kotlinx.serialization.y.d e;

        static {
            kotlinx.serialization.y.d.e = new kotlinx.serialization.y.d();
        }

        kotlinx.serialization.y.d() {
            super(1);
        }

        @m
        public final i a(@l d d0) {
            L.p(d0, "it");
            i i0 = z.m(d0);
            if(i0 != null) {
                i i1 = P3.a.u(i0);
                return i1 == null ? null : i1;
            }
            return null;
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.a(((d)object0));
        }
    }

    @l
    private static final I0 a;
    @l
    private static final I0 b;
    @l
    private static final s0 c;
    @l
    private static final s0 d;

    static {
        y.a = kotlinx.serialization.internal.o.a(c.e);
        y.b = kotlinx.serialization.internal.o.a(kotlinx.serialization.y.d.e);
        y.c = kotlinx.serialization.internal.o.b(a.e);
        y.d = kotlinx.serialization.internal.o.b(b.e);
    }

    @m
    public static final i a(@l d d0, boolean z) {
        L.p(d0, "clazz");
        if(!z) {
            i i0 = y.a.a(d0);
            return i0 == null ? null : i0;
        }
        return y.b.a(d0);
    }

    @l
    public static final Object b(@l d d0, @l List list0, boolean z) {
        L.p(d0, "clazz");
        L.p(list0, "types");
        return z ? y.d.a(d0, list0) : y.c.a(d0, list0);
    }

    private static void c() {
    }

    private static void d() {
    }

    private static void e() {
    }

    private static void f() {
    }
}

