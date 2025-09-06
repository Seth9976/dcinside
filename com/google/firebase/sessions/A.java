package com.google.firebase.sessions;

import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a {
    @l
    private final String a;
    @l
    private final String b;
    @l
    private final String c;
    @l
    private final String d;
    @l
    private final v e;
    @l
    private final List f;

    public a(@l String s, @l String s1, @l String s2, @l String s3, @l v v0, @l List list0) {
        L.p(s, "packageName");
        L.p(s1, "versionName");
        L.p(s2, "appBuildVersion");
        L.p(s3, "deviceManufacturer");
        L.p(v0, "currentProcessDetails");
        L.p(list0, "appProcessDetails");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = v0;
        this.f = list0;
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final String b() {
        return this.b;
    }

    @l
    public final String c() {
        return this.c;
    }

    @l
    public final String d() {
        return this.d;
    }

    @l
    public final v e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!L.g(this.a, ((a)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((a)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((a)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((a)object0).d)) {
            return false;
        }
        return L.g(this.e, ((a)object0).e) ? L.g(this.f, ((a)object0).f) : false;
    }

    @l
    public final List f() {
        return this.f;
    }

    @l
    public final a g(@l String s, @l String s1, @l String s2, @l String s3, @l v v0, @l List list0) {
        L.p(s, "packageName");
        L.p(s1, "versionName");
        L.p(s2, "appBuildVersion");
        L.p(s3, "deviceManufacturer");
        L.p(v0, "currentProcessDetails");
        L.p(list0, "appProcessDetails");
        return new a(s, s1, s2, s3, v0, list0);
    }

    public static a h(a a0, String s, String s1, String s2, String s3, v v0, List list0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = a0.a;
        }
        if((v1 & 2) != 0) {
            s1 = a0.b;
        }
        if((v1 & 4) != 0) {
            s2 = a0.c;
        }
        if((v1 & 8) != 0) {
            s3 = a0.d;
        }
        if((v1 & 16) != 0) {
            v0 = a0.e;
        }
        if((v1 & 0x20) != 0) {
            list0 = a0.f;
        }
        return a0.g(s, s1, s2, s3, v0, list0);
    }

    @Override
    public int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @l
    public final String i() {
        return this.c;
    }

    @l
    public final List j() {
        return this.f;
    }

    @l
    public final v k() {
        return this.e;
    }

    @l
    public final String l() {
        return this.d;
    }

    @l
    public final String m() {
        return this.a;
    }

    @l
    public final String n() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ')';
    }
}

