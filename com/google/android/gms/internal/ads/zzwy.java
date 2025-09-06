package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzwy implements zzxn {
    public final zzxt zza;
    public final zzxh zzb;
    public final boolean zzc;
    public final int[] zzd;

    public zzwy(zzxt zzxt0, zzxh zzxh0, boolean z, int[] arr_v) {
        this.zza = zzxt0;
        this.zzb = zzxh0;
        this.zzc = z;
        this.zzd = arr_v;
    }

    @Override  // com.google.android.gms.internal.ads.zzxn
    public final List zza(int v, zzbr zzbr0, int[] arr_v) {
        zzxa zzxa0 = new zzxa(this.zza);
        int v1 = this.zzd[v];
        zzfxk zzfxk0 = new zzfxk();
        for(int v2 = 0; v2 < zzbr0.zza; ++v2) {
            zzfxk0.zzf(new zzxd(v, zzbr0, v2, this.zzb, arr_v[v2], this.zzc, zzxa0, v1));
        }
        return zzfxk0.zzi();
    }
}

