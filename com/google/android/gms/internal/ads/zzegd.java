package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzegd extends zzegf {
    private final zzcgx zza;
    private final zzdgl zzb;
    private final zzcva zzc;
    private final zzdbm zzd;
    private final zzegq zze;
    private final zzedb zzf;

    public zzegd(zzcgx zzcgx0, zzdgl zzdgl0, zzcva zzcva0, zzdbm zzdbm0, zzegq zzegq0, zzedb zzedb0) {
        this.zza = zzcgx0;
        this.zzb = zzdgl0;
        this.zzc = zzcva0;
        this.zzd = zzdbm0;
        this.zze = zzegq0;
        this.zzf = zzedb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegf
    protected final t0 zzc(zzfcj zzfcj0, Bundle bundle0, zzfbo zzfbo0, zzfca zzfca0) {
        this.zzc.zzk(zzfcj0);
        this.zzc.zzg(bundle0);
        zzcut zzcut0 = new zzcut(zzfca0, zzfbo0, this.zze);
        this.zzc.zzh(zzcut0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzc.zze(this.zzf);
        }
        zzdgp zzdgp0 = this.zza.zzh();
        zzdgp0.zzf(this.zzc.zzl());
        zzdgp0.zze(this.zzd);
        zzdgp0.zzd(this.zzb);
        zzdgp0.zzc(new zzcoj(null));
        zzcsd zzcsd0 = zzdgp0.zzg().zza();
        return zzcsd0.zzh(zzcsd0.zzi());
    }
}

