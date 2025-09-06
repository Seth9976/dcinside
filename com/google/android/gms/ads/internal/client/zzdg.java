package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;

public abstract class zzdg extends zzayb implements zzdh {
    public zzdg() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzdh zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterface0 instanceof zzdh ? ((zzdh)iInterface0) : new zzdf(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                String s = this.zze();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 2: {
                String s1 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

