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

@Class(creator = "LineBoxParcelCreator")
@Reserved({1})
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final zzao[] zza;
    @Field(id = 3)
    public final zzab zzb;
    @Field(id = 6)
    public final String zzc;
    @Field(id = 8)
    public final String zzd;
    @Field(id = 10)
    public final boolean zze;
    @Field(id = 11)
    public final int zzf;
    @Field(id = 12)
    public final int zzg;
    @Field(id = 4)
    private final zzab zzh;
    @Field(id = 5)
    private final zzab zzi;
    @Field(id = 7)
    private final float zzj;
    @Field(id = 9)
    private final int zzk;

    static {
        zzah.CREATOR = new zzag();
    }

    @Constructor
    public zzah(@Param(id = 2) zzao[] arr_zzao, @Param(id = 3) zzab zzab0, @Param(id = 4) zzab zzab1, @Param(id = 5) zzab zzab2, @Param(id = 6) String s, @Param(id = 7) float f, @Param(id = 8) String s1, @Param(id = 9) int v, @Param(id = 10) boolean z, @Param(id = 11) int v1, @Param(id = 12) int v2) {
        this.zza = arr_zzao;
        this.zzb = zzab0;
        this.zzh = zzab1;
        this.zzi = zzab2;
        this.zzc = s;
        this.zzj = f;
        this.zzd = s1;
        this.zzk = v;
        this.zze = z;
        this.zzf = v1;
        this.zzg = v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeTypedArray(parcel0, 2, this.zza, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzb, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zzh, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 5, this.zzi, v, false);
        SafeParcelWriter.writeString(parcel0, 6, this.zzc, false);
        SafeParcelWriter.writeFloat(parcel0, 7, this.zzj);
        SafeParcelWriter.writeString(parcel0, 8, this.zzd, false);
        SafeParcelWriter.writeInt(parcel0, 9, this.zzk);
        SafeParcelWriter.writeBoolean(parcel0, 10, this.zze);
        SafeParcelWriter.writeInt(parcel0, 11, this.zzf);
        SafeParcelWriter.writeInt(parcel0, 12, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

