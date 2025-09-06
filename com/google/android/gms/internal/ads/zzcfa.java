package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

public final class zzcfa implements Runnable {
    public final String zza;

    public zzcfa(String s) {
        this.zza = s;
    }

    @Override
    public final void run() {
        zzv.zzp().zzg().zze(this.zza);
    }
}

