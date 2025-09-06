package com.dcinside.app.model;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class g {
    @c("result")
    @m
    private final Boolean a;
    @c("msg")
    @m
    private final String b;
    @c("data")
    @m
    private final String c;
    @c("ct_img")
    @m
    private final String d;
    @c("limit")
    @m
    private final Boolean e;

    public g() {
        this(null, null, null, null, null, 0x1F, null);
    }

    public g(@m Boolean boolean0, @m String s, @m String s1, @m String s2, @m Boolean boolean1) {
        this.a = boolean0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = boolean1;
    }

    public g(Boolean boolean0, String s, String s1, String s2, Boolean boolean1, int v, w w0) {
        this(((v & 1) == 0 ? boolean0 : null), ((v & 2) == 0 ? s : null), ((v & 4) == 0 ? s1 : null), ((v & 8) == 0 ? s2 : null), ((v & 16) == 0 ? boolean1 : null));
    }

    @m
    public final Boolean a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    @m
    public final String c() {
        return this.c;
    }

    @m
    public final String d() {
        return this.d;
    }

    @m
    public final Boolean e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        if(!L.g(this.a, ((g)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((g)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((g)object0).c)) {
            return false;
        }
        return L.g(this.d, ((g)object0).d) ? L.g(this.e, ((g)object0).e) : false;
    }

    @l
    public final g f(@m Boolean boolean0, @m String s, @m String s1, @m String s2, @m Boolean boolean1) {
        return new g(boolean0, s, s1, s2, boolean1);
    }

    public static g g(g g0, Boolean boolean0, String s, String s1, String s2, Boolean boolean1, int v, Object object0) {
        if((v & 1) != 0) {
            boolean0 = g0.a;
        }
        if((v & 2) != 0) {
            s = g0.b;
        }
        if((v & 4) != 0) {
            s1 = g0.c;
        }
        if((v & 8) != 0) {
            s2 = g0.d;
        }
        if((v & 16) != 0) {
            boolean1 = g0.e;
        }
        return g0.f(boolean0, s, s1, s2, boolean1);
    }

    @m
    public final String h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        Boolean boolean0 = this.e;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @m
    public final String i() {
        return this.b;
    }

    @m
    public final String j() {
        return this.d;
    }

    @m
    public final Boolean k() {
        return this.a;
    }

    @m
    public final Boolean l() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        return "AiImageResult(result=" + this.a + ", msg=" + this.b + ", imageData=" + this.c + ", resampleId=" + this.d + ", isLimited=" + this.e + ")";
    }
}

