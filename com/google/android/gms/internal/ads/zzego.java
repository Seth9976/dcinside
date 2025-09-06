package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

final class zzego implements zzgcd {
    final long zza;
    final zzfbr zzb;
    final zzfbo zzc;
    final String zzd;
    final zzfiv zze;
    final zzfca zzf;
    final zzegq zzg;

    zzego(zzegq zzegq0, long v, zzfbr zzfbr0, zzfbo zzfbo0, String s, zzfiv zzfiv0, zzfca zzfca0) {
        this.zza = v;
        this.zzb = zzfbr0;
        this.zzc = zzfbo0;
        this.zzd = s;
        this.zze = zzfiv0;
        this.zzf = zzfca0;
        this.zzg = zzegq0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        Integer integer0;
        int v2;
        int v = 6;
        long v1 = this.zzg.zza.elapsedRealtime() - this.zza;
        zzeda zzeda0 = null;
        if(throwable0 instanceof TimeoutException) {
            v2 = 2;
            integer0 = null;
        }
        else if(throwable0 instanceof zzefy) {
            integer0 = null;
            v2 = 3;
        }
        else if(throwable0 instanceof CancellationException) {
            v2 = 4;
            integer0 = null;
        }
        else if(throwable0 instanceof zzfcq) {
            v2 = 5;
            integer0 = null;
        }
        else if(throwable0 instanceof zzdvy) {
            if(zzfdk.zza(throwable0).zza == 3) {
                v = 1;
            }
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzbK)).booleanValue() || !(throwable0 instanceof zzeda)) {
                integer0 = null;
            }
            else {
                zze zze0 = ((zzeda)throwable0).zzb();
                integer0 = zze0 == null ? null : zze0.zza;
            }
            v2 = v;
        }
        else {
            integer0 = null;
            v2 = 6;
        }
        synchronized(this.zzg) {
            zzegq zzegq1 = this.zzg;
            if(zzegq1.zze) {
                zzegs zzegs0 = zzegq1.zzb;
                zzfbr zzfbr0 = this.zzb;
                zzfbo zzfbo0 = this.zzc;
                if(throwable0 instanceof zzeda) {
                    zzeda0 = (zzeda)throwable0;
                }
                zzegs0.zza(zzfbr0, zzfbo0, v2, zzeda0, v1);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzij)).booleanValue()) {
                this.zzg.zzc.zze(this.zze.zzc(this.zzf, this.zzc, this.zzc.zzn), this.zzc.zzax);
            }
            zzegq zzegq2 = this.zzg;
            if(zzegq2.zzg) {
                return;
            }
            zzegp zzegp0 = new zzegp(this.zzd, this.zzc.zzaf, v2, v1, integer0);
            zzegq2.zzd.put(this.zzc, zzegp0);
            zze zze1 = zzfdk.zza(throwable0);
            if((zze1.zza == 0 || zze1.zza == 3) && (zze1.zzd != null && !zze1.zzd.zzc.equals("com.google.android.gms.ads"))) {
                zze1 = zzfdk.zza(new zzeda(13, zze1.zzd));
            }
            this.zzg.zzf.zzf(this.zzc, v1, zze1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        long v = this.zzg.zza.elapsedRealtime() - this.zza;
        synchronized(this.zzg) {
            zzegq zzegq1 = this.zzg;
            if(zzegq1.zze) {
                zzegq1.zzb.zza(this.zzb, this.zzc, 0, null, v);
            }
            zzegq zzegq2 = this.zzg;
            if(zzegq2.zzg) {
                return;
            }
            if(zzegq2.zzq(this.zzc)) {
                ((zzegp)this.zzg.zzd.get(this.zzc)).zzd = v;
            }
            else {
                zzegp zzegp0 = new zzegp(this.zzd, this.zzc.zzaf, 0, v, null);
                this.zzg.zzd.put(this.zzc, zzegp0);
            }
            this.zzg.zzf.zzg(this.zzc, v, null);
        }
    }
}

