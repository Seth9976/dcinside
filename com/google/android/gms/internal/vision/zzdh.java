package com.google.android.gms.internal.vision;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzdh implements zzdf, Serializable {
    private final zzdf zza;
    private volatile transient boolean zzb;
    @NullableDecl
    private transient Object zzc;

    zzdh(zzdf zzdf0) {
        this.zza = (zzdf)zzde.zza(zzdf0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return this.zzb ? "Suppliers.memoize(" + ("<supplier that returned " + this.zzc + ">") + ")" : "Suppliers.memoize(" + this.zza + ")";
    }

    @Override  // com.google.android.gms.internal.vision.zzdf
    public final Object zza() {
        if(!this.zzb) {
            synchronized(this) {
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

