package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcix implements zzdtg {
    private final zzcih zza;
    private Context zzb;
    private zzbko zzc;

    zzcix(zzcih zzcih0, zzcjm zzcjm0) {
        this.zza = zzcih0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdtg
    public final zzdtg zza(zzbko zzbko0) {
        zzbko0.getClass();
        this.zzc = zzbko0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdtg
    public final zzdtg zzb(Context context0) {
        context0.getClass();
        this.zzb = context0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdtg
    public final zzdth zzc() {
        zzhez.zzc(this.zzb, Context.class);
        zzhez.zzc(this.zzc, zzbko.class);
        return new zzciy(this.zza, this.zzb, this.zzc, null);
    }
}

