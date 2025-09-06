package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        String s1 = null;
        byte[] arr_b = null;
        long v1 = 0L;
        double f = 0.0;
        boolean z = false;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v4)) {
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 3: {
                    v1 = SafeParcelReader.readLong(parcel0, v4);
                    break;
                }
                case 4: {
                    z = SafeParcelReader.readBoolean(parcel0, v4);
                    break;
                }
                case 5: {
                    f = SafeParcelReader.readDouble(parcel0, v4);
                    break;
                }
                case 6: {
                    s1 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 7: {
                    arr_b = SafeParcelReader.createByteArray(parcel0, v4);
                    break;
                }
                case 8: {
                    v2 = SafeParcelReader.readInt(parcel0, v4);
                    break;
                }
                case 9: {
                    v3 = SafeParcelReader.readInt(parcel0, v4);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v4);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzi(s, v1, z, f, s1, arr_b, v2, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzi[v];
    }
}

