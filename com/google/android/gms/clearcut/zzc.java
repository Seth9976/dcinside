package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "CollectForDebugParcelableCreator")
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(defaultValue = "false", id = 1)
    private final boolean zzad;
    @Field(id = 3)
    private final long zzae;
    @Field(id = 2)
    private final long zzaf;

    static {
        zzc.CREATOR = new zzd();
    }

    @Constructor
    public zzc(@Param(id = 1) boolean z, @Param(id = 3) long v, @Param(id = 2) long v1) {
        this.zzad = z;
        this.zzae = v;
        this.zzaf = v1;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof zzc && this.zzad == ((zzc)object0).zzad && this.zzae == ((zzc)object0).zzae && this.zzaf == ((zzc)object0).zzaf;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.valueOf(this.zzad), this.zzae, this.zzaf});
    }

    @Override
    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.zzad + ",collectForDebugStartTimeMillis: " + this.zzae + ",collectForDebugExpiryTimeMillis: " + this.zzaf + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.zzad);
        SafeParcelWriter.writeLong(parcel0, 2, this.zzaf);
        SafeParcelWriter.writeLong(parcel0, 3, this.zzae);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

