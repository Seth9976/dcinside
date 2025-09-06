package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbwr extends zzayb implements zzbws {
    public zzbwr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbwm zzbwm0;
        switch(v) {
            case 1: {
                this.zzj();
                break;
            }
            case 2: {
                this.zzg();
                break;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbwm0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzbwm0 = iInterface0 instanceof zzbwm ? ((zzbwm)iInterface0) : new zzbwk(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzk(zzbwm0);
                break;
            }
            case 4: {
                int v2 = parcel0.readInt();
                zzayc.zzc(parcel0);
                this.zzh(v2);
                break;
            }
            case 5: {
                zze zze0 = (zze)zzayc.zza(parcel0, zze.CREATOR);
                zzayc.zzc(parcel0);
                this.zzi(zze0);
                break;
            }
            case 6: {
                this.zzf();
                break;
            }
            case 7: {
                this.zze();
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

