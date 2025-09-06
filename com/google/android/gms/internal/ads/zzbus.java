package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Collections;
import java.util.List;
import o3.j;

@Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@Reserved({1})
@j
public final class zzbus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final boolean zza;
    @Nullable
    @Field(id = 3)
    public final List zzb;

    static {
        zzbus.CREATOR = new zzbut();
    }

    public zzbus() {
        this(false, Collections.emptyList());
    }

    @Constructor
    public zzbus(@Param(id = 2) boolean z, @Param(id = 3) List list0) {
        this.zza = z;
        this.zzb = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.zza);
        SafeParcelWriter.writeStringList(parcel0, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

