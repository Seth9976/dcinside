package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

public final class zzet implements zzax {
    public static final Parcelable.Creator CREATOR;
    public final float zza;
    public final float zzb;

    static {
        zzet.CREATOR = new zzer();
    }

    public zzet(@FloatRange(from = -90.0, to = 90.0) float f, @FloatRange(from = -180.0, to = 180.0) float f1) {
        zzcw.zze(f >= -90.0f && f <= 90.0f && f1 >= -180.0f && f1 <= 180.0f, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f1;
    }

    zzet(Parcel parcel0, zzes zzes0) {
        this.zza = parcel0.readFloat();
        this.zzb = parcel0.readFloat();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzet.class == class0 && this.zza == ((zzet)object0).zza && this.zzb == ((zzet)object0).zzb;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (this.zza.hashCode() + 0x20F) * 0x1F + this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeFloat(this.zza);
        parcel0.writeFloat(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzat0) {
    }
}

