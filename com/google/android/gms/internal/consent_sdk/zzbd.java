package com.google.android.gms.internal.consent_sdk;

public final class zzbd implements Runnable {
    public final zzbn zza;
    public final zzbb zzb;

    public zzbd(zzbn zzbn0, zzbb zzbb0) {
        this.zza = zzbn0;
        this.zzb = zzbb0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

