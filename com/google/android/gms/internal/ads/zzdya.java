package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

final class zzdya implements zzcyq {
    private final Context zza;
    private final zzbyi zzb;

    zzdya(Context context0, zzbyi zzbyi0) {
        this.zza = context0;
        this.zzb = zzbyi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
        if(!TextUtils.isEmpty(zzfca0.zzb.zzb.zze)) {
            this.zzb.zzm(this.zza, zzfca0.zza.zza.zzd);
            this.zzb.zzi(this.zza, zzfca0.zzb.zzb.zze);
        }
    }
}

