package com.google.firebase.sessions;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class b {
    @l
    private final String a;
    @l
    private final String b;
    @l
    private final String c;
    @l
    private final String d;
    @l
    private final u e;
    @l
    private final a f;

    public b(@l String s, @l String s1, @l String s2, @l String s3, @l u u0, @l a a0) {
        L.p(s, "appId");
        L.p(s1, "deviceModel");
        L.p(s2, "sessionSdkVersion");
        L.p(s3, "osVersion");
        L.p(u0, "logEnvironment");
        L.p(a0, "androidAppInfo");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = u0;
        this.f = a0;
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
    public final u e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(!L.g(this.a, ((b)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((b)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((b)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((b)object0).d)) {
            return false;
        }
        return this.e == ((b)object0).e ? L.g(this.f, ((b)object0).f) : false;
    }

    @l
    public final a f() {
        return this.f;
    }

    @l
    public final b g(@l String s, @l String s1, @l String s2, @l String s3, @l u u0, @l a a0) {
        L.p(s, "appId");
        L.p(s1, "deviceModel");
        L.p(s2, "sessionSdkVersion");
        L.p(s3, "osVersion");
        L.p(u0, "logEnvironment");
        L.p(a0, "androidAppInfo");
        return new b(s, s1, s2, s3, u0, a0);
    }

    public static b h(b b0, String s, String s1, String s2, String s3, u u0, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = b0.a;
        }
        if((v & 2) != 0) {
            s1 = b0.b;
        }
        if((v & 4) != 0) {
            s2 = b0.c;
        }
        if((v & 8) != 0) {
            s3 = b0.d;
        }
        if((v & 16) != 0) {
            u0 = b0.e;
        }
        if((v & 0x20) != 0) {
            a0 = b0.f;
        }
        return b0.g(s, s1, s2, s3, u0, a0);
    }

    @Override
    public int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @l
    public final a i() {
        return this.f;
    }

    @l
    public final String j() {
        return this.a;
    }

    @l
    public final String k() {
        return this.b;
    }

    @l
    public final u l() {
        return this.e;
    }

    @l
    public final String m() {
        return this.d;
    }

    @l
    public final String n() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + this.b + ", sessionSdkVersion=" + this.c + ", osVersion=" + this.d + ", logEnvironment=" + this.e + ", androidAppInfo=" + this.f + ')';
    }
}

