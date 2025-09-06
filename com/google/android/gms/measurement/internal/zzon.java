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

@Class(creator = "UserAttributeParcelCreator")
public final class zzon extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final long zzb;
    @Nullable
    @Field(id = 4)
    public final Long zzc;
    @Nullable
    @Field(id = 6)
    public final String zzd;
    @Field(id = 7)
    public final String zze;
    @Nullable
    @Field(id = 8)
    public final Double zzf;
    @Field(id = 1)
    private final int zzg;

    static {
        zzon.CREATOR = new zzoq();
    }

    @Constructor
    zzon(@Param(id = 1) int v, @Param(id = 2) String s, @Param(id = 3) long v1, @Nullable @Param(id = 4) Long long0, @Param(id = 5) Float float0, @Nullable @Param(id = 6) String s1, @Param(id = 7) String s2, @Nullable @Param(id = 8) Double double0) {
        this.zzg = v;
        this.zza = s;
        this.zzb = v1;
        this.zzc = long0;
        if(v == 1) {
            this.zzf = float0 == null ? null : float0.doubleValue();
        }
        else {
            this.zzf = double0;
        }
        this.zzd = s1;
        this.zze = s2;
    }

    zzon(zzop zzop0) {
        this(zzop0.zzc, zzop0.zzd, zzop0.zze, zzop0.zzb);
    }

    zzon(String s, long v, @Nullable Object object0, String s1) {
        Preconditions.checkNotEmpty(s);
        this.zzg = 2;
        this.zza = s;
        this.zzb = v;
        this.zze = s1;
        if(object0 == null) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if(object0 instanceof Long) {
            this.zzc = (Long)object0;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if(object0 instanceof String) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = (String)object0;
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.zzc = null;
        this.zzf = (Double)object0;
        this.zzd = null;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzg);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeLong(parcel0, 3, this.zzb);
        SafeParcelWriter.writeLongObject(parcel0, 4, this.zzc, false);
        SafeParcelWriter.writeFloatObject(parcel0, 5, null, false);
        SafeParcelWriter.writeString(parcel0, 6, this.zzd, false);
        SafeParcelWriter.writeString(parcel0, 7, this.zze, false);
        SafeParcelWriter.writeDoubleObject(parcel0, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Nullable
    public final Object zza() {
        Long long0 = this.zzc;
        if(long0 != null) {
            return long0;
        }
        Double double0 = this.zzf;
        if(double0 != null) {
            return double0;
        }
        String s = this.zzd;
        return s != null ? s : null;
    }
}

