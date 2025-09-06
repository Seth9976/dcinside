package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Arrays;

public final class zzagd extends zzagh {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    static {
        zzagd.CREATOR = new zzagc();
    }

    zzagd(Parcel parcel0) {
        super("GEOB");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = parcel0.createByteArray();
    }

    public zzagd(String s, String s1, String s2, byte[] arr_b) {
        super("GEOB");
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = arr_b;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzagd.class == class0 && Objects.equals(this.zza, ((zzagd)object0).zza) && Objects.equals(this.zzb, ((zzagd)object0).zzb) && Objects.equals(this.zzc, ((zzagd)object0).zzc) && Arrays.equals(this.zzd, ((zzagd)object0).zzd);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        int v2 = this.zzb == null ? 0 : this.zzb.hashCode();
        String s = this.zzc;
        if(s != null) {
            v = s.hashCode();
        }
        return (((v1 + 0x20F) * 0x1F + v2) * 0x1F + v) * 0x1F + Arrays.hashCode(this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeByteArray(this.zzd);
    }
}

