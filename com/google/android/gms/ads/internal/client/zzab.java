package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbxb;

final class zzab extends zzbb {
    final Context zza;
    final String zzb;
    final zzbpe zzc;

    zzab(zzba zzba0, Context context0, String s, zzbpe zzbpe0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = zzbpe0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    protected final Object zza() {
        zzba.zzv(this.zza, "rewarded");
        return new zzfq();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        return zzcp0.zzp(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzc() throws RemoteException {
        return zzbxb.zza(this.zza, this.zzb, this.zzc);
    }
}

