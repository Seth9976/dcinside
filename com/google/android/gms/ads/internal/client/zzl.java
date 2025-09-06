package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbpe;
import o3.h;

public final class zzl extends RemoteCreator {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    protected final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterface0 instanceof zzcj ? ((zzcj)iInterface0) : new zzcj(iBinder0);
    }

    @h
    public final zzci zza(Context context0, zzbpe zzbpe0) {
        zzci zzci0;
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
            IBinder iBinder0 = ((zzcj)this.getRemoteCreatorInstance(context0)).zze(iObjectWrapper0, zzbpe0, 244410000);
            if(iBinder0 == null) {
                zzci0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzci0 = iInterface0 instanceof zzci ? ((zzci)iInterface0) : new zzcg(iBinder0);
            }
            zzci0.zzh(zzbpe0);
            return zzci0;
        }
        catch(RemoteException | RemoteCreatorException remoteException0) {
        }
        zzo.zzk("Could not get remote AdPreloaderCreator.", remoteException0);
        return null;
    }
}

