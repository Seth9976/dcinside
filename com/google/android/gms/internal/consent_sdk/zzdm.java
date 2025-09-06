package com.google.android.gms.internal.consent_sdk;

public final class zzdm implements zzdq {
    private static final Object zza;
    private volatile zzdq zzb;
    private volatile Object zzc;

    static {
        zzdm.zza = new Object();
    }

    private zzdm(zzdq zzdq0) {
        this.zzc = zzdm.zza;
        this.zzb = zzdq0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        Object object0 = this.zzc;
        Object object1 = zzdm.zza;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.zzc;
                if(object0 == object1) {
                    object0 = this.zzb.zza();
                    Object object2 = this.zzc;
                    if(object2 != object1 && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = object0;
                    this.zzb = null;
                }
            }
        }
        return object0;
    }

    public static zzdq zzb(zzdq zzdq0) {
        return zzdq0 instanceof zzdm ? zzdq0 : new zzdm(zzdq0);
    }
}

