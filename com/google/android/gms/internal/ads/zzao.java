package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;

public final class zzao {
    public static final zzao zza;
    @Nullable
    public final Uri zzb;
    @Nullable
    public final String zzc;
    @Nullable
    public final Bundle zzd;

    static {
        zzao.zza = new zzao(new zzan());
    }

    private zzao(zzan zzan0) {
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzao)) {
            return false;
        }
        zzao zzao0 = (zzao)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0;
    }
}

