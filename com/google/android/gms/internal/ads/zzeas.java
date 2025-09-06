package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

public final class zzeas implements zzfgo {
    private final zzeag zza;
    private final zzeak zzb;

    zzeas(zzeag zzeag0, zzeak zzeak0) {
        this.zza = zzeag0;
        this.zzb = zzeak0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(zzfgh zzfgh0, String s) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && zzfgh.zzd == zzfgh0 && this.zza.zzc() != 0L) {
            long v = zzv.zzC().elapsedRealtime();
            long v1 = this.zza.zzc();
            this.zza.zzf(v - v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(zzfgh zzfgh0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(zzfgh zzfgh0, String s, Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && zzfgh.zzd == zzfgh0 && this.zza.zzc() != 0L) {
            long v = zzv.zzC().elapsedRealtime();
            long v1 = this.zza.zzc();
            this.zza.zzf(v - v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(zzfgh zzfgh0, String s) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            if(zzfgh.zzd == zzfgh0) {
                long v = zzv.zzC().elapsedRealtime();
                this.zza.zzg(v);
                return;
            }
            if(zzfgh.zzA == zzfgh0 || zzfgh.zzc == zzfgh0) {
                long v1 = zzv.zzC().elapsedRealtime();
                this.zza.zzh(v1);
                long v2 = this.zza.zzd();
                zzeaj zzeaj0 = new zzeaj(this.zzb, v2);
                this.zzb.zza.zza(zzeaj0);
            }
        }
    }
}

