package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.util.Clock;

public final class zzfbn {
    private final Clock zza;
    private final zzdrw zzb;
    private final Object zzc;
    private volatile long zzd;
    private volatile int zze;

    public zzfbn(Clock clock0, zzdrw zzdrw0) {
        this.zzc = new Object();
        this.zze = 1;
        this.zzd = 0L;
        this.zza = clock0;
        this.zzb = zzdrw0;
    }

    public final void zza() {
        this.zzf(2, 3);
    }

    public final void zzb(boolean z) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmS)).booleanValue()) {
            zzdrv zzdrv0 = this.zzb.zza();
            zzdrv0.zzb("action", "mbs_state");
            zzdrv0.zzb("mbs_state", (z ? "1" : "0"));
            zzdrv0.zzg();
        }
        if(z) {
            this.zzf(1, 2);
            return;
        }
        this.zzf(2, 1);
    }

    public final boolean zzc() {
        synchronized(this.zzc) {
            this.zze();
            return this.zze == 3;
        }
    }

    public final boolean zzd() {
        synchronized(this.zzc) {
            this.zze();
            return this.zze == 2;
        }
    }

    private final void zze() {
        long v = this.zza.currentTimeMillis();
        synchronized(this.zzc) {
            if(this.zze == 3 && this.zzd + ((long)(((Long)zzbe.zzc().zza(zzbcl.zzfP)))) <= v) {
                this.zze = 1;
            }
        }
    }

    private final void zzf(int v, int v1) {
        this.zze();
        Object object0 = this.zzc;
        long v2 = this.zza.currentTimeMillis();
        synchronized(object0) {
            if(this.zze != v) {
                return;
            }
            this.zze = v1;
            if(this.zze == 3) {
                this.zzd = v2;
            }
        }
    }
}

