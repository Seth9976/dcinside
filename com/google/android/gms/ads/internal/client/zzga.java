package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "VideoOptionsParcelCreator")
@Reserved({1})
public final class zzga extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final boolean zza;
    @Field(id = 3)
    public final boolean zzb;
    @Field(id = 4)
    public final boolean zzc;

    static {
        zzga.CREATOR = new zzgb();
    }

    public zzga(VideoOptions videoOptions0) {
        this(videoOptions0.getStartMuted(), videoOptions0.getCustomControlsRequested(), videoOptions0.getClickToExpandRequested());
    }

    @Constructor
    public zzga(@Param(id = 2) boolean z, @Param(id = 3) boolean z1, @Param(id = 4) boolean z2) {
        this.zza = z;
        this.zzb = z1;
        this.zzc = z2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.zza);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.zzb);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

