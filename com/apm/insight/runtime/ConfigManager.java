package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.ICommonParams;
import com.apm.insight.b.i.a;
import com.apm.insight.l.g;
import com.apm.insight.nativecrash.b;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

public class ConfigManager {
    public static final long BLOCK_MONITOR_INTERVAL = 1000L;
    private static final long BLOCK_MONITOR_MIN_INTERVAL = 10L;
    public static final String CONFIG_URL_SUFFIX = "/settings/get";
    public static final String EXCEPTION_URL_SUFFIX = "/monitor/collect/c/exception";
    public static final String JAVA_URL_SUFFIX = "/monitor/collect/c/crash";
    private static final long LAUNCH_CRASH_INTERVAL = 8000L;
    public static final String LAUNCH_URL_SUFFIX = "/monitor/collect/c/exception/dump_collection";
    public static final String LOG_TYPE_ALL_STACK = "npth_enable_all_thread_stack";
    public static final String NATIVE_URL_SUFFIX = "/monitor/collect/c/native_bin_crash";
    private String mAlogUploadUrl;
    private String mAsanReportUploadUrl;
    private boolean mBlockMonitorEnable;
    private long mBlockMonitorInterval;
    private String mConfigUrl;
    private String mCoreDumpUrl;
    private a mEncryptImpl$1c14659d;
    private boolean mEnsureEnable;
    private boolean mEnsureWithLogcat;
    private String mExceptionUploadUrl;
    private boolean mIsDebugMode;
    private String mJavaCrashUploadUrl;
    private long mLaunchCrashInterval;
    private String mLaunchCrashUploadUrl;
    private int mLogcatDumpCount;
    private int mLogcatLevel;
    private boolean mNativeCrashMiniDump;
    private String mNativeCrashUploadUrl;
    private String mNativeMemUrl;
    private ThreadPoolExecutor mThreadPoolExecutor;
    private boolean reportErrorEnable;

    public ConfigManager() {
        this.reportErrorEnable = true;
        this.mNativeMemUrl = "";
        this.mCoreDumpUrl = "";
        this.mJavaCrashUploadUrl = "";
        this.mLaunchCrashUploadUrl = "";
        this.mExceptionUploadUrl = "";
        this.mConfigUrl = "";
        this.mNativeCrashUploadUrl = "";
        this.mAlogUploadUrl = "";
        this.mAsanReportUploadUrl = "";
        this.mLaunchCrashInterval = 8000L;
        this.mEncryptImpl$1c14659d = new a() {
            private ConfigManager a;

        };
        this.mLogcatDumpCount = 0x200;
        this.mLogcatLevel = 1;
        this.mNativeCrashMiniDump = true;
        this.mEnsureEnable = true;
        this.mEnsureWithLogcat = false;
        this.mBlockMonitorInterval = 1000L;
        this.mBlockMonitorEnable = false;
        this.mIsDebugMode = false;
    }

    public String getAlogUploadUrl() [...] // 潜在的解密器

    public String getAsanReportUploadUrl() {
        return this.mAsanReportUploadUrl;
    }

    public long getBlockInterval() {
        return this.mBlockMonitorInterval;
    }

    public String getConfigUrl() [...] // 潜在的解密器

    public String getCoreDumpUrl() {
        return this.mCoreDumpUrl;
    }

    @NonNull
    public a getEncryptImpl$1546c4a2() {
        return this.mEncryptImpl$1c14659d;
    }

    public String getExceptionUploadUrl() [...] // 潜在的解密器

    public Set getFilterThreadSet() {
        return g.a();
    }

    public String getJavaCrashUploadUrl() [...] // 潜在的解密器

    public long getLaunchCrashInterval() {
        return this.mLaunchCrashInterval;
    }

    public String getLaunchCrashUploadUrl() [...] // 潜在的解密器

    public int getLogcatDumpCount() {
        return this.mLogcatDumpCount;
    }

