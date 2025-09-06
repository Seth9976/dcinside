package com.bytedance.sdk.openadsdk.api.init;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import androidx.core.content.pm.a0;
import com.bytedance.sdk.component.Au.DWo;
import com.bytedance.sdk.component.PjT;
import com.bytedance.sdk.component.SM.JQp;
import com.bytedance.sdk.component.SM.cz.ReZ;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.Au;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.Lrd.Zh.XX;
import com.bytedance.sdk.openadsdk.XX.Zh;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.core.Au.xf;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.iZZ;
import com.bytedance.sdk.openadsdk.core.qla;
import com.bytedance.sdk.openadsdk.core.settings.SM;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.ltE;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import s.b;
import y.a;

public class PAGSdk {
    public interface PAGInitCallback {
        void fail(int arg1, String arg2);

        void success();
    }

    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    private static long PjT;

    static {
        try {
            PjT.PjT(new com.bytedance.sdk.component.PjT.PjT() {
                @Override  // com.bytedance.sdk.component.PjT$PjT
                public ExecutorService getExecutorService() {
                    return Jo.JQp();
                }

                @Override  // com.bytedance.sdk.component.PjT$PjT
                public HandlerThread getSafeHandlerThread(String s, int v) {
                    return Au.PjT(s, v);
                }
            });
            Jo.PjT(new com.bytedance.sdk.component.Au.Au("tt_init_memory_data") {
                @Override
                public void run() {
                    PAGInitHelper.initAPM();
                    PAGInitHelper.initMemoryData();
                }
            });
            fDm.PjT(System.currentTimeMillis());
            fDm.Zh();
            cz.setWebViewProvider(new ReZ() {
                @Override  // com.bytedance.sdk.component.SM.cz$ReZ
                public WebView createWebView(Context context0, AttributeSet attributeSet0, int v) {
                    if(!(context0 instanceof MutableContextWrapper)) {
                        context0 = context0.getApplicationContext();
                    }
                    try {
                        return v == 0 ? new JQp(context0, attributeSet0) : new JQp(context0, attributeSet0, v);
                    }
                    catch(Exception unused_ex) {
                        return v == 0 ? new JQp(context0, attributeSet0) : new JQp(context0, attributeSet0, v);
                    }
                }
            });
        }
        catch(Throwable throwable0) {
            Log.i("TTAD.PAGSdk", throwable0.getMessage());
        }
        PAGSdk.PjT = 0L;
    }

    private static void JQp(Context context0, InitConfig initConfig0) {
        if(!SM.PjT()) {
            return;
        }
        com.bytedance.sdk.component.Au.cz.ReZ(-1);
        com.bytedance.sdk.component.Au.JQp.PjT(new DWo() {
            @Override  // com.bytedance.sdk.component.Au.DWo
            public com.bytedance.sdk.component.Au.SM createThreadFactory(int v, String s) {
                return new com.bytedance.sdk.component.Au.SM(v, s) {
                    final com.bytedance.sdk.openadsdk.api.init.PAGSdk.7 cr;

                    @Override  // com.bytedance.sdk.component.Au.SM
                    public Thread newThread(Runnable runnable0) {
                        if(com.bytedance.sdk.component.Au.SM.sCrashHappened) {
                            return null;
                        }
                        int v = xs.Gr().CY();
                        if(v >= 0xFFF80000 && v < 0) {
                            Thread thread0 = new Thread(this.PjT, runnable0, this.Zh, ((long)v));
                            if(thread0.isDaemon()) {
                                thread0.setDaemon(false);
                            }
                            if(this.ReZ > 10 || this.ReZ <= 0) {
                                this.ReZ = 5;
                            }
                            thread0.setPriority(this.ReZ);
                            return thread0;
                        }
                        return super.newThread(runnable0);
                    }
                };
            }
        });
        com.bytedance.sdk.openadsdk.multipro.ReZ.PjT(context0);
        Zh.ReZ();
        fDm.Zh.set(true);
        try {
            com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().PjT(new com.bytedance.sdk.openadsdk.SM.PjT());
        }
        catch(Exception exception0) {
            RD.Zh("TTAD.PAGSdk", exception0.getMessage());
        }
        PAGSdk.ReZ(initConfig0);
        PAGSdk.ReZ(context0, initConfig0);
        b.d(context0, null);
        b.c(2);
        b.f(initConfig0.isSupportMultiProcess());
        b.e(com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().JQp());
        if(Build.VERSION.SDK_INT < 23) {
            a.c(context0);
        }
    }

