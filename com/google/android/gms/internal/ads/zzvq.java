package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzvq implements zzye {
    public long zza;
    public long zzb;
    @Nullable
    public zzyd zzc;
    @Nullable
    public zzvq zzd;

    public zzvq(long v, int v1) {
        this.zze(v, 0x10000);
    }

    public final int zza(long v) {
        return (int)(v - this.zza);
    }

    public final zzvq zzb() {
        this.zzc = null;
        zzvq zzvq0 = this.zzd;
        this.zzd = null;
        return zzvq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzye
    public final zzyd zzc() {
        zzyd zzyd0 = this.zzc;
        zzyd0.getClass();
        return zzyd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzye
    @Nullable
    public final zzye zzd() {
        return this.zzd == null || this.zzd.zzc == null ? null : this.zzd;
    }

    public final void zze(long v, int v1) {
        zzcw.zzf(this.zzc == null);
        this.zza = v;
        this.zzb = v + 0x10000L;
    }
}

