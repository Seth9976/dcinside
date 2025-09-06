package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdo;
import java.util.ArrayList;

final class zzmo implements Runnable {
    private final String zza;
    private final String zzb;
    private final zzo zzc;
    private final zzdo zzd;
    private final zzls zze;

    zzmo(zzls zzls0, String s, String s1, zzo zzo0, zzdo zzdo0) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzo0;
        this.zzd = zzdo0;
        this.zze = zzls0;
        super();
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = new ArrayList();
        try {
            zzgb zzgb0 = this.zze.zzb;
            if(zzgb0 != null) {
                Preconditions.checkNotNull(this.zzc);
                arrayList0 = zzos.zzb(zzgb0.zza(this.zza, this.zzb, this.zzc));
                this.zze.zzar();
                return;
            }
            this.zze.zzj().zzg().zza("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
        }
        catch(RemoteException remoteException0) {
            this.zze.zzj().zzg().zza("Failed to get conditional properties; remote exception", this.zza, this.zzb, remoteException0);
        }
        finally {
            this.zze.zzq().zza(this.zzd, arrayList0);
        }
    }
}

