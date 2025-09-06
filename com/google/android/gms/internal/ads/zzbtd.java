package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbtd extends zzayb implements zzbte {
    public zzbtd() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbte zzI(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterface0 instanceof zzbte ? ((zzbte)iInterface0) : new zzbtc(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzl(bundle0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                this.zzt();
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.zzr();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                this.zzo();
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                Bundle bundle1 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzs(bundle1);
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle1);
                return true;
            }
            case 7: {
                this.zzu();
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.zzm();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                this.zzx();
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                this.zzi();
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                boolean z = this.zzH();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 12: {
                int v2 = parcel0.readInt();
                int v3 = parcel0.readInt();
                Intent intent0 = (Intent)zzayc.zza(parcel0, Intent.CREATOR);
                zzayc.zzc(parcel0);
                this.zzh(v2, v3, intent0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzk(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                this.zzv();
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                int v4 = parcel0.readInt();
                String[] arr_s = parcel0.createStringArray();
                int[] arr_v = parcel0.createIntArray();
                zzayc.zzc(parcel0);
                this.zzp(v4, arr_s, arr_v);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

