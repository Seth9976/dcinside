package kotlin.jvm.internal;

import java.util.List;
import kotlin.J;
import kotlin.h0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.d;
import kotlin.reflect.g;
import kotlin.reflect.s;
import kotlin.reflect.u;
import kotlin.reflect.v;
import y4.l;
import y4.m;

@h0(version = "1.4")
public final class x0 implements s {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[v.values().length];
            try {
                arr_v[v.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[v.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[v.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @l
    private final g a;
    @l
    private final List b;
    @m
    private final s c;
    private final int d;
    @l
    public static final a e = null;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;

    static {
        x0.e = new a(null);
    }

    @h0(version = "1.6")
    public x0(@l g g0, @l List list0, @m s s0, int v) {
        L.p(g0, "classifier");
        L.p(list0, "arguments");
        super();
        this.a = g0;
        this.b = list0;
        this.c = s0;
        this.d = v;
    }

    public x0(@l g g0, @l List list0, boolean z) {
        L.p(g0, "classifier");
        L.p(list0, "arguments");
        this(g0, list0, null, ((int)z));
    }

    @h0(version = "1.6")
    public static void A() {
    }

    @Override  // kotlin.reflect.s
    @l
    public List c() {
        return this.b;
    }

    private final String e(u u0) {
        String s1;
        if(u0.h() == null) {
            return "*";
        }
        s s0 = u0.g();
        x0 x00 = s0 instanceof x0 ? ((x0)s0) : null;
        if(x00 == null) {
            s1 = String.valueOf(u0.g());
        }
        else {
            s1 = x00.q(true);
            if(s1 == null) {
                s1 = String.valueOf(u0.g());
            }
        }
        switch(u0.h()) {
            case 1: {
                return s1;
            }
            case 2: {
                return "in " + s1;
            }
            case 3: {
                return "out " + s1;
            }
            default: {
                throw new J();
            }
        }
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof x0 && L.g(this.p(), ((x0)object0).p()) && L.g(this.c(), ((x0)object0).c()) && L.g(this.c, ((x0)object0).c) && this.d == ((x0)object0).d;
    }

    @Override  // kotlin.reflect.b
    @l
    public List getAnnotations() {
        return kotlin.collections.u.H();
    }

    @Override
    public int hashCode() {
        return (this.p().hashCode() * 0x1F + this.c().hashCode()) * 0x1F + this.d;
    }

    @Override  // kotlin.reflect.s
    public boolean k() {
        return (this.d & 1) != 0;
    }

    @Override  // kotlin.reflect.s
    @l
    public g p() {
        return this.a;
    }

    private final String q(boolean z) {
        static final class c extends N implements Function1 {
            final x0 e;

            c(x0 x00) {
                this.e = x00;
                super(1);
            }

            public final CharSequence a(u u0) {
                L.p(u0, "it");
                return this.e.e(u0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((u)object0));
            }
        }

        String s;
        g g0 = this.p();
        Class class0 = null;
        d d0 = g0 instanceof d ? ((d)g0) : null;
        if(d0 != null) {
            class0 = z3.b.e(d0);
        }
        if(class0 == null) {
            s = this.p().toString();
        }
        else if((this.d & 4) != 0) {
            s = "kotlin.Nothing";
        }
        else if(class0.isArray()) {
            s = this.t(class0);
        }
        else if(!z || !class0.isPrimitive()) {
            s = class0.getName();
        }
        else {
            g g1 = this.p();
            L.n(g1, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            s = z3.b.g(((d)g1)).getName();
        }
        String s1 = "";
        String s2 = this.c().isEmpty() ? "" : kotlin.collections.u.m3(this.c(), ", ", "<", ">", 0, null, new c(this), 24, null);
        if(this.k()) {
            s1 = "?";
        }
        String s3 = s + s2 + s1;
        s s4 = this.c;
        if(s4 instanceof x0) {
            String s5 = ((x0)s4).q(true);
            if(!L.g(s5, s3)) {
                return L.g(s5, s3 + '?') ? s3 + '!' : '(' + s3 + ".." + s5 + ')';
            }
        }
        return s3;
    }

    private final String t(Class class0) {
        if(L.g(class0, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if(L.g(class0, char[].class)) {
            return "kotlin.CharArray";
        }
        if(L.g(class0, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if(L.g(class0, short[].class)) {
            return "kotlin.ShortArray";
        }
        if(L.g(class0, int[].class)) {
            return "kotlin.IntArray";
        }
        if(L.g(class0, float[].class)) {
            return "kotlin.FloatArray";
        }
        if(L.g(class0, long[].class)) {
            return "kotlin.LongArray";
        }
        return L.g(class0, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override
    @l
    public String toString() {
        return this.q(false) + " (Kotlin reflection is not available)";
    }

    public final int v() {
        return this.d;
    }

    @h0(version = "1.6")
    public static void y() {
    }

    @m
    public final s z() {
        return this.c;
    }
}

