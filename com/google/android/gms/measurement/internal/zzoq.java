package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzoq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        Long long0 = null;
        Float float0 = null;
        String s1 = null;
        String s2 = null;
        Double double0 = null;
        long v1 = 0L;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v3)) {
                case 1: {
                    v2 = SafeParcelReader.readInt(parcel0, v3);
                    break;
                }
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 3: {
                    v1 = SafeParcelReader.readLong(parcel0, v3);
                    break;
                }
                case 4: {
                    long0 = SafeParcelReader.readLongObject(parcel0, v3);
                    break;
                }
                case 5: {
                    float0 = SafeParcelReader.readFloatObject(parcel0, v3);
                    break;
                }
                case 6: {
                    s1 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 7: {
                    s2 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 8: {
                    double0 = SafeParcelReader.readDoubleObject(parcel0, v3);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v3);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzon(v2, s, v1, long0, float0, s1, s2, double0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzon[v];
    }
}

