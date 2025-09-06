package com.dcinside.app.write.menu.setting;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class b {
    @m
    private String a;
    @m
    private String b;

    public b(@m String s, @m String s1) {
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
    public final b c(@m String s, @m String s1) {
        return new b(s, s1);
    }

    public static b d(b b0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = b0.a;
        }
        if((v & 2) != 0) {
            s1 = b0.b;
        }
        return b0.c(s, s1);
    }

    @m
    public final String e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        return L.g(this.a, ((b)object0).a) ? L.g(this.b, ((b)object0).b) : false;
    }

    @m
    public final String f() {
        return this.a;
    }

    public final void g(@m String s) {
        this.b = s;
    }

    public final void h(@m String s) {
        this.a = s;
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
        return "PollItem(subject=" + this.a + ", image=" + this.b + ")";
    }
}

