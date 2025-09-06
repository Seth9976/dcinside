package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;

public final class zzdwa implements zzcyq, zzdee {
    private final Context zza;
    private final zzdrw zzb;

    zzdwa(Context context0, zzdrw zzdrw0) {
        this.zza = context0;
        this.zzb = zzdrw0;
    }

    // 检测为 Lambda 实现
    final void zzc(Context context0) [...]

    private final void zzd(Context context0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeG)).booleanValue()) {
            zzdvz zzdvz0 = () -> zzv.zzf().zzb(context0, this.zzb);
            zzbzw.zza.execute(zzdvz0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
        this.zzd(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable zzbk zzbk0) {
        this.zzd(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String s) {
    }
}

