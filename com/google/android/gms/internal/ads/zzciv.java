package com.google.android.gms.internal.ads;

final class zzciv implements zzdsy {
    private final zzcih zza;
    private final zzciy zzb;
    private Long zzc;
    private String zzd;

    zzciv(zzcih zzcih0, zzciy zzciy0, zzcjm zzcjm0) {
        this.zza = zzcih0;
        this.zzb = zzciy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsy
    public final zzdsy zza(String s) {
        s.getClass();
        this.zzd = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsy
    public final zzdsy zzb(long v) {
        this.zzc = v;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsy
    public final zzdsz zzc() {
        zzhez.zzc(this.zzc, Long.class);
        zzhez.zzc(this.zzd, String.class);
        return new zzciw(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

