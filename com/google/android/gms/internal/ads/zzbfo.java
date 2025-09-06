package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public abstract class zzbfo extends zzayb implements zzbfp {
    public zzbfo() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 2: {
                String s = this.zzg();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 3: {
                List list0 = this.zzh();
                parcel1.writeNoException();
                parcel1.writeList(list0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbfp zzj(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterface0 instanceof zzbfp ? ((zzbfp)iInterface0) : new zzbfn(iBinder0);
    }
}

