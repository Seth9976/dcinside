package com.google.android.gms.internal.consent_sdk;

public final class zzax implements Runnable {
    public final zzbb zza;

    public zzax(zzbb zzbb0) {
        this.zza = zzbb0;
    }

    @Override
    public final void run() {
        zzg zzg0 = new zzg(4, "Web view timed out.");
        this.zza.zzj(zzg0);
    }
}

