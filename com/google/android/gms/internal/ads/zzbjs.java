package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbjs {
    private boolean zza;
    private boolean zzb;
    private float zzc;
    private final AtomicBoolean zzd;

    public zzbjs() {
        this.zza = false;
        this.zzb = false;
        this.zzc = 0.0f;
        this.zzd = new AtomicBoolean(false);
    }

    public final float zza() {
        synchronized(this) {
        }
        return this.zzc;
    }

    public final void zzb(boolean z, float f) {
        synchronized(this) {
            this.zzb = z;
            this.zzc = f;
        }
    }

    public final void zzc(boolean z) {
        synchronized(this) {
            this.zza = z;
            this.zzd.set(true);
        }
    }

    public final boolean zzd() {
        synchronized(this) {
        }
        return this.zzb;
    }

    public final boolean zze(boolean z) {
        synchronized(this) {
            return this.zzd.get() ? this.zza : z;
        }
    }
}

