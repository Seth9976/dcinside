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
import java.util.Arrays;

@Class(creator = "ProgramResponseCreator")
public final class zzfpb extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @VersionField(id = 1)
    public final int zza;
    @Field(id = 2)
    public final byte[] zzb;
    @Field(id = 3)
    public final int zzc;

    static {
        zzfpb.CREATOR = new zzfpc();
    }

    @Constructor
    zzfpb(@Param(id = 1) int v, @Param(id = 2) byte[] arr_b, @Param(id = 3) int v1) {
        this.zza = v;
        this.zzb = arr_b == null ? null : Arrays.copyOf(arr_b, arr_b.length);
        this.zzc = v1;
    }

    public zzfpb(byte[] arr_b, int v) {
        this(1, null, 1);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel0, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

