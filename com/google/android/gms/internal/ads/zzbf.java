package com.google.android.gms.internal.ads;

public final class zzbf {
    private final zzv zza;

    public zzbf() {
        this.zza = new zzv();
    }

    public final zzbf zza(int v) {
        this.zza.zza(v);
        return this;
    }

    public final zzbf zzb(zzbg zzbg0) {
        zzx zzx0 = zzbg0.zza;
        for(int v = 0; v < zzx0.zzb(); ++v) {
            int v1 = zzx0.zza(v);
            this.zza.zza(v1);
        }
        return this;
    }

    public final zzbf zzc(int[] arr_v) {
        for(int v = 0; v < 20; ++v) {
            this.zza.zza(arr_v[v]);
        }
        return this;
    }

    public final zzbf zzd(int v, boolean z) {
        if(z) {
            this.zza.zza(v);
        }
        return this;
    }

    public final zzbg zze() {
        return new zzbg(this.zza.zzb(), null);
    }
}

