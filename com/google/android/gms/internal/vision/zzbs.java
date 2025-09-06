package com.google.android.gms.internal.vision;

public final class zzbs {
    private final boolean zza;

    public zzbs(zzbv zzbv0) {
        zzde.zza(zzbv0, "BuildInfo must be non-null");
        this.zza = !zzbv0.zza();
    }

    public final boolean zza(String s) {
        zzde.zza(s, "flagName must not be null");
        return this.zza ? ((zzeh)zzbu.zza.zza()).zza(s) : true;
    }
}

