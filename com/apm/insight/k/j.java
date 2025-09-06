package com.apm.insight.k;

import android.util.Log;
import androidx.annotation.NonNull;
import com.apm.insight.entity.b;
import com.apm.insight.l.f;
import com.apm.insight.runtime.a;
import com.apm.insight.runtime.d;
import com.apm.insight.runtime.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONArray;

public final class j {
    private static File a = null;
    private static boolean b = false;
    private static boolean c = false;
    private static Map d;

    static {
    }

    public static void a(String s) {
        if(j.d == null) {
            j.d = new HashMap();
        }
        j.d.put(s, "1757088850833");
    }

    public static void a(JSONArray jSONArray0) {
        try {
            f.a(new File("/sdcard/", "apminsight/configCrash/configFile"), jSONArray0);
        }
        catch(IOException unused_ex) {
        }
        try {
            f.a(j.h(), j.d);
        }
        catch(Throwable unused_ex) {
        }
    }

    static boolean a() [...] // 潜在的解密器

    static boolean b() [...] // 潜在的解密器

    static void c() {
        if(j.b) {
            return;
        }
        j.c = true;
        File file0 = new File("/sdcard/", "apminsight/configCrash/configFile");
        if(!file0.exists()) {
            return;
        }
        try {
            a.a(new JSONArray(f.a(file0, "\n")), false);
            j.b = true;
        }
        catch(Throwable unused_ex) {
            a.a(null, false);
        }
    }

    public static void d() {
        j.c();
        if(j.g()) {
            com.apm.insight.k.a.a();
        }
    }

    public static void e() {
        m.a().a(new Runnable() {
            @Override
            public final void run() {
                if(j.g()) {
                    com.apm.insight.k.a.a();
                }
            }
        });
    }

    public static void f() {
        Map map0 = j.d;
        if(map0 != null) {
            map0.clear();
        }
    }

    static boolean g() {
        boolean z;
        File file0 = j.h();
        try {
            Map map0 = j.d == null ? f.c(file0) : j.d;
            j.d = map0;
            if(map0 == null) {
                j.d = new HashMap();
                return true;
            }
            if(map0.size() < 0) {
                return true;
            }
            for(Object object0: b.d()) {
                if(!j.d.containsKey(((String)object0))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            long v = System.currentTimeMillis();
            Iterator iterator1 = j.d.entrySet().iterator();
            z = false;
            while(true) {
            label_17:
                if(!iterator1.hasNext()) {
                    if(z) {
                        com.apm.insight.a.a("config should be updated");
                        return true;
                    }
                    com.apm.insight.a.a("config should not be updated");
                    return false;
                }
                Object object1 = iterator1.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                break;
            }
        }
        catch(Throwable throwable0) {
            Log.e("npth", "err", throwable0);
            return true;
        }
        try {
            if(v - ((long)Long.decode(((String)map$Entry0.getValue()))) <= d.d(((String)map$Entry0.getKey()))) {
                goto label_17;
            }
            z = true;
            goto label_17;
        }
        catch(Throwable throwable1) {
            try {
                com.apm.insight.a.a(throwable1);
                goto label_17;
            }
            catch(Throwable throwable0) {
            }
        }
        Log.e("npth", "err", throwable0);
        return true;
    }

    @NonNull
    private static File h() {
        if(j.a == null) {
            j.a = new File("/sdcard/", "apminsight/configCrash/configInvalid");
        }
        return j.a;
    }
}

