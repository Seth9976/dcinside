package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import j..util.Objects;

public final class zzafr implements zzax {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final String zzc;
    @Nullable
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    static {
        zzafr.CREATOR = new zzafq();
    }

    public zzafr(int v, @Nullable String s, @Nullable String s1, @Nullable String s2, boolean z, int v1) {
        zzcw.zzd(v1 == -1 || v1 > 0);
        this.zza = v;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = s2;
        this.zze = z;
        this.zzf = v1;
    }

    zzafr(Parcel parcel0) {
        this.zza = parcel0.readInt();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = parcel0.readString();
        this.zze = parcel0.readInt() != 0;
        this.zzf = parcel0.readInt();
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
            return zzafr.class == class0 && this.zza == ((zzafr)object0).zza && Objects.equals(this.zzb, ((zzafr)object0).zzb) && Objects.equals(this.zzc, ((zzafr)object0).zzc) && Objects.equals(this.zzd, ((zzafr)object0).zzd) && this.zze == ((zzafr)object0).zze && this.zzf == ((zzafr)object0).zzf;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zzb == null ? 0 : this.zzb.hashCode();
        int v2 = this.zza;
        int v3 = this.zzc == null ? 0 : this.zzc.hashCode();
        String s = this.zzd;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((v2 + 0x20F) * 0x1F + v1) * 0x1F + v3) * 0x1F + v) * 0x1F + this.zze) * 0x1F + this.zzf;
    }

    @Override
    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeString(this.zzd);
        parcel0.writeInt(((int)this.zze));
        parcel0.writeInt(this.zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzat0) {
        String s = this.zzc;
        if(s != null) {
            zzat0.zzp(s);
        }
        String s1 = this.zzb;
        if(s1 != null) {
            zzat0.zzi(s1);
        }
    }
}

