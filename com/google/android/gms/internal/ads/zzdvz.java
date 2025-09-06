package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdvz implements Runnable {
    public final zzdwa zza;
    public final Context zzb;

    public zzdvz(zzdwa zzdwa0, Context context0) {
        this.zza = zzdwa0;
        this.zzb = context0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb);
    }
}

