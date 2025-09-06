package com.google.firebase.sessions;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class v {
    @l
    private final String a;
    private final int b;
    private final int c;
    private final boolean d;

    public v(@l String s, int v, int v1, boolean z) {
        L.p(s, "processName");
        super();
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = z;
    }

    @l
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @l
    public final v e(@l String s, int v, int v1, boolean z) {
        L.p(s, "processName");
        return new v(s, v, v1, z);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        if(!L.g(this.a, ((v)object0).a)) {
            return false;
        }
        if(this.b != ((v)object0).b) {
            return false;
        }
        return this.c == ((v)object0).c ? this.d == ((v)object0).d : false;
    }

    public static v f(v v0, String s, int v1, int v2, boolean z, int v3, Object object0) {
        if((v3 & 1) != 0) {
            s = v0.a;
        }
        if((v3 & 2) != 0) {
            v1 = v0.b;
        }
        if((v3 & 4) != 0) {
            v2 = v0.c;
        }
        if((v3 & 8) != 0) {
            z = v0.d;
        }
        return v0.e(s, v1, v2, z);
    }

    public final int g() {
        return this.c;
    }

    public final int h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F;
        int v1 = this.d;
        if(v1) {
            v1 = 1;
        }
        return v + v1;
    }

    @l
    public final String i() {
        return this.a;
    }

    public final boolean j() {
        return this.d;
    }

    @Override
    @l
    public String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}

