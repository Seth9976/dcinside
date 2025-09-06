package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbdc extends zzayb implements zzbdd {
    public zzbdc() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                String s1 = this.zzb();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 2: {
                String s = this.zzc();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzd(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.zze();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                this.zzf();
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

