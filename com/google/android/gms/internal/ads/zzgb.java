package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

public final class zzgb {
    @Nullable
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzgb() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }

    zzgb(zzgd zzgd0, zzgc zzgc0) {
        this.zza = zzgd0.zza;
        this.zzb = zzgd0.zzd;
        this.zzc = zzgd0.zze;
        this.zzd = zzgd0.zzf;
        this.zze = zzgd0.zzg;
    }

    public final zzgb zza(int v) {
        this.zze = 6;
        return this;
    }

    public final zzgb zzb(Map map0) {
        this.zzb = map0;
        return this;
    }

    public final zzgb zzc(long v) {
        this.zzc = v;
        return this;
    }

    public final zzgb zzd(Uri uri0) {
        this.zza = uri0;
        return this;
    }

    public final zzgd zze() {
        if(this.zza == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new zzgd(this.zza, 0L, 1, null, this.zzb, this.zzc, this.zzd, null, this.zze, null, null);
    }
}

