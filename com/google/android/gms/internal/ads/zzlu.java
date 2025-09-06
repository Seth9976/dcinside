package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzlu {
    public final long zza;
    public final zzbq zzb;
    public final int zzc;
    @Nullable
    public final zzug zzd;
    public final long zze;
    public final zzbq zzf;
    public final int zzg;
    @Nullable
    public final zzug zzh;
    public final long zzi;
    public final long zzj;

    public zzlu(long v, zzbq zzbq0, int v1, @Nullable zzug zzug0, long v2, zzbq zzbq1, int v3, @Nullable zzug zzug1, long v4, long v5) {
        this.zza = v;
        this.zzb = zzbq0;
        this.zzc = v1;
        this.zzd = zzug0;
        this.zze = v2;
        this.zzf = zzbq1;
        this.zzg = v3;
        this.zzh = zzug1;
        this.zzi = v4;
        this.zzj = v5;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzlu.class == class0 && this.zza == ((zzlu)object0).zza && this.zzc == ((zzlu)object0).zzc && this.zze == ((zzlu)object0).zze && this.zzg == ((zzlu)object0).zzg && this.zzi == ((zzlu)object0).zzi && this.zzj == ((zzlu)object0).zzj && zzfuk.zza(this.zzb, ((zzlu)object0).zzb) && zzfuk.zza(this.zzd, ((zzlu)object0).zzd) && zzfuk.zza(this.zzf, ((zzlu)object0).zzf) && zzfuk.zza(this.zzh, ((zzlu)object0).zzh);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj});
    }
}

