package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzefh implements zzedc {
    private final Context zza;
    private final zzdfu zzb;

    public zzefh(Context context0, zzdfu zzdfu0) {
        this.zza = context0;
        this.zzb = zzdfu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        zzefb zzefb0 = new zzefb(zzfbo0, ((zzbrd)zzecz0.zzb), AdFormat.INTERSTITIAL);
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        zzdeu zzdeu0 = new zzdeu(zzefb0, null);
        zzder zzder0 = this.zzb.zze(zzcrp0, zzdeu0);
        zzefb0.zzb(zzder0.zzc());
        zzeie zzeie0 = zzder0.zzj();
        ((zzees)zzecz0.zzc).zzc(zzeie0);
        return zzder0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        try {
            ((zzbrd)zzecz0.zzb).zzq(zzfbo0.zzZ);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
            zzeff zzeff0 = new zzeff(this, zzecz0, null);
            ((zzbrd)zzecz0.zzb).zzl(zzfbo0.zzU, zzfbo0.zzv.toString(), zzfca0.zza.zza.zzd, iObjectWrapper0, zzeff0, ((zzbpk)zzecz0.zzc));
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Remote exception loading a interstitial RTB ad", remoteException0);
            throw new zzfcq(remoteException0);
        }
    }
}

