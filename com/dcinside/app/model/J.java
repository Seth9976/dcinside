package com.dcinside.app.model;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class j {
    @c("result")
    @m
    private final Boolean a;
    @c("prompts")
    @m
    private final String b;
    @c("msg")
    @m
    private final String c;

    public j() {
        this(null, null, null, 7, null);
    }

    public j(@m Boolean boolean0, @m String s, @m String s1) {
        this.a = boolean0;
        this.b = s;
        this.c = s1;
    }

    public j(Boolean boolean0, String s, String s1, int v, w w0) {
        if((v & 1) != 0) {
            boolean0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        this(boolean0, s, s1);
    }

    @m
    public final Boolean a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    @m
    public final String c() {
        return this.c;
    }

    @l
    public final j d(@m Boolean boolean0, @m String s, @m String s1) {
        return new j(boolean0, s, s1);
    }

    public static j e(j j0, Boolean boolean0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            boolean0 = j0.a;
        }
        if((v & 2) != 0) {
            s = j0.b;
        }
        if((v & 4) != 0) {
            s1 = j0.c;
        }
        return j0.d(boolean0, s, s1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(!L.g(this.a, ((j)object0).a)) {
            return false;
        }
        return L.g(this.b, ((j)object0).b) ? L.g(this.c, ((j)object0).c) : false;
    }

    @m
    public final String f() {
        return this.b;
    }

    @m
    public final String g() {
        return this.c;
    }

    @m
    public final Boolean h() {
        return this.a;
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
        return "AiPromptResult(result=" + this.a + ", executePrompts=" + this.b + ", msg=" + this.c + ")";
    }
}

