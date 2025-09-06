package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;

final class zzcjc implements zzezt {
    private final zzcih zza;
    private Context zzb;
    private String zzc;
    private zzs zzd;

    zzcjc(zzcih zzcih0, zzcjm zzcjm0) {
        this.zza = zzcih0;
    }

    @Override  // com.google.android.gms.internal.ads.zzezt
    public final zzezt zza(zzs zzs0) {
        zzs0.getClass();
        this.zzd = zzs0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzezt
    public final zzezt zzb(String s) {
        s.getClass();
        this.zzc = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzezt
    public final zzezt zzc(Context context0) {
        context0.getClass();
        this.zzb = context0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzezt
    public final zzezu zzd() {
        zzhez.zzc(this.zzb, Context.class);
        zzhez.zzc(this.zzc, String.class);
        zzhez.zzc(this.zzd, zzs.class);
        return new zzcjd(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

