package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "AdErrorParcelCreator")
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final int zza;
    @Field(id = 2)
    public final String zzb;
    @Field(id = 3)
    public final String zzc;
    @Nullable
    @Field(id = 4)
    public zze zzd;
    @Nullable
    @Field(id = 5, type = "android.os.IBinder")
    public IBinder zze;

    static {
        zze.CREATOR = new zzf();
    }

    @Constructor
    public zze(@Param(id = 1) int v, @Param(id = 2) String s, @Param(id = 3) String s1, @Nullable @Param(id = 4) zze zze0, @Nullable @Param(id = 5) IBinder iBinder0) {
        this.zza = v;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = zze0;
        this.zze = iBinder0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeString(parcel0, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel0, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zzd, v, false);
        SafeParcelWriter.writeIBinder(parcel0, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final AdError zza() {
        zze zze0 = this.zzd;
        if(zze0 == null) {
            return new AdError(this.zza, this.zzb, this.zzc, null);
        }
        AdError adError0 = new AdError(zze0.zza, zze0.zzb, zze0.zzc);
        return new AdError(this.zza, this.zzb, this.zzc, adError0);
    }

    public final LoadAdError zzb() {
        zzdy zzdy0 = null;
        AdError adError0 = this.zzd == null ? null : new AdError(this.zzd.zza, this.zzd.zzb, this.zzd.zzc);
        int v = this.zza;
        String s = this.zzb;
        String s1 = this.zzc;
        IBinder iBinder0 = this.zze;
        if(iBinder0 != null) {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if(iInterface0 instanceof zzdy) {
                return new LoadAdError(v, s, s1, adError0, ResponseInfo.zza(((zzdy)iInterface0)));
            }
            zzdy0 = new zzdw(iBinder0);
        }
        return new LoadAdError(v, s, s1, adError0, ResponseInfo.zza(zzdy0));
    }
}

