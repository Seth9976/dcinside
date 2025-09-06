package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzbu {
    public static final zzbu zza;
    public final int zzb;

    static {
        zzbu.zza = new zzbu(new zzbt());
    }

    private zzbu(zzbt zzbt0) {
        this.zzb = 0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzbu.class == class0) {
                zzbu zzbu0 = (zzbu)object0;
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return 0x745F;
    }
}

