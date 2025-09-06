package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;

public final class zzeyu implements zzezf {
    @Nullable
    private zzcuz zza;

    @Nullable
    public final zzcuz zza() {
        synchronized(this) {
        }
        return this.zza;
    }

    public final t0 zzb(zzezg zzezg0, zzeze zzeze0, @Nullable zzcuz zzcuz0) {
        synchronized(this) {
            this.zza = zzcuz0 == null ? ((zzcuz)zzeze0.zza(zzezg0.zzb).zzh()) : zzcuz0;
            zzcsd zzcsd0 = this.zza.zzb();
            return zzcsd0.zzh(zzcsd0.zzi());
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

