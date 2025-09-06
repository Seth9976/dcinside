package kotlin.reflect;

import kotlin.J;
import kotlin.b0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@h0(version = "1.1")
public final class u {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final u a(@l s s0) {
            L.p(s0, "type");
            return new u(v.b, s0);
        }

        @l
        @n
        public final u b(@l s s0) {
            L.p(s0, "type");
            return new u(v.c, s0);
        }

        @l
        public final u c() {
            return u.d;
        }

        @b0
        public static void d() {
        }

        @l
        @n
        public final u e(@l s s0) {
            L.p(s0, "type");
            return new u(v.a, s0);
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

    @m
    private final v a;
    @m
    private final s b;
    @l
    public static final a c;
    @l
    @f
    public static final u d;

    static {
        u.c = new a(null);
        u.d = new u(null, null);
    }

    public u(@m v v0, @m s s0) {
        this.a = v0;
        this.b = s0;
        if((v0 == null ? 1 : 0) != (s0 == null ? 1 : 0)) {
            throw new IllegalArgumentException((v0 == null ? "Star projection must have no type specified." : "The projection variance " + v0 + " requires type to be specified.").toString());
        }
    }

    @m
    public final v a() {
        return this.a;
    }

    @m
    public final s b() {
        return this.b;
    }

    @l
    @n
    public static final u c(@l s s0) {
        return u.c.a(s0);
    }

    @l
    public final u d(@m v v0, @m s s0) {
        return new u(v0, s0);
    }

    public static u e(u u0, v v0, s s0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v0 = u0.a;
        }
        if((v1 & 2) != 0) {
            s0 = u0.b;
        }
        return u0.d(v0, s0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        return this.a == ((u)object0).a ? L.g(this.b, ((u)object0).b) : false;
    }

    @l
    @n
    public static final u f(@l s s0) {
        return u.c.b(s0);
    }

    @m
    public final s g() {
        return this.b;
    }

    @m
    public final v h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        s s0 = this.b;
        if(s0 != null) {
            v = s0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @l
    @n
    public static final u i(@l s s0) {
        return u.c.e(s0);
    }

    @Override
    @l
    public String toString() {
        switch((this.a == null ? -1 : b.a[this.a.ordinal()])) {
            case -1: {
                return "*";
            }
            case 1: {
                return String.valueOf(this.b);
            }
            case 2: {
                return "in " + this.b;
            }
            case 3: {
                return "out " + this.b;
            }
            default: {
                throw new J();
            }
        }
    }
}

