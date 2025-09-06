package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.zze;
import com.google.android.gms.internal.vision.zzfi.zzo;
import com.google.android.gms.internal.vision.zzi;
import com.google.android.gms.vision.L;
import java.util.concurrent.ExecutorService;

@Keep
public class DynamiteClearcutLogger {
    private static final ExecutorService zza;
    private zzb zzb;
    private VisionClearcutLogger zzc;

    static {
        DynamiteClearcutLogger.zza = zze.zza().zza(2, zzi.zza);
    }

    public DynamiteClearcutLogger(@RecentlyNonNull Context context0) {
        this.zzb = new zzb(0.033333);
        this.zzc = new VisionClearcutLogger(context0);
    }

    public final void zza(int v, zzo zzfi$zzo0) {
        if(v == 3 && !this.zzb.zza()) {
            L.v("Skipping image analysis log due to rate limiting", new Object[0]);
            return;
        }
        zza zza0 = new zza(this, v, zzfi$zzo0);
        DynamiteClearcutLogger.zza.execute(zza0);
    }
}

