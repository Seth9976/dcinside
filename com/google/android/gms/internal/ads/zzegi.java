package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzegi extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzeiw zzc;
    private final zzdbm zzd;
    private final zzdgl zze;
    private final zzcyl zzf;
    @Nullable
    private final ViewGroup zzg;
    @Nullable
    private final zzdar zzh;
    private final zzegq zzi;
    private final zzedb zzj;

    public zzegi(zzcgx zzcgx0, zzcva zzcva0, zzeiw zzeiw0, zzdbm zzdbm0, zzdgl zzdgl0, zzcyl zzcyl0, @Nullable ViewGroup viewGroup0, @Nullable zzdar zzdar0, zzegq zzegq0, zzedb zzedb0) {
        this.zza = zzcgx0;
        this.zzb = zzcva0;
        this.zzc = zzeiw0;
        this.zzd = zzdbm0;
        this.zze = zzdgl0;
        this.zzf = zzcyl0;
        this.zzg = viewGroup0;
        this.zzh = zzdar0;
        this.zzi = zzegq0;
        this.zzj = zzedb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegf
    protected final t0 zzc(zzfcj zzfcj0, Bundle bundle0, zzfbo zzfbo0, zzfca zzfca0) {
        this.zzb.zzk(zzfcj0);
        this.zzb.zzg(bundle0);
        zzcut zzcut0 = new zzcut(zzfca0, zzfbo0, this.zzi);
        this.zzb.zzh(zzcut0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzj);
        }
        zzcpp zzcpp0 = this.zza.zze();
        zzcpp0.zzi(this.zzb.zzl());
        zzcpp0.zzf(this.zzd);
        zzcpp0.zze(this.zzc);
        zzcpp0.zzd(this.zze);
        zzcpp0.zzg(new zzcqr(this.zzf, this.zzh));
        zzcpp0.zzc(new zzcoj(this.zzg));
        zzcsd zzcsd0 = zzcpp0.zzk().zzd();
        return zzcsd0.zzh(zzcsd0.zzi());
    }
}

