package com.google.android.gms.ads.internal.client;

import android.content.Context;

public final class zzeo implements Runnable {
    public final zzex zza;
    public final Context zzb;

    public zzeo(zzex zzex0, Context context0, String s) {
        this.zza = zzex0;
        this.zzb = context0;
    }

    @Override
    public final void run() {
        this.zza.zzp(this.zzb, null);
    }
}

