package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzbhs extends zzayb implements zzbht {
    public zzbhs() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbhq zzbhq0;
        switch(v) {
            case 2: {
                String s = this.zzq();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 3: {
                List list0 = this.zzu();
                parcel1.writeNoException();
                parcel1.writeList(list0);
                return true;
            }
            case 4: {
                String s1 = this.zzo();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 5: {
                zzbfw zzbfw0 = this.zzk();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbfw0);
                return true;
            }
            case 6: {
                String s2 = this.zzp();
                parcel1.writeNoException();
                parcel1.writeString(s2);
                return true;
            }
            case 7: {
                String s3 = this.zzn();
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
                String s4 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            case 10: {
                String s5 = this.zzs();
                parcel1.writeNoException();
                parcel1.writeString(s5);
                return true;
            }
            case 11: {
                zzeb zzeb0 = this.zzh();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 12: {
                String s6 = this.zzr();
                parcel1.writeNoException();
                parcel1.writeString(s6);
                return true;
            }
            case 13: {
                this.zzx();
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzbfp zzbfp0 = this.zzi();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbfp0);
                return true;
            }
            case 15: {
                Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzz(bundle0);
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                Bundle bundle1 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                boolean z = this.zzJ(bundle1);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 17: {
                Bundle bundle2 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzC(bundle2);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                IObjectWrapper iObjectWrapper0 = this.zzm();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 19: {
                IObjectWrapper iObjectWrapper1 = this.zzl();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 20: {
                Bundle bundle3 = this.zzf();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle3);
                return true;
            }
            case 21: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbhq0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbhq0 = iInterface0 instanceof zzbhq ? ((zzbhq)iInterface0) : new zzbho(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzG(zzbhq0);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                this.zzw();
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                List list1 = this.zzv();
                parcel1.writeNoException();
                parcel1.writeList(list1);
                return true;
            }
            case 24: {
                boolean z1 = this.zzI();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 25: {
                zzdh zzdh0 = zzdg.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzy(zzdh0);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzdd zzdd0 = zzdc.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzE(zzdd0);
                parcel1.writeNoException();
                return true;
            }
            case 27: {
                this.zzD();
                parcel1.writeNoException();
                return true;
            }
            case 28: {
                this.zzA();
                parcel1.writeNoException();
                return true;
            }
            case 29: {
                zzbft zzbft0 = this.zzj();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbft0);
                return true;
            }
            case 30: {
                boolean z2 = this.zzH();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 0x1F: {
                zzdy zzdy0 = this.zzg();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzdy0);
                return true;
            }
            case 0x20: {
                zzdr zzdr0 = zzdq.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzF(zzdr0);
                parcel1.writeNoException();
                return true;
            }
            case 33: {
                Bundle bundle4 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
                zzayc.zzc(parcel0);
                this.zzB(bundle4);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

