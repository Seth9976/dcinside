package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzaww implements Callable {
    private final zzawd zza;
    private final zzasc zzb;

    public zzaww(zzawd zzawd0, zzasc zzasc0) {
        this.zza = zzawd0;
        this.zzb = zzasc0;
    }

    @Override
    public final Object call() throws Exception {
        if(this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzasy zzasy0 = this.zza.zzc();
        if(zzasy0 != null) {
            try {
                synchronized(this.zzb) {
                    byte[] arr_b = zzasy0.zzaV();
                    this.zzb.zzaM(arr_b, zzgxb.zza());
                    return null;
                }
            }
            catch(zzgyg | NullPointerException unused_ex) {
            }
        }
        return null;
    }
}

