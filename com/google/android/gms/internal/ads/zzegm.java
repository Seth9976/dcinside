package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import o3.h;

public final class zzegm extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzdbm zzc;
    private final zzegq zzd;
    @h
    private final zzfcb zze;
    private final zzedb zzf;

    public zzegm(zzcgx zzcgx0, zzcva zzcva0, zzdbm zzdbm0, @h zzfcb zzfcb0, zzegq zzegq0, zzedb zzedb0) {
        this.zza = zzcgx0;
        this.zzb = zzcva0;
        this.zzc = zzdbm0;
        this.zze = zzfcb0;
        this.zzd = zzegq0;
        this.zzf = zzedb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegf
    protected final t0 zzc(zzfcj zzfcj0, Bundle bundle0, zzfbo zzfbo0, zzfca zzfca0) {
        this.zzb.zzk(zzfcj0);
        this.zzb.zzg(bundle0);
        zzcut zzcut0 = new zzcut(zzfca0, zzfbo0, this.zzd);
        this.zzb.zzh(zzcut0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdG)).booleanValue()) {
            zzfcb zzfcb0 = this.zze;
            if(zzfcb0 != null) {
                this.zzb.zzj(zzfcb0);
            }
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzdoe zzdoe0 = this.zza.zzi();
        zzdoe0.zzd(this.zzb.zzl());
        zzdoe0.zzc(this.zzc);
        zzcsd zzcsd0 = zzdoe0.zze().zzb();
        return zzcsd0.zzh(zzcsd0.zzi());
    }
}

