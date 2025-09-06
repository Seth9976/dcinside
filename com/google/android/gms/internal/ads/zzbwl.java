package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbwl extends zzayb implements zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static zzbwm zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterface0 instanceof zzbwm ? ((zzbwm)iInterface0) : new zzbwk(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                String s = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 2: {
                int v2 = this.zze();
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

