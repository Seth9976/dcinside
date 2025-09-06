package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.h;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.util.f;
import com.google.firebase.remoteconfig.B;
import com.google.firebase.remoteconfig.p;
import com.google.firebase.remoteconfig.w;
import com.google.firebase.u;
import h2.b;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0L;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000L;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    private final ConcurrentHashMap allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final e cache;
    private final Executor executor;
    @Nullable
    private p firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    @Nullable
    private b firebaseRemoteConfigProvider;
    private static final RemoteConfigManager instance;
    private static final a logger;

    static {
        RemoteConfigManager.logger = a.e();
        RemoteConfigManager.instance = new RemoteConfigManager();
        RemoteConfigManager.TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12L);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(e.h(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, 5000L + ((long)new Random().nextInt(25000)), RemoteConfigManager.getInitialStartupMillis());
    }

    @VisibleForTesting
    RemoteConfigManager(e e0, Executor executor0, p p0, long v, long v1) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = e0;
        this.executor = executor0;
        this.firebaseRemoteConfig = p0;
        this.allRcConfigMap = p0 == null ? new ConcurrentHashMap() : new ConcurrentHashMap(p0.p());
        this.appStartTimeInMs = v1;
        this.appStartConfigFetchDelayInMs = v;
    }

    public f getBoolean(String s) {
        if(s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config boolean value is null.");
            return f.a();
        }
        w w0 = this.getRemoteConfigValue(s);
        if(w0 != null) {
            try {
                return f.e(Boolean.valueOf(w0.d()));
            }
            catch(IllegalArgumentException unused_ex) {
                if(!w0.asString().isEmpty()) {
                    Object[] arr_object = {w0.asString(), s};
                    RemoteConfigManager.logger.b("Could not parse value: \'%s\' for key: \'%s\'.", arr_object);
                }
            }
        }
        return f.a();
    }

    @VisibleForTesting
    protected long getCurrentSystemTimeMillis() [...] // 潜在的解密器

    public f getDouble(String s) {
        if(s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config double value is null.");
            return f.a();
        }
        w w0 = this.getRemoteConfigValue(s);
        if(w0 != null) {
            try {
                return f.e(w0.c());
            }
            catch(IllegalArgumentException unused_ex) {
                if(!w0.asString().isEmpty()) {
                    Object[] arr_object = {w0.asString(), s};
                    RemoteConfigManager.logger.b("Could not parse value: \'%s\' for key: \'%s\'.", arr_object);
                }
            }
        }
        return f.a();
    }

    @VisibleForTesting
    static long getInitialStartupMillis() {
        u u0 = (u)h.p().l(u.class);
        return u0 == null ? System.currentTimeMillis() : u0.c();
    }

    public static RemoteConfigManager getInstance() {
        return RemoteConfigManager.instance;
    }

    public f getLong(String s) {
        if(s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config long value is null.");
            return f.a();
        }
        w w0 = this.getRemoteConfigValue(s);
        if(w0 != null) {
            try {
                return f.e(w0.b());
            }
            catch(IllegalArgumentException unused_ex) {
                if(!w0.asString().isEmpty()) {
                    Object[] arr_object = {w0.asString(), s};
                    RemoteConfigManager.logger.b("Could not parse value: \'%s\' for key: \'%s\'.", arr_object);
                }
            }
        }
        return f.a();
    }

    private w getRemoteConfigValue(String s) {
        this.triggerRemoteConfigFetchIfNecessary();
        if(this.isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(s)) {
            w w0 = (w)this.allRcConfigMap.get(s);
            if(w0.N() == 2) {
                Object[] arr_object = {w0.asString(), s};
                RemoteConfigManager.logger.b("Fetched value: \'%s\' for key: \'%s\' from Firebase Remote Config.", arr_object);
                return w0;
            }
        }
        return null;
    }

    public Object getRemoteConfigValueOrDefault(String s, Object object0) {
        String s1;
        w w0 = this.getRemoteConfigValue(s);
        if(w0 != null) {
            try {
                if(object0 instanceof Boolean) {
                    return Boolean.valueOf(w0.d());
                }
                if(object0 instanceof Double) {
                    return w0.c();
                }
                if(object0 instanceof Long || object0 instanceof Integer) {
                    return w0.b();
                }
                if(object0 instanceof String) {
                    return w0.asString();
                }
                s1 = w0.asString();
                goto label_13;
            }
            catch(IllegalArgumentException unused_ex) {
            }
            goto label_16;
            try {
            label_13:
                RemoteConfigManager.logger.b("No matching type found for the defaultValue: \'%s\', using String.", new Object[]{object0});
                return s1;
            }
            catch(IllegalArgumentException unused_ex) {
                object0 = s1;
            }
        label_16:
            if(!w0.asString().isEmpty()) {
                Object[] arr_object = {w0.asString(), s};
                RemoteConfigManager.logger.b("Could not parse value: \'%s\' for key: \'%s\'.", arr_object);
            }
        }
        return object0;
    }

    public f getString(String s) {
        if(s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config String value is null.");
            return f.a();
        }
        w w0 = this.getRemoteConfigValue(s);
        return w0 == null ? f.a() : f.e(w0.asString());
    }

    @VisibleForTesting
    public static int getVersionCode(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long v) {
        return v - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long v) {
        return v - this.firebaseRemoteConfigLastFetchTimestampMs > RemoteConfigManager.TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        if(this.firebaseRemoteConfig == null) {
            b b0 = this.firebaseRemoteConfigProvider;
            if(b0 != null) {
                B b1 = (B)b0.get();
                if(b1 != null) {
                    this.firebaseRemoteConfig = b1.e("fireperf");
                }
            }
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        return this.firebaseRemoteConfig == null || this.firebaseRemoteConfig.s().c() == 1 || this.firebaseRemoteConfig.s().c() == 2;
    }

    // 检测为 Lambda 实现
    private void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean boolean0) [...]

    // 检测为 Lambda 实现
    private void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exception0) [...]

    public void setFirebaseRemoteConfigProvider(@Nullable b b0) {
        this.firebaseRemoteConfigProvider = b0;
    }

    // 去混淆评级： 低(40)
    private boolean shouldFetchAndActivateRemoteConfigValues() {
        return this.hasAppStartConfigFetchDelayElapsed(0x1991AF4F427L) && this.hasLastFetchBecomeStale(0x1991AF4F427L);
    }

    @VisibleForTesting
    protected void syncConfigValues(Map map0) {
        this.allRcConfigMap.putAll(map0);
        for(Object object0: this.allRcConfigMap.keySet()) {
            String s = (String)object0;
            if(!map0.containsKey(s)) {
                this.allRcConfigMap.remove(s);
            }
        }
        c.g();
        w w0 = (w)this.allRcConfigMap.get("fpr_experiment_app_start_ttid");
        if(w0 != null) {
            try {
                boolean z = w0.d();
                this.cache.p("com.google.firebase.perf.ExperimentTTID", z);
            }
            catch(Exception unused_ex) {
                RemoteConfigManager.logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
            }
            return;
        }
        RemoteConfigManager.logger.a("ExperimentTTID remote config flag does not exist.");
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0x1991AF4D48EL;
        Task task0 = this.firebaseRemoteConfig.o();
        com.google.firebase.perf.config.f f0 = (Boolean boolean0) -> this.syncConfigValues(this.firebaseRemoteConfig.p());
        Task task1 = task0.addOnSuccessListener(this.executor, f0);
        g g0 = (Exception exception0) -> {
            RemoteConfigManager.logger.m("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", new Object[]{exception0});
            this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        };
        task1.addOnFailureListener(this.executor, g0);
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if(!this.isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if(this.allRcConfigMap.isEmpty()) {
            Map map0 = this.firebaseRemoteConfig.p();
            this.allRcConfigMap.putAll(map0);
        }
        if(this.shouldFetchAndActivateRemoteConfigValues()) {
            this.triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }
}

