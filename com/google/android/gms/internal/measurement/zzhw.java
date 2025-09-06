package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzhw implements zzhb {
    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map zza;
    private final SharedPreferences zzb;
    private final Runnable zzc;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final Object zze;
    private volatile Map zzf;
    @GuardedBy("this")
    private final List zzg;

    static {
        zzhw.zza = new ArrayMap();
    }

    private zzhw(SharedPreferences sharedPreferences0, Runnable runnable0) {
        zzhv zzhv0 = (SharedPreferences sharedPreferences0, String s) -> {
            synchronized(this.zze) {
                this.zzf = null;
                this.zzc.run();
            }
            synchronized(this) {
                for(Object object0: this.zzg) {
                    ((zzgz)object0).zza();
                }
            }
        };
        this.zzd = zzhv0;
        this.zze = new Object();
        this.zzg = new ArrayList();
        this.zzb = sharedPreferences0;
        this.zzc = runnable0;
        sharedPreferences0.registerOnSharedPreferenceChangeListener(zzhv0);
    }

    private static SharedPreferences zza(Context context0, String s) {
        SharedPreferences sharedPreferences1;
        SharedPreferences sharedPreferences0;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            if(s.startsWith("direct_boot:")) {
                sharedPreferences0 = zzcu.zza(context0.createDeviceProtectedStorageContext(), s.substring(12), 0, zzcq.zza);
                goto label_3;
            }
            sharedPreferences1 = zzcu.zza(context0, s, 0, zzcq.zza);
            goto label_10;
        }
        catch(Throwable throwable0) {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            throw throwable0;
        }
    label_3:
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return sharedPreferences0;
        try {
            sharedPreferences1 = zzcu.zza(context0, s, 0, zzcq.zza);
        }
        catch(Throwable throwable0) {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            throw throwable0;
        }
    label_10:
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return sharedPreferences1;
    }

    @Nullable
    static zzhw zza(Context context0, String s, Runnable runnable0) {
        if(!(s.startsWith("direct_boot:") ? true : zzgs.zzb(context0))) {
            return null;
        }
        synchronized(zzhw.class) {
            Map map0 = zzhw.zza;
            zzhw zzhw0 = (zzhw)map0.get(s);
            if(zzhw0 == null) {
                zzhw0 = new zzhw(zzhw.zza(context0, s), runnable0);
                map0.put(s, zzhw0);
            }
            return zzhw0;
        }
    }

    static void zza() {
        synchronized(zzhw.class) {
            for(Object object0: zzhw.zza.values()) {
                ((zzhw)object0).zzb.unregisterOnSharedPreferenceChangeListener(((zzhw)object0).zzd);
            }
            zzhw.zza.clear();
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzhb
    @Nullable
    public final Object zza(String s) {
        Map map1;
        Map map0 = this.zzf;
        if(map0 == null) {
            synchronized(this.zze) {
                map0 = this.zzf;
                if(map0 == null) {
                    StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                    try {
                        map1 = this.zzb.getAll();
                        this.zzf = map1;
                    }
                    catch(Throwable throwable0) {
                        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                        throw throwable0;
                    }
                    StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                    map0 = map1;
                }
            }
        }
        return map0 == null ? null : map0.get(s);
    }

    // 检测为 Lambda 实现
    final void zza(SharedPreferences sharedPreferences0, String s) [...]
}

