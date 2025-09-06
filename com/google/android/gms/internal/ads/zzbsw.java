package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbsw extends zzayb implements zzbsx {
    public zzbsw() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbsx zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterface0 instanceof zzbsx ? ((zzbsx)iInterface0) : new zzbsv(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                Intent intent0 = (Intent)zzayc.zza(parcel0, Intent.CREATOR);
                zzayc.zzc(parcel0);
                this.zze(intent0);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzi(iObjectWrapper0, s, s1);
                break;
            }
            case 3: {
                this.zzh();
                break;
            }
            case 4: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzg(iObjectWrapper1);
                break;
            }
            case 5: {
                String[] arr_s = parcel0.createStringArray();
                int[] arr_v = parcel0.createIntArray();
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzf(arr_s, arr_v, iObjectWrapper2);
                break;
            }
            case 6: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zza zza0 = (zza)zzayc.zza(parcel0, zza.CREATOR);
                zzayc.zzc(parcel0);
                this.zzj(iObjectWrapper3, zza0);
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

