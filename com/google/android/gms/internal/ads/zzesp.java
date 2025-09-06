package com.google.android.gms.internal.ads;

public final class zzesp implements zzetq {
    private final String zza;
    private final int zzb;

    public zzesp(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        ((zzcuv)object0).zzb.putString("request_id", this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        ((zzcuv)object0).zza.putString("request_id", this.zza);
        if(this.zzb == 2) {
            ((zzcuv)object0).zza.putInt("sod", 1);
        }
    }
}

