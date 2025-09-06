package com.google.android.gms.internal.ads;

public final class zzxu {
    public final zzbr zza;
    public final int[] zzb;

    public zzxu(zzbr zzbr0, int[] arr_v, int v) {
        if(arr_v.length == 0) {
            zzdo.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbr0;
        this.zzb = arr_v;
    }
}

