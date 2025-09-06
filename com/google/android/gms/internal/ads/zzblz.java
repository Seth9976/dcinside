package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import o3.j;

@Class(creator = "InstreamAdConfigurationParcelCreator")
@j
public final class zzblz extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @VersionField(id = 1000)
    public final int zza;
    @Field(id = 1)
    public final int zzb;
    @Field(id = 2)
    public final String zzc;
    @Field(id = 3)
    public final int zzd;

    static {
        zzblz.CREATOR = new zzbma();
    }

    @Constructor
    public zzblz(@Param(id = 1000) int v, @Param(id = 1) int v1, @Param(id = 2) String s, @Param(id = 3) int v2) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = s;
        this.zzd = v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzb);
        SafeParcelWriter.writeString(parcel0, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel0, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

