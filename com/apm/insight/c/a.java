package com.apm.insight.c;

import com.apm.insight.e;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {
    private static AtomicBoolean a;

    static {
        a.a = new AtomicBoolean(false);
    }

    public static boolean a() {
        synchronized(a.a) {
            if(a.a.get()) {
                return false;
            }
            a.a.set(true);
        }
        return a.b();
    }

    public static boolean b() {
        if(!com.apm.insight.runtime.a.g()) {
            return false;
        }
        try {
            File file0 = new File(e.h().getFilesDir(), "apminsight/crashCommand");
            file0.mkdirs();
            new File(file0, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }
}

