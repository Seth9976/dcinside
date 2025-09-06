package kotlinx.coroutines.channels;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.E0;
import y4.l;
import y4.m;
import z3.f;
import z3.g;

@g
public final class p {
    public static final class a extends c {
        @m
        @f
        public final Throwable a;

        public a(@m Throwable throwable0) {
            this.a = throwable0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof a && L.g(this.a, ((a)object0).a);
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override  // kotlinx.coroutines.channels.p$c
        @l
        public String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    @E0
    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @E0
        @l
        public final Object a(@m Throwable throwable0) {
            return p.c(new a(throwable0));
        }

        @E0
        @l
        public final Object b() {
            return p.c;
        }

        @E0
        @l
        public final Object c(Object object0) {
            return p.c(object0);
        }
    }

    public static class c {
        @Override
        @l
        public String toString() {
            return "Failed";
        }
    }

    @m
    private final Object a;
    @l
    public static final b b;
    @l
    private static final c c;

    static {
        p.b = new b(null);
        p.c = new c();
    }

    @b0
    private p(Object object0) {
        this.a = object0;
    }

    public static final p b(Object object0) {
        return new p(object0);
    }

    @b0
    @l
    public static Object c(@m Object object0) [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static boolean d(Object object0, Object object1) {
        return object1 instanceof p ? L.g(object0, ((p)object1).o()) : false;
    }

    public static final boolean e(Object object0, Object object1) {
        return L.g(object0, object1);
    }

    @Override
    public boolean equals(Object object0) {
        return p.d(this.a, object0);
    }

    @m
    public static final Throwable f(Object object0) {
        a p$a0 = object0 instanceof a ? ((a)object0) : null;
        return p$a0 == null ? null : p$a0.a;
    }

    @b0
    public static void g() {
    }

    // 去混淆评级： 低(20)
    @m
    public static final Object h(Object object0) {
        return object0 instanceof c ? null : object0;
    }

    @Override
    public int hashCode() {
        return p.j(this.a);
    }

    public static final Object i(Object object0) {
        if(!(object0 instanceof c)) {
            return object0;
        }
        if(object0 instanceof a) {
            Throwable throwable0 = ((a)object0).a;
            if(throwable0 != null) {
                throw throwable0;
            }
        }
        throw new IllegalStateException(("Trying to call \'getOrThrow\' on a failed channel result: " + object0).toString());
    }

    public static int j(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public static final boolean k(Object object0) {
        return object0 instanceof a;
    }

    public static final boolean l(Object object0) {
        return object0 instanceof c;
    }

    public static final boolean m(Object object0) {
        return !(object0 instanceof c);
    }

    // 去混淆评级： 低(20)
    @l
    public static String n(Object object0) {
        return object0 instanceof a ? ((a)object0).toString() : "Value(" + object0 + ')';
    }

    public final Object o() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return p.n(this.a);
    }
}

