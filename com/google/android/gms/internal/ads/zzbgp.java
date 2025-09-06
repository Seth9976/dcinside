package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzbgp extends zzayb implements zzbgq {
    public zzbgp() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbgq zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterface0 instanceof zzbgq ? ((zzbgq)iInterface0) : new zzbgo(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzayc.zzc(parcel0);
                String s1 = this.zzj(s);
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 2: {
                String s2 = parcel0.readString();
                zzayc.zzc(parcel0);
                zzbfw zzbfw0 = this.zzg(s2);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbfw0);
                return true;
            }
            case 3: {
                List list0 = this.zzk();
                parcel1.writeNoException();
                parcel1.writeStringList(list0);
                return true;
            }
            case 4: {
                String s3 = this.zzi();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 5: {
                String s4 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzn(s4);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                this.zzo();
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzeb zzeb0 = this.zze();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 8: {
                this.zzl();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper0 = this.zzh();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                boolean z = this.zzs(iObjectWrapper1);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 11: {
                parcel1.writeNoException();
                zzayc.zzf(parcel1, null);
                return true;
            }
            case 12: {
                boolean z1 = this.zzq();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 13: {
                boolean z2 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 14: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzp(iObjectWrapper2);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                this.zzm();
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                zzbft zzbft0 = this.zzf();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbft0);
                return true;
            }
            case 17: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                boolean z3 = this.zzr(iObjectWrapper3);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z3));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

