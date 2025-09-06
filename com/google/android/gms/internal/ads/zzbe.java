package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.Locale;

public final class zzbe {
    public static final zzbe zza;
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        zzbe.zza = new zzbe(1.0f, 1.0f);
    }

    public zzbe(@FloatRange(from = 0.0, fromInclusive = false) float f, @FloatRange(from = 0.0, fromInclusive = false) float f1) {
        boolean z = false;
        zzcw.zzd(f > 0.0f);
        if(f1 > 0.0f) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzb = f;
        this.zzc = f1;
        this.zzd = Math.round(f * 1000.0f);
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzbe.class == class0 && this.zzb == ((zzbe)object0).zzb && this.zzc == ((zzbe)object0).zzc;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (Float.floatToRawIntBits(this.zzb) + 0x20F) * 0x1F + Float.floatToRawIntBits(this.zzc);
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", this.zzb, this.zzc);
    }

    public final long zza(long v) {
        return v * ((long)this.zzd);
    }
}

