package com.google.android.gms.internal.ads;

public final class zzheq implements zzhel, zzhfa {
    private static final Object zza;
    private volatile zzhfa zzb;
    private volatile Object zzc;

    static {
        zzheq.zza = new Object();
    }

    private zzheq(zzhfa zzhfa0) {
        this.zzc = zzheq.zza;
        this.zzb = zzhfa0;
    }

    public static zzhel zza(zzhfa zzhfa0) {
        return zzhfa0 instanceof zzhel ? ((zzhel)zzhfa0) : new zzheq(zzhfa0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhel, com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zzc == zzheq.zza ? this.zzd() : this.zzc;
    }

    public static zzhfa zzc(zzhfa zzhfa0) {
        return zzhfa0 instanceof zzheq ? zzhfa0 : new zzheq(zzhfa0);
    }

    private final Object zzd() {
        synchronized(this) {
            Object object0 = this.zzc;
            Object object1 = zzheq.zza;
            if(object0 == object1) {
                Object object2 = this.zzb.zzb();
                Object object3 = this.zzc;
                if(object3 != object1 && object3 != object2) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object3 + " & " + object2 + ". This is likely due to a circular dependency.");
                }
                this.zzc = object2;
                this.zzb = null;
                return object2;
            }
            return object0;
        }
    }
}

