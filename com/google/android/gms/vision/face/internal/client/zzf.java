package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "FaceSettingsParcelCreator")
@Reserved({1})
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public int zza;
    @Field(id = 3)
    public int zzb;
    @Field(id = 4)
    public int zzc;
    @Field(id = 5)
    public boolean zzd;
    @Field(id = 6)
    public boolean zze;
    @Field(defaultValue = "-1", id = 7)
    public float zzf;

    static {
        zzf.CREATOR = new zze();
    }

    public zzf() {
    }

    @Constructor
    public zzf(@Param(id = 2) int v, @Param(id = 3) int v1, @Param(id = 4) int v2, @Param(id = 5) boolean z, @Param(id = 6) boolean z1, @Param(id = 7) float f) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = z;
        this.zze = z1;
        this.zzf = f;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 2, this.zza);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel0, 6, this.zze);
        SafeParcelWriter.writeFloat(parcel0, 7, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

