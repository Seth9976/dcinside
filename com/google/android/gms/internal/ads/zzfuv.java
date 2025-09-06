package com.google.android.gms.internal.ads;

final class zzfuv extends zzfva {
    final zzftz zza;

    zzfuv(zzfuw zzfuw0, zzfvc zzfvc0, CharSequence charSequence0, zzftz zzftz0) {
        this.zza = zzftz0;
        super(zzfvc0, charSequence0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfva
    public final int zzc(int v) {
        return ((zzfud)this.zza).zza.end();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzfva
    public final int zzd(int v) {
        return ((zzfud)this.zza).zza.find(v) ? ((zzfud)this.zza).zza.start() : -1;
    }
}

