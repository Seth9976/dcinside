package com.google.android.gms.measurement.internal;

final class zzgn implements Runnable {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;
    private final Object zze;
    private final zzgo zzf;

    zzgn(zzgo zzgo0, int v, String s, Object object0, Object object1, Object object2) {
        this.zza = v;
        this.zzb = s;
        this.zzc = object0;
        this.zzd = object1;
        this.zze = object2;
        this.zzf = zzgo0;
        super();
    }

    @Override
    public final void run() {
        zzha zzha0 = this.zzf.zzu.zzn();
        if(!zzha0.zzaf()) {
            this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if(this.zzf.zza == 0) {
            this.zzf.zza = this.zzf.zze().zzz() ? 'C' : 'c';
        }
        if(this.zzf.zzb < 0L) {
            this.zzf.zzb = 106000L;
        }
        String s = zzgo.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
        String s1 = "2" + "01VDIWEA?".charAt(this.zza) + this.zzf.zza + this.zzf.zzb + ":" + s;
        if(s1.length() > 0x400) {
            s1 = this.zzb.substring(0, 0x400);
        }
        zzhe zzhe0 = zzha0.zzb;
        if(zzhe0 != null) {
            zzhe0.zza(s1, 1L);
        }
    }
}

