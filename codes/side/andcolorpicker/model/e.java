package codes.side.andcolorpicker.model;

import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.random.f;
import y4.l;
import y4.m;

public final class e extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final e a(boolean z) {
            e e0 = new e();
            e0.a(new int[]{f.a.n(b.d.d(), b.d.c()), (z ? b.e.a() : f.a.n(b.e.d(), b.e.c())), (z ? b.f.a() : f.a.n(b.f.d(), b.f.c()))});
            return e0;
        }

        public static e b(a e$a0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            return e$a0.a(z);
        }
    }

    public static enum b {
        H(0, 0, 360),
        S(100, 0, 100),
        L(50, 0, 100),
        A(0xFF, 0, 0xFF);

        private final int a;
        private final int b;
        private final int c;

        private b(int v1, int v2, int v3) {
            this.a = v1;
            this.b = v2;
            this.c = v3;
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.ordinal();
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public final float e() {
            return ((float)this.a) / ((float)this.c);
        }
    }

    @l
    private final codes.side.andcolorpicker.model.b d;
    private static final String e = "IntegerHSLColor";
    private static final int f;
    private static final int[] g;
    @l
    public static final a h;

    static {
        e.h = new a(null);
        e.f = b.values().length;
        b[] arr_e$b = b.values();
        ArrayList arrayList0 = new ArrayList(arr_e$b.length);
        for(int v = 0; v < arr_e$b.length; ++v) {
            arrayList0.add(arr_e$b[v].a());
        }
        e.g = u.U5(arrayList0);
    }

    public e() {
        super(e.f, e.g);
        this.d = codes.side.andcolorpicker.model.b.a;
    }

    @Override  // codes.side.andcolorpicker.model.a
    @l
    public codes.side.andcolorpicker.model.b N1() {
        return this.d;
    }

    @Override  // codes.side.andcolorpicker.model.d
    public Object clone() {
        return this.f();
    }

    @Override  // codes.side.andcolorpicker.model.d
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(e.class, class0)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.model.IntegerHSLColor");
        }
        return this.N1() == ((e)object0).N1();
    }

    @l
    public e f() {
        e e0 = new e();
        e0.d(this);
        return e0;
    }

    public final float g() {
        return (float)this.l();
    }

    public final float h() {
        return ((float)this.m()) / ((float)b.f.c());
    }

    @Override  // codes.side.andcolorpicker.model.d
    public int hashCode() {
        return super.hashCode() * 0x1F + this.N1().hashCode();
    }

    @Override  // codes.side.andcolorpicker.model.a
    public float i() {
        return ((float)this.k()) / ((float)b.g.c());
    }

    public final float j() {
        return ((float)this.n()) / ((float)b.e.c());
    }

    public final int k() {
        return this.c()[b.g.b()];
    }

    public final int l() {
        return this.c()[b.d.b()];
    }

    public final int m() {
        return this.c()[b.f.b()];
    }

    public final int n() {
        return this.c()[b.e.b()];
    }

    public final void o(float f) {
        this.s(((int)f));
    }

    public final void p(float f) {
        this.t(((int)(f * ((float)b.f.c()))));
    }

    public final void q(float f) {
        this.u(((int)(f * ((float)b.e.c()))));
    }

    public final void r(int v) {
        this.e(b.g.b(), v, b.g.d(), b.g.c());
    }

    public final void s(int v) {
        this.e(b.d.b(), v, b.d.d(), b.d.c());
    }

    public final void t(int v) {
        this.e(b.f.b(), v, b.f.d(), b.f.c());
    }

    public final void u(int v) {
        this.e(b.e.b(), v, b.e.d(), b.e.c());
    }
}

