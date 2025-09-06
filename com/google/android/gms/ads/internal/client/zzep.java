package com.google.android.gms.ads.internal.client;

import android.content.Context;

public final class zzep implements Runnable {
    public final zzex zza;
    public final Context zzb;

    public zzep(zzex zzex0, Context context0, String s) {
        this.zza = zzex0;
        this.zzb = context0;
    }

    @Override
    public final void run() {
        this.zza.zzq(this.zzb, null);
    }
}

