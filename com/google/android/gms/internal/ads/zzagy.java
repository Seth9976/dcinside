package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;

public final class zzagy implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    public final long zzb;
    public final int zzc;

    static {
        zzagy.CREATOR = new zzagx();
    }

    public zzagy(long v, long v1, int v2) {
        zzcw.zzd(v < v1);
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
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
            return zzagy.class == class0 && this.zza == ((zzagy)object0).zza && this.zzb == ((zzagy)object0).zzb && this.zzc == ((zzagy)object0).zzc;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", this.zza, this.zzb, this.zzc);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.zza);
        parcel0.writeLong(this.zzb);
        parcel0.writeInt(this.zzc);
    }
}

