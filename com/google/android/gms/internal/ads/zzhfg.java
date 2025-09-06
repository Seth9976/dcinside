package com.google.android.gms.internal.ads;

public final class zzhfg implements zzhfa {
    private static final Object zza;
    private volatile zzhfa zzb;
    private volatile Object zzc;

    static {
        zzhfg.zza = new Object();
    }

    private zzhfg(zzhfa zzhfa0) {
        this.zzc = zzhfg.zza;
        this.zzb = zzhfa0;
    }

    public static zzhfa zza(zzhfa zzhfa0) {
        return !(zzhfa0 instanceof zzhfg) && !(zzhfa0 instanceof zzheq) ? new zzhfg(zzhfa0) : zzhfa0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Object object0 = this.zzc;
        if(object0 == zzhfg.zza) {
            zzhfa zzhfa0 = this.zzb;
            if(zzhfa0 == null) {
                return this.zzc;
            }
            object0 = zzhfa0.zzb();
            this.zzc = object0;
            this.zzb = null;
        }
        return object0;
    }
}

