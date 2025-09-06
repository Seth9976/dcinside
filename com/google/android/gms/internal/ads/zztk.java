package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

public final class zztk implements zzud, zzue {
    public final zzue zza;
    long zzb;
    @Nullable
    private zzud zzc;
    private zztj[] zzd;
    private long zze;

    public zztk(zzue zzue0, boolean z, long v, long v1) {
        this.zza = zzue0;
        this.zzd = new zztj[0];
        this.zze = 0L;
        this.zzb = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zza(long v, zzlp zzlp0) {
        if(v != 0L) {
            long v1 = Math.max(0L, Math.min(zzlp0.zzc, v));
            long v2 = Math.max(0L, Math.min(zzlp0.zzd, (this.zzb == 0x8000000000000000L ? 0x7FFFFFFFFFFFFFFFL : this.zzb - v)));
            if(v1 != zzlp0.zzc || v2 != zzlp0.zzd) {
                zzlp0 = new zzlp(v1, v2);
            }
            return this.zza.zza(v, zzlp0);
        }
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzb() {
        long v = this.zza.zzb();
        return v == 0x8000000000000000L || this.zzb != 0x8000000000000000L && v >= this.zzb ? 0x8000000000000000L : v;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzc() {
        long v = this.zza.zzc();
        return v == 0x8000000000000000L || this.zzb != 0x8000000000000000L && v >= this.zzb ? 0x8000000000000000L : v;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        if(this.zzq()) {
            long v = this.zze;
            this.zze = 0x8000000000000001L;
            long v1 = this.zzd();
            return v1 == 0x8000000000000001L ? v : v1;
        }
        boolean z = false;
        long v2 = this.zza.zzd();
        if(v2 == 0x8000000000000001L) {
            return 0x8000000000000001L;
        }
        zzcw.zzf(v2 >= 0L);
        if(this.zzb == 0x8000000000000000L || v2 <= this.zzb) {
            z = true;
        }
        zzcw.zzf(z);
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zze(long v) {
        this.zze = 0x8000000000000001L;
        zztj[] arr_zztj = this.zzd;
        boolean z = false;
        for(int v1 = 0; v1 < arr_zztj.length; ++v1) {
            zztj zztj0 = arr_zztj[v1];
            if(zztj0 != null) {
                zztj0.zzc();
            }
        }
        long v2 = this.zza.zze(v);
        if(v2 == v || v2 >= 0L && (this.zzb == 0x8000000000000000L || v2 <= this.zzb)) {
            z = true;
        }
        zzcw.zzf(z);
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] arr_zzxv, boolean[] arr_z, zzvy[] arr_zzvy, boolean[] arr_z1, long v) {
        this.zzd = new zztj[arr_zzvy.length];
        zzvy[] arr_zzvy1 = new zzvy[arr_zzvy.length];
        for(int v2 = 0; true; ++v2) {
            zzvy zzvy0 = null;
            if(v2 >= arr_zzvy.length) {
                break;
            }
            zztj[] arr_zztj = this.zzd;
            zztj zztj0 = (zztj)arr_zzvy[v2];
            arr_zztj[v2] = zztj0;
            if(zztj0 != null) {
                zzvy0 = zztj0.zza;
            }
            arr_zzvy1[v2] = zzvy0;
        }
        long v3 = this.zza.zzf(arr_zzxv, arr_z, arr_zzvy1, arr_z1, v);
        long v4 = !this.zzq() || v != 0L ? v : 0L;
        this.zze = 0x8000000000000001L;
        zzcw.zzf(v3 == v4 || v3 >= 0L && (this.zzb == 0x8000000000000000L || v3 <= this.zzb));
        for(int v1 = 0; v1 < arr_zzvy.length; ++v1) {
            zzvy zzvy1 = arr_zzvy1[v1];
            if(zzvy1 == null) {
                this.zzd[v1] = null;
            }
            else {
                zztj[] arr_zztj1 = this.zzd;
                zztj zztj1 = arr_zztj1[v1];
                if(zztj1 == null || zztj1.zza != zzvy1) {
                    arr_zztj1[v1] = new zztj(this, zzvy1);
                }
            }
            arr_zzvy[v1] = this.zzd[v1];
        }
        return v3;
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
        this.zza.zzj(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzud0, long v) {
        this.zzc = zzud0;
        this.zza.zzl(this, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzm(long v) {
        this.zza.zzm(v);
    }

    public final void zzn(long v, long v1) {
        this.zzb = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzo(zzkj zzkj0) {
        return this.zza.zzo(zzkj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != 0x8000000000000001L;
    }
}

