package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

final class zzbzk {
    private final Object zza;
    private volatile long zzb;
    private volatile int zzc;

    private zzbzk() {
        this.zza = new Object();
        this.zzc = 1;
        this.zzb = 0L;
    }

    zzbzk(zzbzl zzbzl0) {
        this.zza = new Object();
        this.zzc = 1;
        this.zzb = 0L;
    }

    public final void zza() {
        long v = zzv.zzC().currentTimeMillis();
        synchronized(this.zza) {
            if(this.zzc == 3 && this.zzb + ((long)(((Long)zzbe.zzc().zza(zzbcl.zzfP)))) <= v) {
                this.zzc = 1;
            }
        }
        long v2 = zzv.zzC().currentTimeMillis();
        synchronized(this.zza) {
            if(this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            this.zzb = v2;
        }
    }
}

