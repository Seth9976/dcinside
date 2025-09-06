package com.google.android.gms.internal.ads;

final class zzfrw extends zzfsz {
    private int zza;
    private String zzb;
    private byte zzc;

    @Override  // com.google.android.gms.internal.ads.zzfsz
    public final zzfsz zza(String s) {
        this.zzb = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsz
    public final zzfsz zzb(int v) {
        this.zza = v;
        this.zzc = 1;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsz
    public final zzfta zzc() {
        if(this.zzc != 1) {
            throw new IllegalStateException("Missing required properties: statusCode");
        }
        return new zzfry(this.zza, this.zzb, null);
    }
}

