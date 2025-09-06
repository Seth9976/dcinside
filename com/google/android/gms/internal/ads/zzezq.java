package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

final class zzezq implements zzgcd {
    final zzelc zza;
    final zzfhh zzb;
    final zzfgw zzc;
    final zzdfu zzd;
    final zzezr zze;

    zzezq(zzezr zzezr0, zzelc zzelc0, zzfhh zzfhh0, zzfgw zzfgw0, zzdfu zzdfu0) {
        this.zza = zzelc0;
        this.zzb = zzfhh0;
        this.zzc = zzfgw0;
        this.zzd = zzdfu0;
        this.zze = zzezr0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            zze.zzb("Interstitial ad failed to load", throwable0);
        }
        com.google.android.gms.ads.internal.client.zze zze0 = this.zzd.zza().zza(throwable0);
        synchronized(this.zze) {
            zzezr.zzg(this.zze, null);
            this.zzd.zzb().zzdz(zze0);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzib)).booleanValue()) {
                this.zze.zzb.execute(new zzezm(this, zze0));
                this.zze.zzb.execute(new zzezn(this, zze0));
            }
            zzfdg.zzb(zze0.zza, throwable0, "InterstitialAdLoader.onFailure");
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
            zzezr.zzg(this.zze, null);
            zzbcc zzbcc0 = zzbcl.zzib;
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                zzczz zzczz0 = ((zzdeq)object0).zzo();
                zzczz0.zza(this.zze.zzd);
                zzczz0.zzd(this.zze.zze);
            }
            this.zza.zzb(((zzdeq)object0));
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                zzezo zzezo0 = new zzezo(this);
                this.zze.zzb.execute(zzezo0);
                zzezp zzezp0 = new zzezp(this);
                this.zze.zzb.execute(zzezp0);
            }
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                zzfhh zzfhh0 = this.zzb;
                if(zzfhh0 != null) {
                    zzfhh0.zzg(((zzdeq)object0).zzq().zzb);
                    zzfhh0.zze(((zzdeq)object0).zzm().zzg());
                    this.zzc.zzg(true);
                    zzfhh0.zza(this.zzc);
                    zzfhh0.zzh();
                    return;
                }
                goto label_24;
            }
            else {
            label_24:
                this.zzc.zzb(((zzdeq)object0).zzq().zzb);
                this.zzc.zzd(((zzdeq)object0).zzm().zzg());
                this.zzc.zzg(true);
                zzfha zzfha0 = this.zzc.zzm();
                this.zze.zzg.zzb(zzfha0);
            }
        }
    }
}

