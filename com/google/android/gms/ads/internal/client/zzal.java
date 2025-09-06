package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbku;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpe;

final class zzal extends zzbb {
    final Context zza;
    final zzbpe zzb;
    final OnH5AdsEventListener zzc;

    zzal(zzba zzba0, Context context0, zzbpe zzbpe0, OnH5AdsEventListener onH5AdsEventListener0) {
        this.zza = context0;
        this.zzb = zzbpe0;
        this.zzc = onH5AdsEventListener0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @NonNull
    protected final Object zza() {
        return new zzbky();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        zzbkl zzbkl0 = new zzbkl(this.zzc);
        return zzcp0.zzl(iObjectWrapper0, this.zzb, 244410000, zzbkl0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        try {
            zzak zzak0 = new zzak();
            zzbku zzbku0 = (zzbku)zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzak0);
            zzbkl zzbkl0 = new zzbkl(this.zzc);
            return zzbku0.zze(iObjectWrapper0, this.zzb, 244410000, zzbkl0);
        }
        catch(zzr | RemoteException | NullPointerException unused_ex) {
            return null;
        }
    }
}

