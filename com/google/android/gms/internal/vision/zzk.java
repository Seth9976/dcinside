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

@Class(creator = "BarcodeDetectorOptionsCreator")
@Reserved({1})
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public int zza;
    @Field(id = 3)
    private boolean zzb;

    static {
        zzk.CREATOR = new zzj();
    }

    public zzk() {
    }

    @Constructor
    public zzk(@Param(id = 2) int v, @Param(id = 3) boolean z) {
        this.zza = v;
        this.zzb = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 2, this.zza);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

