package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class zzu implements Parcelable, Comparator {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    public final String zza;
    public final int zzb;
    private final zzt[] zzc;
    private int zzd;

    static {
        zzu.CREATOR = new zzr();
    }

    zzu(Parcel parcel0) {
        this.zza = parcel0.readString();
        zzt[] arr_zzt = (zzt[])parcel0.createTypedArray(zzt.CREATOR);
        this.zzc = arr_zzt;
        this.zzb = arr_zzt.length;
    }

    private zzu(@Nullable String s, boolean z, zzt[] arr_zzt) {
        this.zza = s;
        if(z) {
            arr_zzt = (zzt[])arr_zzt.clone();
        }
        this.zzc = arr_zzt;
        this.zzb = arr_zzt.length;
        Arrays.sort(arr_zzt, this);
    }

    public zzu(@Nullable String s, zzt[] arr_zzt) {
        this(null, true, arr_zzt);
    }

    public zzu(List list0) {
        this(null, false, ((zzt[])list0.toArray(new zzt[0])));
    }

    @Override
    public final int compare(Object object0, Object object1) {
        UUID uUID0 = zzh.zza;
        if(uUID0.equals(((zzt)object0).zza)) {
            return uUID0.equals(((zzt)object1).zza) ? 0 : 1;
        }
        return ((zzt)object0).zza.compareTo(((zzt)object1).zza);
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
            return zzu.class == class0 && Objects.equals(this.zza, ((zzu)object0).zza) && Arrays.equals(this.zzc, ((zzu)object0).zzc);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzd;
        if(v == 0) {
            v = (this.zza == null ? 0 : this.zza.hashCode()) * 0x1F + Arrays.hashCode(this.zzc);
            this.zzd = v;
        }
        return v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeTypedArray(this.zzc, 0);
    }

    public final zzt zza(int v) {
        return this.zzc[v];
    }

    // 去混淆评级： 低(20)
    @CheckResult
    public final zzu zzb(@Nullable String s) {
        return Objects.equals(this.zza, s) ? this : new zzu(s, false, this.zzc);
    }
}

