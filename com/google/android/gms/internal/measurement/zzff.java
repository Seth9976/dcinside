package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzff extends zza {
    private final Long zzc;
    private final String zzd;
    private final String zze;
    private final Bundle zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzdy zzi;

    zzff(zzdy zzdy0, Long long0, String s, String s1, Bundle bundle0, boolean z, boolean z1) {
        this.zzc = long0;
        this.zzd = s;
        this.zze = s1;
        this.zzf = bundle0;
        this.zzg = z;
        this.zzh = z1;
        this.zzi = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzi.zzj)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, (this.zzc == null ? this.zza : ((long)this.zzc)));
    }
}

