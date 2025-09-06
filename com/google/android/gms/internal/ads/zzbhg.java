package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbhg extends zzayb implements zzbhh {
    public zzbhg() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbhh zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterface0 instanceof zzbhh ? ((zzbhh)iInterface0) : new zzbhf(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            zzby zzby0 = zzbx.zzad(parcel0.readStrongBinder());
            IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
            zzayc.zzc(parcel0);
            this.zze(zzby0, iObjectWrapper0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

