package com.google.android.gms.measurement.internal;

final class zzik implements Runnable {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzic zze;

    zzik(zzic zzic0, String s, String s1, String s2, long v) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = v;
        this.zze = zzic0;
        super();
    }

    @Override
    public final void run() {
        String s = this.zza;
        if(s == null) {
            this.zze.zza.zza(this.zzb, null);
            return;
        }
        zzlk zzlk0 = new zzlk(this.zzc, s, this.zzd);
        this.zze.zza.zza(this.zzb, zzlk0);
    }
}

