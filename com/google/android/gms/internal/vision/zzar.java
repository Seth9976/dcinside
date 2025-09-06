package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzar implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        zzal[] arr_zzal = null;
        zzab zzab0 = null;
        zzab zzab1 = null;
        String s = null;
        String s1 = null;
        float f = 0.0f;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v1)) {
                case 2: {
                    arr_zzal = (zzal[])SafeParcelReader.createTypedArray(parcel0, v1, zzal.CREATOR);
                    break;
                }
                case 3: {
                    zzab0 = (zzab)SafeParcelReader.createParcelable(parcel0, v1, zzab.CREATOR);
                    break;
                }
                case 4: {
                    zzab1 = (zzab)SafeParcelReader.createParcelable(parcel0, v1, zzab.CREATOR);
                    break;
                }
                case 5: {
                    s = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 6: {
                    f = SafeParcelReader.readFloat(parcel0, v1);
                    break;
                }
                case 7: {
                    s1 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 8: {
                    z = SafeParcelReader.readBoolean(parcel0, v1);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v1);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzao(arr_zzal, zzab0, zzab1, s, f, s1, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzao[v];
    }
}

