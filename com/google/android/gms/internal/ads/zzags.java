package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import j..util.Objects;

public final class zzags extends zzagh {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    public final String zza;
    public final String zzb;

    static {
        zzags.CREATOR = new zzagr();
    }

    zzags(Parcel parcel0) {
        super(parcel0.readString());
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
    }

    public zzags(String s, @Nullable String s1, String s2) {
        super(s);
        this.zza = s1;
        this.zzb = s2;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzags.class == class0 && this.zzf.equals(((zzags)object0).zzf) && Objects.equals(this.zza, ((zzags)object0).zza) && Objects.equals(this.zzb, ((zzags)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzf.hashCode();
        int v1 = 0;
        int v2 = this.zza == null ? 0 : this.zza.hashCode();
        String s = this.zzb;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + 0x20F) * 0x1F + v2) * 0x1F + v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zzf);
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
    }
}

