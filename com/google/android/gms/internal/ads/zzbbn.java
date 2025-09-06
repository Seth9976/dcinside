package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzbbn {
    final zzbbp zza;
    private final byte[] zzb;
    private int zzc;

    zzbbn(zzbbp zzbbp0, byte[] arr_b, zzbbo zzbbo0) {
        this.zza = zzbbp0;
        super();
        this.zzb = arr_b;
    }

    public final zzbbn zza(int v) {
        this.zzc = v;
        return this;
    }

    public final void zzc() {
        synchronized(this) {
            this.zza.zzc.execute(() -> synchronized(this) {
                zzbbp zzbbp0 = this.zza;
                if(zzbbp0.zzb) {
                    try {
                        zzbbp0.zza.zzj(this.zzb);
                        this.zza.zza.zzi(0);
                        this.zza.zza.zzg(this.zzc);
                        this.zza.zza.zzh(null);
                        this.zza.zza.zzf();
                    }
                    catch(RemoteException remoteException0) {
                        zzo.zzf("Clearcut log failed", remoteException0);
                    }
                }
            });
        }
    }

    // 检测为 Lambda 实现
    private final void zzd() [...]
}

