package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;

public class zzhb {
    private int zza;

    public final void zza(int v) {
        this.zza |= 0x20000000;
    }

    @CallSuper
    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int v) {
        this.zza = v;
    }

    protected final boolean zzd(int v) {
        return (this.zza & v) == v;
    }

    public final boolean zze() {
        return this.zzd(0x10000000);
    }

    public final boolean zzf() {
        return this.zzd(4);
    }

    public final boolean zzg() {
        return this.zzd(1);
    }

    public final boolean zzh() {
        return this.zzd(0x20000000);
    }

    public final boolean zzi() {
        return this.zzd(0x4000000);
    }
}

