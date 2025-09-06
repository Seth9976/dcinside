package com.apm.insight.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.a;
import com.apm.insight.b;
import com.apm.insight.e;
import com.apm.insight.l.m;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.l;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

public class NativeCrashCollector {
    public static int a() [...] // Inlined contents

    private static void a(String s, String s1, String s2) {
        for(Object object0: l.a().d()) {
            ICrashCallback iCrashCallback0 = (ICrashCallback)object0;
            try {
                if(iCrashCallback0 instanceof b) {
                    ((b)iCrashCallback0).a(CrashType.NATIVE, s, s2, s1);
                    continue;
                }
                iCrashCallback0.onCrash(CrashType.NATIVE, s, null);
                continue;
            }
            catch(Throwable throwable0) {
            }
            j.a(throwable0, "NPTH_CATCH");
        }
    }

    @NonNull
    private static String b(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        if("main".equalsIgnoreCase(s)) {
            return m.a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup0 = Looper.getMainLooper().getThread().getThreadGroup();
        int v = threadGroup0.activeCount();
        Thread[] arr_thread = new Thread[v + v / 2];
        int v1 = threadGroup0.enumerate(arr_thread);
        for(int v2 = 0; v2 < v1; ++v2) {
            String s1 = arr_thread[v2].getName();
            if(!TextUtils.isEmpty(s1) && (s1.equals(s) || s1.startsWith(s) || s1.endsWith(s))) {
                return m.a(arr_thread[v2].getStackTrace());
            }
        }
        try {
            Iterator iterator0 = Thread.getAllStackTraces().entrySet().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return "";
                }
                Object object0 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s2 = ((Thread)map$Entry0.getKey()).getName();
                if(s2.equals(s) || s2.startsWith(s) || s2.endsWith(s)) {
                    return m.a(((StackTraceElement[])map$Entry0.getValue()));
                }
            }
        }
        catch(Throwable throwable0) {
        }
        j.a(throwable0, "NPTH_CATCH");
        return "";
    }

    @Keep
    public static void onNativeCrash(String s) {
        long v = System.currentTimeMillis();
        a.a("[onNativeCrash] enter");
        try {
            com.apm.insight.k.b.a().b();
            File file0 = com.apm.insight.l.j.e(new File(com.apm.insight.l.j.a(), "c8dbc4851c0557f9U"));
            f f0 = f.a();
            com.apm.insight.nativecrash.NativeCrashCollector.1 nativeCrashCollector$10 = new com.apm.insight.runtime.a.c.a() {
                @Override  // com.apm.insight.runtime.a.c$a
                public final com.apm.insight.entity.a a(int v, com.apm.insight.entity.a a0) {
                    switch(v) {
                        case 1: {
                            if(s != null && s.length() != 0) {
                                a0.a("java_data", NativeCrashCollector.b(s));
                            }
                            a0.a("crash_after_crash", "false");
                            return a0;
                        }
                        case 2: {
                            JSONArray jSONArray0 = com.apm.insight.b.f.b().b();
                            long v1 = SystemClock.uptimeMillis();
                            JSONObject jSONObject0 = com.apm.insight.b.f.b().a(v1).a();
                            JSONArray jSONArray1 = com.apm.insight.b.j.a(v1);
                            a0.a("history_message", jSONArray0);
                            a0.a("current_message", jSONObject0);
                            a0.a("pending_messages", jSONArray1);
                            a0.a("disable_looper_monitor", "false");
                            a0.a("npth_force_apm_crash", "false");
                            return a0;
                        }
                        case 3: {
                            if(com.apm.insight.runtime.a.d()) {
                                a0.a("all_thread_stacks", m.b(s));
                                a0.a("has_all_thread_stack", "true");
                                return a0;
                            }
                            return a0;
                        }
                        case 4: {
                            com.apm.insight.l.a.a(e.g(), a0.c());
                            return a0;
                        }
                        default: {
                            return a0;
                        }
                    }
                }

                @Override  // com.apm.insight.runtime.a.c$a
                public final com.apm.insight.entity.a b(int v, com.apm.insight.entity.a a0) {
                    try {
                        JSONObject jSONObject0 = a0.c();
                        if(jSONObject0.length() > 0) {
                            com.apm.insight.l.f.a(new File(file0.getAbsolutePath() + '.' + v), jSONObject0);
                        }
                    }
                    catch(IOException iOException0) {
                        j.a(iOException0, "NPTH_CATCH");
                    }
                    if(v == 0) {
                        com.apm.insight.a.a.a();
                        com.apm.insight.a.a.a();
                        new String("8be90cafecf0271cU");
                    }
                    return a0;
                }
            };
            com.apm.insight.entity.a a0 = f0.a(CrashType.NATIVE, nativeCrashCollector$10);
            JSONObject jSONObject0 = a0.c();
            if(jSONObject0 != null && jSONObject0.length() != 0) {
                long v1 = System.currentTimeMillis();
                long v2 = v1 - v;
                try {
                    jSONObject0.put("java_end", v1);
                    a0.b("crash_cost", String.valueOf(v2));
                    a0.a("crash_cost", String.valueOf(v2 / 1000L));
                }
                catch(Throwable unused_ex) {
                }
                File file1 = new File(file0.getAbsolutePath() + ".tmp");
                com.apm.insight.l.f.a(file1, jSONObject0);
                file1.renameTo(file0);
            }
        }
        catch(Throwable throwable0) {
            try {
                j.a(throwable0, "NPTH_CATCH");
            }
            catch(Throwable throwable1) {
                try {
                    if(!l.a().d().isEmpty()) {
                        File file2 = new File(com.apm.insight.l.j.a(), "c8dbc4851c0557f9U");
                        c c0 = new c(file2);
                        c0.b(file2);
                        NativeCrashCollector.a("", c0.a(), s);
                    }
                }
                catch(Throwable unused_ex) {
                    NativeCrashCollector.a("", null, s);
                }
                throw throwable1;
            }
            try {
                if(!l.a().d().isEmpty()) {
                    File file3 = new File(com.apm.insight.l.j.a(), "c8dbc4851c0557f9U");
                    c c1 = new c(file3);
                    c1.b(file3);
                    NativeCrashCollector.a("", c1.a(), s);
                }
            }
            catch(Throwable unused_ex) {
                NativeCrashCollector.a("", null, s);
            }
            return;
        }
        try {
            if(!l.a().d().isEmpty()) {
                File file4 = new File(com.apm.insight.l.j.a(), "c8dbc4851c0557f9U");
                c c2 = new c(file4);
                c2.b(file4);
                NativeCrashCollector.a("", c2.a(), s);
            }
        }
        catch(Throwable unused_ex) {
            NativeCrashCollector.a("", null, s);
        }
    }
}

