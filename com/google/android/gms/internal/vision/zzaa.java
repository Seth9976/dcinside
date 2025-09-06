package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        float f = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v5 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v5)) {
                case 2: {
                    v1 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 3: {
                    v2 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 4: {
                    v3 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 5: {
                    v4 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 6: {
                    f = SafeParcelReader.readFloat(parcel0, v5);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v5);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzab(v1, v2, v3, v4, f);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzab[v];
    }
}

