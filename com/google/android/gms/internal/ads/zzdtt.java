package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;

public final class zzdtt implements Runnable {
    public final zzdua zza;
    public final zzblu zzb;

    public zzdtt(zzdua zzdua0, zzblu zzblu0) {
        this.zza = zzdua0;
        this.zzb = zzblu0;
    }

    @Override
    public final void run() {
        try {
            List list0 = this.zza.zzg();
            this.zzb.zzb(list0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }
}

