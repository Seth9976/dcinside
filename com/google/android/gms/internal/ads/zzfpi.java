package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

public final class zzfpi {
    final zzfpk zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    zzfpi(zzfpk zzfpk0, byte[] arr_b, zzfpj zzfpj0) {
        this.zza = zzfpk0;
        super();
        this.zzb = arr_b;
    }

    public final zzfpi zza(int v) {
        this.zzd = v;
        return this;
    }

    public final zzfpi zzb(int v) {
        this.zzc = v;
        return this;
    }

    public final void zzc() {
        synchronized(this) {
            zzfpk zzfpk0 = this.zza;
            if(zzfpk0.zzb) {
                try {
                    zzfpk0.zza.zzj(this.zzb);
                    this.zza.zza.zzi(this.zzc);
                    this.zza.zza.zzg(this.zzd);
                    this.zza.zza.zzh(null);
                    this.zza.zza.zzf();
                }
                catch(RemoteException remoteException0) {
                    Log.d("GASS", "Clearcut log failed", remoteException0);
                }
            }
        }
    }
}

