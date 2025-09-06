package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = true;
        boolean z1 = false;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v4)) {
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 3: {
                    v1 = SafeParcelReader.readInt(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = SafeParcelReader.readInt(parcel0, v4);
                    break;
                }
                case 5: {
                    s1 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 6: {
                    s2 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 7: {
                    z = SafeParcelReader.readBoolean(parcel0, v4);
                    break;
                }
                case 8: {
                    s3 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 9: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v4);
                    break;
                }
                case 10: {
                    v3 = SafeParcelReader.readInt(parcel0, v4);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v4);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzr(s, v1, v2, s1, s2, z, s3, z1, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzr[v];
    }
}

