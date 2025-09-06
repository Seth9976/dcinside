package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.Nullable;

public final class zzlf {
    private final zzle zza;
    private final zzld zzb;
    private final zzbq zzc;
    private int zzd;
    @Nullable
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzlf(zzld zzld0, zzle zzle0, zzbq zzbq0, int v, zzcx zzcx0, Looper looper0) {
        this.zzb = zzld0;
        this.zza = zzle0;
        this.zzc = zzbq0;
        this.zzf = looper0;
        this.zzg = v;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzle zzc() {
        return this.zza;
    }

    public final zzlf zzd() {
        zzcw.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzlf zze(@Nullable Object object0) {
        zzcw.zzf(!this.zzh);
        this.zze = object0;
        return this;
    }

    public final zzlf zzf(int v) {
        zzcw.zzf(!this.zzh);
        this.zzd = v;
        return this;
    }

    @Nullable
    public final Object zzg() {
        return this.zze;
    }

    public final void zzh(boolean z) {
        synchronized(this) {
            this.zzi |= z;
            this.notifyAll();
        }
    }

    public final boolean zzi() [...] // 潜在的解密器
}

