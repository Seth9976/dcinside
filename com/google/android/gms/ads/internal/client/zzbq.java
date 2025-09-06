package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzbq extends zzayb implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                zzm zzm1 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                zzayc.zzc(parcel0);
                this.zzg(zzm1);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                String s1 = this.zze();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 3: {
                boolean z = this.zzi();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 4: {
                String s = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 5: {
                zzm zzm0 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                int v2 = parcel0.readInt();
                zzayc.zzc(parcel0);
                this.zzh(zzm0, v2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

