package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        long v1 = 0L;
        zzc zzc0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        String s = null;
        String s1 = null;
        IBinder iBinder4 = null;
        String s2 = null;
        VersionInfoParcel versionInfoParcel0 = null;
        String s3 = null;
        zzl zzl0 = null;
        IBinder iBinder5 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        IBinder iBinder6 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        boolean z = false;
        int v2 = 0;
        int v3 = 0;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v4 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v4)) {
                case 2: {
                    zzc0 = (zzc)SafeParcelReader.createParcelable(parcel0, v4, zzc.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = SafeParcelReader.readIBinder(parcel0, v4);
                    break;
                }
                case 4: {
                    iBinder1 = SafeParcelReader.readIBinder(parcel0, v4);
                    break;
                }
                case 5: {
                    iBinder2 = SafeParcelReader.readIBinder(parcel0, v4);
                    break;
                }
                case 6: {
                    iBinder3 = SafeParcelReader.readIBinder(parcel0, v4);
                    break;
                }
                case 7: {
                    s = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 8: {
                    z = SafeParcelReader.readBoolean(parcel0, v4);
                    break;
                }
                case 9: {
                    s1 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 10: {
                    iBinder4 = SafeParcelReader.readIBinder(parcel0, v4);
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
                case 13: {
                    s2 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 14: {
                    versionInfoParcel0 = (VersionInfoParcel)SafeParcelReader.createParcelable(parcel0, v4, VersionInfoParcel.CREATOR);
                    break;
                }
                case 16: {
                    s3 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 17: {
                    zzl0 = (zzl)SafeParcelReader.createParcelable(parcel0, v4, zzl.CREATOR);
                    break;
                }
                case 18: {
                    iBinder5 = SafeParcelReader.readIBinder(parcel0, v4);
                    break;
                }
                case 19: {
                    s4 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 24: {
                    s5 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 25: {
                    s6 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 26: {
                    iBinder6 = SafeParcelReader.readIBinder(parcel0, v4);
                    break;
                }
                case 27: {
                    iBinder7 = SafeParcelReader.readIBinder(parcel0, v4);
                    break;
                }
                case 28: {
                    iBinder8 = SafeParcelReader.readIBinder(parcel0, v4);
                    break;
                }
                case 29: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v4);
                    break;
                }
                case 30: {
                    v1 = SafeParcelReader.readLong(parcel0, v4);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v4);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new AdOverlayInfoParcel(zzc0, iBinder0, iBinder1, iBinder2, iBinder3, s, z, s1, iBinder4, v2, v3, s2, versionInfoParcel0, s3, zzl0, iBinder5, s4, s5, s6, iBinder6, iBinder7, iBinder8, z1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AdOverlayInfoParcel[v];
    }
}

