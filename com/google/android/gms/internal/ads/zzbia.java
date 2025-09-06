package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;

public final class zzbia {
    private final zzg zza;
    @Nullable
    private final zzf zzb;
    @GuardedBy("this")
    @Nullable
    private zzbgr zzc;

    public zzbia(zzg zzg0, @Nullable zzf zzf0) {
        this.zza = zzg0;
        this.zzb = zzf0;
    }

    @Nullable
    public final zzbha zzc() {
        return this.zzb == null ? null : new zzbhx(this, null);
    }

    public final zzbhd zzd() {
        return new zzbhy(this, null);
    }

    private final zzbgr zzf(zzbgq zzbgq0) {
        synchronized(this) {
            zzbgr zzbgr0 = this.zzc;
            if(zzbgr0 != null) {
                return zzbgr0;
            }
            zzbgr zzbgr1 = new zzbgr(zzbgq0);
            this.zzc = zzbgr1;
            return zzbgr1;
        }
    }
}

