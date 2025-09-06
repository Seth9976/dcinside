package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbat implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        long v1 = 0L;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(parcel0.dataPosition() < v) {
            int v2 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v2)) {
                case 2: {
                    parcelFileDescriptor0 = (ParcelFileDescriptor)SafeParcelReader.createParcelable(parcel0, v2, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 3: {
                    z = SafeParcelReader.readBoolean(parcel0, v2);
                    break;
                }
                case 4: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = SafeParcelReader.readLong(parcel0, v2);
                    break;
                }
                case 6: {
                    z2 = SafeParcelReader.readBoolean(parcel0, v2);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v2);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzbas(parcelFileDescriptor0, z, z1, v1, z2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzbas[v];
    }
}

