package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzefw implements zzedc {
    private final Context zza;
    private final zzdgq zzb;
    private zzbpt zzc;
    private final VersionInfoParcel zzd;

    public zzefw(Context context0, zzdgq zzdgq0, VersionInfoParcel versionInfoParcel0) {
        this.zza = context0;
        this.zzb = zzdgq0;
        this.zzd = versionInfoParcel0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        if(!zzfca0.zza.zza.zzg.contains("6")) {
            throw new zzegu(2, "Unified must be used for RTB.");
        }
        zzdif zzdif0 = zzdif.zzt(this.zzc);
        String s = Integer.toString(zzdif0.zzc());
        if(!zzfca0.zza.zza.zzg.contains(s)) {
            throw new zzegu(1, "No corresponding native ad listener");
        }
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        zzdir zzdir0 = new zzdir(zzdif0);
        zzdkk zzdkk0 = new zzdkk(null, null, this.zzc);
        zzdih zzdih0 = this.zzb.zze(zzcrp0, zzdir0, zzdkk0);
        zzeie zzeie0 = zzdih0.zzj();
        ((zzees)zzecz0.zzc).zzc(zzeie0);
        return zzdih0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        try {
            ((zzbrd)zzecz0.zzb).zzq(zzfbo0.zzZ);
            if(this.zzd.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzbP))))) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzefu zzefu0 = new zzefu(this, zzecz0, null);
                ((zzbrd)zzecz0.zzb).zzm(zzfbo0.zzU, zzfbo0.zzv.toString(), zzfca0.zza.zza.zzd, iObjectWrapper0, zzefu0, ((zzbpk)zzecz0.zzc));
                return;
            }
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zza);
            zzefu zzefu1 = new zzefu(this, zzecz0, null);
            ((zzbrd)zzecz0.zzb).zzn(zzfbo0.zzU, zzfbo0.zzv.toString(), zzfca0.zza.zza.zzd, iObjectWrapper1, zzefu1, ((zzbpk)zzecz0.zzc), zzfca0.zza.zza.zzi);
            return;
        }
        catch(RemoteException remoteException0) {
        }
        throw new zzfcq(remoteException0);
    }
}

