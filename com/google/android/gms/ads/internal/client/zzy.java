package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "AppOpenAdOptionsParcelCreator")
@Reserved({1})
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @AppOpenAdOrientation
    @Field(id = 2)
    public final int zza;

    static {
        zzy.CREATOR = new zzz();
    }

    @Constructor
    public zzy(@AppOpenAdOrientation @Param(id = 2) int v) {
        this.zza = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 2, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

