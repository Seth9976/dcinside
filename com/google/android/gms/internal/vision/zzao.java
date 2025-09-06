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

@Class(creator = "WordBoxParcelCreator")
@Reserved({1})
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 3)
    public final zzab zza;
    @Field(id = 5)
    public final String zzb;
    @Field(id = 7)
    public final String zzc;
    @Field(id = 2)
    private final zzal[] zzd;
    @Field(id = 4)
    private final zzab zze;
    @Field(id = 6)
    private final float zzf;
    @Field(id = 8)
    private final boolean zzg;

    static {
        zzao.CREATOR = new zzar();
    }

    @Constructor
    public zzao(@Param(id = 2) zzal[] arr_zzal, @Param(id = 3) zzab zzab0, @Param(id = 4) zzab zzab1, @Param(id = 5) String s, @Param(id = 6) float f, @Param(id = 7) String s1, @Param(id = 8) boolean z) {
        this.zzd = arr_zzal;
        this.zza = zzab0;
        this.zze = zzab1;
        this.zzb = s;
        this.zzf = f;
        this.zzc = s1;
        this.zzg = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeTypedArray(parcel0, 2, this.zzd, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zza, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zze, v, false);
        SafeParcelWriter.writeString(parcel0, 5, this.zzb, false);
        SafeParcelWriter.writeFloat(parcel0, 6, this.zzf);
        SafeParcelWriter.writeString(parcel0, 7, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

