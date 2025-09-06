package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzdq extends zzayb implements zzdr {
    public zzdq() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdr zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterface0 instanceof zzdr ? ((zzdr)iInterface0) : new zzdp(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                zzu zzu0 = (zzu)zzayc.zza(parcel0, zzu.CREATOR);
                zzayc.zzc(parcel0);
                this.zze(zzu0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                boolean z = this.zzf();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

