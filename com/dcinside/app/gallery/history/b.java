package com.dcinside.app.gallery.history;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final boolean a(@m b b0) {
            return b0 != null && L.g("1", b0.b());
        }
    }

    @c("nickname")
    @m
    private final String a;
    @c("user_id")
    @m
    private final String b;
    @c("ip")
    @m
    private final String c;
    @c("avoid_hour")
    @m
    private final String d;
    @c("reg_date")
    @m
    private final String e;
    @c("manager_name")
    @m
    private final String f;
    @c("manager_id")
    @m
    private final String g;
    @c("subject_type")
    @m
    private final String h;
    @c(alternate = {"contents"}, value = "reason")
    @m
    private final String i;
    @c("subject")
    @m
    private final String j;
    @c("type")
    @m
    private final String k;
    @c("ip_user_avoid")
    @m
    private String l;
    @l
    public static final a m;

    static {
        b.m = new a(null);
    }

    @m
    public final String a() {
        return this.d;
    }

    @m
    public final String b() {
        return this.l;
    }

    @m
    public final String c() {
        return this.h;
    }

    @m
    public final String d() {
        return this.e;
    }

    @m
    public final String e() {
        return this.c;
    }

    @m
    public final String f() {
        return this.g;
    }

    @m
    public final String g() {
        return this.f;
    }

    @m
    public final String h() {
        return this.i;
    }

    @m
    public final String i() {
        return this.a;
    }

    @m
    public final String j() {
        return this.j;
    }

    @m
    public final String k() {
        return this.k;
    }

    @m
    public final String l() {
        return this.b;
    }

    public final void m(@m String s) {
        this.l = s;
    }
}

