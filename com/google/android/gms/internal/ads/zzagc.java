package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzagc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return new zzagd(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzagd[v];
    }
}

