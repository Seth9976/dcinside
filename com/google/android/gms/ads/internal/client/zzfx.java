package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "SearchAdRequestParcelCreator")
@Reserved({1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14})
public final class zzfx extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 15)
    public final String zza;

    static {
        zzfx.CREATOR = new zzfy();
    }

    public zzfx(SearchAdRequest searchAdRequest0) {
        this.zza = searchAdRequest0.getQuery();
    }

    @Constructor
    zzfx(@Param(id = 15) String s) {
        this.zza = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 15, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

