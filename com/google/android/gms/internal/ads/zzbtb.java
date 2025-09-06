package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;

public final class zzbtb extends RemoteCreator {
    public zzbtb() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    protected final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterface0 instanceof zzbth ? ((zzbth)iInterface0) : new zzbtf(iBinder0);
    }

    @Nullable
    public final zzbte zza(Activity activity0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(activity0);
            IBinder iBinder0 = ((zzbth)this.getRemoteCreatorInstance(activity0)).zze(iObjectWrapper0);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterface0 instanceof zzbte ? ((zzbte)iInterface0) : new zzbtc(iBinder0);
            }
            return null;
        }
        catch(RemoteException remoteException0) {
        }
        catch(RemoteCreatorException remoteCreator$RemoteCreatorException0) {
            zzo.zzk("Could not create remote AdOverlay.", remoteCreator$RemoteCreatorException0);
            return null;
        }
        zzo.zzk("Could not create remote AdOverlay.", remoteException0);
        return null;
    }
}

