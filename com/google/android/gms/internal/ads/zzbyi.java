package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.DynamiteModule;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o3.j;

@j
public final class zzbyi {
    @VisibleForTesting
    final AtomicBoolean zza;
    private final AtomicReference zzb;
    private final Object zzc;
    @Nullable
    private String zzd;
    private final AtomicInteger zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    private final ConcurrentMap zzh;
    private final Object zzi;

    public zzbyi() {
        this.zzb = new AtomicReference(null);
        this.zzc = new Object();
        this.zzd = null;
        this.zza = new AtomicBoolean(false);
        this.zze = new AtomicInteger(-1);
        this.zzf = new AtomicReference(null);
        this.zzg = new AtomicReference(null);
        this.zzh = new ConcurrentHashMap(9);
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.zzi = new Object();
    }

    @Nullable
    public final String zza(Context context0) {
        if(this.zzp(context0)) {
            Object object0 = this.zzs("generateEventId", context0);
            return object0 == null ? null : object0.toString();
        }
        return null;
    }

    @Nullable
    public final String zzb(Context context0) {
        if(!this.zzp(context0)) {
            return null;
        }
        long v = (long)(((Long)zzbe.zzc().zza(zzbcl.zzat)));
        if(v < 0L) {
            return (String)this.zzs("getAppInstanceId", context0);
        }
        if(this.zzb.get() == null) {
            ExecutorService executorService0 = new ThreadPoolExecutor(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzau)))), ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzau)))), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbyh(this));
            zzbyf.zza(this.zzb, null, executorService0);
        }
        Future future0 = ((ExecutorService)this.zzb.get()).submit(() -> ((String)this.zzs("getAppInstanceId", context0)));
        try {
            return (String)future0.get(v, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException unused_ex) {
            return "TIME_OUT";
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public final String zzc(Context context0) {
        if(this.zzp(context0) && this.zzx(context0, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            try {
                String s = (String)this.zzt(context0, "getCurrentScreenName").invoke(this.zzf.get(), null);
                if(s == null) {
                    s = (String)this.zzt(context0, "getCurrentScreenClass").invoke(this.zzf.get(), null);
                }
                return s == null ? "" : s;
            }
            catch(Exception unused_ex) {
                this.zzw("getCurrentScreenName", false);
            }
        }
        return "";
    }

    @Nullable
    public final String zzd(Context context0) {
        if(!this.zzp(context0)) {
            return null;
        }
        synchronized(this.zzc) {
            String s = this.zzd;
            if(s != null) {
                return s;
            }
            String s1 = (String)this.zzs("getGmpAppId", context0);
            this.zzd = s1;
            return s1;
        }
    }

    // 检测为 Lambda 实现
    final String zze(Context context0) throws Exception [...]

    public final void zzf(Context context0, String s) {
        if(!this.zzp(context0)) {
            return;
        }
        this.zzu(context0, s, "beginAdUnitExposure");
    }

    public final void zzg(Context context0, String s) {
        if(!this.zzp(context0)) {
            return;
        }
        this.zzu(context0, s, "endAdUnitExposure");
    }

    public final void zzh(Context context0, String s) {
        this.zzv(context0, "_aa", s, null);
    }

    public final void zzi(Context context0, String s) {
        this.zzv(context0, "_aq", s, null);
    }

    public final void zzj(Context context0, @Nullable String s, @Nullable Map map0) {
        this.zzv(context0, "_ac", s, zzbyi.zzq(map0));
    }

    public final void zzk(Context context0, @Nullable String s, @Nullable Map map0) {
        this.zzv(context0, "_ai", s, zzbyi.zzq(map0));
    }

    public final void zzl(Context context0, @Nullable String s, String s1, String s2, int v) {
        if(!this.zzp(context0)) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("_ai", s1);
        bundle0.putString("reward_type", s2);
        bundle0.putInt("reward_value", v);
        this.zzv(context0, "_ar", s, bundle0);
        zze.zza(("Log a Firebase reward video event, reward type: " + s2 + ", reward value: " + v));
    }

    public final void zzm(Context context0, zzm zzm0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaA)).booleanValue() && this.zzp(context0) && zzbyi.zzr(context0)) {
        }
    }

    public final void zzn(Context context0, zzfv zzfv0) {
        zzbyj.zzd(context0).zzb().zzc(zzfv0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaA)).booleanValue() && this.zzp(context0) && zzbyi.zzr(context0)) {
        }
    }

    @Deprecated
    public final void zzo(Context context0, String s) {
        if(this.zzp(context0) && context0 instanceof Activity && this.zzx(context0, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            Method method0 = (Method)this.zzh.get("setCurrentScreen");
            if(method0 == null) {
                try {
                    method0 = context0.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.zzh.put("setCurrentScreen", method0);
                }
                catch(Exception unused_ex) {
                    this.zzw("setCurrentScreen", false);
                    method0 = null;
                }
            }
            try {
                method0.invoke(this.zzg.get(), ((Activity)context0), s, "com.dcinside.app.android");
            }
            catch(Exception unused_ex) {
                this.zzw("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzp(Context context0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzan)).booleanValue() && !this.zza.get()) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzay)).booleanValue()) {
                return true;
            }
            if(this.zze.get() == -1) {
                if(!zzf.zzs(context0, 12451000) && zzf.zzt(context0)) {
                    zzo.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.zze.set(0);
                    return this.zze.get() == 1;
                }
                this.zze.set(1);
            }
            return this.zze.get() == 1;
        }
        return false;
    }

    public static final Bundle zzq(@Nullable Map map0) {
        Bundle bundle0 = new Bundle();
        if(map0 != null) {
            for(Object object0: map0.keySet()) {
                String s = (String)object0;
                try {
                    if(Objects.equals(s, "value")) {
                        bundle0.putDouble(s, Double.parseDouble(((String)map0.get(s))));
                        continue;
                    }
                    bundle0.putString(s, ((String)map0.get(s)));
                }
                catch(NumberFormatException | NullPointerException unused_ex) {
                }
            }
        }
        return bundle0;
    }

    @VisibleForTesting
    static final boolean zzr(Context context0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzav)).booleanValue() || DynamiteModule.getLocalVersion(context0, "com.google.android.gms.ads.dynamite") < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzaw))))) {
            return false;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzax)).booleanValue()) {
            try {
                context0.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        return true;
    }

    @Nullable
    private final Object zzs(String s, Context context0) {
        if(!this.zzx(context0, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return null;
        }
        Method method0 = this.zzt(context0, s);
        try {
            return method0.invoke(this.zzf.get(), null);
        }
        catch(Exception unused_ex) {
            this.zzw(s, true);
            return null;
        }
    }

    @Nullable
    private final Method zzt(Context context0, String s) {
        Method method0 = (Method)this.zzh.get(s);
        if(method0 != null) {
            return method0;
        }
        try {
            Method method1 = context0.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(s, null);
            this.zzh.put(s, method1);
            return method1;
        }
        catch(Exception unused_ex) {
            this.zzw(s, false);
            return null;
        }
    }

    private final void zzu(Context context0, String s, String s1) {
        if(!this.zzx(context0, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return;
        }
        Method method0 = (Method)this.zzh.get(s1);
        if(method0 == null) {
            try {
                method0 = context0.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(s1, String.class);
                this.zzh.put(s1, method0);
            }
            catch(Exception unused_ex) {
                this.zzw(s1, false);
                method0 = null;
            }
        }
        try {
            method0.invoke(this.zzf.get(), s);
            zze.zza(("Invoke Firebase method " + s1 + ", Ad Unit Id: " + s));
        }
        catch(Exception unused_ex) {
            this.zzw(s1, false);
        }
    }

    private final void zzv(Context context0, String s, String s1, @Nullable Bundle bundle0) {
        if(this.zzp(context0)) {
            Bundle bundle1 = new Bundle();
            try {
                bundle1.putLong("_aeid", Long.parseLong(s1));
            }
            catch(NullPointerException | NumberFormatException nullPointerException0) {
                zzo.zzh(("Invalid event ID: " + s1), nullPointerException0);
            }
            if("_ac".equals(s)) {
                bundle1.putInt("_r", 1);
            }
            if(bundle0 != null) {
                bundle1.putAll(bundle0);
            }
            if(this.zzx(context0, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                Method method0 = (Method)this.zzh.get("logEventInternal");
                if(method0 == null) {
                    try {
                        method0 = context0.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzh.put("logEventInternal", method0);
                    }
                    catch(Exception unused_ex) {
                        this.zzw("logEventInternal", true);
                        method0 = null;
                    }
                }
                try {
                    method0.invoke(this.zzf.get(), "am", s, bundle1);
                }
                catch(Exception unused_ex) {
                    this.zzw("logEventInternal", true);
                }
            }
        }
    }

    private final void zzw(String s, boolean z) {
        if(!this.zza.get()) {
            zzo.zzj(("Invoke Firebase method " + s + " error."));
            if(z) {
                zzo.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zza.set(true);
            }
        }
    }

    private final boolean zzx(Context context0, String s, AtomicReference atomicReference0, boolean z) {
        if(atomicReference0.get() == null) {
            try {
                zzbyf.zza(atomicReference0, null, context0.getClassLoader().loadClass(s).getDeclaredMethod("getInstance", Context.class).invoke(null, context0));
                return true;
            }
            catch(Exception unused_ex) {
                this.zzw("getInstance", z);
                return false;
            }
        }
        return true;
    }
}

