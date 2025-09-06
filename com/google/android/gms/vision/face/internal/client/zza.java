package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "ContourParcelCreator")
@Reserved({1})
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final PointF[] zza;
    @Field(id = 3)
    public final int zzb;

    static {
        zza.CREATOR = new zzc();
    }

    @Constructor
    public zza(@Param(id = 2) PointF[] arr_pointF, @Param(id = 3) int v) {
        this.zza = arr_pointF;
        this.zzb = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeTypedArray(parcel0, 2, this.zza, v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

