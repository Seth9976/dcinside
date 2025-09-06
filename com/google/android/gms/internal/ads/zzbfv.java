package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbfv extends zzayb implements zzbfw {
    public zzbfv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = this.zzf();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 2: {
                Uri uri0 = this.zze();
                parcel1.writeNoException();
                zzayc.zze(parcel1, uri0);
                return true;
            }
            case 3: {
                double f = this.zzb();
                parcel1.writeNoException();
                parcel1.writeDouble(f);
                return true;
            }
            case 4: {
                int v3 = this.zzd();
                parcel1.writeNoException();
                parcel1.writeInt(v3);
                return true;
            }
            case 5: {
                int v2 = this.zzc();
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbfw zzg(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterface0 instanceof zzbfw ? ((zzbfw)iInterface0) : new zzbfu(iBinder0);
    }
}

