package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzv;

public final class zzcmh implements Runnable {
    public final zzcmj zza;
    public final Throwable zzb;
    public final zzfja zzc;
    public final String zzd;
    public final zzv zze;

    public zzcmh(zzcmj zzcmj0, Throwable throwable0, zzfja zzfja0, String s, zzv zzv0) {
        this.zza = zzcmj0;
        this.zzb = throwable0;
        this.zzc = zzfja0;
        this.zzd = s;
        this.zze = zzv0;
    }

    @Override
    public final void run() {
        boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzkh)).booleanValue();
        zzcmj zzcmj0 = this.zza;
        Throwable throwable0 = this.zzb;
        if(z) {
            zzcmj0.zzd.zzb = zzbuh.zzc(zzcmj0.zzd.zzc);
            zzcmj0.zzd.zzb.zzh(throwable0, "AttributionReporting.registerSourceAndPingClickUrl");
        }
        else {
            zzcmj0.zzd.zza = zzbuh.zza(zzcmj0.zzd.zzc);
            zzcmj0.zzd.zza.zzh(throwable0, "AttributionReportingSampled.registerSourceAndPingClickUrl");
        }
        this.zzc.zzd(this.zzd, this.zze, null);
    }
}

