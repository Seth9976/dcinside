package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Arrays;

public final class zzafk implements zzax {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzz zzz0 = new zzz();
        zzz0.zzaa("application/id3");
        zzz0.zzag();
        zzz zzz1 = new zzz();
        zzz1.zzaa("application/x-scte35");
        zzz1.zzag();
        zzafk.CREATOR = new zzafj();
    }

    zzafk(Parcel parcel0) {
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readLong();
        this.zzd = parcel0.readLong();
        this.zze = parcel0.createByteArray();
    }

    public zzafk(String s, String s1, long v, long v1, byte[] arr_b) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = arr_b;
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
            return zzafk.class == class0 && this.zzc == ((zzafk)object0).zzc && this.zzd == ((zzafk)object0).zzd && Objects.equals(this.zza, ((zzafk)object0).zza) && Objects.equals(this.zzb, ((zzafk)object0).zzb) && Arrays.equals(this.zze, ((zzafk)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzf;
        if(v == 0) {
            int v1 = 0;
            int v2 = this.zza == null ? 0 : this.zza.hashCode();
            String s = this.zzb;
            if(s != null) {
                v1 = s.hashCode();
            }
            int v3 = Arrays.hashCode(this.zze);
            v = ((((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(this.zzc ^ this.zzc >>> 0x20))) * 0x1F + ((int)(this.zzd ^ this.zzd >>> 0x20))) * 0x1F + v3;
            this.zzf = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeLong(this.zzc);
        parcel0.writeLong(this.zzd);
        parcel0.writeByteArray(this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzat0) {
    }
}

