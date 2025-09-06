package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

final class zzdtz extends zzblq {
    final Object zza;
    final String zzb;
    final long zzc;
    final zzfgw zzd;
    final zzcab zze;
    final zzdua zzf;

    zzdtz(zzdua zzdua0, Object object0, String s, long v, zzfgw zzfgw0, zzcab zzcab0) {
        this.zza = object0;
        this.zzb = s;
        this.zzc = v;
        this.zzd = zzfgw0;
        this.zze = zzcab0;
        this.zzf = zzdua0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzblr
    public final void zze(String s) {
        synchronized(this.zza) {
            long v1 = zzv.zzC().elapsedRealtime();
            this.zzf.zzv(this.zzb, false, s, ((int)(v1 - this.zzc)));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            this.zzd.zzc(s);
            this.zzd.zzg(false);
            this.zzf.zzp.zzb(this.zzd.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblr
    public final void zzf() {
        synchronized(this.zza) {
            long v1 = zzv.zzC().elapsedRealtime();
            this.zzf.zzv(this.zzb, true, "", ((int)(v1 - this.zzc)));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            this.zzd.zzg(true);
            this.zzf.zzp.zzb(this.zzd.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}

