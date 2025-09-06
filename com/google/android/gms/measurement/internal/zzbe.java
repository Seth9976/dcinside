package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Iterator;

@Class(creator = "EventParamsCreator")
@Reserved({1})
public final class zzbe extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR;
    @Field(getter = "z", id = 2)
    private final Bundle zza;

    static {
        zzbe.CREATOR = new zzbg();
    }

    @Constructor
    zzbe(@Param(id = 2) Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override
    public final Iterator iterator() {
        return new zzbd(this);
    }

    @Override
    public final String toString() {
        return this.zza.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBundle(parcel0, 2, this.zzb(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final int zza() {
        return this.zza.size();
    }

    final Double zza(String s) {
        return this.zza.getDouble(s);
    }

    public final Bundle zzb() {
        return new Bundle(this.zza);
    }

    final Long zzb(String s) {
        return this.zza.getLong(s);
    }

    final Object zzc(String s) {
        return this.zza.get(s);
    }

    final String zzd(String s) {
        return this.zza.getString(s);
    }
}

