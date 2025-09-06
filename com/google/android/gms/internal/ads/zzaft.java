package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Arrays;

public final class zzaft extends zzagh {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    static {
        zzaft.CREATOR = new zzafs();
    }

    zzaft(Parcel parcel0) {
        super("APIC");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readInt();
        this.zzd = parcel0.createByteArray();
    }

    public zzaft(String s, @Nullable String s1, int v, byte[] arr_b) {
        super("APIC");
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = arr_b;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaft.class == class0 && this.zzc == ((zzaft)object0).zzc && Objects.equals(this.zza, ((zzaft)object0).zza) && Objects.equals(this.zzb, ((zzaft)object0).zzb) && Arrays.equals(this.zzd, ((zzaft)object0).zzd);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        int v2 = this.zzc;
        String s = this.zzb;
        if(s != null) {
            v = s.hashCode();
        }
        return (((v2 + 0x20F) * 0x1F + v1) * 0x1F + v) * 0x1F + Arrays.hashCode(this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeByteArray(this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzagh
    public final void zza(zzat zzat0) {
        zzat0.zza(this.zzd, this.zzc);
    }
}

