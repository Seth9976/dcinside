package com.apm.insight.h;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.n;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class b {
    private static HashMap a;
    private Map b;

    public b(File file0) {
        File file1 = j.c(file0);
        if(file1.exists() && file1.length() != 0L) {
            String s = NativeImpl.a(file1.getAbsolutePath());
            if(s == null) {
                return;
            }
            String[] arr_s = s.split("\n");
            this.b = new HashMap();
            for(int v = 0; v < arr_s.length; ++v) {
                String[] arr_s1 = arr_s[v].split("=");
                if(arr_s1.length == 2) {
                    this.b.put(arr_s1[0], arr_s1[1]);
                }
            }
        }
    }

    public static String a() {
        return e.g().getFilesDir() + "/apminsight/selflib/";
    }

    public static String a(String s) {
        return e.g().getFilesDir() + "/apminsight/selflib/lib" + s + ".so";
    }

    static void b() {
        if(b.a == null) {
            b.a = new HashMap();
            File file0 = new File(e.g().getFilesDir(), "/apminsight/selflib/");
            String[] arr_s = file0.list();
            if(arr_s != null) {
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    if(s.endsWith(".ver")) {
                        try {
                            b.a.put(s.substring(0, s.length() - 4), f.a((file0.getAbsolutePath() + "/" + s), "\n"));
                        }
                        catch(Throwable throwable0) {
                            com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
                        }
                    }
                    else if(!s.endsWith(".so")) {
                        f.a(new File(file0, s));
                    }
                }
            }
        }
    }

    public static void b(String s) {
        m.a().a(new Runnable() {
            private boolean a;

            {
                String s = s;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = false;
            }

            @Override
            public final void run() {
                String s1;
                b.b();
                if(!b.c(s)) {
                    n.a("updateSo", s);
                    File file0 = new File(b.a(s));
                    file0.getParentFile().mkdirs();
                    if(file0.exists()) {
                        file0.delete();
                    }
                    String s = "doUnpackLibrary: " + s;
                    if(e.i().isDebugMode()) {
                        Log.w("npth", s);
                    }
                    try {
                        s1 = c.a(e.g(), s, file0);
                    }
                    catch(Throwable throwable0) {
                        n.a("updateSoError", s);
                        com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
                        s1 = null;
                    }
                    if(s1 == null) {
                        b.a.put(file0.getName(), "2.0.0.3");
                        try {
                            String s2 = s;
                            f.a(new File(e.g().getFilesDir() + "/apminsight/selflib/" + s2 + ".ver"), "2.0.0.3", false);
                        }
                        catch(Throwable unused_ex) {
                        }
                        n.a("updateSoSuccess", s);
                        return;
                    }
                    if(!this.a) {
                        this.a = true;
                        n.a("updateSoPostRetry", s);
                        m.a().a(this, 3000L);
                        return;
                    }
                    n.a("updateSoFailed", s);
                }
            }
        });
    }

    // 去混淆评级： 低(20)
    static boolean c(String s) {
        return "2.0.0.3".equals(((String)b.a.get(s))) ? new File(b.a(s)).exists() : false;
    }

    public final boolean d() {
        if(this.b == null || this.b.isEmpty() || TextUtils.isEmpty(((CharSequence)this.b.get("process_name")))) {
            return false;
        }
        if(TextUtils.isEmpty(((CharSequence)this.b.get("crash_thread_name")))) {
            return false;
        }
        if(TextUtils.isEmpty(((CharSequence)this.b.get("pid")))) {
            return false;
        }
        if(TextUtils.isEmpty(((CharSequence)this.b.get("tid")))) {
            return false;
        }
        if(TextUtils.isEmpty(((CharSequence)this.b.get("start_time")))) {
            return false;
        }
        return TextUtils.isEmpty(((CharSequence)this.b.get("crash_time"))) ? false : !TextUtils.isEmpty(((CharSequence)this.b.get("signal_line")));
    }

    @Nullable
    public final String e() {
        return (String)this.b.get("signal_line");
    }

    public final Map f() {
        return this.b;
    }
}

