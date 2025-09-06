package com.apm.insight;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.j.b;
import com.apm.insight.runtime.l;
import java.util.HashMap;
import java.util.Map;

public class MonitorCrash {
    public class Config {
        String mAid;
        String mChannel;
        String mDeviceId;
        String[] mPackageName;
        String mSSID;
        String[] mSoList;
        String[] mThreadList;
        String mUID;
        long mVersionInt;
        String mVersionStr;

        public Config() {
            this.mVersionInt = -1L;
        }

        public Config setChannel(String s) {
            this.mChannel = s;
            b.c();
            return this;
        }

        public Config setDeviceId(String s) {
            this.mDeviceId = s;
            b.c();
            return this;
        }

        public Config setPackageName(String s) {
            return this.setPackageName(new String[]{s});
        }

        public Config setPackageName(String[] arr_s) {
            this.mPackageName = arr_s;
            b.c();
            return this;
        }

        public Config setSSID(String s) {
            this.mSSID = s;
            b.c();
            return this;
        }

        public Config setSoList(String[] arr_s) {
            this.mSoList = arr_s;
            b.c();
            return this;
        }

        public Config setThreadList(String[] arr_s) {
            this.mThreadList = arr_s;
            b.c();
            return this;
        }

        public Config setUID(String s) {
            this.mUID = s;
            b.c();
            return this;
        }
    }

    public interface HeaderParams {
        Map getCommonParams();
    }

    Config mConfig;
    AttachUserData mCustomData;
    AttachUserData mCustomLongData;
    public static CustomRequestHeader mCustomRequestHeader = null;
    HeaderParams mParams;
    HashMap mTagMap;
    private static volatile boolean sAppMonitorCrashInit = false;

    static {
    }

    private MonitorCrash(Context context0, String s, long v, String s1) {
        this.mTagMap = new HashMap();
        Config monitorCrash$Config0 = new Config(this);
        this.mConfig = monitorCrash$Config0;
        monitorCrash$Config0.mAid = s;
        monitorCrash$Config0.mVersionInt = v;
        monitorCrash$Config0.mVersionStr = s1;
        d.a(context0, this);
    }

    private MonitorCrash(String s, long v, String s1, String[] arr_s) {
        this.mTagMap = new HashMap();
        Config monitorCrash$Config0 = new Config(this);
        this.mConfig = monitorCrash$Config0;
        monitorCrash$Config0.mAid = s;
        monitorCrash$Config0.mVersionInt = v;
        monitorCrash$Config0.mVersionStr = s1;
        monitorCrash$Config0.mPackageName = arr_s;
        d.a(this);
    }

    public MonitorCrash addTags(String s, String s1) {
        this.mTagMap.put(s, s1);
        return this;
    }

    @NonNull
    public Config config() {
        return this.mConfig;
    }

    @Nullable
    public static MonitorCrash init(Context context0, String s, long v, String s1) {
        if(!MonitorCrash.sAppMonitorCrashInit) {
            Class class0 = MonitorCrash.class;
            synchronized(class0) {
                if(!MonitorCrash.sAppMonitorCrashInit) {
                    MonitorCrash.sAppMonitorCrashInit = true;
                    l.a(context0);
                    return new MonitorCrash(context0, s, v, s1);
                }
            }
        }
        return null;
    }

    public static MonitorCrash initSDK(Context context0, String s, long v, String s1, String s2) {
        l.a(context0);
        MonitorCrash monitorCrash0 = new MonitorCrash(s, v, s1, new String[]{s2});
        monitorCrash0.config().setPackageName(s2);
        return monitorCrash0;
    }

    public static MonitorCrash initSDK(Context context0, String s, long v, String s1, String s2, String[] arr_s) {
        l.a(context0);
        MonitorCrash monitorCrash0 = new MonitorCrash(s, v, s1, new String[]{s2});
        monitorCrash0.config().setPackageName(s2).setSoList(arr_s);
        return monitorCrash0;
    }

    public static MonitorCrash initSDK(Context context0, String s, long v, String s1, String[] arr_s) {
        l.a(context0);
        MonitorCrash monitorCrash0 = new MonitorCrash(s, v, s1, arr_s);
        monitorCrash0.config().setPackageName(arr_s);
        return monitorCrash0;
    }

    public static MonitorCrash initSDK(Context context0, String s, long v, String s1, String[] arr_s, String[] arr_s1) {
        l.a(context0);
        MonitorCrash monitorCrash0 = new MonitorCrash(s, v, s1, arr_s);
        monitorCrash0.config().setPackageName(arr_s).setSoList(arr_s1);
        return monitorCrash0;
    }

    public void registerCrashCallback(ICrashCallback iCrashCallback0, CrashType crashType0) {
        if(this == d.a) {
            l.a(iCrashCallback0, crashType0);
            return;
        }
        l.a(new com.apm.insight.b(this.mConfig.mAid, iCrashCallback0), crashType0);
    }

    public void registerOOMCallback(IOOMCallback iOOMCallback0) {
        if(this == d.a) {
            l.a(iOOMCallback0);
            return;
        }
        l.a(new com.apm.insight.b(this.mConfig.mAid, iOOMCallback0));
    }

    public void reportCustomErr(String s, String s1, Throwable throwable0) {
        com.apm.insight.f.b.a(this, throwable0, s, s1, "core_exception_monitor");
    }

    public MonitorCrash setCustomDataCallback(AttachUserData attachUserData0) {
        this.mCustomData = attachUserData0;
        return this;
    }

    public static void setCustomRequestHeaderCallback(CustomRequestHeader customRequestHeader0) {
        MonitorCrash.mCustomRequestHeader = customRequestHeader0;
    }

    public MonitorCrash setReportUrl(String s) {
        int v1;
        if(TextUtils.isEmpty(s)) {
            return this;
        }
        int v = s.indexOf("://");
        if(v < 0) {
            s = "https://" + s;
            v1 = 8;
        }
        else {
            v1 = v + 3;
        }
        int v2 = s.indexOf("/", v1);
        if(v2 >= 0) {
            s = s.substring(0, v2);
        }
        a.a(("set url " + s));
        e.i().setLaunchCrashUrl(s + "/monitor/collect/c/exception");
        e.i().setJavaCrashUploadUrl(s + "/monitor/collect/c/crash");
        e.i().setNativeCrashUrl(s + "/monitor/collect/c/native_bin_crash");
        e.i().setConfigUrl(s + "/settings/get");
        return this;
    }

    public MonitorCrash withOtherHeaders(@Nullable HeaderParams monitorCrash$HeaderParams0) {
        this.mParams = monitorCrash$HeaderParams0;
        return this;
    }
}

