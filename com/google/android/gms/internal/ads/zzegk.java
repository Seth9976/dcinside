package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzegk extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzeiw zzc;
    private final zzdbm zzd;
    private final zzegq zze;
    private final zzedb zzf;

    public zzegk(zzcgx zzcgx0, zzcva zzcva0, zzeiw zzeiw0, zzdbm zzdbm0, zzegq zzegq0, zzedb zzedb0) {
        this.zza = zzcgx0;
        this.zzb = zzcva0;
        this.zzc = zzeiw0;
        this.zzd = zzdbm0;
        this.zze = zzegq0;
        this.zzf = zzedb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegf
    protected final t0 zzc(zzfcj zzfcj0, Bundle bundle0, zzfbo zzfbo0, zzfca zzfca0) {
        this.zzb.zzk(zzfcj0);
        this.zzb.zzg(bundle0);
        zzcut zzcut0 = new zzcut(zzfca0, zzfbo0, this.zze);
        this.zzb.zzh(zzcut0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzdft zzdft0 = this.zza.zzg();
        zzdft0.zze(this.zzb.zzl());
        zzdft0.zzd(this.zzd);
        zzdft0.zzc(this.zzc);
        zzcsd zzcsd0 = zzdft0.zzf().zza();
        return zzcsd0.zzh(zzcsd0.zzi());
    }
}

