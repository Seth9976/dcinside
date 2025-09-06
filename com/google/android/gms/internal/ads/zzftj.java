package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public final class zzftj implements Runnable {
    public final zzftl zza;
    public final IBinder zzb;

    public zzftj(zzftl zzftl0, IBinder iBinder0) {
        this.zza = zzftl0;
        this.zzb = iBinder0;
    }

    @Override
    public final void run() {
        zzfrn zzfrn0 = zzfrm.zzb(this.zzb);
        zzftl zzftl0 = this.zza;
        zzftl0.zza.zzj = zzfrn0;
        zzftl0.zza.zzc.zzc("linkToDeath", new Object[0]);
        try {
            IInterface iInterface0 = zzftl0.zza.zzj;
            if(iInterface0 == null) {
                throw null;
            }
            iInterface0.asBinder().linkToDeath(zzftl0.zza.zzh, 0);
        }
        catch(RemoteException remoteException0) {
            zzftl0.zza.zzc.zzb(remoteException0, "linkToDeath failed", new Object[0]);
        }
        zzftn.zzf(zzftl0.zza, false);
        synchronized(zzftl0.zza.zze) {
            for(Object object0: zzftl0.zza.zze) {
                ((Runnable)object0).run();
            }
            zzftl0.zza.zze.clear();
        }
    }
}

