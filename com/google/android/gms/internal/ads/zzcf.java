package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzcf {
    public static final zzcf zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    static {
        zzcf.zza = new zzcf(-1, -1, -1);
    }

    public zzcf(int v, int v1, int v2) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = zzei.zzJ(v2) ? zzei.zzk(v2) * v1 : -1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) [...] // 潜在的解密器

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd});
    }

    @Override
    public final String toString() {
        return "AudioFormat[sampleRate=" + this.zzb + ", channelCount=" + this.zzc + ", encoding=" + this.zzd + "]";
    }
}

