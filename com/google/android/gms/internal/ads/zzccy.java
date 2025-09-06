package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class zzccy implements Runnable {
    final String zza;
    final String zzb;
    final int zzc;
    final int zzd;
    final zzcde zze;

    zzccy(zzcde zzcde0, String s, String s1, int v, int v1, boolean z) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = zzcde0;
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
        hashMap0.put("cacheReady", "0");
        zzcde.zze(this.zze, "onPrecacheEvent", hashMap0);
    }
}

