package com.dcinside.app.rx.bus;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class k0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final String a;
    @l
    public static final a b = null;
    @l
    public static final String c = "dialog";
    @l
    public static final String d = "other";
    @l
    public static final String e = "archive";
    @l
    public static final String f = "com.facebook.katana";
    @l
    public static final String g = "jp.naver.line.android";
    @l
    public static final String h = "com.kakao.talk";
    @l
    public static final String i = "com.twitter.android";
    @l
    public static final String j = "com.nhn.android.band";
    @l
    public static final String k = "com.kakao.story";
    @l
    public static final String l = "copy_url";

    static {
        k0.b = new a(null);
    }

    public k0(@l String s) {
        L.p(s, "type");
        super();
        this.a = s;
    }

    @l
    public final String a() {
        return this.a;
    }
}

