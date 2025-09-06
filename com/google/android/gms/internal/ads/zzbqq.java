package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbqq extends zzayb implements zzbqr {
    public zzbqq() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzg(iObjectWrapper0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zze(s);
                break;
            }
            case 3: {
                zze zze0 = (zze)zzayc.zza(parcel0, zze.CREATOR);
                zzayc.zzc(parcel0);
                this.zzf(zze0);
                break;
            }
            case 4: {
                zzbpn zzbpn0 = zzbpm.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzh(zzbpn0);
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

