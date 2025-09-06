package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbpd extends zzayb implements zzbpe {
    public zzbpd() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzayc.zzc(parcel0);
                zzbph zzbph0 = this.zzb(s);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbph0);
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                zzayc.zzc(parcel0);
                boolean z = this.zze(s1);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 3: {
                String s2 = parcel0.readString();
                zzayc.zzc(parcel0);
                zzbrd zzbrd0 = this.zzc(s2);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbrd0);
                return true;
            }
            case 4: {
                String s3 = parcel0.readString();
                zzayc.zzc(parcel0);
                boolean z1 = this.zzd(s3);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbpe zzf(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterface0 instanceof zzbpe ? ((zzbpe)iInterface0) : new zzbpc(iBinder0);
    }
}

