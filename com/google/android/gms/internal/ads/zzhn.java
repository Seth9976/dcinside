package com.google.android.gms.internal.ads;

public final class zzhn implements Runnable {
    public final zzho zza;
    public final int zzb;

    public zzhn(zzho zzho0, int v) {
        this.zza = zzho0;
        this.zzb = v;
    }

    @Override
    public final void run() {
        zzhq.zzc(this.zza.zza, this.zzb);
    }
}

