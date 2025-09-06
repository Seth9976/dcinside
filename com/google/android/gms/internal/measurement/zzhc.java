package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import o3.h;

final class zzhc implements zzhb {
    @GuardedBy("GservicesLoader.class")
    private static zzhc zza;
    @h
    private final Context zzb;
    @h
    private final ContentObserver zzc;

    private zzhc() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzhc(Context context0) {
        this.zzb = context0;
        zzhe zzhe0 = new zzhe(this, null);
        this.zzc = zzhe0;
        context0.getContentResolver().registerContentObserver(zzgi.zza, true, zzhe0);
    }

    static zzhc zza(Context context0) {
        synchronized(zzhc.class) {
            if(zzhc.zza == null) {
                zzhc.zza = PermissionChecker.d(context0, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhc(context0) : new zzhc();
            }
            return zzhc.zza;
        }
    }

    static void zza() {
        synchronized(zzhc.class) {
            zzhc zzhc0 = zzhc.zza;
            if(zzhc0 != null) {
                Context context0 = zzhc0.zzb;
                if(context0 != null && zzhc0.zzc != null) {
                    context0.getContentResolver().unregisterContentObserver(zzhc.zza.zzc);
                }
            }
            zzhc.zza = null;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzhb
    @h
    public final Object zza(String s) {
        return this.zzc(s);
    }

    // 检测为 Lambda 实现
    final String zzb(String s) [...]

    @h
    private final String zzc(String s) {
        if(this.zzb != null && !zzgs.zza(this.zzb)) {
            try {
                return (String)zzha.zza(() -> zzgj.zza(this.zzb.getContentResolver(), s, null));
            }
            catch(IllegalStateException | SecurityException | NullPointerException illegalStateException0) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + s, illegalStateException0);
            }
        }
        return null;
    }
}

