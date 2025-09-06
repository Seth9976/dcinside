package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbta;

final class zzaj extends zzbb {
    final Context zza;
    final zzbpe zzb;

    zzaj(zzba zzba0, Context context0, zzbpe zzbpe0) {
        this.zza = context0;
        this.zzb = zzbpe0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    protected final Object zza() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        return zzcp0.zzm(ObjectWrapper.wrap(this.zza), this.zzb, 244410000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        try {
            zzai zzai0 = new zzai();
            return ((zzbta)zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", zzai0)).zze(iObjectWrapper0, this.zzb, 244410000);
        }
        catch(zzr | RemoteException | NullPointerException unused_ex) {
            return null;
        }
    }
}

