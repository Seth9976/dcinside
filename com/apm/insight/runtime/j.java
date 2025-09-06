package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;
import com.apm.insight.e;

public final class j {
    private static MonitorCrash a = null;
    private static int b = -1;
    private static int c;

    static {
    }

    public static MonitorCrash a() {
        if(j.a == null) {
            MonitorCrash monitorCrash0 = MonitorCrash.initSDK(e.g(), "239017", 200000390L, "2.0.0.3", "com.apm.insight");
            j.a = monitorCrash0;
            monitorCrash0.config().setChannel("release");
        }
        return j.a;
    }

    public static void a(Throwable throwable0, String s) {
        if(e.g() == null) {
            return;
        }
        if(j.b == -1) {
            j.b = 5;
        }
        int v = j.c;
        if(v < j.b) {
            j.c = v + 1;
            j.a().reportCustomErr(s, "INNER", throwable0);
        }
    }
}

