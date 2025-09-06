package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzki implements Runnable {
    private final String zza;
    private final String zzb;
    private final long zzc;
    private final Bundle zzd;
    private final boolean zze;
    private final boolean zzf;
    private final boolean zzg;
    private final String zzh;
    private final zzjq zzi;

    zzki(zzjq zzjq0, String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2, String s2) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = bundle0;
        this.zze = z;
        this.zzf = z1;
        this.zzg = z2;
        this.zzh = s2;
        this.zzi = zzjq0;
        super();
    }

    @Override
    public final void run() {
        this.zzi.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}

