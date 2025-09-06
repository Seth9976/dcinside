package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.vision.Frame;

@Class(creator = "FrameMetadataParcelCreator")
@Reserved({1})
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public int zza;
    @Field(id = 3)
    public int zzb;
    @Field(id = 4)
    public int zzc;
    @Field(id = 5)
    public long zzd;
    @Field(id = 6)
    public int zze;

    static {
        zzs.CREATOR = new zzv();
    }

    public zzs() {
    }

    @Constructor
    public zzs(@Param(id = 2) int v, @Param(id = 3) int v1, @Param(id = 4) int v2, @Param(id = 5) long v3, @Param(id = 6) int v4) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 2, this.zza);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzc);
        SafeParcelWriter.writeLong(parcel0, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel0, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static zzs zza(Frame frame0) {
        zzs zzs0 = new zzs();
        zzs0.zza = frame0.getMetadata().getWidth();
        zzs0.zzb = frame0.getMetadata().getHeight();
        zzs0.zze = frame0.getMetadata().getRotation();
        zzs0.zzc = frame0.getMetadata().getId();
        zzs0.zzd = frame0.getMetadata().getTimestampMillis();
        return zzs0;
    }
}

