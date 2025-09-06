package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzug {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzug(Object object0, int v, int v1, long v2) {
        this(object0, v, v1, v2, -1);
    }

    private zzug(Object object0, int v, int v1, long v2, int v3) {
        this.zza = object0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
    }

    public zzug(Object object0, long v) {
        this(object0, -1, -1, v, -1);
    }

    public zzug(Object object0, long v, int v1) {
        this(object0, -1, -1, v, v1);
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzug ? this.zza.equals(((zzug)object0).zza) && this.zzb == ((zzug)object0).zzb && this.zzc == ((zzug)object0).zzc && this.zzd == ((zzug)object0).zzd && this.zze == ((zzug)object0).zze : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.zza.hashCode() + 0x20F) * 0x1F + this.zzb) * 0x1F + this.zzc) * 0x1F + ((int)this.zzd)) * 0x1F + this.zze;
    }

    // 去混淆评级： 低(20)
    public final zzug zza(Object object0) {
        return this.zza.equals(object0) ? this : new zzug(object0, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }
}

