package com.google.android.gms.internal.ads;

import o3.a;

final class zzfvi implements zzfvf {
    private static final zzfvf zza;
    private final zzfvm zzb;
    private volatile zzfvf zzc;
    @a
    private Object zzd;

    static {
        zzfvi.zza = new zzfvh();
    }

    zzfvi(zzfvf zzfvf0) {
        this.zzb = new zzfvm();
        this.zzc = zzfvf0;
    }

    @Override
    public final String toString() {
        zzfvf zzfvf0 = this.zzc;
        if(zzfvf0 == zzfvi.zza) {
            zzfvf0 = "<supplier that returned " + this.zzd + ">";
        }
        return "Suppliers.memoize(" + zzfvf0 + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        zzfvf zzfvf0 = zzfvi.zza;
        if(this.zzc != zzfvf0) {
            synchronized(this.zzb) {
                if(this.zzc != zzfvf0) {
                    Object object0 = this.zzc.zza();
                    this.zzd = object0;
                    this.zzc = zzfvf0;
                    return object0;
                }
            }
        }
        return this.zzd;
    }
}

