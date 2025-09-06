package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzu;

public final class zzbue implements Runnable {
    public final zzu zza;
    public final String zzb;

    public zzbue(zzu zzu0, String s) {
        this.zza = zzu0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

