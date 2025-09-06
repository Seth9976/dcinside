package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final class zzky implements zzkp {
    public final zzub zza;
    public final Object zzb;
    public final List zzc;
    public int zzd;
    public boolean zze;

    public zzky(zzui zzui0, boolean z) {
        this.zza = new zzub(zzui0, z);
        this.zzc = new ArrayList();
        this.zzb = new Object();
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final zzbq zza() {
        return this.zza.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int v) {
        this.zzd = v;
        this.zze = false;
        this.zzc.clear();
    }
}

