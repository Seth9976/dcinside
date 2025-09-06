package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

final class zzexz implements zzgcd {
    final zzfhh zza;
    final zzfgw zzb;
    final zzcpq zzc;
    final zzeya zzd;

    zzexz(zzeya zzeya0, zzfhh zzfhh0, zzfgw zzfgw0, zzcpq zzcpq0) {
        this.zza = zzfhh0;
        this.zzb = zzfgw0;
        this.zzc = zzcpq0;
        this.zzd = zzeya0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            zze.zzb("Banner ad failed to load", throwable0);
        }
        synchronized(this.zzd) {
            com.google.android.gms.ads.internal.client.zze zze0 = this.zzc.zzd().zza(throwable0);
            this.zzd.zzn = zze0;
            this.zzc.zzf().zzdz(zze0);
            zzfdg.zzb(zze0.zza, throwable0, "BannerAdLoader.onFailure");
            zzeya zzeya1 = this.zzd;
            if(zzeya1.zzm) {
                zzeya1.zzt();
                this.zzd.zzh.zzd(this.zzd.zzj.zzc());
            }
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                zzfhh zzfhh0 = this.zza;
                if(zzfhh0 != null) {
                    zzfhh0.zzc(zze0);
                    this.zzb.zzh(throwable0);
                    this.zzb.zzg(false);
                    zzfhh0.zza(this.zzb);
                    zzfhh0.zzh();
                    return;
                }
                goto label_22;
            }
            else {
            label_22:
                this.zzb.zza(zze0);
                this.zzb.zzh(throwable0);
                this.zzb.zzg(false);
                zzfha zzfha0 = this.zzb.zzm();
                this.zzd.zzi.zzb(zzfha0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        synchronized(this.zzd) {
            zzeya zzeya1 = this.zzd;
            if(zzeya1.zzm) {
                zzeya1.zzq();
            }
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                zzfhh zzfhh0 = this.zza;
                if(zzfhh0 != null) {
                    zzfhh0.zzg(((zzcom)object0).zzq().zzb);
                    zzfhh0.zze(((zzcom)object0).zzm().zzg());
                    this.zzb.zzg(true);
                    zzfhh0.zza(this.zzb);
                    zzfhh0.zzh();
                    return;
                }
            }
            this.zzb.zzb(((zzcom)object0).zzq().zzb);
            this.zzb.zzd(((zzcom)object0).zzm().zzg());
            this.zzb.zzg(true);
            this.zzd.zzi.zzb(this.zzb.zzm());
        }
    }
}

