package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbvy extends zzayb implements zzbvz {
    public zzbvy() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbwc zzbwc0 = null;
        switch(v) {
            case 1: {
                zzbwd zzbwd0 = (zzbwd)zzayc.zza(parcel0, zzbwd.CREATOR);
                zzayc.zzc(parcel0);
                this.zzg(zzbwd0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                this.zzq();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbwc0 = iInterface0 instanceof zzbwc ? ((zzbwc)iInterface0) : new zzbwa(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzo(zzbwc0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                boolean z = this.zzs();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 6: {
                this.zzh();
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                this.zzj();
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.zze();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzi(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzk(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzf(iObjectWrapper2);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                String s = this.zzd();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 13: {
                String s1 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzp(s1);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzcc zzcc0 = zzcb.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzl(zzcc0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                Bundle bundle0 = this.zzb();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle0);
                return true;
            }
            case 16: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    zzbwc0 = iInterface1 instanceof zzbvx ? ((zzbvx)iInterface1) : new zzbvx(iBinder1);
                }
                zzayc.zzc(parcel0);
                this.zzu(((zzbvx)zzbwc0));
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                parcel0.readString();
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzr(iObjectWrapper3);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                String s2 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzm(s2);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                boolean z1 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 21: {
                zzdy zzdy0 = this.zzc();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzdy0);
                return true;
            }
            case 34: {
                boolean z2 = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzn(z2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

