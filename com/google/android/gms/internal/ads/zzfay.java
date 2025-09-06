package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import j..util.Objects;

final class zzfay implements zzgcd {
    final zzelc zza;
    final zzfhh zzb;
    final zzfgw zzc;
    final zzfaz zzd;
    final zzfbb zze;

    zzfay(zzfbb zzfbb0, zzelc zzelc0, zzfhh zzfhh0, zzfgw zzfgw0, zzfaz zzfaz0) {
        this.zza = zzelc0;
        this.zzb = zzfhh0;
        this.zzc = zzfgw0;
        this.zzd = zzfaz0;
        this.zze = zzfbb0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            zze.zzb("Rewarded ad failed to load", throwable0);
        }
        zzdof zzdof0 = (zzdof)this.zze.zze.zzd();
        com.google.android.gms.ads.internal.client.zze zze0 = zzdof0 == null ? zzfdk.zzb(throwable0, null) : zzdof0.zzb().zza(throwable0);
        synchronized(this.zze) {
            if(zzdof0 == null) {
                this.zze.zzd.zzdz(zze0);
                this.zze.zzk(this.zzd).zze().zzb().zzc().zzh();
            }
            else {
                zzdof0.zza().zzdz(zze0);
                this.zze.zzb.execute(new zzfaw(this, zze0));
            }
            zzfdg.zzb(zze0.zza, throwable0, "RewardedAdLoader.onFailure");
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
            this.zze.zzg.zzb(this.zzc.zzm());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        synchronized(this.zze) {
            ((zzdoa)object0).zzo().zzd(this.zze.zzd);
            this.zza.zzb(((zzdoa)object0));
            zzfar zzfar0 = this.zze.zzd;
            Objects.requireNonNull(zzfar0);
            this.zze.zzb.execute(new zzfax(zzfar0));
            this.zze.zzd.onAdMetadataChanged();
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                zzfhh zzfhh0 = this.zzb;
                if(zzfhh0 != null) {
                    zzfhh0.zzg(((zzdoa)object0).zzq().zzb);
                    zzfhh0.zze(((zzdoa)object0).zzm().zzg());
                    this.zzc.zzg(true);
                    zzfhh0.zza(this.zzc);
                    zzfhh0.zzh();
                    return;
                }
            }
            this.zzc.zzb(((zzdoa)object0).zzq().zzb);
            this.zzc.zzd(((zzdoa)object0).zzm().zzg());
            this.zzc.zzg(true);
            this.zze.zzg.zzb(this.zzc.zzm());
        }
    }
}

