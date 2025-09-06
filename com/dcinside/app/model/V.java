package com.dcinside.app.model;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class v {
    @m
    private final String a;
    @m
    private final String b;

    public v(@m String s, @m String s1) {
        this.a = s;
        this.b = s1;
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    @l
    public final v c(@m String s, @m String s1) {
        return new v(s, s1);
    }

    public static v d(v v0, String s, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = v0.a;
        }
        if((v1 & 2) != 0) {
            s1 = v0.b;
        }
        return v0.c(s, s1);
    }

    @m
    public final String e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        return L.g(this.a, ((v)object0).a) ? L.g(this.b, ((v)object0).b) : false;
    }

    @m
    public final String f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "DcconDownloadData(dcconIndex=" + this.a + ", url=" + this.b + ")";
    }
}

