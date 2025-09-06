package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzehh implements zzedc {
    private final Context zza;
    private final zzdof zzb;

    public zzehh(Context context0, zzdof zzdof0) {
        this.zza = context0;
        this.zzb = zzdof0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        zzefb zzefb0 = new zzefb(zzfbo0, ((zzbrd)zzecz0.zzb), AdFormat.REWARDED);
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        zzdoc zzdoc0 = new zzdoc(zzefb0);
        zzdob zzdob0 = this.zzb.zze(zzcrp0, zzdoc0);
        zzefb0.zzb(zzdob0.zzc());
        zzeid zzeid0 = zzdob0.zzo();
        ((zzees)zzecz0.zzc).zzc(zzeid0);
        return zzdob0.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        try {
            ((zzbrd)zzecz0.zzb).zzq(zzfbo0.zzZ);
            if(zzfca0.zza.zza.zzo.zza == 3) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzehf zzehf0 = new zzehf(this, zzecz0, null);
                ((zzbrd)zzecz0.zzb).zzo(zzfbo0.zzU, zzfbo0.zzv.toString(), zzfca0.zza.zza.zzd, iObjectWrapper0, zzehf0, ((zzbpk)zzecz0.zzc));
                return;
            }
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zza);
            zzehf zzehf1 = new zzehf(this, zzecz0, null);
            ((zzbrd)zzecz0.zzb).zzp(zzfbo0.zzU, zzfbo0.zzv.toString(), zzfca0.zza.zza.zzd, iObjectWrapper1, zzehf1, ((zzbpk)zzecz0.zzc));
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zze.zzb("Remote exception loading a rewarded RTB ad", remoteException0);
    }
}

