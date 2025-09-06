package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbpe;

public abstract class zzcv extends zzayb implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcw asInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterface0 instanceof zzcw ? ((zzcw)iInterface0) : new zzcu(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                zzfb zzfb0 = this.getLiteSdkVersion();
                parcel1.writeNoException();
                zzayc.zze(parcel1, zzfb0);
                return true;
            }
            case 2: {
                zzbpe zzbpe0 = this.getAdapterCreator();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbpe0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

