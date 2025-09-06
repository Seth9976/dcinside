package com.google.android.gms.internal.ads;

public final class zzhep implements zzher {
    private zzhfa zza;

    public static void zza(zzhfa zzhfa0, zzhfa zzhfa1) {
        if(((zzhep)zzhfa0).zza != null) {
            throw new IllegalStateException();
        }
        ((zzhep)zzhfa0).zza = zzhfa1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzhfa zzhfa0 = this.zza;
        if(zzhfa0 == null) {
            throw new IllegalStateException();
        }
        return zzhfa0.zzb();
    }
}

