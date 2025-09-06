package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

public final class zzcbm {
    private final long zza;
    private long zzb;
    private boolean zzc;

    zzcbm() {
        this.zza = TimeUnit.MILLISECONDS.toNanos(((long)(((Long)zzbe.zzc().zza(zzbcl.zzQ)))));
        this.zzc = true;
    }

    public final void zza(SurfaceTexture surfaceTexture0, zzcax zzcax0) {
        if(zzcax0 != null) {
            long v = surfaceTexture0.getTimestamp();
            if(this.zzc || Math.abs(v - this.zzb) >= this.zza) {
                this.zzc = false;
                this.zzb = v;
                zzcbl zzcbl0 = new zzcbl(zzcax0);
                zzs.zza.post(zzcbl0);
            }
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}

