package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;

public final class zzeyv implements zzezf {
    private final zzezf zza;
    @Nullable
    private zzcuz zzb;

    public zzeyv(zzezf zzezf0) {
        this.zza = zzezf0;
    }

    @Nullable
    public final zzcuz zza() {
        synchronized(this) {
        }
        return this.zzb;
    }

    public final t0 zzb(zzezg zzezg0, zzeze zzeze0, @Nullable zzcuz zzcuz0) {
        synchronized(this) {
            this.zzb = zzcuz0;
            if(zzcuz0 != null) {
                zzbvk zzbvk0 = zzezg0.zza;
                if(zzbvk0 != null) {
                    zzcsd zzcsd0 = zzcuz0.zzb();
                    return zzcsd0.zzh(zzcsd0.zzj(zzgch.zzh(zzbvk0)));
                }
            }
            return ((zzeyu)this.zza).zzb(zzezg0, zzeze0, zzcuz0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzezf
    public final t0 zzc(zzezg zzezg0, zzeze zzeze0, @Nullable Object object0) {
        return this.zzb(zzezg0, zzeze0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzezf
    @Nullable
    public final Object zzd() {
        return this.zza();
    }
}

