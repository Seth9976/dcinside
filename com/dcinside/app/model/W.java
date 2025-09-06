package com.dcinside.app.model;

import com.google.gson.annotations.c;
import y4.m;

public class w {
    @c("gall_id")
    @m
    private String a;
    @c("gall_koname")
    @m
    private String b;
    @c("gall_hide")
    @m
    private Integer c;
    @c("is_mini")
    @m
    private Boolean d;
    @c("is_person")
    @m
    private Boolean e;

    public w() {
        this(null, null, null, null, null, 0x1F, null);
    }

    public w(@m String s, @m String s1, @m Integer integer0, @m Boolean boolean0, @m Boolean boolean1) {
        this.a = s;
        this.b = s1;
        this.c = integer0;
        this.d = boolean0;
        this.e = boolean1;
    }

    public w(String s, String s1, Integer integer0, Boolean boolean0, Boolean boolean1, int v, kotlin.jvm.internal.w w0) {
        if((v & 8) != 0) {
            boolean0 = Boolean.FALSE;
        }
        if((v & 16) != 0) {
            boolean1 = Boolean.FALSE;
        }
        this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? integer0 : null), boolean0, boolean1);
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    @m
    public final Boolean c() {
        return this.d;
    }

    @m
    public final Boolean d() {
        return this.e;
    }

    @m
    public final Integer e() {
        return this.c;
    }

    public final void f(@m String s) {
        this.a = s;
    }

    public final void g(@m String s) {
        this.b = s;
    }

    public final void h(@m Boolean boolean0) {
        this.d = boolean0;
    }

    public final void i(@m Boolean boolean0) {
        this.e = boolean0;
    }

    public final void j(@m Integer integer0) {
        this.c = integer0;
    }
}

