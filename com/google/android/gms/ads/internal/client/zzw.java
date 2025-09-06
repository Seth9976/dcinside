package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "AdapterResponseInfoParcelCreator")
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final String zza;
    @Field(id = 2)
    public long zzb;
    @Nullable
    @Field(id = 3)
    public zze zzc;
    @Field(id = 4)
    public final Bundle zzd;
    @Field(id = 5)
    public final String zze;
    @Field(id = 6)
    public final String zzf;
    @Field(id = 7)
    public final String zzg;
    @Field(id = 8)
    public final String zzh;

    static {
        zzw.CREATOR = new zzx();
    }

    @Constructor
    public zzw(@Param(id = 1) String s, @Param(id = 2) long v, @Nullable @Param(id = 3) zze zze0, @Param(id = 4) Bundle bundle0, @Param(id = 5) String s1, @Param(id = 6) String s2, @Param(id = 7) String s3, @Param(id = 8) String s4) {
        this.zza = s;
        this.zzb = v;
        this.zzc = zze0;
        this.zzd = bundle0;
        this.zze = s1;
        this.zzf = s2;
        this.zzg = s3;
        this.zzh = s4;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel0, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzc, v, false);
        SafeParcelWriter.writeBundle(parcel0, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel0, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel0, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel0, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

