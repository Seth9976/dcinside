package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzdic {
    @Nullable
    private zzbft zza;

    public zzdic(zzdhn zzdhn0) {
        this.zza = zzdhn0;
    }

    @Nullable
    public final zzbft zza() {
        synchronized(this) {
        }
        return this.zza;
    }

    public final void zzb(@Nullable zzbft zzbft0) {
        synchronized(this) {
            this.zza = zzbft0;
        }
    }
}

