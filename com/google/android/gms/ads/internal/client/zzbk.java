package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzbk extends zzayb implements zzbl {
    public zzbk() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                this.zzd();
                break;
            }
            case 2: {
                int v2 = parcel0.readInt();
                zzayc.zzc(parcel0);
                this.zze(v2);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                this.zzi();
                break;
            }
            case 5: {
                this.zzj();
                break;
            }
            case 6: {
                this.zzc();
                break;
            }
            case 7: {
                this.zzg();
                break;
            }
            case 8: {
                zze zze0 = (zze)zzayc.zza(parcel0, zze.CREATOR);
                zzayc.zzc(parcel0);
                this.zzf(zze0);
                break;
            }
            case 9: {
                this.zzk();
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

