package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzekz implements zzcvw {
    public final zzekn zza;
    public final zzbmi zzb;

    public zzekz(zzekn zzekn0, zzbmi zzbmi0) {
        this.zza = zzekn0;
        this.zzb = zzbmi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        this.zza.zzdz(zze0);
        zzbmi zzbmi0 = this.zzb;
        if(zzbmi0 != null) {
            try {
                zzbmi0.zzf(zze0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        if(zzbmi0 != null) {
            try {
                zzbmi0.zze(zze0.zza);
            }
            catch(RemoteException remoteException1) {
                zzo.zzl("#007 Could not call remote method.", remoteException1);
            }
        }
    }
}

