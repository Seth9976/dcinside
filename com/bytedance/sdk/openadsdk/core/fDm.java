package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.ub.ReZ;
import com.bytedance.sdk.openadsdk.ub.Zh.PjT;
import com.bytedance.sdk.openadsdk.ub.cr;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class fDm {
    private static volatile Handler Au = null;
    public static long JQp = 0L;
    public static volatile boolean PjT = false;
    public static long ReZ;
    private static volatile HandlerThread XX;
    public static AtomicBoolean Zh;
    public static float cr;
    private static volatile int cz;

    static {
        fDm.Zh = new AtomicBoolean(false);
        fDm.ReZ = 0L;
        fDm.cz = 0;
        fDm.cr = 1.0f;
        fDm.Au = null;
        com.bytedance.sdk.openadsdk.core.fDm.1 fDm$10 = new HandlerThread("csj_init_handle", 10) {
            boolean PjT;

            {
                String s = "csj_init_handle";  // 捕获的参数
                int v = 10;  // 捕获的参数
                this.PjT = false;
            }

            @Override
            public void start() {
                synchronized(this) {
                    if(this.PjT) {
                        return;
                    }
                    this.PjT = true;
                    super.start();
                }
            }
        };
        fDm.XX = fDm$10;
        fDm$10.start();
        Au.PjT(fDm.XX);
        fDm.JQp = System.currentTimeMillis();
    }

    public static void Au() {
        fDm.Zh().post(new Runnable() {
            @Override
            public void run() {
                try {
                    ReZ.PjT(new cr() {
                        final com.bytedance.sdk.openadsdk.core.fDm.4 PjT;

                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                        public PjT generatorModel() {
                            PjT pjT0 = new PjT();
                            pjT0.Zh("init");
                            return pjT0;
                        }
                    });
                }
                catch(Throwable throwable0) {
                    RD.Zh("InitHelper", throwable0.getMessage());
                }
            }
        });
    }

    // 去混淆评级： 低(20)
    public static boolean JQp() [...] // 潜在的解密器

    public static long PjT() [...] // 潜在的解密器

    public static void PjT(int v) {
        fDm.cz = v;
    }

    public static void PjT(long v) {
        fDm.JQp = v;
    }

    public static void PjT(String s) {
        try {
            if(!TextUtils.isEmpty(s)) {
                JSONArray jSONArray0 = new JSONArray(s);
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    if("mediation".equals(jSONObject0.optString("name", ""))) {
                        SM.Zh().Zh(jSONObject0.optString("value", ""));
                        return;
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("InitHelper", throwable0.getMessage());
        }
    }

    public static Handler ReZ() {
        return new Handler(Looper.getMainLooper());
    }

    public static void XX() {
        long v = SystemClock.elapsedRealtime();
        if(v - fDm.ReZ <= 10000L) {
            return;
        }
        synchronized(fDm.class) {
            if(v - fDm.ReZ <= 10000L) {
                return;
            }
            fDm.ReZ = v;
        }
        com.bytedance.sdk.component.utils.SM.PjT().post(new Runnable() {
            @Override
            public void run() {
                if(!TextUtils.equals("", xs.cr)) {
                    xs.Gr().PjT(6, true);
                    xs.cr = "";
                }
            }
        });
    }

    public static Handler Zh() {
        if(fDm.XX != null && fDm.XX.isAlive()) {
            if(fDm.Au == null) {
                Class class0 = fDm.class;
                __monitor_enter(class0);
                try {
                    if(fDm.Au == null) {
                        fDm.Au = new Handler(fDm.XX.getLooper());
                    }
                    __monitor_exit(class0);
                    return fDm.Au;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(class0);
                throw throwable0;
            }
            return fDm.Au;
        }
        Class class1 = fDm.class;
        __monitor_enter(class1);
        try {
            if(fDm.XX == null || !fDm.XX.isAlive()) {
                fDm.XX = Au.PjT("csj_init_handle", -1);
                fDm.Au = new Handler(fDm.XX.getLooper());
            }
            __monitor_exit(class1);
            return fDm.Au;
        }
        catch(Throwable throwable1) {
        }
        __monitor_exit(class1);
        throw throwable1;
    }

    public static int cr() [...] // 潜在的解密器

    public static void cz() {
        long v = SystemClock.elapsedRealtime();
        if(v - fDm.ReZ <= 10000L) {
            return;
        }
        fDm.ReZ = v;
        Jo.PjT(new com.bytedance.sdk.component.Au.Au("onSharedPreferenceChanged") {
            @Override
            public void run() {
                if(!TextUtils.equals("", xs.cr)) {
                    xs.Gr().PjT(6, true);
                    xs.cr = "";
                }
            }
        });
    }
}

