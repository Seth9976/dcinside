package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.Au.ReZ.JQp;
import com.bytedance.sdk.component.Au.ReZ.PjT;
import com.bytedance.sdk.component.Au.ReZ.ReZ;
import com.bytedance.sdk.component.Au.ReZ.Zh;
import com.bytedance.sdk.component.Au.ReZ.cz;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class Jo {
    private static volatile cz Au;
    private static volatile cz DWo;
    private static volatile cz JQp;
    private static volatile ThreadPoolExecutor PjT;
    private static volatile cz ReZ;
    private static volatile cz SM;
    private static volatile cz XX;
    private static volatile boolean Zh;
    private static volatile cz cr;
    private static volatile cz cz;
    private static volatile cz qj;

    static {
        ReZ.PjT(new PjT() {
            @Override  // com.bytedance.sdk.component.Au.ReZ.PjT
            public void PjT(cz cz0, Zh zh0) {
            }
        });
        ReZ.PjT(new JQp() {
            @Override  // com.bytedance.sdk.component.Au.ReZ.JQp
            public void PjT(cz cz0) {
                if(KM.PjT) {
                    return;
                }
                if(cz0 != null) {
                    try {
                        LinkedHashMap linkedHashMap0 = cz0.PjT();
                        if(linkedHashMap0 != null && linkedHashMap0.size() > 0) {
                            for(Object object0: linkedHashMap0.entrySet()) {
                                com.bytedance.sdk.component.Au.ReZ.PjT.PjT pjT0 = (com.bytedance.sdk.component.Au.ReZ.PjT.PjT)((Map.Entry)object0).getValue();
                                if(pjT0 != null) {
                                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT();
                                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT("pag_thread_pool_state", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                                        final com.bytedance.sdk.openadsdk.utils.Jo.3 ReZ;

                                        @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                                        public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                                            JSONObject jSONObject0 = new JSONObject();
                                            try {
                                                jSONObject0.put("name", pjT0.PjT());
                                                jSONObject0.put("times", pjT0.Zh());
                                                jSONObject0.put("runMaxTime", pjT0.cz());
                                                jSONObject0.put("waitMaxTime", pjT0.JQp());
                                                int v = pjT0.Zh() == 0 ? 1 : pjT0.Zh();
                                                jSONObject0.put("avgRunTime", pjT0.cr() / ((long)v));
                                                jSONObject0.put("avgWaitTime", pjT0.ReZ() / ((long)v));
                                                jSONObject0.put("poolType", cz0.Zh());
                                                return cr.Zh().PjT("pag_thread_pool_state").Zh(jSONObject0.toString());
                                            }
                                            catch(Exception exception0) {
                                                RD.PjT("ThreadUtils", "run: ", exception0);
                                                return cr.Zh().PjT("pag_thread_pool_state").Zh(jSONObject0.toString());
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        throwable0.getMessage();
                    }
                }
            }
        });
        Jo.PjT = null;
        Jo.Zh = false;
    }

    public static ExecutorService Au() {
        return Jo.xf() ? Jo.gK() : com.bytedance.sdk.component.Au.cz.ReZ();
    }

    public static cz DWo() {
        Class class0 = Jo.class;
        __monitor_enter(class0);
        try {
            Jo.SM = Jo.PjT("express", Jo.SM);
            goto label_6;
        }
        catch(Throwable throwable0) {
            try {
                throwable0.getMessage();
            label_6:
                __monitor_exit(class0);
                return Jo.SM;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(class0);
        throw throwable1;
    }

    public static ExecutorService JQp() {
        return Jo.xf() ? Jo.SM() : com.bytedance.sdk.component.Au.cz.Zh();
    }

    public static void JQp(Au au0) {
        if(KM.PjT) {
            return;
        }
        if(Jo.xf()) {
            Jo.fDm().execute(new Zh(au0.getName(), au0) {
                @Override
                public void run() {
                    au0.run();
                }
            });
            return;
        }
        ThreadPoolExecutor threadPoolExecutor0 = Jo.xs();
        threadPoolExecutor0.execute(au0);
        if(!Jo.Zh && xs.QB()) {
            Jo.Zh = true;
            threadPoolExecutor0.setCorePoolSize(xs.Gr().Xtz());
        }
    }

    private static com.bytedance.sdk.component.Au.ReZ.cz.PjT PjT(String s) {
        com.bytedance.sdk.component.Au.ReZ.cz.PjT cz$PjT0 = Jo.Zh(s);
        try {
            if(xs.QB()) {
                cz$PjT0.Zh(true);
                JSONObject jSONObject0 = xs.Gr().xR();
                JSONObject jSONObject1 = jSONObject0 == null ? null : jSONObject0.optJSONObject(s);
                if(jSONObject1 != null) {
                    cz$PjT0.Zh(true);
                    if(jSONObject1.has("coreSize")) {
                        cz$PjT0.PjT(jSONObject1.optInt("coreSize"));
                    }
                    if(jSONObject1.has("maxSize")) {
                        cz$PjT0.Zh(jSONObject1.optInt("maxSize"));
                    }
                    if(jSONObject1.has("createSize")) {
                        cz$PjT0.ReZ(jSONObject1.optInt("createSize"));
                    }
                    if(jSONObject1.has("keepAlive")) {
                        cz$PjT0.PjT(((long)jSONObject1.optInt("keepAlive")));
                    }
                    if(jSONObject1.has("allowCoreTimeOut")) {
                        cz$PjT0.PjT(jSONObject1.optBoolean("allowCoreTimeOut"));
                    }
                    if(jSONObject1.has("reportLogThreshold")) {
                        cz$PjT0.JQp(jSONObject1.optInt("reportLogThreshold"));
                    }
                    if(jSONObject1.has("logTaskCount")) {
                        cz$PjT0.cr(jSONObject1.optInt("logTaskCount"));
                    }
                }
            }
            return cz$PjT0;
        }
        catch(Throwable unused_ex) {
        }
        return cz$PjT0;
    }

    private static cz PjT(String s, cz cz0) {
        com.bytedance.sdk.component.Au.ReZ.cz.PjT cz$PjT0 = Jo.PjT(s);
        if(cz0 == null) {
            return cz$PjT0.PjT();
        }
        cz0.PjT(cz$PjT0);
        return cz0;
    }

    public static ScheduledExecutorService PjT() {
        return com.bytedance.sdk.component.Au.cz.cz();
    }

    public static void PjT(Au au0) {
        if(KM.PjT) {
            return;
        }
        if(Jo.xf()) {
            Jo.SM().execute(new Zh(au0.getName()) {
                @Override
                public void run() {
                    au0.run();
                }
            });
            return;
        }
        com.bytedance.sdk.component.Au.cz.PjT(au0);
    }

    public static void PjT(Au au0, int v) {
        if(au0 == null) {
            return;
        }
        if(KM.PjT) {
            return;
        }
        if(Jo.xf()) {
            com.bytedance.sdk.openadsdk.utils.Jo.6 jo$60 = new Zh(au0.getName()) {
                @Override
                public void run() {
                    au0.run();
                }
            };
            jo$60.PjT(v);
            Jo.gK().execute(jo$60);
            return;
        }
        com.bytedance.sdk.component.Au.cz.PjT(au0, 5, v);
    }

    public static void PjT(Zh zh0) {
        Jo.qj().execute(zh0);
    }

    public static void PjT(Runnable runnable0) {
        if(runnable0 == null) {
            return;
        }
        if(KM.PjT) {
            return;
        }
        if(Jo.cz()) {
            runnable0.run();
            return;
        }
        fDm.ReZ().post(runnable0);
    }

    // 去混淆评级： 低(20)
    private static boolean PjT(cz cz0) [...] // 潜在的解密器

    public static ExecutorService ReZ() {
        return Jo.xf() ? Jo.ltE() : com.bytedance.sdk.component.Au.cz.ReZ();
    }

    public static void ReZ(Au au0) {
        if(au0 == null) {
            return;
        }
        if(KM.PjT) {
            return;
        }
        if(Jo.xf()) {
            Jo.qla().execute(new Zh(au0.getName()) {
                @Override
                public void run() {
                    au0.run();
                }
            });
            return;
        }
        com.bytedance.sdk.component.Au.cz.ReZ(au0);
    }

    public static void ReZ(Au au0, int v) {
        if(au0 == null) {
            return;
        }
        if(KM.PjT) {
            return;
        }
        if(Jo.xf()) {
            Jo.xE().execute(new Zh(au0.getName()) {
                @Override
                public void run() {
                    au0.run();
                }
            });
            return;
        }
        com.bytedance.sdk.component.Au.cz.ReZ(au0, v);
    }

    public static cz SM() {
        Class class0 = Jo.class;
        __monitor_enter(class0);
        try {
            Jo.cz = Jo.PjT("cache", Jo.cz);
            goto label_6;
        }
        catch(Throwable throwable0) {
            try {
                throwable0.getMessage();
            label_6:
                __monitor_exit(class0);
                return Jo.cz;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(class0);
        throw throwable1;
    }

    // 去混淆评级： 中等(50)
    public static boolean XX() {
        String s = Jo.xf() ? "pag_log" : "csj_log";
        return TextUtils.isEmpty("jeb-dexdec-sb-st-4638") ? false : "jeb-dexdec-sb-st-4638".startsWith(s);
    }

    private static com.bytedance.sdk.component.Au.ReZ.cz.PjT Zh(String s) {
        if(TextUtils.isEmpty(s)) {
            s = "unknown";
        }
        com.bytedance.sdk.component.Au.ReZ.cz.PjT cz$PjT0 = new com.bytedance.sdk.component.Au.ReZ.cz.PjT();
        s.hashCode();
        switch(s) {
            case "ad": {
                return cz$PjT0.PjT(s).PjT(4).Zh(4).ReZ(0).PjT(20000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
            case "aidl": {
                return cz$PjT0.PjT(s).PjT(2).Zh(4).ReZ(0).PjT(10000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
            case "cache": {
                return cz$PjT0.PjT(s).PjT(0).Zh(0).ReZ(0).PjT(5000L).PjT(true).JQp(-1).cr(20).Zh(false);
            }
            case "express": {
                return cz$PjT0.PjT(s).PjT(2).Zh(4).ReZ(0).PjT(10000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
            case "image": {
                return cz$PjT0.PjT(s).PjT(3).Zh(3).ReZ(0).PjT(20000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
            case "imgdisk": {
                return cz$PjT0.PjT(s).PjT(1).Zh(2).ReZ(3).PjT(10000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
            case "io": {
                return cz$PjT0.PjT(s).PjT(4).Zh(10).ReZ(0).PjT(20000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
            case "log": {
                return cz$PjT0.PjT(s).PjT(4).Zh(6).ReZ(2).PjT(20000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
            case "monitor": {
                return cz$PjT0.PjT(s).PjT(2).Zh(2).ReZ(0).PjT(10000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
            case "net": {
                return cz$PjT0.PjT(s).PjT(10).Zh(10).ReZ(0).PjT(10000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
            default: {
                return cz$PjT0.PjT(s).PjT(8).Zh(16).ReZ(2).PjT(20000L).PjT(true).JQp(-1).cr(10).Zh(false);
            }
        }
    }

    public static ExecutorService Zh() {
        return Jo.xf() ? Jo.ub() : com.bytedance.sdk.component.Au.cz.DWo();
    }

    public static void Zh(Au au0) {
        if(KM.PjT) {
            return;
        }
        if(Jo.xf()) {
            Jo.gK().execute(new Zh(au0.getName()) {
                @Override
                public void run() {
                    au0.run();
                }
            });
            return;
        }
        com.bytedance.sdk.component.Au.cz.Zh(au0);
    }

    public static void Zh(Au au0, int v) {
        if(au0 == null) {
            return;
        }
        if(KM.PjT) {
            return;
        }
        if(Jo.xf()) {
            com.bytedance.sdk.openadsdk.utils.Jo.8 jo$80 = new Zh(au0.getName()) {
                @Override
                public void run() {
                    au0.run();
                }
            };
            jo$80.PjT(v);
            Jo.qla().execute(jo$80);
            return;
        }
        com.bytedance.sdk.component.Au.cz.Zh(au0, v);
    }

    public static void Zh(Runnable runnable0) {
        if(runnable0 == null) {
            return;
        }
        fDm.ReZ().removeCallbacks(runnable0);
    }

    public static ExecutorService cr() {
        return Jo.xf() ? Jo.qla() : com.bytedance.sdk.component.Au.cz.cr();
    }

    public static void cr(Au au0) {
        if(au0 == null) {
            return;
        }
        if(KM.PjT) {
            return;
        }
        if(Jo.xf()) {
            Jo.fDm().execute(new Zh(au0.getName()) {
                @Override
                public void run() {
                    au0.run();
                }
            });
            return;
        }
        com.bytedance.sdk.component.Au.cz.JQp(au0);
    }

    public static boolean cz() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    private static ThreadPoolExecutor fDm() {
        Class class0 = Jo.class;
        __monitor_enter(class0);
        try {
            Jo.ReZ = Jo.PjT("ad", Jo.ReZ);
            goto label_6;
        }
        catch(Throwable throwable0) {
            try {
                throwable0.getMessage();
            label_6:
                __monitor_exit(class0);
                return Jo.ReZ;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(class0);
        throw throwable1;
    }

    private static cz gK() {
        Class class0 = Jo.class;
        __monitor_enter(class0);
        try {
            Jo.XX = Jo.PjT("io", Jo.XX);
            goto label_6;
        }
        catch(Throwable throwable0) {
            try {
                throwable0.getMessage();
            label_6:
                __monitor_exit(class0);
                return Jo.XX;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(class0);
        throw throwable1;
    }

    private static cz ltE() {
        Class class0 = Jo.class;
        __monitor_enter(class0);
        try {
            Jo.qj = Jo.PjT("imgdisk", Jo.qj);
            goto label_6;
        }
        catch(Throwable throwable0) {
            try {
                throwable0.getMessage();
            label_6:
                __monitor_exit(class0);
                return Jo.qj;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(class0);
        throw throwable1;
    }

    public static cz qj() {
        Class class0 = Jo.class;
        __monitor_enter(class0);
        try {
            Jo.DWo = Jo.PjT("net", Jo.DWo);
            goto label_6;
        }
        catch(Throwable throwable0) {
            try {
                throwable0.getMessage();
            label_6:
                __monitor_exit(class0);
                return Jo.DWo;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(class0);
        throw throwable1;
    }

    private static cz qla() {
        Class class0 = Jo.class;
        __monitor_enter(class0);
        try {
            Jo.cr = Jo.PjT("log", Jo.cr);
            goto label_6;
        }
        catch(Throwable throwable0) {
            try {
                throwable0.getMessage();
            label_6:
                __monitor_exit(class0);
                return Jo.cr;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(class0);
        throw throwable1;
    }

    private static cz ub() {
        Class class0 = Jo.class;
        __monitor_enter(class0);
        try {
            Jo.Au = Jo.PjT("image", Jo.Au);
            goto label_6;
        }
        catch(Throwable throwable0) {
            try {
                throwable0.getMessage();
            label_6:
                __monitor_exit(class0);
                return Jo.Au;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(class0);
        throw throwable1;
    }

    private static cz xE() {
        Class class0 = Jo.class;
        __monitor_enter(class0);
        try {
            Jo.JQp = Jo.PjT("aidl", Jo.JQp);
            goto label_6;
        }
        catch(Throwable throwable0) {
            try {
                throwable0.getMessage();
            label_6:
                __monitor_exit(class0);
                return Jo.JQp;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(class0);
        throw throwable1;
    }

    // 去混淆评级： 低(20)
    public static boolean xf() {
        return xs.QB() ? xs.Gr().dIF() : true;
    }

    private static ThreadPoolExecutor xs() {
        int v1;
        if(Jo.PjT == null) {
            Class class0 = Jo.class;
            __monitor_enter(class0);
            try {
                if(Jo.PjT == null) {
                    if(xs.QB()) {
                        int v = xs.Gr().Xtz();
                        Jo.Zh = true;
                        v1 = v;
                    }
                    else {
                        v1 = 4;
                    }
                    Jo.PjT = new ThreadPoolExecutor(v1, 0x7FFFFFFF, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                }
                __monitor_exit(class0);
                return Jo.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return Jo.PjT;
    }
}

