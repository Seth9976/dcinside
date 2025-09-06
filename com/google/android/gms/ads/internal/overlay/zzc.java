package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;

@Class(creator = "AdLauncherIntentInfoCreator")
@Reserved({1})
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final String zzb;
    @Field(id = 4)
    public final String zzc;
    @Field(id = 5)
    public final String zzd;
    @Field(id = 6)
    public final String zze;
    @Field(id = 7)
    public final String zzf;
    @Field(id = 8)
    public final String zzg;
    @Field(id = 9)
    public final Intent zzh;
    @Field(getter = "getLaunchIntentListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzaa zzi;
    @Field(id = 11)
    public final boolean zzj;

    static {
        zzc.CREATOR = new zzb();
    }

    public zzc(Intent intent0, zzaa zzaa0) {
        this(null, null, null, null, null, null, null, intent0, ObjectWrapper.wrap(zzaa0).asBinder(), false);
    }

    @Constructor
    public zzc(@Param(id = 2) String s, @Param(id = 3) String s1, @Param(id = 4) String s2, @Param(id = 5) String s3, @Param(id = 6) String s4, @Param(id = 7) String s5, @Param(id = 8) String s6, @Param(id = 9) Intent intent0, @Param(id = 10) IBinder iBinder0, @Param(id = 11) boolean z) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = s3;
        this.zze = s4;
        this.zzf = s5;
        this.zzg = s6;
        this.zzh = intent0;
        this.zzi = (zzaa)ObjectWrapper.unwrap(Stub.asInterface(iBinder0));
        this.zzj = z;
    }

    public zzc(String s, String s1, String s2, String s3, String s4, String s5, String s6, zzaa zzaa0) {
        this(s, s1, s2, s3, s4, s5, s6, null, ObjectWrapper.wrap(zzaa0).asBinder(), false);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel0, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel0, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel0, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel0, 8, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel0, 9, this.zzh, v, false);
        SafeParcelWriter.writeIBinder(parcel0, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel0, 11, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

