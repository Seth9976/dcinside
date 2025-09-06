package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;

public final class zzfiy implements Runnable {
    public final zzfja zza;
    public final String zzb;
    public final zzv zzc;

    public zzfiy(zzfja zzfja0, String s, zzv zzv0) {
        this.zza = zzfja0;
        this.zzb = s;
        this.zzc = zzv0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb, this.zzc);
    }
}

