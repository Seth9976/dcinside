package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public final class zzay implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    private final zzax[] zzb;

    static {
        zzay.CREATOR = new zzaw();
    }

    public zzay(long v, zzax[] arr_zzax) {
        this.zza = v;
        this.zzb = arr_zzax;
    }

    zzay(Parcel parcel0) {
        this.zzb = new zzax[parcel0.readInt()];
        for(int v = 0; true; ++v) {
            zzax[] arr_zzax = this.zzb;
            if(v >= arr_zzax.length) {
                break;
            }
            arr_zzax[v] = (zzax)parcel0.readParcelable(zzax.class.getClassLoader());
        }
        this.zza = parcel0.readLong();
    }

    public zzay(List list0) {
        this(0x8000000000000001L, ((zzax[])list0.toArray(new zzax[0])));
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
            return zzay.class == class0 && Arrays.equals(this.zzb, ((zzay)object0).zzb) && this.zza == ((zzay)object0).zza;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zzb) * 0x1F + ((int)(this.zza ^ this.zza >>> 0x20));
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.zzb);
        return Long.compare(this.zza, 0x8000000000000001L) == 0 ? "entries=" + s + "" : "entries=" + s + (", presentationTimeUs=" + this.zza);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zzb.length);
        zzax[] arr_zzax = this.zzb;
        for(int v1 = 0; v1 < arr_zzax.length; ++v1) {
            parcel0.writeParcelable(arr_zzax[v1], 0);
        }
        parcel0.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzax zzb(int v) {
        return this.zzb[v];
    }

    public final zzay zzc(zzax[] arr_zzax) {
        if(arr_zzax.length == 0) {
            return this;
        }
        Object[] arr_object = Arrays.copyOf(this.zzb, this.zzb.length + arr_zzax.length);
        System.arraycopy(arr_zzax, 0, arr_object, this.zzb.length, arr_zzax.length);
        return new zzay(this.zza, ((zzax[])arr_object));
    }

    public final zzay zzd(@Nullable zzay zzay0) {
        return zzay0 == null ? this : this.zzc(zzay0.zzb);
    }
}

