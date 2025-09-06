package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Arrays;
import java.util.UUID;

public final class zzt implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final UUID zza;
    @Nullable
    public final String zzb;
    public final String zzc;
    @Nullable
    public final byte[] zzd;
    private int zze;

    static {
        zzt.CREATOR = new zzs();
    }

    zzt(Parcel parcel0) {
        this.zza = new UUID(parcel0.readLong(), parcel0.readLong());
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = parcel0.createByteArray();
    }

    public zzt(UUID uUID0, @Nullable String s, String s1, @Nullable byte[] arr_b) {
        uUID0.getClass();
        this.zza = uUID0;
        this.zzb = null;
        this.zzc = zzbb.zze(s1);
        this.zzd = arr_b;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@Nullable Object object0) {
        if(!(object0 instanceof zzt)) {
            return false;
        }
        return object0 == this ? true : Objects.equals(this.zzb, ((zzt)object0).zzb) && Objects.equals(this.zzc, ((zzt)object0).zzc) && Objects.equals(this.zza, ((zzt)object0).zza) && Arrays.equals(this.zzd, ((zzt)object0).zzd);
    }

    @Override
    public final int hashCode() {
        int v = this.zze;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zzd);
            v = ((this.zza.hashCode() * 0x1F + (this.zzb == null ? 0 : this.zzb.hashCode())) * 0x1F + this.zzc.hashCode()) * 0x1F + v1;
            this.zze = v;
        }
        return v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.zza.getMostSignificantBits());
        parcel0.writeLong(this.zza.getLeastSignificantBits());
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeByteArray(this.zzd);
    }
}

