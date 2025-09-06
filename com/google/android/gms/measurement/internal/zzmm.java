package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

final class zzmm implements Runnable {
    private final boolean zza;
    private final zzo zzb;
    private final boolean zzc;
    private final zzae zzd;
    private final zzae zze;
    private final zzls zzf;

    zzmm(zzls zzls0, boolean z, zzo zzo0, boolean z1, zzae zzae0, zzae zzae1) {
        this.zza = true;
        this.zzb = zzo0;
        this.zzc = z1;
        this.zzd = zzae0;
        this.zze = zzae1;
        this.zzf = zzls0;
        super();
    }

    @Override
    public final void run() {
        zzgb zzgb0 = this.zzf.zzb;
        if(zzgb0 == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if(this.zza) {
            Preconditions.checkNotNull(this.zzb);
            this.zzf.zza(zzgb0, (this.zzc ? null : this.zzd), this.zzb);
        }
        else {
            try {
                if(TextUtils.isEmpty(this.zze.zza)) {
                    Preconditions.checkNotNull(this.zzb);
                    zzgb0.zza(this.zzd, this.zzb);
                }
                else {
                    zzgb0.zza(this.zzd);
                }
                goto label_16;
            }
            catch(RemoteException remoteException0) {
            }
            this.zzf.zzj().zzg().zza("Failed to send conditional user property to the service", remoteException0);
        }
    label_16:
        this.zzf.zzar();
    }
}

