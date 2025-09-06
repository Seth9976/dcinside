package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbfz extends zzayb implements zzbga {
    public zzbfz() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbft zzbft0;
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzdt(s, iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                zzayc.zzc(parcel0);
                IObjectWrapper iObjectWrapper1 = this.zzb(s1);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzdx(iObjectWrapper2);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.zzc();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                Stub.asInterface(parcel0.readStrongBinder());
                parcel0.readInt();
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzdu(iObjectWrapper3);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzd(iObjectWrapper4);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbft0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbft0 = iInterface0 instanceof zzbft ? ((zzbft)iInterface0) : new zzbfr(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzdv(zzbft0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzdw(iObjectWrapper5);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbga zzdy(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterface0 instanceof zzbga ? ((zzbga)iInterface0) : new zzbfy(iBinder0);
    }
}

