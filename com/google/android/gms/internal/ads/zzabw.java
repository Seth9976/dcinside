package com.google.android.gms.internal.ads;

public final class zzabw {
    public static final zzabw zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;

    static {
        zzabw.zza = new zzabw(-3, 0x8000000000000001L, -1L);
    }

    private zzabw(int v, long v1, long v2) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
    }

    public static zzabw zzd(long v, long v1) {
        return new zzabw(-1, v, v1);
    }

    public static zzabw zze(long v) {
        return new zzabw(0, 0x8000000000000001L, v);
    }

    public static zzabw zzf(long v, long v1) {
        return new zzabw(-2, v, v1);
    }
}

