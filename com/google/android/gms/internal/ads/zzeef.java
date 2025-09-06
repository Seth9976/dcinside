package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzeef extends zzbqq {
    final zzeeh zza;
    private final zzecz zzb;

    zzeef(zzeeh zzeeh0, zzecz zzecz0, zzeeg zzeeg0) {
        this.zza = zzeeh0;
        super();
        this.zzb = zzecz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqr
    public final void zze(String s) throws RemoteException {
        ((zzees)this.zzb.zzc).zzi(0, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqr
    public final void zzf(zze zze0) throws RemoteException {
        ((zzees)this.zzb.zzc).zzh(zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqr
    public final void zzg(IObjectWrapper iObjectWrapper0) throws RemoteException {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zza.zzc = view0;
        ((zzees)this.zzb.zzc).zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzbqr
    public final void zzh(zzbpn zzbpn0) throws RemoteException {
        this.zza.zzd = zzbpn0;
        ((zzees)this.zzb.zzc).zzo();
    }
}

