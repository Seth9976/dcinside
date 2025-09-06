package com.dcinside.app.memo;

import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class p {
    @m
    private final String a;
    @m
    private final Integer b;
    private final boolean c;
    @m
    private final String d;
    @m
    private final Integer e;
    private final boolean f;

    public p(@m String s, @m Integer integer0, boolean z, @m String s1, @m Integer integer1, boolean z1) {
        this.a = s;
        this.b = integer0;
        this.c = z;
        this.d = s1;
        this.e = integer1;
        this.f = z1;
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final Integer b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @m
    public final String d() {
        return this.d;
    }

    @m
    public final Integer e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(!L.g(this.a, ((p)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((p)object0).b)) {
            return false;
        }
        if(this.c != ((p)object0).c) {
            return false;
        }
        if(!L.g(this.d, ((p)object0).d)) {
            return false;
        }
        return L.g(this.e, ((p)object0).e) ? this.f == ((p)object0).f : false;
    }

    public final boolean f() {
        return this.f;
    }

    @l
    public final p g(@m String s, @m Integer integer0, boolean z, @m String s1, @m Integer integer1, boolean z1) {
        return new p(s, integer0, z, s1, integer1, z1);
    }

    public static p h(p p0, String s, Integer integer0, boolean z, String s1, Integer integer1, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            s = p0.a;
        }
        if((v & 2) != 0) {
            integer0 = p0.b;
        }
        if((v & 4) != 0) {
            z = p0.c;
        }
        if((v & 8) != 0) {
            s1 = p0.d;
        }
        if((v & 16) != 0) {
            integer1 = p0.e;
        }
        if((v & 0x20) != 0) {
            z1 = p0.f;
        }
        return p0.g(s, integer0, z, s1, integer1, z1);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = c.a(this.c);
        int v4 = this.d == null ? 0 : this.d.hashCode();
        Integer integer0 = this.e;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v) * 0x1F + c.a(this.f);
    }

    @m
    public final Integer i() {
        return this.e;
    }

    public final boolean j() {
        return this.f;
    }

    @m
    public final String k() {
        return this.d;
    }

    @m
    public final Integer l() {
        return this.b;
    }

    public final boolean m() {
        return this.c;
    }

    @m
    public final String n() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "UserMemoAddInfo(currentMemo=" + this.a + ", currentColor=" + this.b + ", currentIsChecked=" + this.c + ", allMemo=" + this.d + ", allColor=" + this.e + ", allIsChecked=" + this.f + ")";
    }
}

