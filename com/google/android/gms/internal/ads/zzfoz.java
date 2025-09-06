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

@Class(creator = "ProgramRequestCreator")
public final class zzfoz extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @VersionField(id = 1)
    public final int zza;
    @Field(id = 2)
    public final int zzb;
    @Field(id = 3)
    public final String zzc;
    @Field(id = 4)
    public final String zzd;
    @Field(id = 5)
    public final int zze;

    static {
        zzfoz.CREATOR = new zzfpa();
    }

    @Constructor
    zzfoz(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 5) int v2, @Param(id = 3) String s, @Param(id = 4) String s1) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = s;
        this.zzd = s1;
        this.zze = v2;
    }

    public zzfoz(int v, int v1, String s, String s1) {
        this(1, 1, v1 - 1, s, s1);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzb);
        SafeParcelWriter.writeString(parcel0, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel0, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

