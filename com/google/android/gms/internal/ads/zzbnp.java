package com.google.android.gms.internal.ads;

public final class zzbnp implements Runnable {
    public final zzbnq zza;
    public final zzbmn zzb;

    public zzbnp(zzbnq zzbnq0, zzbmn zzbmn0) {
        this.zza = zzbnq0;
        this.zzb = zzbmn0;
    }

    @Override
    public final void run() {
        this.zzb.zzr("/result", zzbjo.zzo);
        this.zzb.zzc();
    }
}

