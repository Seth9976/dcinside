package com.apm.insight.b;

import com.apm.insight.e;
import com.apm.insight.f.b;

public final class a {
    public a() {
        com.apm.insight.f.a.a();
    }

    public static void a(String s) {
        if(e.i().isEnsureEnable()) {
            b.a(Thread.currentThread().getStackTrace(), s, "EnsureNotReachHere");
        }
    }
}

