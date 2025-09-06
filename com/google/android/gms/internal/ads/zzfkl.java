package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.t0;
import j..util.Optional;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfkl extends zzfkh {
    public zzfkl(ClientApi clientApi0, Context context0, int v, zzbpe zzbpe0, zzft zzft0, zzcf zzcf0, ScheduledExecutorService scheduledExecutorService0, zzfjg zzfjg0, Clock clock0) {
        super(clientApi0, context0, v, zzbpe0, zzft0, zzcf0, scheduledExecutorService0, zzfjg0, clock0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfkh
    protected final t0 zza() {
        t0 t00 = zzgdb.zze();
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zzb);
        zzbwp zzbwp0 = this.zza.zzp(iObjectWrapper0, this.zze.zza, this.zzd, this.zzc);
        zzfkk zzfkk0 = new zzfkk(this, ((zzgdb)t00), zzbwp0);
        if(zzbwp0 != null) {
            try {
                zzbwp0.zzf(this.zze.zzc, zzfkk0);
            }
            catch(RemoteException unused_ex) {
                zzo.zzj("Failed to load rewarded ad.");
                ((zzgdb)t00).zzd(new zzfjc(1, "remote exception"));
            }
            return t00;
        }
        ((zzgdb)t00).zzd(new zzfjc(1, "Failed to create a rewarded ad."));
        return t00;
    }

    @Override  // com.google.android.gms.internal.ads.zzfkh
    protected final Optional zzb(Object object0) {
        zzbwp zzbwp0 = (zzbwp)object0;
        try {
            return Optional.ofNullable(zzbwp0.zzc());
        }
        catch(RemoteException remoteException0) {
            zzo.zzf("Failed to get response info for the rewarded ad.", remoteException0);
            return Optional.empty();
        }
    }
}

