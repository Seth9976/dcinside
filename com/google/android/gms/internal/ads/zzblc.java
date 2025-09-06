package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "HttpResponseParcelCreator")
public final class zzblc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final boolean zza;
    @Field(id = 2)
    public final String zzb;
    @Field(id = 3)
    public final int zzc;
    @Field(id = 4)
    public final byte[] zzd;
    @Field(id = 5)
    public final String[] zze;
    @Field(id = 6)
    public final String[] zzf;
    @Field(id = 7)
    public final boolean zzg;
    @Field(id = 8)
    public final long zzh;

    static {
        zzblc.CREATOR = new zzbld();
    }

    @Constructor
    zzblc(@Param(id = 1) boolean z, @Param(id = 2) String s, @Param(id = 3) int v, @Param(id = 4) byte[] arr_b, @Param(id = 5) String[] arr_s, @Param(id = 6) String[] arr_s1, @Param(id = 7) boolean z1, @Param(id = 8) long v1) {
        this.zza = z;
        this.zzb = s;
        this.zzc = v;
        this.zzd = arr_b;
        this.zze = arr_s;
        this.zzf = arr_s1;
        this.zzg = z1;
        this.zzh = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.zza);
        SafeParcelWriter.writeString(parcel0, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzc);
        SafeParcelWriter.writeByteArray(parcel0, 4, this.zzd, false);
        SafeParcelWriter.writeStringArray(parcel0, 5, this.zze, false);
        SafeParcelWriter.writeStringArray(parcel0, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel0, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel0, 8, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

