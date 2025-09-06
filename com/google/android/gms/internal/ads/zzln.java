package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzln {
    public static final zzln zza;
    public final int zzb;

    static {
        zzln.zza = new zzln(0, false);
    }

    public zzln(int v, boolean z) {
        this.zzb = 0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzln.class == class0) {
                zzln zzln0 = (zzln)object0;
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return 0;
    }
}

