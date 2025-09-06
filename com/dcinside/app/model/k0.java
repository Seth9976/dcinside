package com.dcinside.app.model;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class k0 {
    @c("result")
    @m
    private final Boolean a;
    @c("cause")
    @m
    private final String b;
    @c("article_cnt")
    @m
    private final Integer c;
    @c("reply_cnt")
    @m
    private final Integer d;

    public k0() {
        this(null, null, null, null, 15, null);
    }

    public k0(@m Boolean boolean0, @m String s, @m Integer integer0, @m Integer integer1) {
        this.a = boolean0;
        this.b = s;
        this.c = integer0;
        this.d = integer1;
    }

    public k0(Boolean boolean0, String s, Integer integer0, Integer integer1, int v, w w0) {
        if((v & 1) != 0) {
            boolean0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            integer0 = null;
        }
        if((v & 8) != 0) {
            integer1 = null;
        }
        this(boolean0, s, integer0, integer1);
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
    public final Integer c() {
        return this.c;
    }

    @m
    public final Integer d() {
        return this.d;
    }

    @l
    public final k0 e(@m Boolean boolean0, @m String s, @m Integer integer0, @m Integer integer1) {
        return new k0(boolean0, s, integer0, integer1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k0)) {
            return false;
        }
        if(!L.g(this.a, ((k0)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((k0)object0).b)) {
            return false;
        }
        return L.g(this.c, ((k0)object0).c) ? L.g(this.d, ((k0)object0).d) : false;
    }

    public static k0 f(k0 k00, Boolean boolean0, String s, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            boolean0 = k00.a;
        }
        if((v & 2) != 0) {
            s = k00.b;
        }
        if((v & 4) != 0) {
            integer0 = k00.c;
        }
        if((v & 8) != 0) {
            integer1 = k00.d;
        }
        return k00.e(boolean0, s, integer0, integer1);
    }

    @m
    public final String g() {
        return this.b;
    }

    @m
    public final Integer h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Integer integer0 = this.d;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @m
    public final Integer i() {
        return this.d;
    }

    @m
    public final Boolean j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "UserGallogInfoResult(result=" + this.a + ", cause=" + this.b + ", postCount=" + this.c + ", replyCount=" + this.d + ")";
    }
}

