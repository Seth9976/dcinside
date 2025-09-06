package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

public abstract class zzbyt extends zzayb implements zzbyu {
    public zzbyt() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbyu zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterface0 instanceof zzbyu ? ((zzbyu)iInterface0) : new zzbys(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbyr zzbyr0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzbyy zzbyy0 = (zzbyy)zzayc.zza(parcel0, zzbyy.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbyr0 = iInterface0 instanceof zzbyr ? ((zzbyr)iInterface0) : new zzbyp(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzf(iObjectWrapper0, zzbyy0, zzbyr0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzk(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                Stub.asInterface(parcel0.readStrongBinder());
                Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, null);
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
                ArrayList arrayList0 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzbtt zzbtt0 = zzbts.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzm(arrayList0, iObjectWrapper2, zzbtt0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                ArrayList arrayList1 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzbtt zzbtt1 = zzbts.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzl(arrayList1, iObjectWrapper3, zzbtt1);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzbuc zzbuc0 = (zzbuc)zzayc.zza(parcel0, zzbuc.CREATOR);
                zzayc.zzc(parcel0);
                this.zzg(zzbuc0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzj(iObjectWrapper4);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                ArrayList arrayList2 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzbtt zzbtt2 = zzbts.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzi(arrayList2, iObjectWrapper5, zzbtt2);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                ArrayList arrayList3 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                zzbtt zzbtt3 = zzbts.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzh(arrayList3, iObjectWrapper6, zzbtt3);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                String s = parcel0.readString();
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                IObjectWrapper iObjectWrapper10 = this.zze(iObjectWrapper7, iObjectWrapper8, s, iObjectWrapper9);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper10);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

