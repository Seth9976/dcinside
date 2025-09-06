package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzagm extends zzagh {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    static {
        zzagm.CREATOR = new zzagl();
    }

    public zzagm(int v, int v1, int v2, int[] arr_v, int[] arr_v1) {
        super("MLLT");
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = arr_v;
        this.zze = arr_v1;
    }

    zzagm(Parcel parcel0) {
        super("MLLT");
        this.zza = parcel0.readInt();
        this.zzb = parcel0.readInt();
        this.zzc = parcel0.readInt();
        this.zzd = parcel0.createIntArray();
        this.zze = parcel0.createIntArray();
    }

    @Override  // com.google.android.gms.internal.ads.zzagh
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
            return zzagm.class == class0 && this.zza == ((zzagm)object0).zza && this.zzb == ((zzagm)object0).zzb && this.zzc == ((zzagm)object0).zzc && Arrays.equals(this.zzd, ((zzagm)object0).zzd) && Arrays.equals(this.zze, ((zzagm)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzd);
        int v1 = Arrays.hashCode(this.zze);
        return ((((this.zza + 0x20F) * 0x1F + this.zzb) * 0x1F + this.zzc) * 0x1F + v) * 0x1F + v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zza);
        parcel0.writeInt(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeIntArray(this.zzd);
        parcel0.writeIntArray(this.zze);
    }
}

