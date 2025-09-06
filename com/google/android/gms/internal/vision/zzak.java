package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzak implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        while(parcel0.dataPosition() < v) {
            SafeParcelReader.skipUnknownField(parcel0, SafeParcelReader.readHeader(parcel0));
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzal();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzal[v];
    }
}

