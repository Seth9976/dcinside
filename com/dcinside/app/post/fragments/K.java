package com.dcinside.app.post.fragments;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class k {
    @l
    private final String a;
    @l
    private final String b;

    public k(@l String s, @l String s1) {
        L.p(s, "fileno");
        L.p(s1, "message");
        super();
        this.a = s;
        this.b = s1;
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
    public final k c(@l String s, @l String s1) {
        L.p(s, "fileno");
        L.p(s1, "message");
        return new k(s, s1);
    }

    public static k d(k k0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = k0.a;
        }
        if((v & 2) != 0) {
            s1 = k0.b;
        }
        return k0.c(s, s1);
    }

    @l
    public final String e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        return L.g(this.a, ((k)object0).a) ? L.g(this.b, ((k)object0).b) : false;
    }

    @l
    public final String f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "Failure(fileno=" + this.a + ", message=" + this.b + ")";
    }
}

