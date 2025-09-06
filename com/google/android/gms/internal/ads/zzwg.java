package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzwg implements zzud, zzue {
    private final zzue zza;
    private final long zzb;
    private zzud zzc;

    public zzwg(zzue zzue0, long v) {
        this.zza = zzue0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zza(long v, zzlp zzlp0) {
        return this.zza.zza(v - this.zzb, zzlp0) + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzb() {
        long v = this.zza.zzb();
        return v == 0x8000000000000000L ? 0x8000000000000000L : v + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzc() {
        long v = this.zza.zzc();
        return v == 0x8000000000000000L ? 0x8000000000000000L : v + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        long v = this.zza.zzd();
        return v == 0x8000000000000001L ? 0x8000000000000001L : v + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zze(long v) {
        return this.zza.zze(v - this.zzb) + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] arr_zzxv, boolean[] arr_z, zzvy[] arr_zzvy, boolean[] arr_z1, long v) {
        zzvy[] arr_zzvy1 = new zzvy[arr_zzvy.length];
        for(int v2 = 0; true; ++v2) {
            zzvy zzvy0 = null;
            if(v2 >= arr_zzvy.length) {
                break;
            }
            zzwf zzwf0 = (zzwf)arr_zzvy[v2];
            if(zzwf0 != null) {
                zzvy0 = zzwf0.zzc();
            }
            arr_zzvy1[v2] = zzvy0;
        }
        long v3 = this.zza.zzf(arr_zzxv, arr_z, arr_zzvy1, arr_z1, v - this.zzb);
        for(int v1 = 0; v1 < arr_zzvy.length; ++v1) {
            zzvy zzvy1 = arr_zzvy1[v1];
            if(zzvy1 == null) {
                arr_zzvy[v1] = null;
            }
            else {
                zzvy zzvy2 = arr_zzvy[v1];
                if(zzvy2 == null || ((zzwf)zzvy2).zzc() != zzvy1) {
                    arr_zzvy[v1] = new zzwf(zzvy1, this.zzb);
                }
            }
        }
        return v3 + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzvz
    public final void zzg(zzwa zzwa0) {
        zzue zzue0 = (zzue)zzwa0;
        zzud zzud0 = this.zzc;
        zzud0.getClass();
        zzud0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final zzwj zzh() {
        return this.zza.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzud
    public final void zzi(zzue zzue0) {
        zzud zzud0 = this.zzc;
        zzud0.getClass();
        zzud0.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzj(long v, boolean z) {
        this.zza.zzj(v - this.zzb, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzud0, long v) {
        this.zzc = zzud0;
        this.zza.zzl(this, v - this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzm(long v) {
        this.zza.zzm(v - this.zzb);
    }

    public final zzue zzn() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzo(zzkj zzkj0) {
        zzkh zzkh0 = zzkj0.zza();
        zzkh0.zze(zzkj0.zza - this.zzb);
        zzkj zzkj1 = zzkh0.zzg();
        return this.zza.zzo(zzkj1);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzp() {
        return this.zza.zzp();
    }
}

