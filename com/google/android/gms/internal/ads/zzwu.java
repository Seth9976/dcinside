package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzwu implements zzxn {
    public final zzxh zza;

    public zzwu(zzxh zzxh0) {
        this.zza = zzxh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzxn
    public final List zza(int v, zzbr zzbr0, int[] arr_v) {
        zzfxk zzfxk0 = new zzfxk();
        for(int v1 = 0; v1 < zzbr0.zza; ++v1) {
            zzfxk0.zzf(new zzxe(v, zzbr0, v1, this.zza, arr_v[v1]));
        }
        return zzfxk0.zzi();
    }
}

