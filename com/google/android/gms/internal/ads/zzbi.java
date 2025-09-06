package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzbi {
    @Nullable
    public final Object zza;
    public final int zzb;
    @Nullable
    public final zzar zzc;
    @Nullable
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
    }

    public zzbi(@Nullable Object object0, int v, @Nullable zzar zzar0, @Nullable Object object1, int v1, long v2, long v3, int v4, int v5) {
        this.zza = object0;
        this.zzb = v;
        this.zzc = zzar0;
        this.zzd = object1;
        this.zze = v1;
        this.zzf = v2;
        this.zzg = v3;
        this.zzh = v4;
        this.zzi = v5;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzbi.class == class0 && this.zzb == ((zzbi)object0).zzb && this.zze == ((zzbi)object0).zze && this.zzf == ((zzbi)object0).zzf && this.zzg == ((zzbi)object0).zzg && this.zzh == ((zzbi)object0).zzh && this.zzi == ((zzbi)object0).zzi && zzfuk.zza(this.zzc, ((zzbi)object0).zzc) && zzfuk.zza(this.zza, ((zzbi)object0).zza) && zzfuk.zza(this.zzd, ((zzbi)object0).zzd);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi});
    }
}

