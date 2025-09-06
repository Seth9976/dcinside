package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "PlayLoggerContextCreator")
@Reserved({1})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    private final String packageName;
    @Field(defaultValue = "true", id = 7)
    private final boolean zzay;
    @Field(id = 10)
    private final int zzaz;
    @Field(id = 3)
    private final int zzi;
    @Field(id = 8)
    public final String zzj;
    @Field(id = 4)
    public final int zzk;
    @Field(id = 5)
    private final String zzl;
    @Field(id = 6)
    private final String zzm;
    @Field(id = 9)
    private final boolean zzn;

    static {
        zzr.CREATOR = new zzs();
    }

    public zzr(String s, int v, int v1, String s1, String s2, String s3, boolean z, zzb zzge$zzv$zzb0) {
        this.packageName = (String)Preconditions.checkNotNull(s);
        this.zzi = v;
        this.zzk = v1;
        this.zzj = s1;
        this.zzl = s2;
        this.zzm = s3;
        this.zzay = !z;
        this.zzn = z;
        this.zzaz = zzge$zzv$zzb0.zzc();
    }

    @Constructor
    public zzr(@Param(id = 2) String s, @Param(id = 3) int v, @Param(id = 4) int v1, @Param(id = 5) String s1, @Param(id = 6) String s2, @Param(id = 7) boolean z, @Param(id = 8) String s3, @Param(id = 9) boolean z1, @Param(id = 10) int v2) {
        this.packageName = s;
        this.zzi = v;
        this.zzk = v1;
        this.zzl = s1;
        this.zzm = s2;
        this.zzay = z;
        this.zzj = s3;
        this.zzn = z1;
        this.zzaz = v2;
    }

    // 去混淆评级： 中等(60)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof zzr && Objects.equal(this.packageName, ((zzr)object0).packageName) && this.zzi == ((zzr)object0).zzi && this.zzk == ((zzr)object0).zzk && Objects.equal(this.zzj, ((zzr)object0).zzj) && Objects.equal(this.zzl, ((zzr)object0).zzl) && Objects.equal(this.zzm, ((zzr)object0).zzm) && this.zzay == ((zzr)object0).zzay && this.zzn == ((zzr)object0).zzn && this.zzaz == ((zzr)object0).zzaz;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.packageName, this.zzi, this.zzk, this.zzj, this.zzl, this.zzm, Boolean.valueOf(this.zzay), Boolean.valueOf(this.zzn), this.zzaz});
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return "PlayLoggerContext[package=" + this.packageName + ',' + "packageVersionCode=" + this.zzi + ',' + "logSource=" + this.zzk + ',' + "logSourceName=" + this.zzj + ',' + "uploadAccount=" + this.zzl + ',' + "loggingId=" + this.zzm + ',' + "logAndroidId=" + this.zzay + ',' + "isAnonymous=" + this.zzn + ',' + "qosTier=" + this.zzaz + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.packageName, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzi);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzk);
        SafeParcelWriter.writeString(parcel0, 5, this.zzl, false);
        SafeParcelWriter.writeString(parcel0, 6, this.zzm, false);
        SafeParcelWriter.writeBoolean(parcel0, 7, this.zzay);
        SafeParcelWriter.writeString(parcel0, 8, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.zzn);
        SafeParcelWriter.writeInt(parcel0, 10, this.zzaz);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

