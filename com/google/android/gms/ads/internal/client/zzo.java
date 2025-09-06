package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        Bundle bundle0 = null;
        List list0 = null;
        String s = null;
        zzfx zzfx0 = null;
        Location location0 = null;
        String s1 = null;
        Bundle bundle1 = null;
        Bundle bundle2 = null;
        List list1 = null;
        String s2 = null;
        String s3 = null;
        zzc zzc0 = null;
        String s4 = null;
        List list2 = null;
        String s5 = null;
        int v3 = 0;
        int v4 = 0;
        boolean z = false;
        int v5 = 0;
        boolean z1 = false;
        boolean z2 = false;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        while(parcel0.dataPosition() < v) {
            int v9 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v9)) {
                case 1: {
                    v3 = SafeParcelReader.readInt(parcel0, v9);
                    break;
                }
                case 2: {
                    v1 = SafeParcelReader.readLong(parcel0, v9);
                    break;
                }
                case 3: {
                    bundle0 = SafeParcelReader.createBundle(parcel0, v9);
                    break;
                }
                case 4: {
                    v4 = SafeParcelReader.readInt(parcel0, v9);
                    break;
                }
                case 5: {
                    list0 = SafeParcelReader.createStringList(parcel0, v9);
                    break;
                }
                case 6: {
                    z = SafeParcelReader.readBoolean(parcel0, v9);
                    break;
                }
                case 7: {
                    v5 = SafeParcelReader.readInt(parcel0, v9);
                    break;
                }
                case 8: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v9);
                    break;
                }
                case 9: {
                    s = SafeParcelReader.createString(parcel0, v9);
                    break;
                }
                case 10: {
                    zzfx0 = (zzfx)SafeParcelReader.createParcelable(parcel0, v9, zzfx.CREATOR);
                    break;
                }
                case 11: {
                    location0 = (Location)SafeParcelReader.createParcelable(parcel0, v9, Location.CREATOR);
                    break;
                }
                case 12: {
                    s1 = SafeParcelReader.createString(parcel0, v9);
                    break;
                }
                case 13: {
                    bundle1 = SafeParcelReader.createBundle(parcel0, v9);
                    break;
                }
                case 14: {
                    bundle2 = SafeParcelReader.createBundle(parcel0, v9);
                    break;
                }
                case 15: {
                    list1 = SafeParcelReader.createStringList(parcel0, v9);
                    break;
                }
                case 16: {
                    s2 = SafeParcelReader.createString(parcel0, v9);
                    break;
                }
                case 17: {
                    s3 = SafeParcelReader.createString(parcel0, v9);
                    break;
                }
                case 18: {
                    z2 = SafeParcelReader.readBoolean(parcel0, v9);
                    break;
                }
                case 19: {
                    zzc0 = (zzc)SafeParcelReader.createParcelable(parcel0, v9, zzc.CREATOR);
                    break;
                }
                case 20: {
                    v6 = SafeParcelReader.readInt(parcel0, v9);
                    break;
                }
                case 21: {
                    s4 = SafeParcelReader.createString(parcel0, v9);
                    break;
                }
                case 22: {
                    list2 = SafeParcelReader.createStringList(parcel0, v9);
                    break;
                }
                case 23: {
                    v7 = SafeParcelReader.readInt(parcel0, v9);
                    break;
                }
                case 24: {
                    s5 = SafeParcelReader.createString(parcel0, v9);
                    break;
                }
                case 25: {
                    v8 = SafeParcelReader.readInt(parcel0, v9);
                    break;
                }
                case 26: {
                    v2 = SafeParcelReader.readLong(parcel0, v9);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v9);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzm(v3, v1, bundle0, v4, list0, z, v5, z1, s, zzfx0, location0, s1, bundle1, bundle2, list1, s2, s3, z2, zzc0, v6, s4, list2, v7, s5, v8, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzm[v];
    }
}

