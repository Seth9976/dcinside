package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "BoundingBoxParcelCreator")
@Reserved({1})
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final int zza;
    @Field(id = 3)
    public final int zzb;
    @Field(id = 4)
    public final int zzc;
    @Field(id = 5)
    public final int zzd;
    @Field(id = 6)
    public final float zze;

    static {
        zzab.CREATOR = new zzaa();
    }

    @Constructor
    public zzab(@Param(id = 2) int v, @Param(id = 3) int v1, @Param(id = 4) int v2, @Param(id = 5) int v3, @Param(id = 6) float f) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = f;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 2, this.zza);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel0, 5, this.zzd);
        SafeParcelWriter.writeFloat(parcel0, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

