package com.dcinside.app.write.menu.ai.type;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class c {
    @com.google.gson.annotations.c("name")
    @l
    private final String a;
    @com.google.gson.annotations.c("prompt")
    @l
    private final String b;

    public c() {
        this(null, null, 3, null);
    }

    public c(@l String s, @l String s1) {
        L.p(s, "name");
        L.p(s1, "prompt");
        super();
        this.a = s;
        this.b = s1;
    }

    public c(String s, String s1, int v, w w0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            s1 = "";
        }
        this(s, s1);
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
    public final c c(@l String s, @l String s1) {
        L.p(s, "name");
        L.p(s1, "prompt");
        return new c(s, s1);
    }

    public static c d(c c0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = c0.a;
        }
        if((v & 2) != 0) {
            s1 = c0.b;
        }
        return c0.c(s, s1);
    }

    @l
    public final String e() [...] // 潜在的解密器

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        return L.g(this.a, ((c)object0).a) ? L.g(this.b, ((c)object0).b) : false;
    }

    @l
    public final String f() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "CharaSearchItem(name=" + this.a + ", prompt=" + this.b + ")";
    }
}

