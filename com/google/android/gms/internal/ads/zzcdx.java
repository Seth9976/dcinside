package com.google.android.gms.internal.ads;

public final class zzcdx implements zzfx {
    public final zzcef zza;
    public final String zzb;
    public final boolean zzc;

    public zzcdx(zzcef zzcef0, String s, boolean z) {
        this.zza = zzcef0;
        this.zzb = s;
        this.zzc = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzfx
    public final zzfy zza() {
        return this.zza.zzX(this.zzb, this.zzc);
    }
}

