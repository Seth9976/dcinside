package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import o3.j;

@Class(creator = "SignalConfigurationParcelCreator")
@j
public final class zzbyy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final String zza;
    @Field(id = 2)
    public final String zzb;
    @Field(id = 3)
    @Deprecated
    public final zzs zzc;
    @Field(id = 4)
    public final zzm zzd;
    @Field(id = 5)
    public final int zze;
    @Nullable
    @Field(id = 6)
    public final String zzf;

    static {
        zzbyy.CREATOR = new zzbyz();
    }

    @Constructor
    public zzbyy(@Param(id = 1) String s, @Param(id = 2) String s1, @Param(id = 3) zzs zzs0, @Param(id = 4) zzm zzm0, @Param(id = 5) int v, @Nullable @Param(id = 6) String s2) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzs0;
        this.zzd = zzm0;
        this.zze = v;
        this.zzf = s2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel0, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzc, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zzd, v, false);
        SafeParcelWriter.writeInt(parcel0, 5, this.zze);
        SafeParcelWriter.writeString(parcel0, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

