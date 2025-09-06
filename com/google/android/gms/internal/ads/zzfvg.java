package com.google.android.gms.internal.ads;

import java.io.Serializable;
import o3.a;

final class zzfvg implements zzfvf, Serializable {
    final zzfvf zza;
    volatile transient boolean zzb;
    @a
    transient Object zzc;
    private final transient zzfvm zzd;

    zzfvg(zzfvf zzfvf0) {
        this.zzd = new zzfvm();
        this.zza = zzfvf0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return this.zzb ? "Suppliers.memoize(" + ("<supplier that returned " + this.zzc + ">").toString() + ")" : "Suppliers.memoize(" + this.zza.toString() + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        if(!this.zzb) {
            zzfvm zzfvm0 = this.zzd;
            synchronized(zzfvm0) {
                if(!this.zzb) {
                    Object object0 = this.zza.zza();
                    this.zzc = object0;
                    this.zzb = true;
                    return object0;
                }
            }
        }
        return this.zzc;
    }
}

