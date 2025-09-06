package com.google.android.gms.internal.ads;

import java.io.InputStream;

public final class zzbbh {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbbh(InputStream inputStream0, boolean z, boolean z1, long v, boolean z2) {
        this.zza = inputStream0;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = v;
        this.zze = z2;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzbbh zzb(InputStream inputStream0, boolean z, boolean z1, long v, boolean z2) {
        return new zzbbh(inputStream0, z, z1, v, z2);
    }

    public final InputStream zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}

