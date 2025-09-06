package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzfpm extends zzayb implements zzfpn {
    public zzfpm() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 2: {
                Stub.asInterface(parcel0.readStrongBinder());
                parcel0.readString();
                zzayc.zzc(parcel0);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                parcel0.createIntArray();
                zzayc.zzc(parcel0);
                break;
            }
            case 5: {
                parcel0.createByteArray();
                zzayc.zzc(parcel0);
                break;
            }
            case 6: {
                parcel0.readInt();
                zzayc.zzc(parcel0);
                break;
            }
            case 7: {
                parcel0.readInt();
                zzayc.zzc(parcel0);
                break;
            }
            case 8: {
                Stub.asInterface(parcel0.readStrongBinder());
                parcel0.readString();
                parcel0.readString();
                zzayc.zzc(parcel0);
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

