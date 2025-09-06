package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbvv extends zzayb implements zzbvw {
    public zzbvv() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                String s = this.zzc();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 2: {
                int v2 = this.zzb();
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

