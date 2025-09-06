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

public final class zzfe extends RemoteCreator {
    public zzfe() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    protected final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterface0 instanceof zzda ? ((zzda)iInterface0) : new zzda(iBinder0);
    }

    @Nullable
    public final zzcz zza(Context context0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
            IBinder iBinder0 = ((zzda)this.getRemoteCreatorInstance(context0)).zze(iObjectWrapper0, 244410000);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterface0 instanceof zzcz ? ((zzcz)iInterface0) : new zzcx(iBinder0);
            }
            return null;
        }
        catch(RemoteException | RemoteCreatorException remoteException0) {
        }
        zzo.zzk("Could not get remote MobileAdsSettingManager.", remoteException0);
        return null;
    }
}

