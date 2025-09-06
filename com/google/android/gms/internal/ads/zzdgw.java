package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

public final class zzdgw implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzdgw(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
        this.zze = zzhfj4;
        this.zzf = zzhfj5;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzcgx zzcgx0 = (zzcgx)this.zza.zzb();
        zzcva zzcva0 = ((zzcvl)this.zzb).zza();
        zzdbm zzdbm0 = ((zzdcg)this.zzc).zza();
        zzdgl zzdgl0 = ((zzdgn)this.zzd).zza();
        zzcyl zzcyl0 = ((zzcol)this.zze).zza();
        zzegq zzegq0 = (zzegq)this.zzf.zzb();
        zzcpp zzcpp0 = zzcgx0.zze();
        zzcpp0.zzi(zzcva0.zzl());
        zzcpp0.zzf(zzdbm0);
        zzcpp0.zzd(zzdgl0);
        zzcpp0.zze(new zzeiw(null));
        zzcpp0.zzg(new zzcqr(zzcyl0, null));
        zzcpp0.zzc(new zzcoj(null));
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdK)).booleanValue()) {
            zzcpp0.zzj(zzegz.zzb(zzegq0));
        }
        zzcrc zzcrc0 = zzcpp0.zzk().zzc();
        zzhez.zzb(zzcrc0);
        return zzcrc0;
    }
}

