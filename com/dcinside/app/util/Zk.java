package com.dcinside.app.util;

import com.google.firebase.crashlytics.j;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class zk {
    @l
    public static final zk a;

    static {
        zk.a = new zk();
    }

    @n
    public static final void a(@l Throwable throwable0) {
        L.p(throwable0, "throwable");
        j.e().j(throwable0);
    }

    @n
    public static final void b(@l String s, @m String s1) {
        L.p(s, "key");
        j j0 = j.e();
        if(s1 == null) {
            return;
        }
        j0.r(s, s1);
    }
}

