package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbrf extends zzayb implements zzbrg {
    public zzbrf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zze(s);
                break;
            }
            case 2: {
                String s1 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzf(s1);
                break;
            }
            case 3: {
                zze zze0 = (zze)zzayc.zza(parcel0, zze.CREATOR);
                zzayc.zzc(parcel0);
                this.zzg(zze0);
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

