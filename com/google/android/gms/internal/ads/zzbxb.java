package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbxb {
    @Nullable
    public static final zzbwp zza(Context context0, String s, zzbpe zzbpe0) {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
        try {
            IBinder iBinder0 = ((zzbwt)zzs.zzb(context0, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzbxa())).zze(iObjectWrapper0, s, zzbpe0, 244410000);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterface0 instanceof zzbwp ? ((zzbwp)iInterface0) : new zzbwn(iBinder0);
            }
            return null;
        }
        catch(zzr | RemoteException zzr0) {
        }
        zzo.zzl("#007 Could not call remote method.", zzr0);
        return null;
    }
}

