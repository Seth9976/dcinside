package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "EventParcelCreator")
@Reserved({1})
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final zzbe zzb;
    @Field(id = 4)
    public final String zzc;
    @Field(id = 5)
    public final long zzd;

    static {
        zzbf.CREATOR = new zzbi();
    }

    zzbf(zzbf zzbf0, long v) {
        Preconditions.checkNotNull(zzbf0);
        this.zza = zzbf0.zza;
        this.zzb = zzbf0.zzb;
        this.zzc = zzbf0.zzc;
        this.zzd = v;
    }

    @Constructor
    public zzbf(@Param(id = 2) String s, @Param(id = 3) zzbe zzbe0, @Param(id = 4) String s1, @Param(id = 5) long v) {
        this.zza = s;
        this.zzb = zzbe0;
        this.zzc = s1;
        this.zzd = v;
    }

    @Override
    public final String toString() {
        return "origin=" + this.zzc + ",name=" + this.zza + ",params=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzb, v, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzc, false);
        SafeParcelWriter.writeLong(parcel0, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

