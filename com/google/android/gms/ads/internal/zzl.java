package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "InterstitialAdParameterParcelCreator")
@Reserved({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final boolean zza;
    @Field(id = 3)
    public final boolean zzb;
    @Field(id = 4)
    public final String zzc;
    @Field(id = 5)
    public final boolean zzd;
    @Field(id = 6)
    public final float zze;
    @Field(id = 7)
    public final int zzf;
    @Field(id = 8)
    public final boolean zzg;
    @Field(id = 9)
    public final boolean zzh;
    @Field(id = 10)
    public final boolean zzi;

    static {
        zzl.CREATOR = new zzm();
    }

    @Constructor
    zzl(@Param(id = 2) boolean z, @Param(id = 3) boolean z1, @Param(id = 4) String s, @Param(id = 5) boolean z2, @Param(id = 6) float f, @Param(id = 7) int v, @Param(id = 8) boolean z3, @Param(id = 9) boolean z4, @Param(id = 10) boolean z5) {
        this.zza = z;
        this.zzb = z1;
        this.zzc = s;
        this.zzd = z2;
        this.zze = f;
        this.zzf = v;
        this.zzg = z3;
        this.zzh = z4;
        this.zzi = z5;
    }

    public zzl(boolean z, boolean z1, boolean z2, float f, int v, boolean z3, boolean z4, boolean z5) {
        this(z, z1, null, z2, f, -1, z3, z4, z5);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.zza);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.zzb);
        SafeParcelWriter.writeString(parcel0, 4, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.zzd);
        SafeParcelWriter.writeFloat(parcel0, 6, this.zze);
        SafeParcelWriter.writeInt(parcel0, 7, this.zzf);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzg);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel0, 10, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

