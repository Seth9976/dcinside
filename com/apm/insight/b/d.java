package com.apm.insight.b;

import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.l.a;
import com.apm.insight.l.m;
import com.apm.insight.runtime.j;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    private static String a = null;
    private static long b = -1L;
    private static boolean c = false;
    private static FileObserver d;
    private static ActivityManager.ProcessErrorStateInfo e;

    static {
    }

    static String a(Context context0) {
        if(SystemClock.uptimeMillis() - d.b < 5000L) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo activityManager$ProcessErrorStateInfo0 = a.b(context0);
            if(activityManager$ProcessErrorStateInfo0 != null && Process.myPid() == activityManager$ProcessErrorStateInfo0.pid) {
                if(d.e != null && String.valueOf(d.e.condition).equals(String.valueOf(activityManager$ProcessErrorStateInfo0.condition)) && String.valueOf(d.e.processName).equals(String.valueOf(activityManager$ProcessErrorStateInfo0.processName)) && String.valueOf(d.e.pid).equals(String.valueOf(activityManager$ProcessErrorStateInfo0.pid)) && String.valueOf(d.e.uid).equals(String.valueOf(activityManager$ProcessErrorStateInfo0.uid)) && String.valueOf(d.e.tag).equals(String.valueOf(activityManager$ProcessErrorStateInfo0.tag)) && String.valueOf(d.e.shortMsg).equals(String.valueOf(activityManager$ProcessErrorStateInfo0.shortMsg)) && String.valueOf(d.e.longMsg).equals(String.valueOf(activityManager$ProcessErrorStateInfo0.longMsg))) {
                    return null;
                }
                d.e = activityManager$ProcessErrorStateInfo0;
                d.a = null;
                d.b = SystemClock.uptimeMillis();
                d.c = false;
                return "|------------- processErrorStateInfo--------------|\n" + ("condition: " + activityManager$ProcessErrorStateInfo0.condition + "\n") + ("processName: " + activityManager$ProcessErrorStateInfo0.processName + "\n") + ("pid: " + activityManager$ProcessErrorStateInfo0.pid + "\n") + ("uid: " + activityManager$ProcessErrorStateInfo0.uid + "\n") + ("tag: " + activityManager$ProcessErrorStateInfo0.tag + "\n") + ("shortMsg : " + activityManager$ProcessErrorStateInfo0.shortMsg + "\n") + ("longMsg : " + activityManager$ProcessErrorStateInfo0.longMsg + "\n") + "-----------------------end----------------------------";
            }
        }
        catch(Throwable unused_ex) {
        }
        String s = d.a;
        if(s != null) {
            d.c = true;
            d.a = null;
            d.b = SystemClock.uptimeMillis();
            return s;
        }
        return null;
    }

    public static JSONObject a() throws JSONException {
        try {
            StackTraceElement[] arr_stackTraceElement = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("thread_number", 1);
            jSONObject0.put("mainStackFromTrace", m.a(arr_stackTraceElement));
            return jSONObject0;
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
            return null;
        }
    }

    public static void a(String s, com.apm.insight.b.h.a h$a0) {
        FileObserver fileObserver0 = d.d;
        if(fileObserver0 != null) {
            fileObserver0.stopWatching();
        }
        com.apm.insight.b.d.1 d$10 = new FileObserver(s, h$a0, s) {
            private com.apm.insight.b.h.a a;
            private String b;

            {
                this.a = h$a0;
                this.b = s1;
                super(s, 0x88);
            }

            @Override  // android.os.FileObserver
            public final void onEvent(int v, @Nullable String s) {
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                try {
                    d.a = this.a.a();
                }
                catch(Throwable throwable0) {
                    j.a(throwable0, "NPTH_CATCH");
                }
            }
        };
        d.d = d$10;
        d$10.startWatching();
    }

    public static boolean b() [...] // 潜在的解密器

    public static void c() {
        d.e = null;
    }
}

