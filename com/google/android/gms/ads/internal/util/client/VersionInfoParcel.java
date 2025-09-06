package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "VersionInfoParcelCreator")
@Reserved({1})
public final class VersionInfoParcel extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    @NonNull
    @Field(id = 2)
    public String afmaVersion;
    @Field(id = 3)
    public int buddyApkVersion;
    @Field(id = 4)
    public int clientJarVersion;
    @Field(id = 5)
    public boolean isClientJar;
    @Field(id = 6)
    public boolean isLiteSdk;

    static {
        VersionInfoParcel.CREATOR = new zzy();
    }

    public VersionInfoParcel(int v, int v1, boolean z) {
        this(v, v1, z, false, false);
    }

    public VersionInfoParcel(int v, int v1, boolean z, boolean z1) {
        this(v, v1, z, false, z1);
    }

    public VersionInfoParcel(int v, int v1, boolean z, boolean z1, boolean z2) {
        String s;
        if(z) {
            s = "0";
        }
        else {
            s = z1 ? "2" : "1";
        }
        this("afma-sdk-a-v" + v + "." + v1 + "." + s, v, v1, z, z2);
    }

    @Constructor
    VersionInfoParcel(@Param(id = 2) String s, @Param(id = 3) int v, @Param(id = 4) int v1, @Param(id = 5) boolean z, @Param(id = 6) boolean z1) {
        this.afmaVersion = s;
        this.buddyApkVersion = v;
        this.clientJarVersion = v1;
        this.isClientJar = z;
        this.isLiteSdk = z1;
    }

    @NonNull
    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.afmaVersion, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.buddyApkVersion);
        SafeParcelWriter.writeInt(parcel0, 4, this.clientJarVersion);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.isClientJar);
        SafeParcelWriter.writeBoolean(parcel0, 6, this.isLiteSdk);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

