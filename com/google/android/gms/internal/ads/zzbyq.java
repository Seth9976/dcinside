package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbyq extends zzayb implements zzbyr {
    public zzbyq() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                parcel0.readString();
                parcel0.readString();
                zzayc.zzc(parcel0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzb(s);
                break;
            }
            case 3: {
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzc(s1, s2, bundle0);
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

