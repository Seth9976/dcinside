package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.Objects;

public final class zzyc {
    public final int zza;
    public final zzln[] zzb;
    public final zzxv[] zzc;
    public final zzby zzd;
    @Nullable
    public final Object zze;

    public zzyc(zzln[] arr_zzln, zzxv[] arr_zzxv, zzby zzby0, @Nullable Object object0) {
        zzcw.zzd(arr_zzln.length == arr_zzxv.length);
        this.zzb = arr_zzln;
        this.zzc = (zzxv[])arr_zzxv.clone();
        this.zzd = zzby0;
        this.zze = object0;
        this.zza = arr_zzln.length;
    }

    // 去混淆评级： 低(30)
    public final boolean zza(@Nullable zzyc zzyc0, int v) {
        return zzyc0 == null ? false : Objects.equals(this.zzb[v], zzyc0.zzb[v]) && Objects.equals(this.zzc[v], zzyc0.zzc[v]);
    }

    public final boolean zzb(int v) {
        return this.zzb[v] != null;
    }
}

