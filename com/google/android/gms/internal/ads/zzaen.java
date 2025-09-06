package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

public final class zzaen implements zzacn {
    private final zzado zza;

    public zzaen() {
        this.zza = new zzado(0x424D, 2, "image/bmp");
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        return this.zza.zzb(zzaco0, zzadj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final zzacn zzc() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final List zzd() {
        return zzfxn.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacq0) {
        this.zza.zze(zzacq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        this.zza.zzf(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        return this.zza.zzi(zzaco0);
    }
}

