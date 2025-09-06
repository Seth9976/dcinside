package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;

final class zzqg {
    @Nullable
    private Exception zza;
    private long zzb;
    private long zzc;

    public zzqg() {
        this.zzb = 0x8000000000000001L;
        this.zzc = 0x8000000000000001L;
    }

    public final void zza() {
        this.zza = null;
        this.zzb = 0x8000000000000001L;
        this.zzc = 0x8000000000000001L;
    }

    public final void zzb(Exception exception0) throws Exception {
        long v = SystemClock.elapsedRealtime();
        if(this.zza == null) {
            this.zza = exception0;
        }
        if(this.zzb == 0x8000000000000001L && !zzqm.zzK()) {
            this.zzb = v + 200L;
        }
        if(this.zzb != 0x8000000000000001L && v >= this.zzb) {
            Exception exception1 = this.zza;
            if(exception1 != exception0) {
                exception1.addSuppressed(exception0);
            }
            Exception exception2 = this.zza;
            this.zza();
            throw exception2;
        }
        this.zzc = v + 50L;
    }

    public final boolean zzc() {
        if(this.zza == null) {
            return false;
        }
        return zzqm.zzK() ? true : SystemClock.elapsedRealtime() < this.zzc;
    }
}

