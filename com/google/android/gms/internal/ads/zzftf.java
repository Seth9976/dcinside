package com.google.android.gms.internal.ads;

import android.os.IBinder.DeathRecipient;

public final class zzftf implements IBinder.DeathRecipient {
    public final zzftn zza;

    public zzftf(zzftn zzftn0) {
        this.zza = zzftn0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        this.zza.zzk();
    }
}

