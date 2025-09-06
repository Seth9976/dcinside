package codes.side.andcolorpicker.model;

import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class c extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static enum b {
        C(0, 0, 100),
        M(0, 0, 100),
        Y(0, 0, 100),
        K(0, 0, 100),
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
    private static final int e;
    private static final int[] f;
    @l
    public static final a g;

    static {
        c.g = new a(null);
        c.e = b.values().length;
        b[] arr_c$b = b.values();
        ArrayList arrayList0 = new ArrayList(arr_c$b.length);
        for(int v = 0; v < arr_c$b.length; ++v) {
            arrayList0.add(arr_c$b[v].a());
        }
        c.f = u.U5(arrayList0);
    }

    public c() {
        super(c.e, c.f);
        this.d = codes.side.andcolorpicker.model.b.c;
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
        if(!L.g(c.class, class0)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.model.IntegerCMYKColor");
        }
        return this.N1() == ((c)object0).N1();
    }

    @l
    public c f() {
        Object object0 = super.clone();
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.model.IntegerCMYKColor");
        }
        return (c)object0;
    }

    public final float g() {
        return ((float)this.m()) / ((float)b.d.c());
    }

    public final float h() {
        return ((float)this.n()) / ((float)b.g.c());
    }

    @Override  // codes.side.andcolorpicker.model.d
    public int hashCode() {
        return super.hashCode() * 0x1F + this.N1().hashCode();
    }

    @Override  // codes.side.andcolorpicker.model.a
    public float i() {
        return ((float)this.l()) / ((float)b.h.c());
    }

    public final float j() {
        return ((float)this.o()) / ((float)b.e.c());
    }

    public final float k() {
        return ((float)this.p()) / ((float)b.f.c());
    }

    public final int l() {
        return this.c()[b.h.b()];
    }

    public final int m() {
        return this.c()[b.d.b()];
    }

    public final int n() {
        return this.c()[b.g.b()];
    }

    public final int o() {
        return this.c()[b.e.b()];
    }

    public final int p() {
        return this.c()[b.f.b()];
    }

    public final void q(float f) {
        this.v(((int)(f * ((float)b.d.c()))));
    }

    public final void r(float f) {
        this.w(((int)(f * ((float)b.g.c()))));
    }

    public final void s(float f) {
        this.x(((int)(f * ((float)b.e.c()))));
    }

    public final void t(float f) {
        this.y(((int)(f * ((float)b.f.c()))));
    }

    public final void u(int v) {
        this.e(b.h.b(), v, b.h.d(), b.h.c());
    }

    public final void v(int v) {
        this.e(b.d.b(), v, b.d.d(), b.d.c());
    }

    public final void w(int v) {
        this.e(b.g.b(), v, b.g.d(), b.g.c());
    }

    public final void x(int v) {
        this.e(b.e.b(), v, b.e.d(), b.e.c());
    }

    public final void y(int v) {
        this.e(b.f.b(), v, b.f.d(), b.f.c());
    }
}

