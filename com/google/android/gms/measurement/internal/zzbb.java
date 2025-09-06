package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzbb {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    zzbb(String s, String s1, long v, long v1, long v2, long v3, long v4, Long long0, Long long1, Long long2, Boolean boolean0) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        boolean z = false;
        Preconditions.checkArgument(v >= 0L);
        Preconditions.checkArgument(v1 >= 0L);
        Preconditions.checkArgument(v2 >= 0L);
        if(v4 >= 0L) {
            z = true;
        }
        Preconditions.checkArgument(z);
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = v4;
        this.zzh = long0;
        this.zzi = long1;
        this.zzj = long2;
        this.zzk = boolean0;
    }

    zzbb(String s, String s1, long v, long v1, long v2, long v3, Long long0, Long long1, Long long2, Boolean boolean0) {
        this(s, s1, 0L, 0L, 0L, v2, 0L, null, null, null, null);
    }

    final zzbb zza(long v) {
        return new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, v, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }

    final zzbb zza(long v, long v1) {
        return new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, v, v1, this.zzi, this.zzj, this.zzk);
    }

    final zzbb zza(Long long0, Long long1, Boolean boolean0) {
        return boolean0 == null || boolean0.booleanValue() ? new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, long0, long1, boolean0) : new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, long0, long1, null);
    }
}

