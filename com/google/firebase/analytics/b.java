package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import y4.l;
import y4.m;

public final class b {
    @m
    private a a;
    @m
    private a b;
    @m
    private a c;
    @m
    private a d;

    @l
    public final Map a() {
        Map map0 = new LinkedHashMap();
        a firebaseAnalytics$a0 = this.a;
        if(firebaseAnalytics$a0 != null) {
            map0.put(com.google.firebase.analytics.FirebaseAnalytics.b.a, firebaseAnalytics$a0);
        }
        a firebaseAnalytics$a1 = this.b;
        if(firebaseAnalytics$a1 != null) {
            map0.put(com.google.firebase.analytics.FirebaseAnalytics.b.b, firebaseAnalytics$a1);
        }
        a firebaseAnalytics$a2 = this.c;
        if(firebaseAnalytics$a2 != null) {
            map0.put(com.google.firebase.analytics.FirebaseAnalytics.b.c, firebaseAnalytics$a2);
        }
        a firebaseAnalytics$a3 = this.d;
        if(firebaseAnalytics$a3 != null) {
            map0.put(com.google.firebase.analytics.FirebaseAnalytics.b.d, firebaseAnalytics$a3);
        }
        return map0;
    }

    @Nullable
    public final a b() {
        return this.d;
    }

    @Nullable
    public final a c() {
        return this.a;
    }

    @Nullable
    public final a d() {
        return this.c;
    }

    @Nullable
    public final a e() {
        return this.b;
    }

    public final void f(@m a firebaseAnalytics$a0) {
        this.d = firebaseAnalytics$a0;
    }

    public final void g(@m a firebaseAnalytics$a0) {
        this.a = firebaseAnalytics$a0;
    }

    public final void h(@m a firebaseAnalytics$a0) {
        this.c = firebaseAnalytics$a0;
    }

    public final void i(@m a firebaseAnalytics$a0) {
        this.b = firebaseAnalytics$a0;
    }
}

