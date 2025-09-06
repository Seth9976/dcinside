package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbpe;

public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    protected final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterface0 instanceof zzbv ? ((zzbv)iInterface0) : new zzbv(iBinder0);
    }

    @Nullable
    public final zzbu zza(Context context0, String s, zzbpe zzbpe0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
            IBinder iBinder0 = ((zzbv)this.getRemoteCreatorInstance(context0)).zze(iObjectWrapper0, s, zzbpe0, 244410000);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterface0 instanceof zzbu ? ((zzbu)iInterface0) : new zzbs(iBinder0);
            }
            return null;
        }
        catch(RemoteException | RemoteCreatorException remoteException0) {
        }
        zzo.zzk("Could not create remote builder for AdLoader.", remoteException0);
        return null;
    }
}

