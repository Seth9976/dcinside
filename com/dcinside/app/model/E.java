package com.dcinside.app.model;

import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e {
    @c("id")
    @m
    private final List a;
    @c("user")
    @m
    private final String b;
    @c("guest")
    @m
    private final String c;

    public e() {
        this(null, null, null, 7, null);
    }

    public e(@m List list0, @m String s, @m String s1) {
        this.a = list0;
        this.b = s;
        this.c = s1;
    }

    public e(List list0, String s, String s1, int v, w w0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        this(list0, s, s1);
    }

    @m
    public final List a() {
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
    public final e d(@m List list0, @m String s, @m String s1) {
        return new e(list0, s, s1);
    }

    public static e e(e e0, List list0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = e0.a;
        }
        if((v & 2) != 0) {
            s = e0.b;
        }
        if((v & 4) != 0) {
            s1 = e0.c;
        }
        return e0.d(list0, s, s1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!L.g(this.a, ((e)object0).a)) {
            return false;
        }
        return L.g(this.b, ((e)object0).b) ? L.g(this.c, ((e)object0).c) : false;
    }

    @m
    public final String f() {
        return this.c;
    }

    @m
    public final List g() {
        return this.a;
    }

    @m
    public final String h() {
        return this.b;
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
        return "AdultWarningMessage(ids=" + this.a + ", userText=" + this.b + ", guestText=" + this.c + ")";
    }
}

