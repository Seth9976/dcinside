package com.google.android.gms.internal.ads;

final class zzfn implements Comparable {
    private final zzdy zza;
    private long zzb;
    private long zzc;

    public zzfn() {
        this.zzb = 0x8000000000000001L;
        this.zza = new zzdy();
    }

    @Override
    public final int compareTo(Object object0) {
        int v = Long.compare(this.zzb, ((zzfn)object0).zzb);
        return v == 0 ? Long.compare(this.zzc, ((zzfn)object0).zzc) : v;
    }

    public final void zzc(long v, long v1, zzdy zzdy0) {
        zzcw.zzf(v != 0x8000000000000001L);
        this.zzb = v;
        this.zzc = v1;
        this.zza.zzI(zzdy0.zzb());
        System.arraycopy(zzdy0.zzN(), zzdy0.zzd(), this.zza.zzN(), 0, zzdy0.zzb());
    }
}

