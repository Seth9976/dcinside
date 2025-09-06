package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

final class zzmj implements Runnable {
    private final boolean zza;
    private final zzo zzb;
    private final boolean zzc;
    private final zzbf zzd;
    private final String zze;
    private final zzls zzf;

    zzmj(zzls zzls0, boolean z, zzo zzo0, boolean z1, zzbf zzbf0, String s) {
        this.zza = z;
        this.zzb = zzo0;
        this.zzc = z1;
        this.zzd = zzbf0;
        this.zze = s;
        this.zzf = zzls0;
        super();
    }

    @Override
    public final void run() {
        long v2;
        long v1;
        long v;
        zzgb zzgb0 = this.zzf.zzb;
        if(zzgb0 == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send event to service");
            return;
        }
        if(this.zza) {
            Preconditions.checkNotNull(this.zzb);
            this.zzf.zza(zzgb0, (this.zzc ? null : this.zzd), this.zzb);
        }
        else {
            boolean z = this.zzf.zze().zza(zzbh.zzce);
            try {
                if(TextUtils.isEmpty(this.zze)) {
                    Preconditions.checkNotNull(this.zzb);
                    if(z) {
                        v = this.zzf.zzu.zzb().currentTimeMillis();
                        try {
                            v1 = 0L;
                            v1 = this.zzf.zzu.zzb().elapsedRealtime();
                            goto label_18;
                        label_16:
                            v = 0L;
                            v1 = 0L;
                        label_18:
                            zzgb0.zza(this.zzd, this.zzb);
                            if(z) {
                                this.zzf.zzj().zzp().zza("Logging telemetry for logEvent");
                                zzgm.zza(this.zzf.zzu).zza(36301, 0, v, this.zzf.zzu.zzb().currentTimeMillis(), ((int)(this.zzf.zzu.zzb().elapsedRealtime() - v1)));
                            }
                            goto label_35;
                        }
                        catch(RemoteException remoteException0) {
                            v2 = v;
                            goto label_32;
                        }
                    }
                    else {
                        goto label_16;
                    }
                    goto label_18;
                }
                else {
                    String s = this.zzf.zzj().zzx();
                    zzgb0.zza(this.zzd, this.zze, s);
                }
                goto label_35;
            }
            catch(RemoteException remoteException0) {
                v1 = 0L;
                v2 = 0L;
            }
        label_32:
            this.zzf.zzj().zzg().zza("Failed to send event to the service", remoteException0);
            if(z && v2 != 0L) {
                zzgm.zza(this.zzf.zzu).zza(36301, 13, v2, this.zzf.zzu.zzb().currentTimeMillis(), ((int)(this.zzf.zzu.zzb().elapsedRealtime() - v1)));
            }
        }
    label_35:
        this.zzf.zzar();
    }
}

