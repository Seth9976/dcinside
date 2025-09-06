package com.google.android.gms.internal.ads;

public final class zzcea implements zzfx {
    public final zzfx zza;
    public final byte[] zzb;

    public zzcea(zzfx zzfx0, byte[] arr_b) {
        this.zza = zzfx0;
        this.zzb = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzfx
    public final zzfy zza() {
        zzfy zzfy0 = this.zza.zza();
        return new zzcdt(new zzft(this.zzb), this.zzb.length, zzfy0);
    }
}

