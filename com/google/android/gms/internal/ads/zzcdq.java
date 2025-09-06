package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

public final class zzcdq implements zzkg {
    private final zzyk zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private boolean zzg;

    zzcdq() {
        this.zza = new zzyk(true, 0x10000);
        this.zzb = 15000000L;
        this.zzc = 30000000L;
        this.zzd = 2500000L;
        this.zze = 5000000L;
    }

    @VisibleForTesting
    final void zza(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if(z) {
            this.zza.zze();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final long zzb(zzog zzog0) {
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final void zzc(zzog zzog0) {
        this.zza(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final void zzd(zzog zzog0) {
        this.zza(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final void zze(zzog zzog0) {
        this.zza(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final void zzf(zzkf zzkf0, zzwj zzwj0, zzxv[] arr_zzxv) {
        this.zzf = 0;
        for(int v = 0; v < arr_zzxv.length; ++v) {
            zzxv zzxv0 = arr_zzxv[v];
            if(zzxv0 != null) {
                int v1 = 0x20000;
                int v2 = this.zzf;
                int v3 = zzxv0.zzg().zzc;
                switch(v3) {
                    case 0: {
                        v1 = 0x89A0000;
                        break;
                    }
                    case 1: {
                        v1 = 0xC80000;
                        break;
                    }
                    default: {
                        if(v3 == 2) {
                            v1 = 0x7D00000;
                        }
                        else if(v3 != 3 && v3 != 5 && v3 != 6) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                this.zzf = v2 + v1;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final boolean zzg(zzog zzog0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final boolean zzh(zzkf zzkf0) {
        int v1;
        long v = zzkf0.zzb;
        boolean z = true;
        if(v > this.zzc) {
            v1 = 0;
        }
        else {
            v1 = v >= this.zzb ? 1 : 2;
        }
        int v2 = this.zza.zza();
        if(v1 != 2 && (v1 != 1 || !this.zzg || v2 >= this.zzf)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final boolean zzi(zzbq zzbq0, zzug zzug0, long v) {
        zzdo.zzf("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final boolean zzj(zzkf zzkf0) {
        long v = zzkf0.zzd ? this.zze : this.zzd;
        return v <= 0L || zzkf0.zzb >= v;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final zzyk zzk() {
        return this.zza;
    }

    public final void zzl(int v) {
        synchronized(this) {
            this.zzd = ((long)v) * 1000L;
        }
    }

    public final void zzm(int v) {
        synchronized(this) {
            this.zze = ((long)v) * 1000L;
        }
    }

    public final void zzn(int v) {
        synchronized(this) {
            this.zzc = ((long)v) * 1000L;
        }
    }

    public final void zzo(int v) {
        synchronized(this) {
            this.zzb = ((long)v) * 1000L;
        }
    }
}

