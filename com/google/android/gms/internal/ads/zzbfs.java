package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbfs extends zzayb implements zzbft {
    public zzbfs() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbhe zzbhe0;
        switch(v) {
            case 2: {
                float f = this.zze();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzj(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                IObjectWrapper iObjectWrapper1 = this.zzi();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 5: {
                float f1 = this.zzg();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;
            }
            case 6: {
                float f2 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeFloat(f2);
                return true;
            }
            case 7: {
                zzeb zzeb0 = this.zzh();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 8: {
                boolean z = this.zzl();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 9: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbhe0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbhe0 = iInterface0 instanceof zzbhe ? ((zzbhe)iInterface0) : new zzbhe(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzm(zzbhe0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                boolean z1 = this.zzk();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

