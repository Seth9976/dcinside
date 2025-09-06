package codes.side.andcolorpicker.model;

import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class h extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static enum b {
        R(0, 0, 0xFF),
        G(0, 0, 0xFF),
        B(0, 0, 0xFF),
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
    private static final String e = "IntegerRGBColor";
    private static final int f;
    private static final int[] g;
    @l
    public static final a h;

    static {
        h.h = new a(null);
        h.f = b.values().length;
        b[] arr_h$b = b.values();
        ArrayList arrayList0 = new ArrayList(arr_h$b.length);
        for(int v = 0; v < arr_h$b.length; ++v) {
            arrayList0.add(arr_h$b[v].a());
        }
        h.g = u.U5(arrayList0);
    }

    public h() {
        super(h.f, h.g);
        this.d = codes.side.andcolorpicker.model.b.b;
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
        if(!L.g(h.class, class0)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.model.IntegerRGBColor");
        }
        return this.N1() == ((h)object0).N1();
    }

    @l
    public h f() {
        Object object0 = super.clone();
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.model.IntegerRGBColor");
        }
        return (h)object0;
    }

    public final float g() {
        return (float)this.l();
    }

    public final float h() {
        return (float)this.m();
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
        return (float)this.n();
    }

    public final int k() {
        return this.c()[b.g.b()];
    }

    public final int l() {
        return this.c()[b.f.b()];
    }

    public final int m() {
        return this.c()[b.e.b()];
    }

    public final int n() {
        return this.c()[b.d.b()];
    }

    public final void o(float f) {
        this.s(((int)f));
    }

    public final void p(float f) {
        this.t(((int)f));
    }

    public final void q(float f) {
        this.u(((int)f));
    }

    public final void r(int v) {
        this.e(b.g.b(), v, b.g.d(), b.g.c());
    }

    public final void s(int v) {
        this.e(b.f.b(), v, b.f.d(), b.f.c());
    }

    public final void t(int v) {
        this.e(b.e.b(), v, b.e.d(), b.e.c());
    }

    public final void u(int v) {
        this.e(b.d.b(), v, b.d.d(), b.d.c());
    }
}

