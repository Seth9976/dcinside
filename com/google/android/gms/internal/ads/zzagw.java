package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

final class zzagw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ArrayList arrayList0 = new ArrayList();
        parcel0.readList(arrayList0, zzagy.class.getClassLoader());
        return new zzagz(arrayList0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzagz[v];
    }
}

