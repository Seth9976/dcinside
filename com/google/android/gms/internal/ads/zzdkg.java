package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzdkg implements zzcwn {
    private final zzdif zza;
    private final zzdik zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdkg(zzdif zzdif0, zzdik zzdik0, Executor executor0, Executor executor1) {
        this.zza = zzdif0;
        this.zzb = zzdik0;
        this.zzc = executor0;
        this.zzd = executor1;
    }

    private final void zzb(zzcex zzcex0) {
        zzdke zzdke0 = new zzdke(zzcex0);
        this.zzc.execute(zzdke0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if(this.zzb.zzd()) {
            zzecr zzecr0 = this.zza.zzu();
            if(zzecr0 == null && this.zza.zzw() != null && ((Boolean)zzbe.zzc().zza(zzbcl.zzfl)).booleanValue()) {
                t0 t00 = this.zza.zzw();
                zzcab zzcab0 = this.zza.zzp();
                if(t00 != null && zzcab0 != null) {
                    zzgch.zzr(zzgch.zzl(new t0[]{t00, zzcab0}), new zzdkf(this), this.zzd);
                }
            }
            else if(zzecr0 != null) {
                zzcex zzcex0 = this.zza.zzr();
                zzcex zzcex1 = this.zza.zzs();
                if(zzcex0 == null) {
                    zzcex0 = zzcex1 == null ? null : zzcex1;
                }
                if(zzcex0 != null) {
                    this.zzb(zzcex0);
                }
            }
        }
    }
}

