package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzagp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        String s = parcel0.readString();
        s.getClass();
        String s1 = parcel0.readString();
        String[] arr_s = parcel0.createStringArray();
        arr_s.getClass();
        return new zzagq(s, s1, zzfxn.zzm(arr_s));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzagq[v];
    }
}

