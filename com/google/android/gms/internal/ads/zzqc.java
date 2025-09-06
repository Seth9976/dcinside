package com.google.android.gms.internal.ads;

public final class zzqc {
    private final zzch[] zza;
    private final zzqu zzb;
    private final zzck zzc;

    public zzqc(zzch[] arr_zzch) {
        zzqu zzqu0 = new zzqu();
        zzck zzck0 = new zzck();
        super();
        zzch[] arr_zzch1 = new zzch[2];
        this.zza = arr_zzch1;
        System.arraycopy(arr_zzch, 0, arr_zzch1, 0, 0);
        this.zzb = zzqu0;
        this.zzc = zzck0;
        arr_zzch1[0] = zzqu0;
        arr_zzch1[1] = zzck0;
    }

    // 去混淆评级： 低(20)
    public final long zza(long v) {
        return this.zzc.zzg() ? this.zzc.zzi(v) : v;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbe zzc(zzbe zzbe0) {
        this.zzc.zzk(zzbe0.zzb);
        this.zzc.zzj(zzbe0.zzc);
        return zzbe0;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzch[] zze() {
        return this.zza;
    }
}

