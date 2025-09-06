package S0;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class c {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    @l
    private final String g;

    public c(int v, int v1, int v2, int v3, int v4, int v5, @l String s) {
        L.p(s, "scaleType");
        super();
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = s;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(c.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.facebook.fresco.ui.common.DimensionsInfo");
        return this.a == ((c)object0).a && this.b == ((c)object0).b && this.c == ((c)object0).c && this.d == ((c)object0).d && this.e == ((c)object0).e && this.f == ((c)object0).f && L.g(this.g, ((c)object0).g);
    }

    public final int f() {
        return this.f;
    }

    @l
    public final String g() {
        return this.g;
    }

    @l
    public final c h(int v, int v1, int v2, int v3, int v4, int v5, @l String s) {
        L.p(s, "scaleType");
        return new c(v, v1, v2, v3, v4, v5, s);
    }

    @Override
    public int hashCode() {
        return (((((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g.hashCode();
    }

    public static c i(c c0, int v, int v1, int v2, int v3, int v4, int v5, String s, int v6, Object object0) {
        if((v6 & 1) != 0) {
            v = c0.a;
        }
        if((v6 & 2) != 0) {
            v1 = c0.b;
        }
        if((v6 & 4) != 0) {
            v2 = c0.c;
        }
        if((v6 & 8) != 0) {
            v3 = c0.d;
        }
        if((v6 & 16) != 0) {
            v4 = c0.e;
        }
        if((v6 & 0x20) != 0) {
            v5 = c0.f;
        }
        if((v6 & 0x40) != 0) {
            s = c0.g;
        }
        return c0.h(v, v1, v2, v3, v4, v5, s);
    }

    public final int j() {
        return this.f;
    }

    public final int k() {
        return this.e;
    }

    public final int l() {
        return this.d;
    }

    public final int m() {
        return this.c;
    }

    @l
    public final String n() {
        return this.g;
    }

    public final int o() {
        return this.b;
    }

    public final int p() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "DimensionsInfo(viewportWidth=" + this.a + ", viewportHeight=" + this.b + ", encodedImageWidth=" + this.c + ", encodedImageHeight=" + this.d + ", decodedImageWidth=" + this.e + ", decodedImageHeight=" + this.f + ", scaleType=" + this.g + ")";
    }
}

