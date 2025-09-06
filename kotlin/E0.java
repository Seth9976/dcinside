package kotlin;

import java.io.Serializable;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.g;
import z3.i;

@h0(version = "1.3")
@g
public final class e0 implements Serializable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @f
        @i(name = "failure")
        private final Object a(Throwable throwable0) {
            L.p(throwable0, "exception");
            return e0.b(f0.a(throwable0));
        }

        @f
        @i(name = "success")
        private final Object b(Object object0) {
            return object0;
        }
    }

    public static final class b implements Serializable {
        @l
        @z3.f
        public final Throwable a;

        public b(@l Throwable throwable0) {
            L.p(throwable0, "exception");
            super();
            this.a = throwable0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof b && L.g(this.a, ((b)object0).a);
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Failure(" + this.a + ')';
        }
    }

    @m
    private final Object a;
    @l
    public static final a b;

    static {
        e0.b = new a(null);
    }

    @b0
    private e0(Object object0) {
        this.a = object0;
    }

    public static final e0 a(Object object0) {
        return new e0(object0);
    }

    @b0
    @l
    public static Object b(@m Object object0) [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static boolean c(Object object0, Object object1) {
        return object1 instanceof e0 ? L.g(object0, ((e0)object1).l()) : false;
    }

    public static final boolean d(Object object0, Object object1) {
        return L.g(object0, object1);
    }

    // 去混淆评级： 低(20)
    @m
    public static final Throwable e(Object object0) {
        return object0 instanceof b ? ((b)object0).a : null;
    }

    @Override
    public boolean equals(Object object0) {
        return e0.c(this.a, object0);
    }

    // 去混淆评级： 低(20)
    @f
    private static final Object f(Object object0) {
        return e0.i(object0) ? null : object0;
    }

    @b0
    public static void g() {
    }

    public static int h(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    @Override
    public int hashCode() {
        return e0.h(this.a);
    }

    public static final boolean i(Object object0) {
        return object0 instanceof b;
    }

    public static final boolean j(Object object0) {
        return !(object0 instanceof b);
    }

    // 去混淆评级： 低(20)
    @l
    public static String k(Object object0) {
        return object0 instanceof b ? object0.toString() : "Success(" + object0 + ')';
    }

    public final Object l() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return e0.k(this.a);
    }
}

