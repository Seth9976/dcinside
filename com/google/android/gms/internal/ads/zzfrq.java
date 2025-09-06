package com.google.android.gms.internal.ads;

final class zzfrq extends zzfsc {
    private String zza;
    private String zzb;

    @Override  // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zza(String s) {
        this.zzb = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zzb(String s) {
        this.zza = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsc
    public final zzfsd zzc() {
        return new zzfrs(this.zza, this.zzb, null);
    }
}

