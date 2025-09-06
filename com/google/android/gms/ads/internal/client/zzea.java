package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzea extends zzayb implements zzeb {
    public zzea() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzeb zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterface0 instanceof zzeb ? ((zzeb)iInterface0) : new zzdz(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzee zzee0;
        switch(v) {
            case 1: {
                this.zzl();
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                this.zzk();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                boolean z = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzj(z);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                boolean z1 = this.zzq();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 5: {
                int v2 = this.zzh();
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            case 6: {
                float f = this.zzg();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;
            }
            case 7: {
                float f1 = this.zzf();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;
            }
            case 8: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzee0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzee0 = iInterface0 instanceof zzee ? ((zzee)iInterface0) : new zzec(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzm(zzee0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                float f2 = this.zze();
                parcel1.writeNoException();
                parcel1.writeFloat(f2);
                return true;
            }
            case 10: {
                boolean z2 = this.zzp();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 11: {
                zzee zzee1 = this.zzi();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzee1);
                return true;
            }
            case 12: {
                boolean z3 = this.zzo();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z3));
                return true;
            }
            case 13: {
                this.zzn();
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

