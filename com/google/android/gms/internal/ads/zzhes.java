package com.google.android.gms.internal.ads;

public final class zzhes implements zzhel, zzher {
    private static final zzhes zza;
    private final Object zzb;

    static {
        zzhes.zza = new zzhes(null);
    }

    private zzhes(Object object0) {
        this.zzb = object0;
    }

    public static zzher zza(Object object0) {
        zzhez.zza(object0, "instance cannot be null");
        return new zzhes(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhel, com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zzb;
    }

    public static zzher zzc(Object object0) {
        return object0 == null ? zzhes.zza : new zzhes(object0);
    }
}

