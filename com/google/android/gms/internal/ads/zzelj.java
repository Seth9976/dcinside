package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

final class zzelj implements zzgcd {
    final zzelc zza;
    final zzfhh zzb;
    final zzfgw zzc;
    final zzdgq zzd;
    final zzelk zze;

    zzelj(zzelk zzelk0, zzelc zzelc0, zzfhh zzfhh0, zzfgw zzfgw0, zzdgq zzdgq0) {
        this.zza = zzelc0;
        this.zzb = zzfhh0;
        this.zzc = zzfgw0;
        this.zzd = zzdgq0;
        this.zze = zzelk0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            zze.zzb("Native ad failed to load", throwable0);
        }
        com.google.android.gms.ads.internal.client.zze zze0 = this.zzd.zza().zza(throwable0);
        this.zzd.zzb().zzdz(zze0);
        this.zze.zzb.zzC().execute(new zzeli(this, zze0));
        zzfdg.zzb(zze0.zza, throwable0, "NativeAdLoader.onFailure");
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
        this.zze.zze.zzb(this.zzc.zzm());
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        synchronized(this.zze) {
            ((zzcqz)object0).zzo().zza(this.zze.zzd.zzd());
            this.zza.zzb(((zzcqz)object0));
            this.zze.zzb.zzC().execute(new zzelh(this));
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
            }
            this.zzc.zzb(((zzcqz)object0).zzq().zzb);
            this.zzc.zzd(((zzcqz)object0).zzm().zzg());
            this.zzc.zzg(true);
            this.zze.zze.zzb(this.zzc.zzm());
        }
    }
}

