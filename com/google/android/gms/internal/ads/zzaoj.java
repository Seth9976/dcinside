package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

public final class zzaoj implements zzacn {
    private final zzdy zza;
    private final zzado zzb;

    public zzaoj() {
        this.zza = new zzdy(4);
        this.zzb = new zzado(-1, -1, "image/webp");
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        return this.zzb.zzb(zzaco0, zzadj0);
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
        this.zzb.zze(zzacq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        this.zzb.zzf(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        this.zza.zzI(4);
        ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 4, false);
        if(this.zza.zzu() == 1380533830L) {
            ((zzacc)zzaco0).zzl(4, false);
            this.zza.zzI(4);
            ((zzacc)zzaco0).zzm(this.zza.zzN(), 0, 4, false);
            return this.zza.zzu() == 0x57454250L;
        }
        return false;
    }
}

