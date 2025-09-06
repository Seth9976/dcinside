package com.google.android.gms.internal.ads;

final class zzfrz extends zzftc {
    private String zza;
    private String zzb;

    @Override  // com.google.android.gms.internal.ads.zzftc
    public final zzftc zza(String s) {
        this.zzb = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzftc
    public final zzftc zzb(String s) {
        this.zza = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzftc
    public final zzftd zzc() {
        return new zzfsb(this.zza, this.zzb, null);
    }
}