    private static void PjT(Context context0, boolean z, InitConfig initConfig0, long v, long v1) {
        com.bytedance.sdk.openadsdk.qla.ReZ.PjT();
        com.bytedance.sdk.openadsdk.qla.ReZ.PjT("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    boolean z = com.bytedance.sdk.openadsdk.core.SM.Zh().ReZ();
                    jSONObject0.put("duration", v);
                    jSONObject0.put("sdk_init_time", v1);
                    jSONObject0.put("is_async", true);
                    jSONObject0.put("is_multi_process", initConfig0.isSupportMultiProcess());
                    jSONObject0.put("is_debug", PAGSdk.Zh(initConfig0));
                    jSONObject0.put("is_use_texture_view", initConfig0.isUseTextureView());
                    jSONObject0.put("is_activate_init", z);
                    jSONObject0.put("minSdkVersion", wN.qj(context0));
                    jSONObject0.put("targetSdkVersion", wN.DWo(context0));
                    jSONObject0.put("apm_is_init", false);
                    jSONObject0.put("is_success", z);
                    com.bytedance.sdk.openadsdk.core.SM.Zh().Zh(false);
                    return cr.Zh().PjT("pangle_sdk_init").Zh(jSONObject0.toString());
                }
                catch(Exception exception0) {
                    RD.PjT("TTAD.PAGSdk", "run: ", exception0);
                    return cr.Zh().PjT("pangle_sdk_init").Zh(jSONObject0.toString());
                }
            }
        });
    }

    private static void PjT(InitConfig initConfig0, PAGInitCallback pAGSdk$PAGInitCallback0) {
        fDm.PjT(2);
        if(pAGSdk$PAGInitCallback0 != null) {
            if(initConfig0 instanceof PAGConfig) {
                PAGSdk.Zh(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
                return;
            }
            PAGSdk.Zh(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
        }
    }

    private static void ReZ() {
        if(Build.VERSION.SDK_INT >= 26) {
            try {
                Context context0 = ub.PjT();
                if(context0 != null) {
                    ShortcutManager shortcutManager0 = a0.a(context0.getSystemService(ShortcutManager.class));
                    if(shortcutManager0 != null) {
                        com.bytedance.sdk.openadsdk.core.SM.Zh().PjT(shortcutManager0.isRequestPinShortcutSupported());
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private static void ReZ(Context context0, InitConfig initConfig0) {
        fDm.PjT = true;
        int v = initConfig0.getGdpr();
        iZZ.PjT().PjT(initConfig0.getAppId()).Zh(v).JQp(initConfig0.getPA()).cr(initConfig0.getAppIconId()).PjT(initConfig0.getTitleBarTheme()).ReZ(initConfig0.getAdxId());
        com.bytedance.sdk.openadsdk.core.SM.cRA();
        if(initConfig0 instanceof PAGConfig) {
            iZZ.PjT().ReZ(((int)((PAGConfig)initConfig0).getDebugLog()));
        }
        try {
            if(PAGSdk.Zh(initConfig0)) {
                iZZ.PjT().PjT();
                com.bytedance.sdk.openadsdk.utils.ub.PjT();
            }
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.component.utils.SM.PjT();
    }

    private static void ReZ(InitConfig initConfig0) {
        if(initConfig0 == null) {
            return;
        }
        if(!TextUtils.isEmpty(initConfig0.getData())) {
            com.bytedance.sdk.openadsdk.core.SM.Zh().ReZ(initConfig0.getData());
        }
        com.bytedance.sdk.openadsdk.core.SM.Zh().ReZ(PAGSdk.Zh(initConfig0));
    }

    private static String Zh(PAGBiddingRequest pAGBiddingRequest0) {
        if(ub.PjT() == null) {
            return "";
        }
        return iZZ.PjT() == null ? "" : iZZ.PjT().PjT(pAGBiddingRequest0);
    }

    // 检测为 Lambda 实现
    private static void Zh(int v, String s) [...]

    private static void Zh(Context context0, InitConfig initConfig0) {
        long v1;
        try {
            PAGSdk.JQp(context0, initConfig0);
            long v = SystemClock.elapsedRealtime() - PAGSdk.PjT;
            PAGSdk.cr();
            PAGSdk.cz(context0, initConfig0);
            v1 = v;
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAD.PAGSdk", throwable0.getMessage());
            long v2 = SystemClock.elapsedRealtime() - PAGSdk.PjT;
            PAGSdk.Zh(4000, throwable0.getMessage());
            v1 = v2;
        }
        PAGSdk.PjT(context0, false, initConfig0, SystemClock.elapsedRealtime() - PAGSdk.PjT, v1);
    }

    // 检测为 Lambda 实现
    private static void Zh(Context context0, InitConfig initConfig0, PAGInitCallback pAGSdk$PAGInitCallback0) [...]

    private static boolean Zh(InitConfig initConfig0) {
        return ((PAGConfig)initConfig0).getDebugLog();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGSdk$PAGInitCallback0) {
        if(pAGSdk$PAGInitCallback0 == null) {
            return;
        }
        if(fDm.cr() != 0) {
            return;
        }
        PAGInitHelper.CALLBACK_LIST.add(pAGSdk$PAGInitCallback0);
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.multipro.ReZ.PjT();
    }

    private static void cr() {
        List list0;
        fDm.PjT(1);
        try {
            list0 = PAGInitHelper.CALLBACK_LIST;
            __monitor_enter(list0);
        }
        catch(Throwable throwable0) {
            RD.Zh(throwable0.getMessage(), new Object[0]);
            return;
        }
        try {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                PAGInitCallback pAGSdk$PAGInitCallback0 = (PAGInitCallback)object0;
                if(pAGSdk$PAGInitCallback0 != null) {
                    iterator0.remove();
                    pAGSdk$PAGInitCallback0.success();
                }
            }
            __monitor_exit(list0);
            goto label_16;
        }
        catch(Throwable throwable1) {
        }
        try {
            __monitor_exit(list0);
            throw throwable1;
        label_16:
            com.bytedance.sdk.openadsdk.ub.ReZ.Zh(new com.bytedance.sdk.openadsdk.ub.cr() {
                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                    com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                    pjT0.Zh("init");
                    return pjT0;
                }
            });
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh(throwable0.getMessage(), new Object[0]);
    }

    private static void cr(Context context0, InitConfig initConfig0) {
        if(TextUtils.isEmpty(initConfig0.getPackageName())) {
            Lrd.PjT(null);
            com.bytedance.adsdk.ugeno.XX.cr.PjT(null);
        }
        else {
            Lrd.PjT(initConfig0.getPackageName());
            com.bytedance.adsdk.ugeno.XX.cr.PjT(initConfig0.getPackageName());
        }
        ub.Zh(context0);
        if(initConfig0.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.Zh.PjT();
        }
        else {
            com.bytedance.sdk.openadsdk.multipro.Zh.Zh();
        }
        xf.PjT();
        com.bytedance.sdk.openadsdk.core.DWo.Zh.PjT(context0);
    }

    private static void cz(Context context0, InitConfig initConfig0) {
        SystemClock.elapsedRealtime();
        Jo.PjT(new com.bytedance.sdk.component.Au.Au("init_sync") {
            @Override
            public void run() {
                fDm.PjT(initConfig0.getData());
                String s = initConfig0.getAppId();
                com.bytedance.sdk.openadsdk.RD.PjT.PjT(context0, s);
                com.bytedance.sdk.openadsdk.RD.PjT.PjT();
                com.bytedance.sdk.openadsdk.ub.ReZ.PjT();
                com.bytedance.sdk.openadsdk.ub.ReZ.Zh();
                com.bytedance.sdk.component.adexpress.PjT.Zh.cz.PjT(ltE.PjT() * 10);
                boolean z = initConfig0.isSupportMultiProcess();
                com.bytedance.sdk.openadsdk.cr.PjT.cr.PjT(context0, z);
                qla.PjT().Zh();
                com.bytedance.sdk.openadsdk.core.SM.ReZ.PjT();
                com.bytedance.sdk.openadsdk.tT.PjT.PjT(new com.bytedance.sdk.openadsdk.tT.PjT.PjT() {
                    final com.bytedance.sdk.openadsdk.api.init.PAGSdk.8 PjT;

                    public void onGdprChanged(int v) {
                        PAGConfig.setGDPRConsent(v);
                    }
                });
                xs.cr = xs.ReZ(context0);
                XX.Zh();
                a.d(ub.cr().zZ());
                a.e(CacheDirFactory.getICacheDir(0));
                com.bytedance.sdk.openadsdk.core.settings.cz cz0 = ub.cr();
                if(!cz0.xH()) {
                    __monitor_enter(cz0);
                    try {
                        if(!cz0.xH()) {
                            cz0.Zh();
                            cz0.iZZ();
                        }
                        __monitor_exit(cz0);
                        goto label_27;
                    }
                    catch(Throwable throwable0) {
                    }
                    __monitor_exit(cz0);
                    throw throwable0;
                }
            label_27:
                DeviceUtils.DWo();
                PAGInitHelper.maybeAsyncInitTask(context0);
                new String("");
                com.bytedance.sdk.component.Au.cz.PjT(true);
                com.bytedance.sdk.component.Au.cz.PjT(new com.bytedance.sdk.openadsdk.qla.Zh.PjT());
                DeviceUtils.PjT(context0);
                DeviceUtils.xf(context0);
                DeviceUtils.xs(context0);
                com.bytedance.sdk.openadsdk.qla.PjT.PjT();
                com.bytedance.sdk.openadsdk.core.settings.cr.PjT();
                com.bytedance.sdk.openadsdk.qla.ReZ.cr();
                wN.xs(context0);
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT();
                PAGSdk.ReZ();
                com.bytedance.sdk.openadsdk.core.SM.ReZ.Zh();
                com.bytedance.sdk.openadsdk.core.cr.PjT.PjT().Zh();
                com.bytedance.sdk.component.Au.ReZ.ReZ.PjT(fDm.Zh());
                com.bytedance.sdk.component.utils.Zh.PjT(new com.bytedance.sdk.component.utils.Zh.PjT() {
                    final com.bytedance.sdk.openadsdk.api.init.PAGSdk.8 PjT;

                    @Override  // com.bytedance.sdk.component.utils.Zh$PjT
                    public ExecutorService getAsyncStartActivityThreadPool() {
                        return Jo.SM();
                    }

                    @Override  // com.bytedance.sdk.component.utils.Zh$PjT
                    public boolean isEnableAsyncStartActivity() {
                        return com.bytedance.sdk.openadsdk.RD.PjT.PjT("start_activity_async", 0) == 1;
                    }
                });
            }
        });
    }

    public static String getApplicationName(Context context0) {
        try {
            PackageManager packageManager0 = context0.getApplicationContext().getPackageManager();
            return (String)packageManager0.getApplicationLabel(packageManager0.getApplicationInfo("com.dcinside.app.android", 0x80));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return "";
        }
    }

    public static String getBiddingToken() [...] // 潜在的解密器

    // 去混淆评级： 低(25)
    public static String getBiddingToken(Context context0) {
        ub.Zh(context0);
        return "";
    }

    public static String getBiddingToken(Context context0, String s) {
        ub.Zh(context0);
        return PAGSdk.getBiddingToken(s);
    }

    public static String getBiddingToken(String s) {
        if(ub.PjT() == null) {
            return "";
        }
        if(iZZ.PjT() != null) {
            PAGBiddingRequest pAGBiddingRequest0 = new PAGBiddingRequest();
            pAGBiddingRequest0.setSlotId(s);
            return iZZ.PjT().PjT(pAGBiddingRequest0);
        }
        return "";
    }

    public static void getBiddingToken(Context context0, PAGBiddingRequest pAGBiddingRequest0, BiddingTokenCallback biddingTokenCallback0) {
        if(biddingTokenCallback0 == null) {
            return;
        }
        Jo.JQp(new com.bytedance.sdk.component.Au.Au("getBiddingToken") {
            @Override
            public void run() {
                ub.Zh(context0);
                String s = PAGSdk.Zh(pAGBiddingRequest0);
                biddingTokenCallback0.onBiddingTokenCollected(s);
            }
        });
    }

    public static void getBiddingToken(BiddingTokenCallback biddingTokenCallback0) {
        if(biddingTokenCallback0 == null) {
            return;
        }
        Jo.JQp(new com.bytedance.sdk.component.Au.Au("getBiddingToken") {
            // 去混淆评级： 低(20)
            @Override
            public void run() {
                biddingTokenCallback0.onBiddingTokenCollected("");
            }
        });
    }

    public static void getBiddingToken(String s, BiddingTokenCallback biddingTokenCallback0) {
        if(biddingTokenCallback0 == null) {
            return;
        }
        Jo.JQp(new com.bytedance.sdk.component.Au.Au("getBiddingToken") {
            @Override
            public void run() {
                String s = PAGSdk.getBiddingToken(s);
                biddingTokenCallback0.onBiddingTokenCollected(s);
            }
        });
    }

    // 去混淆评级： 低(40)
    public static String getSDKVersion() {
        return "7.1.0.4";
    }

    public static void init(Context context0, PAGConfig pAGConfig0, PAGInitCallback pAGSdk$PAGInitCallback0) {
        fDm.Zh().post(() -> {
            PAGSdk.PjT = SystemClock.elapsedRealtime();
            ub.Zh(this.PjT);
            if(this.ReZ != null) {
                List list0 = PAGInitHelper.CALLBACK_LIST;
                synchronized(list0) {
                    if(!list0.contains(this.ReZ)) {
                        list0.add(this.ReZ);
                    }
                }
            }
            if(this.Zh == null) {
                PAGSdk.Zh(4000, "PAGConfig is null, please check.");
                return;
            }
            fDm.PjT(3);
            int v1 = this.Zh.getPA();
            if(v1 >= -1 && v1 <= 1) {
                if(this.PjT == null) {
                    PAGSdk.Zh(4000, "Context is null, please check. ");
                    return;
                }
                if(!(this.PjT instanceof Application)) {
                    Context context1 = this.PjT.getApplicationContext();
                    if(context1 != null) {
                        this.PjT = context1;
                    }
                }
                PAGSdk.cr(this.PjT, this.Zh);
                ApmHelper.initApm(this.PjT, this.Zh);
                try {
                    com.bytedance.sdk.openadsdk.core.SM.PjT((int v, String s) -> {
                        List list0;
                        fDm.PjT(2);
                        try {
                            list0 = PAGInitHelper.CALLBACK_LIST;
                            __monitor_enter(list0);
                        }
                        catch(Throwable throwable0) {
                            RD.Zh(throwable0.getMessage(), new Object[0]);
                            return;
                        }
                        try {
                            Iterator iterator0 = list0.iterator();
                            while(iterator0.hasNext()) {
                                Object object0 = iterator0.next();
                                PAGInitCallback pAGSdk$PAGInitCallback0 = (PAGInitCallback)object0;
                                if(pAGSdk$PAGInitCallback0 != null) {
                                    iterator0.remove();
                                    pAGSdk$PAGInitCallback0.fail(v, s);
                                }
                            }
                            com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                    com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                    pjT0.Zh("init");
                                    return pjT0;
                                }
                            });
                            __monitor_exit(list0);
                            return;
                        }
                        catch(Throwable throwable1) {
                        }
                        try {
                            __monitor_exit(list0);
                            throw throwable1;
                        }
                        catch(Throwable throwable0) {
                            RD.Zh(throwable0.getMessage(), new Object[0]);
                        }
                    });
                }
                catch(Throwable unused_ex) {
                    PAGSdk.Zh(4000, "Internal Error, setting exception. ");
                    return;
                }
                try {
                    Lrd.PjT(ub.PjT(), "tt_ad_logo_txt");
                    if(Lrd.cr(this.PjT, "tt_ad_logo") == 0) {
                        PAGSdk.PjT(this.Zh, this.ReZ);
                        return;
                    }
                }
                catch(Throwable unused_ex) {
                    PAGSdk.PjT(this.Zh, this.ReZ);
                    return;
                }
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() {
                    @Override  // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public IADTypeLoaderFactory createADTypeLoaderFactory(String s) {
                        return new com.bytedance.sdk.openadsdk.JQp.PjT();
                    }
                });
                if(!this.Zh.isSupportMultiProcess()) {
                    PAGSdk.Zh(this.PjT, this.Zh);
                    return;
                }
                com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT().PjT(new com.bytedance.sdk.openadsdk.multipro.aidl.Zh() {
                    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.Zh
                    public void onServiceConnected() {
                        fDm.Zh().post(new Runnable() {
                            final com.bytedance.sdk.openadsdk.api.init.PAGSdk.6 PjT;

                            @Override
                            public void run() {
                                PAGSdk.Zh(com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.this.PjT, com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.this.Zh);
                            }
                        });
                    }
                });
                com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT().ReZ();
                return;
            }
            PAGSdk.Zh(10004, "Not allowed PAConsent value, please set 0 or 1");

            final class com.bytedance.sdk.openadsdk.api.init.PAGSdk.4 implements com.bytedance.sdk.openadsdk.core.xs {
                @Override  // com.bytedance.sdk.openadsdk.core.xs
                public void fail(int v, String s) {
                    PAGSdk.Zh(v, s);
                }

                public void success() {
                    PAGSdk.cr();
                }
            }

        });
        fDm.Au();

        final class com.bytedance.sdk.openadsdk.api.init.PAGSdk.12 implements Runnable {
            com.bytedance.sdk.openadsdk.api.init.PAGSdk.12(Context context0, PAGConfig pAGConfig0, PAGInitCallback pAGSdk$PAGInitCallback0) {
            }

            @Override
            public void run() {
                PAGSdk.Zh(this.PjT, this.Zh, this.ReZ);
            }
        }

    }

    // 去混淆评级： 低(20)
    public static boolean isInitSuccess() [...] // 潜在的解密器

    public static boolean onlyVerityPlayable(String s, int v, String s1, String s2, String s3) {
        return iZZ.PjT() == null ? false : iZZ.PjT().PjT(s, v, s1, s2, s3);
    }

    public static void setAabPackageName(String s) {
        if(!TextUtils.isEmpty(s)) {
            Lrd.PjT(s);
            com.bytedance.adsdk.ugeno.XX.cr.PjT(s);
        }
    }

    public static void setAdRevenue(JSONObject jSONObject0) {
        if(jSONObject0 != null && ub.cr().ub() && PAGSdk.isInitSuccess()) {
            com.bytedance.sdk.openadsdk.qla.ReZ.PjT().PjT(jSONObject0);
        }
    }

    private static void setSdkDisable(boolean z) {
        com.bytedance.sdk.openadsdk.common.JQp.PjT(z);
    }
}

