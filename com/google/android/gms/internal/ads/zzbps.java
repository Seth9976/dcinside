package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzbps extends zzayb implements zzbpt {
    public zzbps() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbpt zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterface0 instanceof zzbpt ? ((zzbpt)iInterface0) : new zzbpr(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 2: {
                String s = this.zzs();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 3: {
                List list0 = this.zzv();
                parcel1.writeNoException();
                parcel1.writeList(list0);
                return true;
            }
            case 4: {
                String s1 = this.zzq();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 5: {
                zzbfw zzbfw0 = this.zzl();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbfw0);
                return true;
            }
            case 6: {
                String s2 = this.zzr();
                parcel1.writeNoException();
                parcel1.writeString(s2);
                return true;
            }
            case 7: {
                String s3 = this.zzp();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 8: {
                double f = this.zze();
                parcel1.writeNoException();
                parcel1.writeDouble(f);
                return true;
            }
            case 9: {
                String s4 = this.zzu();
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            case 10: {
                String s5 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeString(s5);
                return true;
            }
            case 11: {
                zzeb zzeb0 = this.zzj();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 12: {
                parcel1.writeNoException();
                zzayc.zzf(parcel1, null);
                return true;
            }
            case 13: {
                IObjectWrapper iObjectWrapper0 = this.zzm();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 14: {
                IObjectWrapper iObjectWrapper1 = this.zzn();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 15: {
                IObjectWrapper iObjectWrapper2 = this.zzo();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper2);
                return true;
            }
            case 16: {
                Bundle bundle0 = this.zzi();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle0);
                return true;
            }
            case 17: {
                boolean z = this.zzB();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 18: {
                boolean z1 = this.zzA();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 19: {
                this.zzx();
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzw(iObjectWrapper3);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzy(iObjectWrapper4, iObjectWrapper5, iObjectWrapper6);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzz(iObjectWrapper7);
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                float f1 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;
            }
            case 24: {
                float f2 = this.zzh();
                parcel1.writeNoException();
                parcel1.writeFloat(f2);
                return true;
            }
            case 25: {
                float f3 = this.zzg();
                parcel1.writeNoException();
                parcel1.writeFloat(f3);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

