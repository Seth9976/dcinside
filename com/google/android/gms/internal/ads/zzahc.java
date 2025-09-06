package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;

public final class zzahc implements zzax {
    public static final Parcelable.Creator CREATOR;
    public final float zza;
    public final int zzb;

    static {
        zzahc.CREATOR = new zzaha();
    }

    public zzahc(float f, int v) {
        this.zza = f;
        this.zzb = v;
    }

    zzahc(Parcel parcel0, zzahb zzahb0) {
        this.zza = parcel0.readFloat();
        this.zzb = parcel0.readInt();
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
            return zzahc.class == class0 && this.zza == ((zzahc)object0).zza && this.zzb == ((zzahc)object0).zzb;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (this.zza.hashCode() + 0x20F) * 0x1F + this.zzb;
    }

    @Override
    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeFloat(this.zza);
        parcel0.writeInt(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzat0) {
    }
}

