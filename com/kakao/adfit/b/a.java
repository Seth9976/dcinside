package com.kakao.adfit.b;

import android.content.Context;
import android.os.Bundle;
import com.kakao.adfit.a.b;
import com.kakao.adfit.ads.AdListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;

public final class a implements b {
    public static final class com.kakao.adfit.b.a.a {
        private com.kakao.adfit.b.a.a() {
        }

        public com.kakao.adfit.b.a.a(w w0) {
        }
    }

    private final com.kakao.adfit.b.b a;
    private final Context b;
    private String c;
    private String d;
    private final A3.a e;
    private boolean f;
    private String g;
    private final Map h;
    private AdListener i;
    private int j;
    private long k;
    private int l;
    public static final com.kakao.adfit.b.a.a m;

    static {
        a.m = new com.kakao.adfit.b.a.a(null);
    }

    public a(com.kakao.adfit.b.b b0) {
        static final class com.kakao.adfit.b.a.b extends N implements A3.a {
            final a a;

            com.kakao.adfit.b.a.b(a a0) {
                this.a = a0;
                super(0);
            }

            // 去混淆评级： 低(40)
            public final Boolean a() {
                return !this.a.a.b() || !this.a.a.e() || !this.a.a.f() || !this.a.a.a() ? false : true;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.a();
            }
        }

        L.p(b0, "view");
        super();
        this.a = b0;
        Context context0 = b0.getContext().getApplicationContext();
        L.o(context0, "view.context.applicationContext");
        this.b = context0;
        this.c = "https://display.ad.daum.net/sdk/banner";
        this.e = new com.kakao.adfit.b.a.b(this);
        L.o("com.dcinside.app.android", "view.context.packageName");
        this.g = "com.dcinside.app.android";
        this.h = new LinkedHashMap();
        this.k = 60000L;
        this.l = 3000;
    }

    @Override  // com.kakao.adfit.a.b
    public int a() {
        return this.j;
    }

    public void a(int v) {
        com.kakao.adfit.a.b.a.a(this, v);
    }

    public void a(long v) {
        if(this.i()) {
            v = Math.max(v, 0L);
        }
        else if(v <= 0L) {
            v = 0L;
        }
        else if(v <= 30000L) {
            v = 30000L;
        }
        else if(v >= 120000L) {
            v = 120000L;
        }
        this.k = v;
    }

    public void a(AdListener adListener0) {
        this.i = adListener0;
    }

    public void a(String s) {
        if(s != null && !v.x3(s) == 1) {
            this.d = s;
        }
    }

    public void a(String s, String s1) {
        com.kakao.adfit.a.b.a.a(this, s, s1);
    }

    public void a(boolean z) {
        this.f = z;
    }

    @Override  // com.kakao.adfit.a.b
    public String b() {
        return this.c;
    }

    public void b(int v) {
        this.j = v;
    }

    @Override  // com.kakao.adfit.a.b
    public Map c() {
        return this.h;
    }

    public void c(int v) {
        this.l = Math.max(v, 1000);
    }

    @Override  // com.kakao.adfit.a.b
    public long d() {
        return this.k;
    }

    @Override  // com.kakao.adfit.a.b
    public A3.a e() {
        return this.e;
    }

    @Override  // com.kakao.adfit.a.b
    public String f() {
        return this.g;
    }

    @Override  // com.kakao.adfit.a.b
    public String g() {
        return this.j();
    }

    @Override  // com.kakao.adfit.a.b
    public Context getContext() {
        return this.b;
    }

    @Override  // com.kakao.adfit.a.b
    public AdListener h() {
        return this.i;
    }

    @Override  // com.kakao.adfit.a.b
    public boolean i() {
        return this.f;
    }

    public String j() {
        return this.d;
    }

    public Bundle k() {
        return com.kakao.adfit.a.b.a.a(this);
    }

    public int l() {
        return this.l;
    }

    public void m() {
        com.kakao.adfit.a.b.a.b(this);
    }

    public void n() {
        com.kakao.adfit.a.b.a.c(this);
    }
}

