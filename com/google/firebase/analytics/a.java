package com.google.firebase.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.d;
import com.google.firebase.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a {
    @m
    private static volatile FirebaseAnalytics a;
    @l
    private static final Object b;

    static {
        a.b = new Object();
    }

    @Nullable
    public static final FirebaseAnalytics a() {
        return a.a;
    }

    @l
    public static final FirebaseAnalytics b(@NonNull d d0) {
        L.p(d0, "<this>");
        if(a.a == null) {
            synchronized(a.b) {
                if(a.a == null) {
                    a.a = FirebaseAnalytics.getInstance(q.c(d.a).n());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics0 = a.a;
        L.m(firebaseAnalytics0);
        return firebaseAnalytics0;
    }

    @l
    public static final Object c() {
        return a.b;
    }

    public static final void d(@NonNull FirebaseAnalytics firebaseAnalytics0, @NonNull String s, @NonNull Function1 function10) {
        L.p(firebaseAnalytics0, "<this>");
        L.p(s, "name");
        L.p(function10, "block");
        com.google.firebase.analytics.d d0 = new com.google.firebase.analytics.d();
        function10.invoke(d0);
        firebaseAnalytics0.c(s, d0.a());
    }

    public static final void e(@m FirebaseAnalytics firebaseAnalytics0) {
        a.a = firebaseAnalytics0;
    }

    public static final void f(@NonNull FirebaseAnalytics firebaseAnalytics0, @NonNull Function1 function10) {
        L.p(firebaseAnalytics0, "<this>");
        L.p(function10, "block");
        b b0 = new b();
        function10.invoke(b0);
        firebaseAnalytics0.f(b0.a());
    }
}

