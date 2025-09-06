package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import j..util.Objects;

public final class zzog {
    public final String zza;
    @Nullable
    private final zzof zzb;
    @Nullable
    private final Object zzc;

    static {
        if(zzei.zza < 0x1F) {
            new zzog("");
        }
    }

    @RequiresApi(0x1F)
    public zzog(LogSessionId logSessionId0, String s) {
        zzof zzof0 = new zzof(logSessionId0);
        super();
        this.zzb = zzof0;
        this.zza = s;
        this.zzc = new Object();
    }

    public zzog(String s) {
        zzcw.zzf(zzei.zza < 0x1F);
        this.zza = s;
        this.zzb = null;
        this.zzc = new Object();
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzog ? Objects.equals(this.zza, ((zzog)object0).zza) && Objects.equals(this.zzb, ((zzog)object0).zzb) && Objects.equals(this.zzc, ((zzog)object0).zzc) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb, this.zzc});
    }

    @RequiresApi(0x1F)
    public final LogSessionId zza() {
        this.zzb.getClass();
        return this.zzb.zza;
    }
}