    public int getLogcatLevel() {
        return this.mLogcatLevel;
    }

    public String getNativeCrashUploadUrl() [...] // 潜在的解密器

    public String getNativeMemUrl() {
        return this.mNativeMemUrl;
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isApmExists() [...] // 潜在的解密器

    public boolean isBlockMonitorEnable() {
        return this.mBlockMonitorEnable;
    }

    public boolean isCrashIgnored(String s) {
        try {
            com.apm.insight.runtime.ConfigManager.3 configManager$30 = new e() {
                private ConfigManager b;

                @Override  // com.apm.insight.runtime.e
                @Nullable
                public final Object a(String s) {
                    return s.equals("md5") ? s : super.a(s);
                }
            };
            if(k.a("java_crash_ignore", configManager$30)) {
                return true;
            }
            return com.apm.insight.l.k.b(com.apm.insight.e.g()) ? k.a("java_crash_ignore", configManager$30) : false;
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public boolean isDebugMode() {
        return this.mIsDebugMode;
    }

    public boolean isEnsureEnable() {
        return this.mEnsureEnable;
    }

    public boolean isEnsureWithLogcat() {
        return this.mEnsureWithLogcat;
    }

    public boolean isNativeCrashMiniDump() {
        return this.mNativeCrashMiniDump;
    }

    public boolean isReportErrorEnable() {
        return this.reportErrorEnable;
    }

    public void setAlogUploadUrl(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.mAlogUploadUrl = s;
    }

    public void setBlockMonitorEnable(boolean z) {
        this.mBlockMonitorEnable = z;
    }

    public void setBlockMonitorInterval(long v) {
        this.mBlockMonitorInterval = v;
    }

    public void setConfigUrl(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.mConfigUrl = s;
    }

    public void setCurrentProcessName(String s) {
        com.apm.insight.l.a.a(s);
    }

    public void setDebugMode(boolean z) {
        this.mIsDebugMode = z;
    }

    public static void setDefaultCommonParams(ICommonParams iCommonParams0, Context context0) {
        com.apm.insight.e.a(new b(context0, iCommonParams0));
    }

    public void setEncryptImpl$22f2d42e(a i$a0) {
        if(i$a0 != null) {
            this.mEncryptImpl$1c14659d = i$a0;
        }
    }

    public void setEnsureEnable(boolean z) {
        this.mEnsureEnable = z;
    }

    public void setEnsureWithLogcat(boolean z) {
        this.mEnsureWithLogcat = z;
    }

    public void setJavaCrashUploadUrl(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.mJavaCrashUploadUrl = s;
    }

    public void setLaunchCrashInterval(long v) {
        if(v > 0L) {
            this.mLaunchCrashInterval = v;
        }
    }

    public void setLaunchCrashUrl(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.mExceptionUploadUrl = s;
        int v = s.indexOf("//");
        if(v == -1) {
            this.mLaunchCrashUploadUrl = s.substring(0, s.indexOf("/") + 1) + "monitor/collect/c/exception/dump_collection";
            return;
        }
        this.mLaunchCrashUploadUrl = s.substring(0, s.indexOf("/", v + 2) + 1) + "monitor/collect/c/exception/dump_collection";
    }

    public void setLogcatDumpCount(int v) {
        if(v > 0) {
            this.mLogcatDumpCount = v;
        }
    }

    public void setLogcatLevel(int v) {
        if(v >= 0 && v <= 4) {
            this.mLogcatLevel = v;
        }
    }

    public void setNativeCrashUrl(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.mNativeCrashUploadUrl = s;
    }

    public void setReportErrorEnable(boolean z) {
        this.reportErrorEnable = z;
    }

    public void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor0) {
        this.mThreadPoolExecutor = threadPoolExecutor0;
    }

    public static void updateDid(String s) {
        m.a().a(new Runnable() {
            @Override
            public final void run() {
                com.apm.insight.e.c().a(s);
                com.apm.insight.j.b.c();
            }
        });
    }
}

