package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import o3.h;

@Class(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(getter = "getResult", id = 1)
    private final boolean zza;
    @Field(getter = "getErrorMessage", id = 2)
    @h
    private final String zzb;
    @Field(getter = "getStatusValue", id = 3)
    private final int zzc;
    @Field(getter = "getFirstPartyStatusValue", id = 4)
    private final int zzd;

    static {
        zzq.CREATOR = new zzr();
    }

    @Constructor
    zzq(@Param(id = 1) boolean z, @Param(id = 2) String s, @Param(id = 3) int v, @Param(id = 4) int v1) {
        this.zza = z;
        this.zzb = s;
        this.zzc = zzx.zza(v) - 1;
        this.zzd = zzd.zza(v1) - 1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.zza);
        SafeParcelWriter.writeString(parcel0, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @h
    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public final int zzc() {
        return zzd.zza(this.zzd);
    }

    public final int zzd() {
        return zzx.zza(this.zzc);
    }
}

