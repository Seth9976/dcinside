package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.time.e;
import kotlin.time.g;
import y4.l;
import y4.m;

public final class b implements h {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final Bundle a;
    @l
    private static final a b = null;
    @Deprecated
    @l
    public static final String c = "firebase_sessions_enabled";
    @Deprecated
    @l
    public static final String d = "firebase_sessions_sessions_restart_timeout";
    @Deprecated
    @l
    public static final String e = "firebase_sessions_sampling_rate";

    static {
        b.b = new a(null);
    }

    public b(@l Context context0) {
        L.p(context0, "context");
        super();
        Bundle bundle0 = context0.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0x80).metaData;
        if(bundle0 == null) {
            bundle0 = Bundle.EMPTY;
        }
        this.a = bundle0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.firebase.sessions.settings.h
    @m
    public Double a() {
        return this.a.containsKey("firebase_sessions_sampling_rate") ? this.a.getDouble("firebase_sessions_sampling_rate") : null;
    }

    @Override  // com.google.firebase.sessions.settings.h
    @m
    public Object b(@l d d0) {
        return com.google.firebase.sessions.settings.h.a.b(this, d0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.firebase.sessions.settings.h
    @m
    public Boolean c() {
        return this.a.containsKey("firebase_sessions_enabled") ? Boolean.valueOf(this.a.getBoolean("firebase_sessions_enabled")) : null;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.firebase.sessions.settings.h
    @m
    public e d() {
        return this.a.containsKey("firebase_sessions_sessions_restart_timeout") ? e.f(g.m0(this.a.getInt("firebase_sessions_sessions_restart_timeout"), kotlin.time.h.e)) : null;
    }

    @Override  // com.google.firebase.sessions.settings.h
    public boolean e() {
        return false;
    }

    private static void f() {
    }
}

