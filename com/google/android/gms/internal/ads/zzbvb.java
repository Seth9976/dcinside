package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

public abstract class zzbvb extends zzayb implements zzbvc {
    public zzbvb() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)zzayc.zza(parcel0, ParcelFileDescriptor.CREATOR);
                zzayc.zzc(parcel0);
                this.zzf(parcelFileDescriptor0);
                break;
            }
            case 2: {
                zzbb zzbb0 = (zzbb)zzayc.zza(parcel0, zzbb.CREATOR);
                zzayc.zzc(parcel0);
                this.zze(zzbb0);
                break;
            }
            case 3: {
                ParcelFileDescriptor parcelFileDescriptor1 = (ParcelFileDescriptor)zzayc.zza(parcel0, ParcelFileDescriptor.CREATOR);
                zzbvk zzbvk0 = (zzbvk)zzayc.zza(parcel0, zzbvk.CREATOR);
                zzayc.zzc(parcel0);
                this.zzg(parcelFileDescriptor1, zzbvk0);
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

