package io.realm.transformer;

import java.util.Set;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class c {
    @l
    private final Set a;
    private final boolean b;
    @l
    private final String c;
    @l
    private final String d;
    @l
    private final String e;
    @l
    private final String f;
    @l
    private final String g;
    @l
    private final String h;
    private final boolean i;
    private final boolean j;

    public c(@l Set set0, boolean z, @l String s, @l String s1, @l String s2, @l String s3, @l String s4, @l String s5, boolean z1, boolean z2) {
        L.p(set0, "bootClassPath");
        L.p(s, "targetType");
        L.p(s1, "targetSdk");
        L.p(s2, "minSdk");
        L.p(s3, "agpVersion");
        L.p(s4, "appId");
        L.p(s5, "gradleVersion");
        super();
        this.a = set0;
        this.b = z;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = z1;
        this.j = z2;
    }

    @l
    public final Set a() {
        return this.a;
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.b;
    }

    @l
    public final String d() {
        return this.c;
    }

    @l
    public final String e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        if(!L.g(this.a, ((c)object0).a)) {
            return false;
        }
        if(this.b != ((c)object0).b) {
            return false;
        }
        if(!L.g(this.c, ((c)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((c)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((c)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((c)object0).f)) {
            return false;
        }
        if(!L.g(this.g, ((c)object0).g)) {
            return false;
        }
        if(!L.g(this.h, ((c)object0).h)) {
            return false;
        }
        return this.i == ((c)object0).i ? this.j == ((c)object0).j : false;
    }

    @l
    public final String f() {
        return this.e;
    }

    @l
    public final String g() {
        return this.f;
    }

    @l
    public final String h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b;
        int v2 = 1;
        if(v1) {
            v1 = 1;
        }
        int v3 = this.c.hashCode();
        int v4 = this.d.hashCode();
        int v5 = this.e.hashCode();
        int v6 = this.f.hashCode();
        int v7 = this.g.hashCode();
        int v8 = this.h.hashCode();
        int v9 = this.i;
        if(v9) {
            v9 = 1;
        }
        if(!this.j) {
            v2 = false;
        }
        return ((((((((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v2;
    }

    @l
    public final String i() {
        return this.h;
    }

    public final boolean j() {
        return this.i;
    }

    @l
    public final c k(@l Set set0, boolean z, @l String s, @l String s1, @l String s2, @l String s3, @l String s4, @l String s5, boolean z1, boolean z2) {
        L.p(set0, "bootClassPath");
        L.p(s, "targetType");
        L.p(s1, "targetSdk");
        L.p(s2, "minSdk");
        L.p(s3, "agpVersion");
        L.p(s4, "appId");
        L.p(s5, "gradleVersion");
        return new c(set0, z, s, s1, s2, s3, s4, s5, z1, z2);
    }

    public static c l(c c0, Set set0, boolean z, String s, String s1, String s2, String s3, String s4, String s5, boolean z1, boolean z2, int v, Object object0) {
        Set set1 = (v & 1) == 0 ? set0 : c0.a;
        boolean z3 = (v & 2) == 0 ? z : c0.b;
        String s6 = (v & 4) == 0 ? s : c0.c;
        String s7 = (v & 8) == 0 ? s1 : c0.d;
        String s8 = (v & 16) == 0 ? s2 : c0.e;
        String s9 = (v & 0x20) == 0 ? s3 : c0.f;
        String s10 = (v & 0x40) == 0 ? s4 : c0.g;
        String s11 = (v & 0x80) == 0 ? s5 : c0.h;
        boolean z4 = (v & 0x100) == 0 ? z1 : c0.i;
        return (v & 0x200) == 0 ? c0.k(set1, z3, s6, s7, s8, s9, s10, s11, z4, z2) : c0.k(set1, z3, s6, s7, s8, s9, s10, s11, z4, c0.j);
    }

    @l
    public final String m() {
        return this.f;
    }

    @l
    public final String n() {
        return this.g;
    }

    @l
    public final Set o() {
        return this.a;
    }

    @l
    public final String p() {
        return this.h;
    }

    @l
    public final String q() {
        return this.e;
    }

    @l
    public final String r() {
        return this.d;
    }

    @l
    public final String s() {
        return this.c;
    }

    public final boolean t() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "ProjectMetaData(bootClassPath=" + this.a + ", usesKotlin=" + this.b + ", targetType=" + this.c + ", targetSdk=" + this.d + ", minSdk=" + this.e + ", agpVersion=" + this.f + ", appId=" + this.g + ", gradleVersion=" + this.h + ", usesSync=" + this.i + ", isGradleOffline=" + this.j + ")";
    }

    public final boolean u() {
        return this.i;
    }

    public final boolean v() {
        return this.j;
    }
}

