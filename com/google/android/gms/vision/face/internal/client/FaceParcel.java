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
@Class(creator = "FaceParcelCreator")
public class FaceParcel extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final int zza;
    @Field(id = 3)
    public final float zzb;
    @Field(id = 4)
    public final float zzc;
    @Field(id = 5)
    public final float zzd;
    @Field(id = 6)
    public final float zze;
    @Field(defaultValue = "3.4028235E38f", id = 7)
    public final float zzf;
    @Field(defaultValue = "3.4028235E38f", id = 8)
    public final float zzg;
    @Field(defaultValue = "3.4028235E38f", id = 14)
    public final float zzh;
    @RecentlyNonNull
    @Field(id = 9)
    public final LandmarkParcel[] zzi;
    @Field(id = 10)
    public final float zzj;
    @Field(id = 11)
    public final float zzk;
    @Field(id = 12)
    public final float zzl;
    @Field(id = 13)
    public final zza[] zzm;
    @Field(defaultValue = "-1.0f", id = 15)
    public final float zzn;
    @VersionField(id = 1)
    private final int zzo;

    static {
        FaceParcel.CREATOR = new zzd();
    }

    @Constructor
    public FaceParcel(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) float f, @Param(id = 4) float f1, @Param(id = 5) float f2, @Param(id = 6) float f3, @Param(id = 7) float f4, @Param(id = 8) float f5, @Param(id = 14) float f6, @Param(id = 9) LandmarkParcel[] arr_landmarkParcel, @Param(id = 10) float f7, @Param(id = 11) float f8, @Param(id = 12) float f9, @Param(id = 13) zza[] arr_zza, @Param(id = 15) float f10) {
        this.zzo = v;
        this.zza = v1;
        this.zzb = f;
        this.zzc = f1;
        this.zzd = f2;
        this.zze = f3;
        this.zzf = f4;
        this.zzg = f5;
        this.zzh = f6;
        this.zzi = arr_landmarkParcel;
        this.zzj = f7;
        this.zzk = f8;
        this.zzl = f9;
        this.zzm = arr_zza;
        this.zzn = f10;
    }

    @UsedByNative("wrapper.cc")
    public FaceParcel(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) float f, @Param(id = 4) float f1, @Param(id = 5) float f2, @Param(id = 6) float f3, @Param(id = 7) float f4, @Param(id = 8) float f5, @RecentlyNonNull @Param(id = 9) LandmarkParcel[] arr_landmarkParcel, @Param(id = 10) float f6, @Param(id = 11) float f7, @Param(id = 12) float f8) {
        this(v, v1, f, f1, f2, f3, f4, f5, 0.0f, arr_landmarkParcel, f6, f7, f8, new zza[0], -1.0f);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzo);
        SafeParcelWriter.writeInt(parcel0, 2, this.zza);
        SafeParcelWriter.writeFloat(parcel0, 3, this.zzb);
        SafeParcelWriter.writeFloat(parcel0, 4, this.zzc);
        SafeParcelWriter.writeFloat(parcel0, 5, this.zzd);
        SafeParcelWriter.writeFloat(parcel0, 6, this.zze);
        SafeParcelWriter.writeFloat(parcel0, 7, this.zzf);
        SafeParcelWriter.writeFloat(parcel0, 8, this.zzg);
        SafeParcelWriter.writeTypedArray(parcel0, 9, this.zzi, v, false);
        SafeParcelWriter.writeFloat(parcel0, 10, this.zzj);
        SafeParcelWriter.writeFloat(parcel0, 11, this.zzk);
        SafeParcelWriter.writeFloat(parcel0, 12, this.zzl);
        SafeParcelWriter.writeTypedArray(parcel0, 13, this.zzm, v, false);
        SafeParcelWriter.writeFloat(parcel0, 14, this.zzh);
        SafeParcelWriter.writeFloat(parcel0, 15, this.zzn);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

