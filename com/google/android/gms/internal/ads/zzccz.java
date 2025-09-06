package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;

final class zzccz implements Runnable {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final boolean zzh;
    final int zzi;
    final int zzj;
    final zzcde zzk;

    zzccz(zzcde zzcde0, String s, String s1, long v, long v1, long v2, long v3, long v4, boolean z, int v5, int v6) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = v4;
        this.zzh = z;
        this.zzi = v5;
        this.zzj = v6;
        this.zzk = zzcde0;
        super();
    }

    @Override
    public final void run() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", "precacheProgress");
        hashMap0.put("src", this.zza);
        hashMap0.put("cachedSrc", this.zzb);
        hashMap0.put("bufferedDuration", Long.toString(this.zzc));
        hashMap0.put("totalDuration", Long.toString(this.zzd));
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue()) {
            hashMap0.put("qoeLoadedBytes", Long.toString(this.zze));
            hashMap0.put("qoeCachedBytes", Long.toString(this.zzf));
            hashMap0.put("totalBytes", Long.toString(this.zzg));
            hashMap0.put("reportTime", Long.toString(zzv.zzC().currentTimeMillis()));
        }
        hashMap0.put("cacheReady", (this.zzh ? "1" : "0"));
        hashMap0.put("playerCount", Integer.toString(this.zzi));
        hashMap0.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcde.zze(this.zzk, "onPrecacheEvent", hashMap0);
    }
}

