package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzgg implements zzfx {
    private final zzgs zza;
    @Nullable
    private zzgy zzb;
    @Nullable
    private String zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzgg() {
        this.zza = new zzgs();
        this.zzd = 8000;
        this.zze = 8000;
    }

    @Override  // com.google.android.gms.internal.ads.zzfx
    public final zzfy zza() {
        return this.zzg();
    }

    public final zzgg zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzgg zzc(int v) {
        this.zzd = v;
        return this;
    }

    public final zzgg zzd(int v) {
        this.zze = v;
        return this;
    }

    public final zzgg zze(@Nullable zzgy zzgy0) {
        this.zzb = zzgy0;
        return this;
    }

    public final zzgg zzf(@Nullable String s) {
        this.zzc = s;
        return this;
    }

    public final zzgl zzg() {
        zzgl zzgl0 = new zzgl(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzgy zzgy0 = this.zzb;
        if(zzgy0 != null) {
            zzgl0.zzf(zzgy0);
        }
        return zzgl0;
    }
}

