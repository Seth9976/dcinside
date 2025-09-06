package com.apm.insight;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.b.i.a;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.l;
import java.util.Map;

public final class Npth {
    private static boolean sInit;

    public static void addAttachLongUserData(AttachUserData attachUserData0, CrashType crashType0) {
        if(attachUserData0 != null) {
            e.b().b(attachUserData0, crashType0);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData0, CrashType crashType0) {
        if(attachUserData0 != null) {
            e.b().a(attachUserData0, crashType0);
        }
    }

    public static void addTags(Map map0) {
        if(map0 != null && !map0.isEmpty()) {
            e.b().a(map0);
        }
    }

    public static void checkInnerNpth(boolean z) {
        l.c(z);
    }

    public static void dumpHprof(String s) {
        l.c(s);
    }

    public static void enableALogCollector$422740a0$2ccf6887(String s, a i$a0, a i$a1) {
        l.a(s, i$a0, i$a1);
    }

    public static void enableAnrInfo(boolean z) {
        l.b(z);
    }

    public static void enableLoopMonitor(boolean z) {
        l.a(z);
    }

    public static void enableNativeDump(boolean z) {
        l.d(z);
    }

    public static void enableThreadsBoost() {
        e.l();
    }

    public static ConfigManager getConfigManager() {
        return e.i();
    }

    public static boolean hasCrash() {
        return l.l();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return l.m();
    }

    // 去混淆评级： 低(20)
    public static boolean hasCrashWhenNativeCrash() [...] // 潜在的解密器

    public static void init(@NonNull Application application0, @NonNull Context context0, @NonNull ICommonParams iCommonParams0, boolean z, boolean z1, boolean z2, boolean z3, long v) {
        synchronized(Npth.class) {
            if(Npth.sInit) {
                return;
            }
            Npth.sInit = true;
            l.a(application0, context0);
            e.a(application0, context0, iCommonParams0);
            Map map0 = e.a().a();
            int v2 = com.apm.insight.l.c.1.a(map0.get("update_version_code"), 0);
            MonitorCrash monitorCrash0 = MonitorCrash.init(context0, String.valueOf(com.apm.insight.l.c.1.a(map0.get("aid"), 4444)), ((long)v2), String.valueOf(map0.get("app_version")));
            if(monitorCrash0 != null) {
                monitorCrash0.config().setDeviceId("").setChannel(String.valueOf(map0.get("channel")));
            }
        }
    }

    public static void init(@NonNull Context context0, @NonNull ICommonParams iCommonParams0) {
        synchronized(Npth.class) {
            Npth.init(context0, iCommonParams0, true, false, false);
        }
    }

    public static void init(@NonNull Context context0, @NonNull ICommonParams iCommonParams0, boolean z, boolean z1, boolean z2) {
        synchronized(Npth.class) {
            Npth.init(context0, iCommonParams0, z, z, z1, z2);
        }
    }

    public static void init(@NonNull Context context0, @NonNull ICommonParams iCommonParams0, boolean z, boolean z1, boolean z2, boolean z3) {
        synchronized(Npth.class) {
            Npth.init(context0, iCommonParams0, z, z1, z2, z3, 0L);
        }
    }

    public static void init(@NonNull Context context0, @NonNull ICommonParams iCommonParams0, boolean z, boolean z1, boolean z2, boolean z3, long v) {
        Application application0;
        Context context1 = context0;
        synchronized(Npth.class) {
            if(e.h() != null) {
                application0 = e.h();
                Npth.init(application0, context1, iCommonParams0, z, z1, z2, z3, v);
                return;
            }
            if(context1 instanceof Application) {
                application0 = (Application)context1;
                if(application0.getBaseContext() == null) {
                    throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                }
                Npth.init(application0, context1, iCommonParams0, z, z1, z2, z3, v);
                return;
            }
            try {
                application0 = (Application)context0.getApplicationContext();
            }
            catch(Throwable unused_ex) {
                throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
            }
            if(application0 != null) {
                if(application0.getBaseContext() != null) {
                    context1 = application0.getBaseContext();
                }
                Npth.init(application0, context1, iCommonParams0, z, z1, z2, z3, v);
                return;
            }
        }
        throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
    }

    public static void initMiniApp(@NonNull Context context0, @NonNull ICommonParams iCommonParams0) {
        synchronized(Npth.class) {
            e.o();
            Npth.init(context0, iCommonParams0, true, false, true, true);
        }
    }

    public static void initMiniApp(@NonNull Context context0, @NonNull ICommonParams iCommonParams0, int v, String s) {
        synchronized(Npth.class) {
            e.o();
            e.b(v, s);
            Npth.init(context0, iCommonParams0, true, true, true, true);
        }
    }

    // 去混淆评级： 低(20)
    public static boolean isANREnable() {
        return false;
    }

    public static boolean isInit() {
        return Npth.sInit;
    }

    // 去混淆评级： 低(20)
    public static boolean isJavaCrashEnable() {
        return false;
    }

    // 去混淆评级： 低(20)
    public static boolean isNativeCrashEnable() {
        return false;
    }

    public static boolean isRunning() {
        return l.i();
    }

    // 去混淆评级： 低(20)
    public static boolean isStopUpload() [...] // 潜在的解密器

    public static void openANRMonitor() {
        l.g();
    }

    public static void openJavaCrashMonitor() {
        l.f();
    }

    public static boolean openNativeCrashMonitor() {
        return l.h();
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback0, CrashType crashType0) {
        l.a(iCrashCallback0, crashType0);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback0) {
        l.a(iOOMCallback0);
    }

    public static void registerSdk(int v, String s) {
        e.a(v, s);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData0, CrashType crashType0) {
        if(attachUserData0 != null) {
            e.b().b(crashType0, attachUserData0);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData0, CrashType crashType0) {
        if(attachUserData0 != null) {
            e.b().a(crashType0, attachUserData0);
        }
    }

    public static void reportDartError(String s) {
        l.a(s);
    }

    public static void reportDartError$1703a8c9(String s, @Nullable Map map0, @Nullable Map map1, @Nullable com.apm.insight.b.h.a h$a0) {
        l.a(s, map0, map1, h$a0);
    }

    public static void reportDartError$721849be(String s, @Nullable Map map0, @Nullable Map map1, @Nullable Map map2, @Nullable com.apm.insight.b.h.a h$a0) {
        l.a(s, map0, map1, map2, h$a0);
    }

    @Deprecated
    public static void reportError(String s) {
        l.b(s);
    }

    @Deprecated
    public static void reportError(@NonNull Throwable throwable0) {
        l.a(throwable0);
    }

    public static void setAlogFlushAddr(long v) {
    }

    public static void setAlogFlushV2Addr(long v) {
        l.a(v);
    }

    public static void setAlogLogDirAddr(long v) {
        l.b(v);
    }

    public static void setAlogWriteAddr(long v) {
    }

    public static void setAnrInfoFileObserver$28c38359(String s, com.apm.insight.b.h.a h$a0) {
        l.a(s, h$a0);
    }

    public static void setApplication(Application application0) {
        e.a(application0);
    }

    @Deprecated
    public static void setAttachUserData(AttachUserData attachUserData0, CrashType crashType0) {
        if(attachUserData0 != null) {
            e.b().a(attachUserData0, crashType0);
        }
    }

    public static void setBusiness(String s) {
        if(s != null) {
            e.a(s);
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter0) {
        e.b().a(iCrashFilter0);
    }

    public static void setCrashWaitTime(long v) {
        com.apm.insight.g.a.a(v);
    }

    public static void setCurProcessName(String s) {
        com.apm.insight.l.a.a(s);
    }

    public static void setEncryptImpl$22f2d42e(@NonNull a i$a0) {
        l.a(i$a0);
    }

    public static void setLogcatImpl$4df9fca2(com.apm.insight.b.h.a h$a0) {
        l.a(h$a0);
    }

    public static void setRequestIntercept$5f954c60(com.apm.insight.b.h.a h$a0) {
        l.b(h$a0);
    }

    public static void stopAnr() {
        l.j();
    }

    public static void stopUpload() {
        l.p();
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback0, CrashType crashType0) {
        l.b(iCrashCallback0, crashType0);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback0, CrashType crashType0) {
        l.b(iOOMCallback0);
    }
}

