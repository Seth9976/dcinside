package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        LandmarkParcel[] arr_landmarkParcel = null;
        zza[] arr_zza = null;
        int v1 = 0;
        int v2 = 0;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 3.402823E+38f;
        float f5 = 3.402823E+38f;
        float f6 = 3.402823E+38f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = -1.0f;
        while(parcel0.dataPosition() < v) {
            int v3 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v3)) {
                case 1: {
                    v1 = SafeParcelReader.readInt(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = SafeParcelReader.readInt(parcel0, v3);
                    break;
                }
                case 3: {
                    f = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 4: {
                    f1 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 5: {
                    f2 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 6: {
                    f3 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 7: {
                    f4 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 8: {
                    f5 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 9: {
                    arr_landmarkParcel = (LandmarkParcel[])SafeParcelReader.createTypedArray(parcel0, v3, LandmarkParcel.CREATOR);
                    break;
                }
                case 10: {
                    f7 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 11: {
                    f8 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 12: {
                    f9 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 13: {
                    arr_zza = (zza[])SafeParcelReader.createTypedArray(parcel0, v3, zza.CREATOR);
                    break;
                }
                case 14: {
                    f6 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                case 15: {
                    f10 = SafeParcelReader.readFloat(parcel0, v3);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v3);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new FaceParcel(v1, v2, f, f1, f2, f3, f4, f5, f6, arr_landmarkParcel, f7, f8, f9, arr_zza, f10);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FaceParcel[v];
    }
}

