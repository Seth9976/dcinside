package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzce extends zzayb implements zzcf {
    public zzce() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                zzft zzft0 = (zzft)zzayc.zza(parcel0, zzft.CREATOR);
                zzayc.zzc(parcel0);
                this.zze(zzft0);
                break;
            }
            case 2: {
                zzft zzft1 = (zzft)zzayc.zza(parcel0, zzft.CREATOR);
                zzayc.zzc(parcel0);
                this.zzf(zzft1);
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

