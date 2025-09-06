package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbyz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        String s1 = null;
        zzs zzs0 = null;
        zzm zzm0 = null;
        String s2 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v2)) {
                case 1: {
                    s = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 3: {
                    zzs0 = (zzs)SafeParcelReader.createParcelable(parcel0, v2, zzs.CREATOR);
                    break;
                }
                case 4: {
                    zzm0 = (zzm)SafeParcelReader.createParcelable(parcel0, v2, zzm.CREATOR);
                    break;
                }
                case 5: {
                    v1 = SafeParcelReader.readInt(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v2);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzbyy(s, s1, zzs0, zzm0, v1, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzbyy[v];
    }
}

