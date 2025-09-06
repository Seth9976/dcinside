package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "HttpRequestParcelCreator")
public final class zzbla extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final String zza;
    @Field(id = 2)
    public final String[] zzb;
    @Field(id = 3)
    public final String[] zzc;

    static {
        zzbla.CREATOR = new zzblb();
    }

    @Constructor
    zzbla(@Param(id = 1) String s, @Param(id = 2) String[] arr_s, @Param(id = 3) String[] arr_s1) {
        this.zza = s;
        this.zzb = arr_s;
        this.zzc = arr_s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeStringArray(parcel0, 2, this.zzb, false);
        SafeParcelWriter.writeStringArray(parcel0, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

