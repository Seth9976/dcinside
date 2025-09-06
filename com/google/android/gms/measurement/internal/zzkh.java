package com.google.android.gms.measurement.internal;

final class zzkh implements Runnable {
    private final String zza;
    private final String zzb;
    private final Object zzc;
    private final long zzd;
    private final zzjq zze;

    zzkh(zzjq zzjq0, String s, String s1, Object object0, long v) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = object0;
        this.zzd = v;
        this.zze = zzjq0;
        super();
    }

    @Override
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

