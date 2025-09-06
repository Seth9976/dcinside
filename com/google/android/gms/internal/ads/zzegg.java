package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzegg extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzdbm zzc;
    private final zzegq zzd;
    private final zzedb zze;

    zzegg(zzcgx zzcgx0, zzcva zzcva0, zzdbm zzdbm0, zzegq zzegq0, zzedb zzedb0) {
        this.zza = zzcgx0;
        this.zzb = zzcva0;
        this.zzc = zzdbm0;
        this.zzd = zzegq0;
        this.zze = zzedb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegf
    protected final t0 zzc(zzfcj zzfcj0, Bundle bundle0, zzfbo zzfbo0, zzfca zzfca0) {
        this.zzb.zzk(zzfcj0);
        this.zzb.zzg(bundle0);
        zzcut zzcut0 = new zzcut(zzfca0, zzfbo0, this.zzd);
        this.zzb.zzh(zzcut0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zze);
        }
        zzcnz zzcnz0 = this.zza.zzd();
        zzcnz0.zzd(this.zzb.zzl());
        zzcnz0.zzc(this.zzc);
        zzcsd zzcsd0 = zzcnz0.zze().zzb();
        return zzcsd0.zzh(zzcsd0.zzi());
    }
}

