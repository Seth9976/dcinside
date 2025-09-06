package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "LiteSdkVersionsParcelCreator")
public final class zzfb extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(getter = "getAdsDynamiteVersion", id = 1)
    private final int zza;
    @Field(getter = "getSdkVersionLite", id = 2)
    private final int zzb;
    @Field(getter = "getGranularVersion", id = 3)
    private final String zzc;

    static {
        zzfb.CREATOR = new zzfc();
    }

    public zzfb() {
        this(244410203, 244410000, "23.6.0");
    }

    @Constructor
    public zzfb(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) String s) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzb);
        SafeParcelWriter.writeString(parcel0, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() [...] // 潜在的解密器
}

