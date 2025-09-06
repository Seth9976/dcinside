package com.google.android.gms.internal.consent_sdk;

public final class zzbq implements Runnable {
    public final zzbu zza;
    public final String zzb;

    public zzbq(zzbu zzbu0, String s) {
        this.zza = zzbu0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        zzcs.zza(this.zza, this.zzb);
    }
}

