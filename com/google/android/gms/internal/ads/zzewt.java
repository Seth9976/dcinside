package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

final class zzewt implements zzgcd {
    final zzelc zza;
    final zzfhh zzb;
    final zzfgw zzc;
    final zzewu zzd;
    final zzeww zze;

    zzewt(zzeww zzeww0, zzelc zzelc0, zzfhh zzfhh0, zzfgw zzfgw0, zzewu zzewu0) {
        this.zza = zzelc0;
        this.zzb = zzfhh0;
        this.zzc = zzfgw0;
        this.zzd = zzewu0;
        this.zze = zzeww0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            zze.zzb("App open ad failed to load", throwable0);
        }
        zzcnw zzcnw0 = (zzcnw)this.zze.zze.zzd();
        com.google.android.gms.ads.internal.client.zze zze0 = zzcnw0 == null ? zzfdk.zzb(throwable0, null) : zzcnw0.zzb().zza(throwable0);
        synchronized(this.zze) {
            zzeww.zzj(this.zze, null);
            if(zzcnw0 == null) {
                this.zze.zzd.zzdz(zze0);
                ((zzcnw)this.zze.zzm(this.zzd).zzh()).zzb().zzc().zzh();
            }
            else {
                zzcnw0.zzc().zzdz(zze0);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzia)).booleanValue()) {
                    this.zze.zzc.execute(new zzews(this, zze0));
                }
            }
            zzfdg.zzb(zze0.zza, throwable0, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                zzfhh zzfhh0 = this.zzb;
                if(zzfhh0 != null) {
                    zzfhh0.zzc(zze0);
                    this.zzc.zzh(throwable0);
                    this.zzc.zzg(false);
                    zzfhh0.zza(this.zzc);
                    zzfhh0.zzh();
                    return;
                }
            }
            this.zzc.zza(zze0);
            this.zzc.zzh(throwable0);
            this.zzc.zzg(false);
            this.zze.zzh.zzb(this.zzc.zzm());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        synchronized(this.zze) {
            zzeww.zzj(this.zze, null);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzia)).booleanValue()) {
                ((zzcqz)object0).zzo().zzb(this.zze.zzd);
            }
            this.zza.zzb(((zzcqz)object0));
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                zzfhh zzfhh0 = this.zzb;
                if(zzfhh0 != null) {
                    zzfhh0.zzg(((zzcqz)object0).zzq().zzb);
                    zzfhh0.zze(((zzcqz)object0).zzm().zzg());
                    this.zzc.zzg(true);
                    zzfhh0.zza(this.zzc);
                    zzfhh0.zzh();
                    return;
                }
                goto label_16;
            }
            else {
            label_16:
                this.zzc.zzb(((zzcqz)object0).zzq().zzb);
                this.zzc.zzd(((zzcqz)object0).zzm().zzg());
                this.zzc.zzg(true);
                zzfha zzfha0 = this.zzc.zzm();
                this.zze.zzh.zzb(zzfha0);
            }
        }
    }
}

