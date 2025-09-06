package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzed extends zzayb implements zzee {
    public zzed() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                this.zzi();
                break;
            }
            case 2: {
                this.zzh();
                break;
            }
            case 3: {
                this.zzg();
                break;
            }
            case 4: {
                this.zze();
                break;
            }
            case 5: {
                boolean z = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzf(z);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

