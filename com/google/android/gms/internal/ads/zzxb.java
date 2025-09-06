package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzxb implements zzxn {
    public final zzxh zza;
    public final String zzb;

    public zzxb(zzxh zzxh0, String s) {
        this.zza = zzxh0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzxn
    public final List zza(int v, zzbr zzbr0, int[] arr_v) {
        zzfxk zzfxk0 = new zzfxk();
        for(int v1 = 0; v1 < zzbr0.zza; ++v1) {
            zzfxk0.zzf(new zzxm(v, zzbr0, v1, this.zza, arr_v[v1], this.zzb));
        }
        return zzfxk0.zzi();
    }
}

