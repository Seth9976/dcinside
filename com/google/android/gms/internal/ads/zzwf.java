package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzwf implements zzvy {
    private final zzvy zza;
    private final long zzb;

    public zzwf(zzvy zzvy0, long v) {
        this.zza = zzvy0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final int zza(zzke zzke0, zzhh zzhh0, int v) {
        int v1 = this.zza.zza(zzke0, zzhh0, v);
        if(v1 == -4) {
            zzhh0.zze += this.zzb;
            return -4;
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long v) {
        return this.zza.zzb(v - this.zzb);
    }

    public final zzvy zzc() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        return this.zza.zze();
    }
}

