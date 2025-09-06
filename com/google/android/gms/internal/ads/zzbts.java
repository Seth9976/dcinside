package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

public abstract class zzbts extends zzayb implements zzbtt {
    public zzbts() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbtt zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterface0 instanceof zzbtt ? ((zzbtt)iInterface0) : new zzbtr(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(Uri.CREATOR);
                zzayc.zzc(parcel0);
                this.zzf(arrayList0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zze(s);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

