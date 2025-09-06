package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v7 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v7)) {
                case 2: {
                    v1 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 3: {
                    v2 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 4: {
                    v3 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 5: {
                    v4 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 6: {
                    v5 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 7: {
                    v6 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 8: {
                    z = SafeParcelReader.readBoolean(parcel0, v7);
                    break;
                }
                case 9: {
                    s = SafeParcelReader.createString(parcel0, v7);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v7);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new CalendarDateTime(v1, v2, v3, v4, v5, v6, z, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CalendarDateTime[v];
    }
}

