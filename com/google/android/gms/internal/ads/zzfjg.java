package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;

public final class zzfjg {
    private final long zza;
    private final long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private final Random zzf;

    public zzfjg(long v, double f, long v1, double f1) {
        this.zzd = 5L;
        this.zzf = new Random();
        this.zza = v;
        this.zzb = v1;
        this.zzc = 0L;
        this.zzc();
    }

    public final long zza() {
        double f = 0.2 * ((double)this.zze);
        long v = (long)(((double)this.zze) - f);
        long v1 = ((long)(((double)this.zze) + f)) - v + 1L;
        return v + ((long)(this.zzf.nextDouble() * ((double)v1)));
    }

    public final void zzb() {
        double f = (double)this.zze;
        this.zze = Math.min(((long)(f + f)), this.zzb);
        ++this.zzc;
    }

    public final void zzc() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final void zzd(int v) {
        synchronized(this) {
            Preconditions.checkArgument(v > 0);
            this.zzd = (long)v;
        }
    }

    public final boolean zze() {
        return this.zzc > Math.max(this.zzd, ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzz))))) && this.zze >= this.zzb;
    }
}

