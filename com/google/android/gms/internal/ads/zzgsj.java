package com.google.android.gms.internal.ads;

public enum zzgsj implements zzgxv {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    private zzgsj(int v1) {
        this.zzh = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        if(this == zzgsj.zzf) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.zzh;
    }
}

