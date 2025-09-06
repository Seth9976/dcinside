package com.bytedance.sdk.openadsdk.core.SM.PjT;

import android.app.Activity;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.ArrayMap;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh {
    private String Au;
    private boolean DWo;
    private long JQp;
    private static volatile Zh PjT;
    private final AtomicBoolean ReZ;
    private String SM;
    private String XX;
    private final ArrayList Zh;
    private long cr;
    private long cz;
    private boolean qj;

    static {
    }

    public Zh() {
        this.Zh = new ArrayList();
        this.ReZ = new AtomicBoolean(false);
        this.cr = System.currentTimeMillis();
        this.JQp = 0L;
        this.cz = 0L;
        this.XX = "";
        this.Au = "";
        this.SM = "";
        this.DWo = false;
        this.qj = false;
    }

    private static int PjT(Context context0, String s) {
        try {
            return context0.checkPermission(s, Process.myPid(), Process.myUid());
        }
        catch(Throwable unused_ex) {
            return Build.VERSION.SDK_INT < 23 ? 0 : -1;
        }
    }

    public static Zh PjT(Application application0) {
        if(Zh.PjT == null) {
            Class class0 = Zh.class;
            __monitor_enter(class0);
            try {
                if(Zh.PjT == null) {
                    Zh zh0 = new Zh();
                    Zh.PjT = zh0;
                    zh0.DWo = Zh.PjT(application0);
                    Zh zh1 = Zh.PjT;
                    zh1.qj = Zh.PjT(application0.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    Zh.PjT.PjT();
                }
                __monitor_exit(class0);
                return Zh.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return Zh.PjT;
    }

    private void PjT() {
        boolean z = true;
        ActivityThread.class.getDeclaredMethod("currentActivityThread", null).setAccessible(true);
        ActivityThread activityThread0 = ActivityThread.currentActivityThread();
        Field field0 = ActivityThread.class.getDeclaredField("mActivities");
        field0.setAccessible(true);
        ArrayMap arrayMap0 = (ArrayMap)field0.get(activityThread0);
        if(arrayMap0 == null) {
            return;
        }
        int v = arrayMap0.size();
        if(v > 0) {
            Class class0 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
            Field field1 = class0.getDeclaredField("stopped");
            field1.setAccessible(true);
            Field field2 = class0.getDeclaredField("activity");
            field2.setAccessible(true);
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arrayMap0.valueAt(v1);
                if(!((Boolean)field1.get(object0)).booleanValue()) {
                    String s = ((Activity)field2.get(object0)).getLocalClassName();
                    if(!this.Zh.contains(s)) {
                        this.Zh.add(s);
                    }
                }
            }
            AtomicBoolean atomicBoolean0 = this.ReZ;
            if(this.Zh.size() > 0) {
                z = false;
            }
            atomicBoolean0.set(z);
        }
    }

    private static boolean PjT(Context context0) {
        if(context0 == null) {
            return false;
        }
        ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
        return applicationInfo0 != null && (applicationInfo0.flags & 1) > 0;
    }

    public String PjT(String s, long v, int v1) {
        String s1;
        long v2 = System.currentTimeMillis();
        long v3 = v2 - this.JQp;
        long v4 = v2 - v;
        int v5 = v4 >= 500L ? 0 : 1;
        if(this.ReZ.get() && this.qj) {
            v5 |= 2;
        }
        if(!this.ReZ.get() && this.cz >= 5000L && v3 < 1000L) {
            v5 = this.Au.equals(this.SM) ? v5 | 4 : v5 | 8;
        }
        try {
            s1 = "";
            s1 = new JSONObject().put("rst", v5).put("adtag", s).put("bakdur", this.cz).put("rit", v1).put("poptime", v3).put("unlocktime", v4).put("bakground", this.ReZ).put("alert", this.qj).put("sys", this.DWo).put("actsize", this.Zh.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()).toString();
        }
        catch(JSONException unused_ex) {
        }
        this.XX = "";
        this.cz = 0L;
        this.JQp = 0L;
        this.cr = System.currentTimeMillis();
        return s1;
    }

    public void PjT(Activity activity0) {
        String s = activity0.getLocalClassName();
        if(this.Zh.size() == 0) {
            this.XX = s;
            this.JQp = System.currentTimeMillis();
            this.cz = System.currentTimeMillis() - this.cr;
            this.ReZ.set(false);
        }
        if(!this.Zh.contains(s)) {
            this.Zh.add(s);
        }
        if(!s.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") && !s.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            this.SM = s;
        }
    }

    public void Zh(Activity activity0) {
        String s = activity0.getLocalClassName();
        if(this.Zh.contains(s)) {
            this.Zh.remove(s);
        }
        if(this.Zh.size() == 0) {
            this.cr = System.currentTimeMillis();
            this.ReZ.set(true);
            this.Au = s;
        }
    }
}

