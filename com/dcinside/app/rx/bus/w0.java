package com.dcinside.app.rx.bus;

import com.dcinside.app.model.Q;
import com.dcinside.app.read.reply.more.ReplyPostInfo;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class w0 {
    private final int a;
    @l
    private final String b;
    @l
    private final String c;
    private final int d;
    @l
    private final String e;
    @l
    private final String f;
    @l
    private final String g;
    @m
    private final String h;
    @m
    private final String i;

    public w0(int v, @l String s, @l String s1, int v1, @l String s2, @l String s3, @l String s4, @m String s5, @m String s6) {
        L.p(s, "galleryId");
        L.p(s1, "galleryName");
        L.p(s2, "postSubject");
        L.p(s3, "postNickName");
        L.p(s4, "postDate");
        super();
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = v1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = s6;
    }

    public w0(@l Q q0, @m String s) {
        L.p(q0, "info");
        String s1 = q0.H0();
        String s2 = q0.k1();
        String s3 = q0.X0();
        String s4 = q0.D0();
        this((s == null ? 0 : 1), q0.G0(), (s1 == null ? "" : s1), q0.c1(), (s2 == null ? "" : s2), (s3 == null ? "" : s3), (s4 == null ? "" : s4), null, (s == null ? null : v.G5(s).toString()));
    }

    // 去混淆评级： 低(33)
    public w0(@l ReplyPostInfo replyPostInfo0, @m String s) {
        L.p(replyPostInfo0, "info");
        this(1, "", "", replyPostInfo0.s(), "", "", "", null, (s == null ? null : v.G5(s).toString()));
    }

    public final int a() {
        return this.a;
    }

    @l
    public final String b() {
        return this.b;
    }

    @l
    public final String c() {
        return this.c;
    }

    @m
    public final String d() {
        return this.h;
    }

    @l
    public final String e() {
        return this.g;
    }

    @l
    public final String f() {
        return this.f;
    }

    public final int g() {
        return this.d;
    }

    @l
    public final String h() {
        return this.e;
    }

    @m
    public final String i() {
        return this.i;
    }
}

