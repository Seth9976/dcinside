package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzvh implements zzvy {
    final zzvk zza;
    private final int zzb;

    public zzvh(zzvk zzvk0, int v) {
        this.zza = zzvk0;
        super();
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final int zza(zzke zzke0, zzhh zzhh0, int v) {
        return this.zza.zzg(this.zzb, zzke0, zzhh0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long v) {
        return this.zza.zzi(this.zzb, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}

