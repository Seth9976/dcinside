package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    @Field(id = 2)
    public String zza;
    @Field(id = 3)
    public String zzb;
    @Field(id = 4)
    public zzon zzc;
    @Field(id = 5)
    public long zzd;
    @Field(id = 6)
    public boolean zze;
    @Nullable
    @Field(id = 7)
    public String zzf;
    @Nullable
    @Field(id = 8)
    public zzbf zzg;
    @Field(id = 9)
    public long zzh;
    @Nullable
    @Field(id = 10)
    public zzbf zzi;
    @Field(id = 11)
    public long zzj;
    @Nullable
    @Field(id = 12)
    public zzbf zzk;

    static {
        zzae.CREATOR = new zzad();
    }

    zzae(zzae zzae0) {
        Preconditions.checkNotNull(zzae0);
        this.zza = zzae0.zza;
        this.zzb = zzae0.zzb;
        this.zzc = zzae0.zzc;
        this.zzd = zzae0.zzd;
        this.zze = zzae0.zze;
        this.zzf = zzae0.zzf;
        this.zzg = zzae0.zzg;
        this.zzh = zzae0.zzh;
        this.zzi = zzae0.zzi;
        this.zzj = zzae0.zzj;
        this.zzk = zzae0.zzk;
    }

    @Constructor
    zzae(@Nullable @Param(id = 2) String s, @Param(id = 3) String s1, @Param(id = 4) zzon zzon0, @Param(id = 5) long v, @Param(id = 6) boolean z, @Nullable @Param(id = 7) String s2, @Nullable @Param(id = 8) zzbf zzbf0, @Param(id = 9) long v1, @Nullable @Param(id = 10) zzbf zzbf1, @Param(id = 11) long v2, @Nullable @Param(id = 12) zzbf zzbf2) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzon0;
        this.zzd = v;
        this.zze = z;
        this.zzf = s2;
        this.zzg = zzbf0;
        this.zzh = v1;
        this.zzi = zzbf1;
        this.zzj = v2;
        this.zzk = zzbf2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel0, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zzc, v, false);
        SafeParcelWriter.writeLong(parcel0, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel0, 6, this.zze);
        SafeParcelWriter.writeString(parcel0, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel0, 8, this.zzg, v, false);
        SafeParcelWriter.writeLong(parcel0, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel0, 10, this.zzi, v, false);
        SafeParcelWriter.writeLong(parcel0, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel0, 12, this.zzk, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

