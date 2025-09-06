package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

final class zzcdt implements zzfy {
    private final zzfy zza;
    private final long zzb;
    private final zzfy zzc;
    private long zzd;
    private Uri zze;

    zzcdt(zzfy zzfy0, int v, zzfy zzfy1) {
        this.zza = zzfy0;
        this.zzb = (long)v;
        this.zzc = zzfy1;
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        int v6;
        long v2 = this.zzd;
        long v3 = this.zzb;
        if(v2 < v3) {
            int v4 = this.zza.zza(arr_b, v, ((int)Math.min(v1, v3 - v2)));
            long v5 = this.zzd + ((long)v4);
            this.zzd = v5;
            v6 = v4;
            v2 = v5;
        }
        else {
            v6 = 0;
        }
        if(v2 >= this.zzb) {
            int v7 = this.zzc.zza(arr_b, v + v6, v1 - v6);
            v6 += v7;
            this.zzd += (long)v7;
        }
        return v6;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws IOException {
        this.zze = zzgd0.zza;
        zzgd zzgd1 = null;
        zzgd zzgd2 = zzgd0.zze < this.zzb ? new zzgd(zzgd0.zza, zzgd0.zze, (zzgd0.zzf == -1L ? this.zzb - zzgd0.zze : Math.min(zzgd0.zzf, this.zzb - zzgd0.zze)), null) : null;
        if(zzgd0.zzf == -1L || zzgd0.zze + zzgd0.zzf > this.zzb) {
            zzgd1 = new zzgd(zzgd0.zza, Math.max(this.zzb, zzgd0.zze), (zzgd0.zzf == -1L ? -1L : Math.min(zzgd0.zzf, zzgd0.zze + zzgd0.zzf - this.zzb)), null);
        }
        long v = 0L;
        long v1 = zzgd2 == null ? 0L : this.zza.zzb(zzgd2);
        if(zzgd1 != null) {
            v = this.zzc.zzb(zzgd1);
        }
        this.zzd = zzgd0.zze;
        return v1 == -1L || v == -1L ? -1L : v1 + v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final Uri zzc() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        return zzfxq.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgy0) {
    }
}

