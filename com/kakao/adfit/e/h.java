package com.kakao.adfit.e;

import A3.a;
import android.content.Context;
import android.util.SparseArray;
import com.kakao.adfit.a.b;
import com.kakao.adfit.ads.AdListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.text.v;

public class h implements b {
    private final Context a;
    private String b;
    private String c;
    public a d;
    private boolean e;
    private String f;
    private int g;
    private long h;
    private final Map i;
    private AdListener j;
    private final Map k;
    private final SparseArray l;

    public h(Context context0) {
        L.p(context0, "context");
        super();
        Context context1 = context0.getApplicationContext();
        L.o(context1, "context.applicationContext");
        this.a = context1;
        this.b = "https://display.ad.daum.net/sdk/native";
        L.o("com.dcinside.app.android", "context.packageName");
        this.f = "com.dcinside.app.android";
        this.i = new LinkedHashMap();
        this.k = new HashMap();
        this.l = new SparseArray();
    }

    @Override  // com.kakao.adfit.a.b
    public int a() {
        return this.g;
    }

    public void a(a a0) {
        L.p(a0, "<set-?>");
        this.d = a0;
    }

    public void a(String s) {
        if(s != null && !v.x3(s) == 1) {
            this.c = s;
        }
    }

    public void a(boolean z) {
        this.e = z;
    }

    @Override  // com.kakao.adfit.a.b
    public String b() {
        return this.b;
    }

    @Override  // com.kakao.adfit.a.b
    public Map c() {
        return this.i;
    }

    @Override  // com.kakao.adfit.a.b
    public long d() {
        return this.h;
    }

    @Override  // com.kakao.adfit.a.b
    public a e() {
        a a0 = this.d;
        if(a0 != null) {
            return a0;
        }
        L.S("isForeground");
        return null;
    }

    @Override  // com.kakao.adfit.a.b
    public String f() {
        return this.f;
    }

    @Override  // com.kakao.adfit.a.b
    public String g() {
        return this.j();
    }

    @Override  // com.kakao.adfit.a.b
    public Context getContext() {
        return this.a;
    }

    @Override  // com.kakao.adfit.a.b
    public AdListener h() {
        return this.j;
    }

    @Override  // com.kakao.adfit.a.b
    public boolean i() {
        return this.e;
    }

    public String j() {
        return this.c;
    }

    public Map k() {
        return this.k;
    }

    public final boolean l() [...] // Inlined contents
}

