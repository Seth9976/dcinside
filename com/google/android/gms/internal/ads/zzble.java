package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

public abstract class zzble extends zzayb implements zzblf {
    public zzble() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)zzayc.zza(parcel0, ParcelFileDescriptor.CREATOR);
            zzayc.zzc(parcel0);
            this.zzb(parcelFileDescriptor0);
            return true;
        }
        return false;
    }
}

