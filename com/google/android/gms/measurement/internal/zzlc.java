package com.google.android.gms.measurement.internal;

import android.net.Uri;

final class zzlc implements Runnable {
    private final boolean zza;
    private final Uri zzb;
    private final String zzc;
    private final String zzd;
    private final zzkz zze;

    zzlc(zzkz zzkz0, boolean z, Uri uri0, String s, String s1) {
        this.zza = z;
        this.zzb = uri0;
        this.zzc = s;
        this.zzd = s1;
        this.zze = zzkz0;
        super();
    }

    @Override
    public final void run() {
        zzkz.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}

