package com.apm.insight;

import com.apm.insight.b.a;
import com.apm.insight.f.b;
import com.apm.insight.l.g;

public final class c {
    private static a a;

    static {
        c.a = new a();
    }

    public static a a() {
        return c.a;
    }

    public static void a(Throwable throwable0, String s) {
        if(e.i().isEnsureEnable() && !g.a(throwable0)) {
            b.a(throwable0, s, "core_exception_monitor");
        }
    }
}

