package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        String s8 = null;
        String s9 = null;
        String s10 = null;
        String s11 = null;
        String s12 = null;
        String s13 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v1)) {
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 4: {
                    s2 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 5: {
                    s3 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 6: {
                    s4 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 7: {
                    s5 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 8: {
                    s6 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 9: {
                    s7 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 10: {
                    s8 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 11: {
                    s9 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 12: {
                    s10 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 13: {
                    s11 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 14: {
                    s12 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 15: {
                    s13 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v1);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new DriverLicense(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DriverLicense[v];
    }
}

