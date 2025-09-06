package com.google.android.gms.internal.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import o3.h;

final class zzbd implements zzay {
    @GuardedBy("GservicesLoader.class")
    private static zzbd zza;
    @h
    private final Context zzb;
    @h
    private final ContentObserver zzc;

    private zzbd() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzbd(Context context0) {
        this.zzb = context0;
        zzbf zzbf0 = new zzbf(this, null);
        this.zzc = zzbf0;
        context0.getContentResolver().registerContentObserver(zzaq.zza, true, zzbf0);
    }

    static zzbd zza(Context context0) {
        synchronized(zzbd.class) {
            if(zzbd.zza == null) {
                zzbd.zza = PermissionChecker.d(context0, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzbd(context0) : new zzbd();
            }
            return zzbd.zza;
        }
    }

    static void zza() {
        synchronized(zzbd.class) {
            zzbd zzbd0 = zzbd.zza;
            if(zzbd0 != null) {
                Context context0 = zzbd0.zzb;
                if(context0 != null && zzbd0.zzc != null) {
                    context0.getContentResolver().unregisterContentObserver(zzbd.zza.zzc);
                }
            }
            zzbd.zza = null;
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzay
    public final Object zza(String s) {
        return this.zzc(s);
    }

    // 检测为 Lambda 实现
    final String zzb(String s) [...]

    private final String zzc(String s) {
        if(this.zzb == null) {
            return null;
        }
        try {
            return (String)zzbb.zza(() -> zzaq.zza(this.zzb.getContentResolver(), s, null));
        }
        catch(IllegalStateException | SecurityException illegalStateException0) {
            String s1 = String.valueOf(s);
            Log.e("GservicesLoader", (s1.length() == 0 ? new String("Unable to read GServices for: ") : "Unable to read GServices for: " + s1), illegalStateException0);
            return null;
        }
    }
}

