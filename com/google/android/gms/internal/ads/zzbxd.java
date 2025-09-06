package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import o3.j;

@Class(creator = "ServerSideVerificationOptionsParcelCreator")
@j
public final class zzbxd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final String zza;
    @Field(id = 2)
    public final String zzb;

    static {
        zzbxd.CREATOR = new zzbxe();
    }

    public zzbxd(ServerSideVerificationOptions serverSideVerificationOptions0) {
        this(serverSideVerificationOptions0.getUserId(), serverSideVerificationOptions0.getCustomData());
    }

    @Constructor
    public zzbxd(@Param(id = 1) String s, @Param(id = 2) String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel0, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

