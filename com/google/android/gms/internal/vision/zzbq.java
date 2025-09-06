package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzbq implements zzay {
    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map zza;
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;
    private final Object zzd;
    private volatile Map zze;
    @GuardedBy("this")
    private final List zzf;

    static {
        zzbq.zza = new ArrayMap();
    }

    private zzbq(SharedPreferences sharedPreferences0) {
        zzbt zzbt0 = (SharedPreferences sharedPreferences0, String s) -> {
            synchronized(this.zzd) {
                this.zze = null;
                zzbi.zza();
            }
            synchronized(this) {
                for(Object object0: this.zzf) {
                    ((zzaz)object0).zza();
                }
            }
        };
        this.zzc = zzbt0;
        this.zzd = new Object();
        this.zzf = new ArrayList();
        this.zzb = sharedPreferences0;
        sharedPreferences0.registerOnSharedPreferenceChangeListener(zzbt0);
    }

    static zzbq zza(Context context0, String s) {
        if(!(s.startsWith("direct_boot:") ? true : zzas.zza(context0))) {
            return null;
        }
        synchronized(zzbq.class) {
            Map map0 = zzbq.zza;
            zzbq zzbq0 = (zzbq)map0.get(s);
            if(zzbq0 == null) {
                zzbq0 = new zzbq(zzbq.zzb(context0, s));
                map0.put(s, zzbq0);
            }
            return zzbq0;
        }
    }

    static void zza() {
        synchronized(zzbq.class) {
            for(Object object0: zzbq.zza.values()) {
                ((zzbq)object0).zzb.unregisterOnSharedPreferenceChangeListener(((zzbq)object0).zzc);
            }
            zzbq.zza.clear();
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzay
    public final Object zza(String s) {
        Map map1;
        Map map0 = this.zze;
        if(map0 == null) {
            synchronized(this.zzd) {
                map0 = this.zze;
                if(map0 == null) {
                    StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                    try {
                        map1 = this.zzb.getAll();
                        this.zze = map1;
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

    private static SharedPreferences zzb(Context context0, String s) {
        SharedPreferences sharedPreferences1;
        SharedPreferences sharedPreferences0;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            if(s.startsWith("direct_boot:")) {
                sharedPreferences0 = context0.createDeviceProtectedStorageContext().getSharedPreferences(s.substring(12), 0);
                goto label_3;
            }
            sharedPreferences1 = context0.getSharedPreferences(s, 0);
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
            sharedPreferences1 = context0.getSharedPreferences(s, 0);
        }
        catch(Throwable throwable0) {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            throw throwable0;
        }
    label_10:
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return sharedPreferences1;
    }
}

