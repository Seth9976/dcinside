package com.dcinside.app.response;

import com.dcinside.app.util.Ik.a;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class i {
    @c("result")
    @m
    private String a;
    @c("cause")
    @m
    private String b;
    @c("gall_info")
    @l
    private List c;
    @c("gall_list")
    @l
    private List d;
    @c("is_confirm_id")
    private boolean e;
    @c("refresh_join")
    @m
    private final Boolean f;
    @a
    public GalleryInfo g;
    @a
    private int h;
    @a
    @m
    private String i;
    @a
    @m
    private String j;

    public i() {
        this.c = u.H();
        this.d = u.H();
    }

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String b() {
        return this.i;
    }

    @l
    public final GalleryInfo c() {
        GalleryInfo galleryInfo0 = this.g;
        if(galleryInfo0 != null) {
            return galleryInfo0;
        }
        L.S("galleryInfo");
        return null;
    }

    @m
    public final String d() {
        return this.j;
    }

    @l
    public final List e() {
        return this.c;
    }

    @l
    public final List f() {
        return this.d;
    }

    public final int g() {
        return this.h;
    }

    @m
    public final String h() {
        return this.a;
    }

    public final boolean i() {
        return this.e;
    }

    @m
    public final Boolean j() {
        return this.f;
    }

    public final void k(boolean z) {
        this.e = z;
    }

    public final void l(@m String s) {
        this.i = s;
    }

    public final void m(@l GalleryInfo galleryInfo0) {
        L.p(galleryInfo0, "<set-?>");
        this.g = galleryInfo0;
    }

    public final void n(@m String s) {
        this.j = s;
    }

    public final void o(@l List list0) {
        L.p(list0, "<set-?>");
        this.d = list0;
    }

    public final void p(int v) {
        this.h = v;
    }
}

