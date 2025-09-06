package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        zze zze0 = null;
        Bundle bundle0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v2)) {
                case 1: {
                    s = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 2: {
                    v1 = SafeParcelReader.readLong(parcel0, v2);
                    break;
                }
                case 3: {
                    zze0 = (zze)SafeParcelReader.createParcelable(parcel0, v2, zze.CREATOR);
                    break;
                }
                case 4: {
                    bundle0 = SafeParcelReader.createBundle(parcel0, v2);
                    break;
                }
                case 5: {
                    s1 = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 7: {
                    s3 = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 8: {
                    s4 = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v2);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzw(s, v1, zze0, bundle0, s1, s2, s3, s4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzw[v];
    }
}

