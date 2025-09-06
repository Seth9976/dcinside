package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzciw implements zzdsz {
    private final Long zza;
    private final String zzb;
    private final zzcih zzc;
    private final zzciy zzd;

    zzciw(zzcih zzcih0, zzciy zzciy0, Long long0, String s, zzcjm zzcjm0) {
        this.zzc = zzcih0;
        this.zzd = zzciy0;
        this.zza = long0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsz
    public final zzdtj zza() {
        Context context0 = this.zzd.zza;
        zzdtc zzdtc0 = zzciy.zzc(this.zzd);
        return zzdtk.zza(((long)this.zza), context0, zzdtc0, this.zzc, this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzdsz
    public final zzdtn zzb() {
        zzdtc zzdtc0 = zzciy.zzc(this.zzd);
        return zzdto.zza(((long)this.zza), this.zzd.zza, zzdtc0, this.zzc, this.zzb);
    }
}

