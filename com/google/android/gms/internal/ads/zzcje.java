package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

final class zzcje implements zzfbh {
    private final zzcih zza;
    private Context zzb;
    private String zzc;

    zzcje(zzcih zzcih0, zzcjm zzcjm0) {
        this.zza = zzcih0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfbh
    public final zzfbh zza(@Nullable String s) {
        this.zzc = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfbh
    public final zzfbh zzb(Context context0) {
        context0.getClass();
        this.zzb = context0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfbh
    public final zzfbi zzc() {
        zzhez.zzc(this.zzb, Context.class);
        return new zzcjf(this.zza, this.zzb, this.zzc, null);
    }
}

