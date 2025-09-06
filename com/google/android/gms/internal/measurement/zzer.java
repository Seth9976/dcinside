package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzer extends zza {
    private final String zzc;
    private final String zzd;
    private final boolean zze;
    private final zzdk zzf;
    private final zzdy zzg;

    zzer(zzdy zzdy0, String s, String s1, boolean z, zzdk zzdk0) {
        this.zzc = s;
        this.zzd = s1;
        this.zze = z;
        this.zzf = zzdk0;
        this.zzg = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzg.zzj)).getUserProperties(this.zzc, this.zzd, this.zze, this.zzf);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    protected final void zzb() {
        this.zzf.zza(null);
    }
}

