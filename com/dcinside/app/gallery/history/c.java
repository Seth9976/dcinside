package com.dcinside.app.gallery.history;

import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class c {
    @com.google.gson.annotations.c("result")
    @m
    private final String a;
    @com.google.gson.annotations.c("cause")
    @m
    private final String b;
    @com.google.gson.annotations.c("avoid_open")
    private final boolean c;
    @com.google.gson.annotations.c("delete_open")
    private final boolean d;
    @com.google.gson.annotations.c("setting_open")
    private final boolean e;
    @com.google.gson.annotations.c(alternate = {"delete_list", "setting_list"}, value = "avoid_list")
    @m
    private final b[] f;
    @com.google.gson.annotations.c(alternate = {"delete_count", "setting_count"}, value = "avoid_count")
    private final int g;
    @com.google.gson.annotations.c(alternate = {"delete_days", "setting_days"}, value = "avoid_days")
    private final int h;
    @com.google.gson.annotations.c("category")
    @m
    private final String i;

    public final boolean a() {
        return this.c;
    }

    @m
    public final String b() {
        return this.i;
    }

    @l
    public final a c() {
        String s = this.i;
        a a0 = a.b;
        if(!L.g(s, "avoid")) {
            a a1 = a.c;
            if(L.g(s, "delete")) {
                return a1;
            }
            return L.g(s, "setting") ? a.d : a0;
        }
        return a0;
    }

    @m
    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return this.d;
    }

    @m
    public final b[] f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    @m
    public final String h() {
        return this.a;
    }

    public final int i() {
        return this.h;
    }

    public final boolean j() {
        return this.e;
    }

    public final boolean k() {
        return v.O1("true", this.a, true);
    }
}

