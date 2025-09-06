package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbpj extends zzayb implements zzbpk {
    public zzbpj() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpk zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterface0 instanceof zzbpk ? ((zzbpk)iInterface0) : new zzbpi(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                this.zze();
                break;
            }
            case 2: {
                this.zzf();
                break;
            }
            case 3: {
                int v2 = parcel0.readInt();
                zzayc.zzc(parcel0);
                this.zzg(v2);
                break;
            }
            case 4: {
                this.zzn();
                break;
            }
            case 5: {
                this.zzp();
                break;
            }
            case 6: {
                this.zzo();
                break;
            }
            case 7: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zzayc.zzc(parcel0);
                break;
            }
            case 8: {
                this.zzm();
                break;
            }
            case 9: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzq(s, s1);
                break;
            }
            case 10: {
                zzbgp.zzb(parcel0.readStrongBinder());
                parcel0.readString();
                zzayc.zzc(parcel0);
                break;
            }
            case 11: {
                this.zzv();
                break;
            }
            case 12: {
                parcel0.readString();
                zzayc.zzc(parcel0);
                break;
            }
            case 13: {
                this.zzy();
                break;
            }
            case 14: {
                zzbwi zzbwi0 = (zzbwi)zzayc.zza(parcel0, zzbwi.CREATOR);
                zzayc.zzc(parcel0);
                this.zzs(zzbwi0);
                break;
            }
            case 15: {
                this.zzw();
                break;
            }
            case 16: {
                zzbwm zzbwm0 = zzbwl.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzt(zzbwm0);
                break;
            }
            case 17: {
                int v3 = parcel0.readInt();
                zzayc.zzc(parcel0);
                this.zzj(v3);
                break;
            }
            case 18: {
                this.zzu();
                break;
            }
            case 19: {
                Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                break;
            }
            case 20: {
                this.zzx();
                break;
            }
            case 21: {
                String s2 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzl(s2);
                break;
            }
            case 22: {
                int v4 = parcel0.readInt();
                String s3 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzi(v4, s3);
                break;
            }
            case 23: {
                zze zze0 = (zze)zzayc.zza(parcel0, zze.CREATOR);
                zzayc.zzc(parcel0);
                this.zzh(zze0);
                break;
            }
            case 24: {
                zze zze1 = (zze)zzayc.zza(parcel0, zze.CREATOR);
                zzayc.zzc(parcel0);
                this.zzk(zze1);
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

