package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzbgm extends zzayb implements zzbgn {
    public zzbgm() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 2: {
                IObjectWrapper iObjectWrapper0 = this.zzg();
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
                List list0 = this.zzm();
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
                zzbfw zzbfw0 = this.zze();
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
                String s3 = this.zzh();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 9: {
                Bundle bundle0 = this.zzb();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle0);
                return true;
            }
            case 10: {
                this.zzn();
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzeb zzeb0 = this.zzc();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 12: {
                Bundle bundle1 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzo(bundle1);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                Bundle bundle2 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                boolean z = this.zzq(bundle2);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 14: {
                Bundle bundle3 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzp(bundle3);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                zzbfp zzbfp0 = this.zzd();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbfp0);
                return true;
            }
            case 16: {
                IObjectWrapper iObjectWrapper1 = this.zzf();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 17: {
                String s4 = this.zzl();
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

