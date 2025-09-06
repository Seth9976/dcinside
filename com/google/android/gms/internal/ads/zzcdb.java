package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class zzcdb implements Runnable {
    final String zza;
    final String zzb;
    final int zzc;
    final zzcde zzd;

    zzcdb(zzcde zzcde0, String s, String s1, int v) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = zzcde0;
        super();
    }

    @Override
    public final void run() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", "precacheComplete");
        hashMap0.put("src", this.zza);
        hashMap0.put("cachedSrc", this.zzb);
        hashMap0.put("totalBytes", Integer.toString(this.zzc));
        zzcde.zze(this.zzd, "onPrecacheEvent", hashMap0);
    }
}

