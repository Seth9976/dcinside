package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzdar implements zzcyq {
    private int zza;
    private int zzb;

    @VisibleForTesting
    public zzdar() {
        this.zza = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzbp)));
        this.zzb = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzmI)));
    }

    public final int zzc() {
        synchronized(this) {
        }
        return this.zza;
    }

    public final int zzd() {
        synchronized(this) {
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzbq)).booleanValue()) {
                this.zza = zzfca0.zzb.zzb.zzc;
                this.zzb = zzfca0.zzb.zzb.zzd;
            }
        }
    }
}

