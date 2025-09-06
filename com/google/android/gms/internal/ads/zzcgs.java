package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

public abstract class zzcgs extends zzayb implements zzcgt {
    public zzcgs() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzp(bundle0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                Bundle bundle1 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                Bundle bundle2 = this.zzd(bundle1);
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle2);
                return true;
            }
            case 3: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                Bundle bundle3 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzo(s, s1, bundle3);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzt(s2, s3, iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                boolean z = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                Map map0 = this.zzk(s4, s5, z);
                parcel1.writeNoException();
                parcel1.writeMap(map0);
                return true;
            }
            case 6: {
                String s6 = parcel0.readString();
                zzayc.zzc(parcel0);
                int v2 = this.zzb(s6);
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            case 7: {
                Bundle bundle4 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzq(bundle4);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                Bundle bundle5 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzm(s7, s8, bundle5);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                String s9 = parcel0.readString();
                String s10 = parcel0.readString();
                zzayc.zzc(parcel0);
                List list0 = this.zzj(s9, s10);
                parcel1.writeNoException();
                parcel1.writeList(list0);
                return true;
            }
            case 10: {
                String s11 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s11);
                return true;
            }
            case 11: {
                String s12 = this.zzi();
                parcel1.writeNoException();
                parcel1.writeString(s12);
                return true;
            }
            case 12: {
                long v3 = this.zzc();
                parcel1.writeNoException();
                parcel1.writeLong(v3);
                return true;
            }
            case 13: {
                String s13 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzl(s13);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                String s14 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzn(s14);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzs(iObjectWrapper1, s15, s16);
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                String s17 = this.zzh();
                parcel1.writeNoException();
                parcel1.writeString(s17);
                return true;
            }
            case 17: {
                String s18 = this.zzg();
                parcel1.writeNoException();
                parcel1.writeString(s18);
                return true;
            }
            case 18: {
                String s19 = this.zze();
                parcel1.writeNoException();
                parcel1.writeString(s19);
                return true;
            }
            case 19: {
                Bundle bundle6 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzr(bundle6);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

