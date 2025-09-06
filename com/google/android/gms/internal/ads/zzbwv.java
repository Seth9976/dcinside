package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbwv extends zzayb implements zzbww {
    public zzbwv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                this.zzg();
                break;
            }
            case 2: {
                int v2 = parcel0.readInt();
                zzayc.zzc(parcel0);
                this.zze(v2);
                break;
            }
            case 3: {
                zze zze0 = (zze)zzayc.zza(parcel0, zze.CREATOR);
                zzayc.zzc(parcel0);
                this.zzf(zze0);
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

