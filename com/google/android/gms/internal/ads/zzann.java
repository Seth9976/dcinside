package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzann {
    private final List zza;
    private final zzadt[] zzb;
    private final zzfo zzc;

    public zzann(List list0) {
        this.zza = list0;
        this.zzb = new zzadt[list0.size()];
        this.zzc = new zzfo((long v, zzdy zzdy0) -> zzabz.zza(v, zzdy0, this.zzb));
    }

    public final void zza(long v, zzdy zzdy0) {
        this.zzc.zzb(v, zzdy0);
    }

    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        for(int v = 0; v < this.zzb.length; ++v) {
            zzanx0.zzc();
            zzadt zzadt0 = zzacq0.zzw(zzanx0.zza(), 3);
            zzab zzab0 = (zzab)this.zza.get(v);
            zzcw.zze("application/cea-608".equals(zzab0.zzo) || "application/cea-708".equals(zzab0.zzo), "Invalid closed caption MIME type provided: " + zzab0.zzo);
            String s = zzab0.zza == null ? zzanx0.zzb() : zzab0.zza;
            zzz zzz0 = new zzz();
            zzz0.zzM(s);
            zzz0.zzaa(zzab0.zzo);
            zzz0.zzac(zzab0.zze);
            zzz0.zzQ(zzab0.zzd);
            zzz0.zzx(zzab0.zzI);
            zzz0.zzN(zzab0.zzr);
            zzadt0.zzm(zzz0.zzag());
            this.zzb[v] = zzadt0;
        }
    }

    public final void zzc() {
        this.zzc.zzc();
    }

    // 检测为 Lambda 实现
    final void zzd(long v, zzdy zzdy0) [...]

    public final void zze(int v) {
        this.zzc.zzd(v);
    }
}

