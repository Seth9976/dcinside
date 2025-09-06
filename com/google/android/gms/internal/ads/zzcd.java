package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

public final class zzcd {
    public static final zzcd zza;
    @IntRange(from = 0L)
    public final int zzb;
    @IntRange(from = 0L)
    public final int zzc;
    @FloatRange(from = 0.0, fromInclusive = false)
    public final float zzd;

    static {
        zzcd.zza = new zzcd(0, 0, 1.0f);
    }

    public zzcd(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @FloatRange(from = 0.0, fromInclusive = false) float f) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = f;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof zzcd && this.zzb == ((zzcd)object0).zzb && this.zzc == ((zzcd)object0).zzc && this.zzd == ((zzcd)object0).zzd;
    }

    @Override
    public final int hashCode() {
        return ((this.zzb + 0xD9) * 0x1F + this.zzc) * 0x1F + Float.floatToRawIntBits(this.zzd);
    }
}

