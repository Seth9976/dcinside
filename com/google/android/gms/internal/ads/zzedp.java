package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzedp implements zzedc {
    private final Context zza;
    private final zzcoa zzb;

    zzedp(Context context0, zzcoa zzcoa0) {
        this.zza = context0;
        this.zzb = zzcoa0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        zzefb zzefb0 = new zzefb(zzfbo0, ((zzbrd)zzecz0.zzb), AdFormat.APP_OPEN_AD);
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        zzdeu zzdeu0 = new zzdeu(zzefb0, null);
        zzcny zzcny0 = new zzcny(zzfbo0.zzaa);
        zzcnx zzcnx0 = this.zzb.zza(zzcrp0, zzdeu0, zzcny0);
        zzefb0.zzb(zzcnx0.zzc());
        zzeie zzeie0 = zzcnx0.zzj();
        ((zzees)zzecz0.zzc).zzc(zzeie0);
        return zzcnx0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        try {
            ((zzbrd)zzecz0.zzb).zzq(zzfbo0.zzZ);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
            zzedn zzedn0 = new zzedn(zzecz0, null);
            ((zzbrd)zzecz0.zzb).zzi(zzfbo0.zzU, zzfbo0.zzv.toString(), zzfca0.zza.zza.zzd, iObjectWrapper0, zzedn0, ((zzbpk)zzecz0.zzc));
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Remote exception loading an app open RTB ad", remoteException0);
            throw new zzfcq(remoteException0);
        }
    }
}

