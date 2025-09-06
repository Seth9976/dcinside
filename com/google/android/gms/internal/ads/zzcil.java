package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcil implements zzewo {
    private final zzcih zza;
    private Context zzb;
    private String zzc;

    zzcil(zzcih zzcih0, zzcjm zzcjm0) {
        this.zza = zzcih0;
    }

    @Override  // com.google.android.gms.internal.ads.zzewo
    public final zzewo zza(String s) {
        s.getClass();
        this.zzc = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzewo
    public final zzewo zzb(Context context0) {
        context0.getClass();
        this.zzb = context0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzewo
    public final zzewp zzc() {
        zzhez.zzc(this.zzb, Context.class);
        zzhez.zzc(this.zzc, String.class);
        return new zzcim(this.zza, this.zzb, this.zzc, null);
    }
}

