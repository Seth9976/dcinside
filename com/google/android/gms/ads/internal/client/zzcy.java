package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;
import java.util.List;

public abstract class zzcy extends zzayb implements zzcz {
    public zzcy() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzdl zzdl0;
        switch(v) {
            case 1: {
                this.zzk();
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                float f = parcel0.readFloat();
                zzayc.zzc(parcel0);
                this.zzq(f);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                String s = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzr(s);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                boolean z = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzp(z);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s1 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzn(iObjectWrapper0, s1);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                String s2 = parcel0.readString();
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzl(s2, iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                float f1 = this.zze();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;
            }
            case 8: {
                boolean z1 = this.zzv();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 9: {
                String s3 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 10: {
                String s4 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzh(s4);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzbpe zzbpe0 = zzbpd.zzf(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzo(zzbpe0);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                zzblu zzblu0 = zzblt.zzc(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzs(zzblu0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                List list0 = this.zzg();
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 14: {
                zzfv zzfv0 = (zzfv)zzayc.zza(parcel0, zzfv.CREATOR);
                zzayc.zzc(parcel0);
                this.zzu(zzfv0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                this.zzi();
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzdl0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdl0 = iInterface0 instanceof zzdl ? ((zzdl)iInterface0) : new zzdj(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzm(zzdl0);
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                boolean z2 = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzj(z2);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                String s5 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzt(s5);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

