package com.dcinside.app.write;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a {
    @m
    private final String a;
    @m
    private final Boolean b;
    @m
    private final String c;

    public a(@m String s, @m Boolean boolean0, @m String s1) {
        this.a = s;
        this.b = boolean0;
        this.c = s1;
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final Boolean b() {
        return this.b;
    }

    @m
    public final String c() {
        return this.c;
    }

    @l
    public final a d(@m String s, @m Boolean boolean0, @m String s1) {
        return new a(s, boolean0, s1);
    }

    public static a e(a a0, String s, Boolean boolean0, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = a0.a;
        }
        if((v & 2) != 0) {
            boolean0 = a0.b;
        }
        if((v & 4) != 0) {
            s1 = a0.c;
        }
        return a0.d(s, boolean0, s1);
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
        return L.g(this.b, ((a)object0).b) ? L.g(this.c, ((a)object0).c) : false;
    }

    @m
    public final String f() {
        return this.a;
    }

    @m
    public final Boolean g() {
        return this.b;
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
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "AiImageData(data=" + this.a + ", hidePrompt=" + this.b + ", resampleId=" + this.c + ")";
    }
}

