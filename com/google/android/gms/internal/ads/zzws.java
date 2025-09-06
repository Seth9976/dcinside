package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public class zzws implements zzxv {
    protected final zzbr zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzab[] zzd;
    private int zze;

    public zzws(zzbr zzbr0, int[] arr_v, int v) {
        zzcw.zzf(arr_v.length > 0);
        zzbr0.getClass();
        this.zza = zzbr0;
        this.zzb = arr_v.length;
        this.zzd = new zzab[arr_v.length];
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            this.zzd[v2] = zzbr0.zzb(arr_v[v2]);
        }
        zzwr zzwr0 = new zzwr();
        Arrays.sort(this.zzd, zzwr0);
        this.zzc = new int[this.zzb];
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            this.zzc[v1] = zzbr0.zza(this.zzd[v1]);
        }
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.zza.equals(((zzws)object0).zza) && Arrays.equals(this.zzc, ((zzws)object0).zzc);
    }

    @Override
    public final int hashCode() {
        int v = this.zze;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zzc);
            v = System.identityHashCode(this.zza) * 0x1F + v1;
            this.zze = v;
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final int zza(int v) {
        return this.zzc[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzxv
    public final int zzb() {
        return this.zzc[0];
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final int zzc(int v) {
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            if(this.zzc[v1] == v) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final int zzd() {
        return this.zzc.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final zzab zze(int v) {
        return this.zzd[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzxv
    public final zzab zzf() {
        return this.zzd[0];
    }

    @Override  // com.google.android.gms.internal.ads.zzxz
    public final zzbr zzg() {
        return this.zza;
    }
}

