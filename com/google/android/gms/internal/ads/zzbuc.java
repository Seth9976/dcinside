package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
import o3.j;

@Class(creator = "NativeAdLayoutInfoParcelCreator")
@j
public final class zzbuc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(getter = "getAdViewAsBinder", id = 1, type = "android.os.IBinder")
    public final View zza;
    @Field(getter = "getAssetViewMapAsBinder", id = 2, type = "android.os.IBinder")
    public final Map zzb;

    static {
        zzbuc.CREATOR = new zzbud();
    }

    @Constructor
    public zzbuc(@Param(id = 1) IBinder iBinder0, @Param(id = 2) IBinder iBinder1) {
        this.zza = (View)ObjectWrapper.unwrap(Stub.asInterface(iBinder0));
        this.zzb = (Map)ObjectWrapper.unwrap(Stub.asInterface(iBinder1));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeIBinder(parcel0, 1, ObjectWrapper.wrap(this.zza).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 2, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

