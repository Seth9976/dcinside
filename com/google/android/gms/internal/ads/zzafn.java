package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class zzafn implements zzax {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    static {
        zzafn.CREATOR = new zzafm();
    }

    public zzafn(int v, String s, String s1, int v1, int v2, int v3, int v4, byte[] arr_b) {
        this.zza = v;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = v4;
        this.zzh = arr_b;
    }

    zzafn(Parcel parcel0) {
        this.zza = parcel0.readInt();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = parcel0.readInt();
        this.zze = parcel0.readInt();
        this.zzf = parcel0.readInt();
        this.zzg = parcel0.readInt();
        this.zzh = parcel0.createByteArray();
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
            return zzafn.class == class0 && this.zza == ((zzafn)object0).zza && this.zzb.equals(((zzafn)object0).zzb) && this.zzc.equals(((zzafn)object0).zzc) && this.zzd == ((zzafn)object0).zzd && this.zze == ((zzafn)object0).zze && this.zzf == ((zzafn)object0).zzf && this.zzg == ((zzafn)object0).zzg && Arrays.equals(this.zzh, ((zzafn)object0).zzh);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzh);
        return (((((((this.zza + 0x20F) * 0x1F + this.zzb.hashCode()) * 0x1F + this.zzc.hashCode()) * 0x1F + this.zzd) * 0x1F + this.zze) * 0x1F + this.zzf) * 0x1F + this.zzg) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeInt(this.zzd);
        parcel0.writeInt(this.zze);
        parcel0.writeInt(this.zzf);
        parcel0.writeInt(this.zzg);
        parcel0.writeByteArray(this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzat0) {
        zzat0.zza(this.zzh, this.zza);
    }

    public static zzafn zzb(zzdy zzdy0) {
        int v = zzdy0.zzg();
        String s = zzbb.zze(zzdy0.zzB(zzdy0.zzg(), StandardCharsets.US_ASCII));
        String s1 = zzdy0.zzB(zzdy0.zzg(), StandardCharsets.UTF_8);
        int v1 = zzdy0.zzg();
        int v2 = zzdy0.zzg();
        int v3 = zzdy0.zzg();
        int v4 = zzdy0.zzg();
        int v5 = zzdy0.zzg();
        byte[] arr_b = new byte[v5];
        zzdy0.zzH(arr_b, 0, v5);
        return new zzafn(v, s, s1, v1, v2, v3, v4, arr_b);
    }
}

