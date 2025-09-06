package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzbq extends zzayb implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                zzayc.zzc(parcel0);
                boolean z = this.zzf(iObjectWrapper0, s, s1);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zze(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zza zza0 = (zza)zzayc.zza(parcel0, zza.CREATOR);
                zzayc.zzc(parcel0);
                boolean z1 = this.zzg(iObjectWrapper2, zza0);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

