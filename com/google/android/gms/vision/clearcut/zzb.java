package com.google.android.gms.vision.clearcut;

import p3.a;

public final class zzb {
    private final long zza;
    private final Object zzb;
    @a("lock")
    private long zzc;

    public zzb(double f) {
        this.zzb = new Object();
        this.zzc = 0x8000000000000000L;
        this.zza = 30000L;
    }

    public final boolean zza() {
        synchronized(this.zzb) {
            long v = System.currentTimeMillis();
            if(this.zzc + this.zza > v) {
                return false;
            }
            this.zzc = v;
        }
        return true;
    }
}

