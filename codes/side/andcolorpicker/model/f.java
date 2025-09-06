package codes.side.andcolorpicker.model;

import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class f extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static enum b {
        L(50, 0, 100),
        A(0, 0xFFFFFF80, 0x7F),
        B(0, 0xFFFFFF80, 0x7F),
        ALPHA(0xFF, 0, 0xFF);

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
        f.g = new a(null);
        f.e = b.values().length;
        b[] arr_f$b = b.values();
        ArrayList arrayList0 = new ArrayList(arr_f$b.length);
        for(int v = 0; v < arr_f$b.length; ++v) {
            arrayList0.add(arr_f$b[v].a());
        }
        f.f = u.U5(arrayList0);
    }

    public f() {
        super(f.e, f.f);
        this.d = codes.side.andcolorpicker.model.b.d;
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
        if(!L.g(f.class, class0)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.model.IntegerLABColor");
        }
        return this.N1() == ((f)object0).N1();
    }

    @l
    public f f() {
        f f0 = new f();
        f0.d(this);
        return f0;
    }

    public final int g() {
        return this.c()[b.e.b()];
    }

    public final int h() {
        return this.c()[b.g.b()];
    }

    @Override  // codes.side.andcolorpicker.model.d
    public int hashCode() {
        return super.hashCode() * 0x1F + this.N1().hashCode();
    }

    @Override  // codes.side.andcolorpicker.model.a
    public float i() {
        return ((float)this.h()) / ((float)b.g.c());
    }

    public final int j() {
        return this.c()[b.f.b()];
    }

    public final int k() {
        return this.c()[b.d.b()];
    }

    public final void l(int v) {
        this.e(b.e.b(), v, b.e.d(), b.e.c());
    }

    public final void m(int v) {
        this.e(b.g.b(), v, b.g.d(), b.g.c());
    }

    public final void n(int v) {
        this.e(b.f.b(), v, b.f.d(), b.f.c());
    }

    public final void o(int v) {
        this.e(b.d.b(), v, b.d.d(), b.d.c());
    }
}

