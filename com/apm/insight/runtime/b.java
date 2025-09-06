package com.apm.insight.runtime;

import com.apm.insight.l.f;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public final class b {
    private static long a = -30000L;
    private static File b;

    static {
    }

    public static String a(long v, String s) {
        try {
            return f.a(new File("/sdcard/", "apminsight/TrackInfo/" + (v - v % 86400000L) / 86400000L + "/" + s), "\n");
        }
        catch(Throwable throwable0) {
            return throwable0.getMessage();
        }
    }

    public static void a() {
        File file0 = new File("/sdcard/", "apminsight/TrackInfo/");
        String[] arr_s = file0.list();
        if(arr_s == null) {
            return;
        }
        if(arr_s.length > 5) {
            Arrays.sort(arr_s);
            for(int v = 0; v < arr_s.length - 5; ++v) {
                f.a(new File(file0, arr_s[v]));
            }
        }
    }

    public static void a(long v) {
        if(v - b.a < 30000L) {
            return;
        }
        try {
            b.a = v;
            if(b.b == null) {
                long v1 = System.currentTimeMillis();
                b.b = new File("/sdcard/", "apminsight/TrackInfo/" + (v1 - v1 % 86400000L) / 86400000L + "/" + "5b23b803302512c5U");
            }
            f.a(b.b, "1757088858831", false);
        }
        catch(IOException unused_ex) {
        }
    }
}

