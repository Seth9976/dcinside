package com.google.android.gms.ads.internal.util;

import android.content.Context;

public final class zzi implements Runnable {
    public final zzj zza;
    public final Context zzb;
    public final String zzc;

    public zzi(zzj zzj0, Context context0, String s) {
        this.zza = zzj0;
        this.zzb = context0;
        this.zzc = "admob";
    }

    @Override
    public final void run() {
        this.zza.zzQ(this.zzb, this.zzc);
    }
}

