package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import j..util.Objects;

@Class(creator = "PreloadConfigurationParcelCreator")
public final class zzft extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final String zza;
    @Field(id = 2)
    public final int zzb;
    @Field(id = 3)
    public final zzm zzc;
    @Field(id = 4)
    public final int zzd;

    static {
        zzft.CREATOR = new zzfu();
    }

    @Constructor
    public zzft(@Param(id = 1) String s, @Param(id = 2) int v, @Param(id = 3) zzm zzm0, @Param(id = 4) int v1) {
        this.zza = s;
        this.zzb = v;
        this.zzc = zzm0;
        this.zzd = v1;
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof zzft && this.zza.equals(((zzft)object0).zza) && this.zzb == ((zzft)object0).zzb && this.zzc.zza(((zzft)object0).zzc);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb, this.zzc});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzc, v, false);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

