package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class zzcda implements Runnable {
    final String zza;
    final String zzb;
    final int zzc;
    final int zzd;
    final long zze;
    final long zzf;
    final boolean zzg;
    final int zzh;
    final int zzi;
    final zzcde zzj;

    zzcda(zzcde zzcde0, String s, String s1, int v, int v1, long v2, long v3, boolean z, int v4, int v5) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = z;
        this.zzh = v4;
        this.zzi = v5;
        this.zzj = zzcde0;
        super();
    }

    @Override
    public final void run() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", "precacheProgress");
        hashMap0.put("src", this.zza);
        hashMap0.put("cachedSrc", this.zzb);
        hashMap0.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap0.put("totalBytes", Integer.toString(this.zzd));
        hashMap0.put("bufferedDuration", Long.toString(this.zze));
        hashMap0.put("totalDuration", Long.toString(this.zzf));
        hashMap0.put("cacheReady", (this.zzg ? "1" : "0"));
        hashMap0.put("playerCount", Integer.toString(this.zzh));
        hashMap0.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcde.zze(this.zzj, "onPrecacheEvent", hashMap0);
    }
}

