package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbwo extends zzayb implements zzbwp {
    public zzbwo() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbww zzbww0 = null;
        switch(v) {
            case 1: {
                zzm zzm0 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbww0 = iInterface0 instanceof zzbww ? ((zzbww)iInterface0) : new zzbwu(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzf(zzm0, zzbww0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbww0 = iInterface1 instanceof zzbws ? ((zzbws)iInterface1) : new zzbwq(iBinder1);
                }
                zzayc.zzc(parcel0);
                this.zzk(((zzbws)zzbww0));
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                boolean z = this.zzo();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 4: {
                String s = this.zze();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzm(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbww0 = iInterface2 instanceof zzbwx ? ((zzbwx)iInterface2) : new zzbwx(iBinder2);
                }
                zzayc.zzc(parcel0);
                this.zzp(((zzbwx)zzbww0));
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzbxd zzbxd0 = (zzbxd)zzayc.zza(parcel0, zzbxd.CREATOR);
                zzayc.zzc(parcel0);
                this.zzl(zzbxd0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                zzdo zzdo0 = zzdn.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzi(zzdo0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                Bundle bundle0 = this.zzb();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle0);
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                boolean z1 = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzn(iObjectWrapper1, z1);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzbwm zzbwm0 = this.zzd();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbwm0);
                return true;
            }
            case 12: {
                zzdy zzdy0 = this.zzc();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzdy0);
                return true;
            }
            case 13: {
                zzdr zzdr0 = zzdq.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzj(zzdr0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzm zzm1 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbww0 = iInterface3 instanceof zzbww ? ((zzbww)iInterface3) : new zzbwu(iBinder3);
                }
                zzayc.zzc(parcel0);
                this.zzg(zzm1, zzbww0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                boolean z2 = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzh(z2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbwp zzq(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterface0 instanceof zzbwp ? ((zzbwp)iInterface0) : new zzbwn(iBinder0);
    }
}

