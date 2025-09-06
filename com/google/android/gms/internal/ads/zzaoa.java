package com.google.android.gms.internal.ads;

import java.util.List;

final class zzaoa {
    private final List zza;
    private final zzadt[] zzb;

    public zzaoa(List list0) {
        this.zza = list0;
        this.zzb = new zzadt[list0.size()];
    }

    public final void zza(long v, zzdy zzdy0) {
        if(zzdy0.zzb() >= 9 && (zzdy0.zzg() == 434 && zzdy0.zzg() == 1195456820 && zzdy0.zzm() == 3)) {
            zzabz.zzb(v, zzdy0, this.zzb);
        }
    }

    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        for(int v = 0; v < this.zzb.length; ++v) {
            zzanx0.zzc();
            zzadt zzadt0 = zzacq0.zzw(zzanx0.zza(), 3);
            zzab zzab0 = (zzab)this.zza.get(v);
            zzcw.zze("application/cea-608".equals(zzab0.zzo) || "application/cea-708".equals(zzab0.zzo), "Invalid closed caption MIME type provided: " + zzab0.zzo);
            zzz zzz0 = new zzz();
            zzz0.zzM(zzanx0.zzb());
            zzz0.zzaa(zzab0.zzo);
            zzz0.zzac(zzab0.zze);
            zzz0.zzQ(zzab0.zzd);
            zzz0.zzx(zzab0.zzI);
            zzz0.zzN(zzab0.zzr);
            zzadt0.zzm(zzz0.zzag());
            this.zzb[v] = zzadt0;
        }
    }
}

