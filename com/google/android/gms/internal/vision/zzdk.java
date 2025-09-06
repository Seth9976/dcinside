package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzdk implements zzdf {
    private volatile zzdf zza;
    private volatile boolean zzb;
    @NullableDecl
    private Object zzc;

    zzdk(zzdf zzdf0) {
        this.zza = (zzdf)zzde.zza(zzdf0);
    }

    @Override
    public final String toString() {
        zzdf zzdf0 = this.zza;
        if(zzdf0 == null) {
            zzdf0 = "<supplier that returned " + this.zzc + ">";
        }
        return "Suppliers.memoize(" + zzdf0 + ")";
    }

    @Override  // com.google.android.gms.internal.vision.zzdf
    public final Object zza() {
        if(!this.zzb) {
            synchronized(this) {
                if(!this.zzb) {
                    Object object0 = this.zza.zza();
                    this.zzc = object0;
                    this.zzb = true;
                    this.zza = null;
                    return object0;
                }
            }
        }
        return this.zzc;
    }
}

