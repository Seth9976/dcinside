package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;

public final class zzbe {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbe(String s, double f, double f1, double f2, int v) {
        this.zza = s;
        this.zzc = f;
        this.zzb = f1;
        this.zzd = f2;
        this.zze = v;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzbe ? Objects.equal(this.zza, ((zzbe)object0).zza) && this.zzb == ((zzbe)object0).zzb && this.zzc == ((zzbe)object0).zzc && this.zze == ((zzbe)object0).zze && Double.compare(this.zzd, ((zzbe)object0).zzd) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze});
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.zza).add("minBound", this.zzc).add("maxBound", this.zzb).add("percent", this.zzd).add("count", this.zze).toString();
    }
}

