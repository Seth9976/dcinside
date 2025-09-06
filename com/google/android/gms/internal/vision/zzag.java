package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzag implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        zzao[] arr_zzao = null;
        zzab zzab0 = null;
        zzab zzab1 = null;
        zzab zzab2 = null;
        String s = null;
        String s1 = null;
        float f = 0.0f;
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v4)) {
                case 2: {
                    arr_zzao = (zzao[])SafeParcelReader.createTypedArray(parcel0, v4, zzao.CREATOR);
                    break;
                }
                case 3: {
                    zzab0 = (zzab)SafeParcelReader.createParcelable(parcel0, v4, zzab.CREATOR);
                    break;
                }
                case 4: {
                    zzab1 = (zzab)SafeParcelReader.createParcelable(parcel0, v4, zzab.CREATOR);
                    break;
                }
                case 5: {
                    zzab2 = (zzab)SafeParcelReader.createParcelable(parcel0, v4, zzab.CREATOR);
                    break;
                }
                case 6: {
                    s = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 7: {
                    f = SafeParcelReader.readFloat(parcel0, v4);
                    break;
                }
                case 8: {
                    s1 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 9: {
                    v1 = SafeParcelReader.readInt(parcel0, v4);
                    break;
                }
                case 10: {
                    z = SafeParcelReader.readBoolean(parcel0, v4);
                    break;
                }
                case 11: {
                    v2 = SafeParcelReader.readInt(parcel0, v4);
                    break;
                }
                case 12: {
                    v3 = SafeParcelReader.readInt(parcel0, v4);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v4);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzah(arr_zzao, zzab0, zzab1, zzab2, s, f, s1, v1, z, v2, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzah[v];
    }
}

