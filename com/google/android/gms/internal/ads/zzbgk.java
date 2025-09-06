package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzbgk extends zzayb implements zzbgl {
    public zzbgk() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 2: {
                IObjectWrapper iObjectWrapper0 = this.zzh();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 3: {
                String s = this.zzk();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 4: {
                List list0 = this.zzo();
                parcel1.writeNoException();
                parcel1.writeList(list0);
                return true;
            }
            case 5: {
                String s1 = this.zzi();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 6: {
                zzbfw zzbfw0 = this.zzf();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbfw0);
                return true;
            }
            case 7: {
                String s2 = this.zzj();
                parcel1.writeNoException();
                parcel1.writeString(s2);
                return true;
            }
            case 8: {
                double f = this.zzb();
                parcel1.writeNoException();
                parcel1.writeDouble(f);
                return true;
            }
            case 9: {
                String s3 = this.zzn();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 10: {
                String s4 = this.zzm();
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            case 11: {
                Bundle bundle0 = this.zzc();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle0);
                return true;
            }
            case 12: {
                this.zzp();
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                zzeb zzeb0 = this.zzd();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 14: {
                Bundle bundle1 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzq(bundle1);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                Bundle bundle2 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                boolean z = this.zzs(bundle2);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 16: {
                Bundle bundle3 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzr(bundle3);
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                zzbfp zzbfp0 = this.zze();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbfp0);
                return true;
            }
            case 18: {
                IObjectWrapper iObjectWrapper1 = this.zzg();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 19: {
                String s5 = this.zzl();
                parcel1.writeNoException();
                parcel1.writeString(s5);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

