package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        byte[] arr_b = null;
        byte[][] arr2_b = null;
        byte[][] arr2_b1 = null;
        byte[][] arr2_b2 = null;
        byte[][] arr2_b3 = null;
        int[] arr_v = null;
        byte[][] arr2_b4 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v1)) {
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_b = SafeParcelReader.createByteArray(parcel0, v1);
                    break;
                }
                case 4: {
                    arr2_b = SafeParcelReader.createByteArrayArray(parcel0, v1);
                    break;
                }
                case 5: {
                    arr2_b1 = SafeParcelReader.createByteArrayArray(parcel0, v1);
                    break;
                }
                case 6: {
                    arr2_b2 = SafeParcelReader.createByteArrayArray(parcel0, v1);
                    break;
                }
                case 7: {
                    arr2_b3 = SafeParcelReader.createByteArrayArray(parcel0, v1);
                    break;
                }
                case 8: {
                    arr_v = SafeParcelReader.createIntArray(parcel0, v1);
                    break;
                }
                case 9: {
                    arr2_b4 = SafeParcelReader.createByteArrayArray(parcel0, v1);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v1);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new ExperimentTokens(s, arr_b, arr2_b, arr2_b1, arr2_b2, arr2_b3, arr_v, arr2_b4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExperimentTokens[v];
    }
}

