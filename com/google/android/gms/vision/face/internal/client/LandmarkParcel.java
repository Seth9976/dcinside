package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@UsedByNative("wrapper.cc")
@Class(creator = "LandmarkParcelCreator")
public final class LandmarkParcel extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final float zza;
    @Field(id = 3)
    public final float zzb;
    @Field(id = 4)
    public final int zzc;
    @VersionField(id = 1)
    private final int zzd;

    static {
        LandmarkParcel.CREATOR = new zzm();
    }

    @UsedByNative("wrapper.cc")
    @Constructor
    public LandmarkParcel(@Param(id = 1) int v, @Param(id = 2) float f, @Param(id = 3) float f1, @Param(id = 4) int v1) {
        this.zzd = v;
        this.zza = f;
        this.zzb = f1;
        this.zzc = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzd);
        SafeParcelWriter.writeFloat(parcel0, 2, this.zza);
        SafeParcelWriter.writeFloat(parcel0, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

