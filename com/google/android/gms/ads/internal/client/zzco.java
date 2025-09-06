package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbyu;

public abstract class zzco extends zzayb implements zzcp {
    public zzco() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable0 = zzayc.zza(parcel0, zzs.CREATOR);
                String s = parcel0.readString();
                zzbpe zzbpe0 = zzbpd.zzf(parcel0.readStrongBinder());
                int v2 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzby zzby0 = this.zzd(iObjectWrapper0, ((zzs)parcelable0), s, zzbpe0, v2);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzby0);
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable1 = zzayc.zza(parcel0, zzs.CREATOR);
                String s1 = parcel0.readString();
                zzbpe zzbpe1 = zzbpd.zzf(parcel0.readStrongBinder());
                int v3 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzby zzby1 = this.zze(iObjectWrapper1, ((zzs)parcelable1), s1, zzbpe1, v3);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzby1);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                String s2 = parcel0.readString();
                zzbpe zzbpe2 = zzbpd.zzf(parcel0.readStrongBinder());
                int v4 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzbu zzbu0 = this.zzb(iObjectWrapper2, s2, zzbpe2, v4);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbu0);
                return true;
            }
            case 4: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, null);
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                zzbga zzbga0 = this.zzj(iObjectWrapper3, iObjectWrapper4);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbga0);
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzbpe zzbpe3 = zzbpd.zzf(parcel0.readStrongBinder());
                int v5 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzbvz zzbvz0 = this.zzo(iObjectWrapper5, zzbpe3, v5);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbvz0);
                return true;
            }
            case 7: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, null);
                return true;
            }
            case 8: {
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                zzbte zzbte0 = this.zzn(iObjectWrapper6);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbte0);
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                int v6 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzcz zzcz0 = this.zzh(iObjectWrapper7, v6);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzcz0);
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                zzs zzs0 = (zzs)zzayc.zza(parcel0, zzs.CREATOR);
                String s3 = parcel0.readString();
                int v7 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzby zzby2 = this.zzf(iObjectWrapper8, zzs0, s3, v7);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzby2);
                return true;
            }
            case 11: {
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper11 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                zzbgg zzbgg0 = this.zzk(iObjectWrapper9, iObjectWrapper10, iObjectWrapper11);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbgg0);
                return true;
            }
            case 12: {
                IObjectWrapper iObjectWrapper12 = Stub.asInterface(parcel0.readStrongBinder());
                String s4 = parcel0.readString();
                zzbpe zzbpe4 = zzbpd.zzf(parcel0.readStrongBinder());
                int v8 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzbwp zzbwp0 = this.zzp(iObjectWrapper12, s4, zzbpe4, v8);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbwp0);
                return true;
            }
            case 13: {
                IObjectWrapper iObjectWrapper13 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable2 = zzayc.zza(parcel0, zzs.CREATOR);
                String s5 = parcel0.readString();
                zzbpe zzbpe5 = zzbpd.zzf(parcel0.readStrongBinder());
                int v9 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzby zzby3 = this.zzc(iObjectWrapper13, ((zzs)parcelable2), s5, zzbpe5, v9);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzby3);
                return true;
            }
            case 14: {
                IObjectWrapper iObjectWrapper14 = Stub.asInterface(parcel0.readStrongBinder());
                zzbpe zzbpe6 = zzbpd.zzf(parcel0.readStrongBinder());
                int v10 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzbyu zzbyu0 = this.zzq(iObjectWrapper14, zzbpe6, v10);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbyu0);
                return true;
            }
            case 15: {
                IObjectWrapper iObjectWrapper15 = Stub.asInterface(parcel0.readStrongBinder());
                zzbpe zzbpe7 = zzbpd.zzf(parcel0.readStrongBinder());
                int v11 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzbsx zzbsx0 = this.zzm(iObjectWrapper15, zzbpe7, v11);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbsx0);
                return true;
            }
            case 16: {
                IObjectWrapper iObjectWrapper16 = Stub.asInterface(parcel0.readStrongBinder());
                zzbpe zzbpe8 = zzbpd.zzf(parcel0.readStrongBinder());
                int v12 = parcel0.readInt();
                zzbko zzbko0 = zzbkn.zzc(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                zzbkr zzbkr0 = this.zzl(iObjectWrapper16, zzbpe8, v12, zzbko0);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbkr0);
                return true;
            }
            case 17: {
                IObjectWrapper iObjectWrapper17 = Stub.asInterface(parcel0.readStrongBinder());
                zzbpe zzbpe9 = zzbpd.zzf(parcel0.readStrongBinder());
                int v13 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzdu zzdu0 = this.zzi(iObjectWrapper17, zzbpe9, v13);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzdu0);
                return true;
            }
            case 18: {
                IObjectWrapper iObjectWrapper18 = Stub.asInterface(parcel0.readStrongBinder());
                zzbpe zzbpe10 = zzbpd.zzf(parcel0.readStrongBinder());
                int v14 = parcel0.readInt();
                zzayc.zzc(parcel0);
                zzci zzci0 = this.zzg(iObjectWrapper18, zzbpe10, v14);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzci0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

