package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@ShowFirstParty
@Class(creator = "TextRecognizerOptionsCreator")
@Reserved({1})
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    @Field(getter = "getCustomModelsDir", id = 2)
    private final String zza;

    static {
        zzam.CREATOR = new zzap();
    }

    public zzam() {
        this(null);
    }

    @Constructor
    public zzam(@Nullable @Param(id = 2) String s) {
        this.zza = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

