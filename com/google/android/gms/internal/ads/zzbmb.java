package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbmb extends zzayb implements zzbmc {
    public zzbmb() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbmf zzbmf0;
        switch(v) {
            case 3: {
                zzeb zzeb0 = this.zzb();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 4: {
                this.zzd();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbmf0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    zzbmf0 = iInterface0 instanceof zzbmf ? ((zzbmf)iInterface0) : new zzbmd(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzf(iObjectWrapper1, zzbmf0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zze(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzbft zzbft0 = this.zzc();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbft0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

