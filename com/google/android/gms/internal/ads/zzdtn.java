package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdtn implements zzdsx {
    private final long zza;
    private final zzdtc zzb;
    private final zzfbf zzc;

    zzdtn(long v, Context context0, zzdtc zzdtc0, zzcgx zzcgx0, String s) {
        this.zza = v;
        this.zzb = zzdtc0;
        zzfbh zzfbh0 = zzcgx0.zzw();
        zzfbh0.zzb(context0);
        zzfbh0.zza(s);
        this.zzc = zzfbh0.zzc().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzdsx
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdsx
    public final void zzb(zzm zzm0) {
        try {
            zzdtl zzdtl0 = new zzdtl(this);
            this.zzc.zzf(zzm0, zzdtl0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdsx
    public final void zzc() {
        try {
            zzdtm zzdtm0 = new zzdtm(this);
            this.zzc.zzk(zzdtm0);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(null);
            this.zzc.zzm(iObjectWrapper0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

