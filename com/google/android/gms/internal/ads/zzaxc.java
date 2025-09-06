package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaxc extends zzaxr {
    private final zzavg zzh;
    private final long zzi;
    private final long zzj;

    public zzaxc(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, zzavg zzavg0, long v2, long v3) {
        super(zzawd0, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", zzasc0, v, 11);
        this.zzh = zzavg0;
        this.zzi = v2;
        this.zzj = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavg zzavg0 = this.zzh;
        if(zzavg0 != null) {
            zzave zzave0 = new zzave(((String)this.zze.invoke(null, zzavg0.zzb(), this.zzi, this.zzj)));
            synchronized(this.zzd) {
                this.zzd.zzz(((long)zzave0.zza));
                if(((long)zzave0.zzb) >= 0L) {
                    this.zzd.zzQ(((long)zzave0.zzb));
                }
                if(((long)zzave0.zzc) >= 0L) {
                    this.zzd.zzf(((long)zzave0.zzc));
                }
            }
        }
    }
}

