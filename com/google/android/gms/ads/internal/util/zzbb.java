package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.internal.ads.zzfdk;
import com.google.android.gms.internal.ads.zzfve;

@Class(creator = "ExceptionParcelCreator")
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final String zza;
    @Field(id = 2)
    public final int zzb;

    static {
        zzbb.CREATOR = new zzbc();
    }

    @Constructor
    zzbb(@Nullable @Param(id = 1) String s, @Param(id = 2) int v) {
        if(s == null) {
            s = "";
        }
        this.zza = s;
        this.zzb = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final zzba zza() {
        return new zzba(this.zza, this.zzb);
    }

    public static zzbb zzb(Throwable throwable0) {
        zze zze0 = zzfdk.zza(throwable0);
        return zzfve.zzd(throwable0.getMessage()) ? new zzbb(zze0.zzb, zze0.zza) : new zzbb(throwable0.getMessage(), zze0.zza);
    }
}

