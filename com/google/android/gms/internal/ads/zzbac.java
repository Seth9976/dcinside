package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbac extends zzayb implements zzbad {
    public zzbac() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbad zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterface0 instanceof zzbad ? ((zzbad)iInterface0) : new zzbab(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbak zzbak0;
        switch(v) {
            case 2: {
                zzby zzby0 = this.zze();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzby0);
                return true;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if(iInterface0 instanceof zzbah) {
                        zzbah zzbah0 = (zzbah)iInterface0;
                    }
                }
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    zzbak0 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbak0 = iInterface1 instanceof zzbak ? ((zzbak)iInterface1) : new zzbai(iBinder1);
                }
                zzayc.zzc(parcel0);
                this.zzi(iObjectWrapper0, zzbak0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                zzdy zzdy0 = this.zzf();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzdy0);
                return true;
            }
            case 6: {
                boolean z = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzg(z);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzdr zzdr0 = zzdq.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzh(zzdr0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

