package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbwp;
import java.util.ArrayList;

public abstract class zzch extends zzayb implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzcf zzcf0;
        switch(v) {
            case 1: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(zzft.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzcf0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzcf0 = iInterface0 instanceof zzcf ? ((zzcf)iInterface0) : new zzcd(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzi(arrayList0, zzcf0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                zzayc.zzc(parcel0);
                boolean z = this.zzl(s);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 3: {
                String s1 = parcel0.readString();
                zzayc.zzc(parcel0);
                zzbwp zzbwp0 = this.zzg(s1);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbwp0);
                return true;
            }
            case 4: {
                String s2 = parcel0.readString();
                zzayc.zzc(parcel0);
                boolean z1 = this.zzj(s2);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 5: {
                String s3 = parcel0.readString();
                zzayc.zzc(parcel0);
                zzbad zzbad0 = this.zze(s3);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbad0);
                return true;
            }
            case 6: {
                String s4 = parcel0.readString();
                zzayc.zzc(parcel0);
                boolean z2 = this.zzk(s4);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 7: {
                String s5 = parcel0.readString();
                zzayc.zzc(parcel0);
                zzby zzby0 = this.zzf(s5);
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzby0);
                return true;
            }
            case 8: {
                zzbpe zzbpe0 = zzbpd.zzf(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzh(zzbpe0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

