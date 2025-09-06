package com.google.android.gms.internal.ads;

public enum zzhau {
    DOUBLE(zzhav.zzd, 1),
    FLOAT(zzhav.zzc, 5),
    INT64(zzhav.zzb, 0),
    UINT64(zzhav.zzb, 0),
    INT32(zzhav.zza, 0),
    FIXED64(zzhav.zzb, 1),
    FIXED32(zzhav.zza, 5),
    BOOL(zzhav.zze, 0),
    STRING(zzhav.zzf, 2),
    GROUP(zzhav.zzi, 3),
    MESSAGE(zzhav.zzi, 2),
    BYTES(zzhav.zzg, 2),
    UINT32(zzhav.zza, 0),
    ENUM(zzhav.zzh, 0),
    SFIXED32(zzhav.zza, 5),
    SFIXED64(zzhav.zzb, 1),
    SINT32(zzhav.zza, 0),
    SINT64(zzhav.zzb, 0);

    private final zzhav zzt;

    private zzhau(zzhav zzhav0, int v1) {
        this.zzt = zzhav0;
    }

    public final zzhav zza() {
        return this.zzt;
    }
}

