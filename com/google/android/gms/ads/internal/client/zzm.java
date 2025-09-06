package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.ArrayList;
import java.util.List;

@Class(creator = "AdRequestParcelCreator")
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final int zza;
    @Field(id = 2)
    @Deprecated
    public final long zzb;
    @Field(id = 3)
    public final Bundle zzc;
    @Field(id = 4)
    @Deprecated
    public final int zzd;
    @Field(id = 5)
    public final List zze;
    @Field(id = 6)
    public final boolean zzf;
    @Field(id = 7)
    public final int zzg;
    @Field(id = 8)
    public final boolean zzh;
    @Field(id = 9)
    public final String zzi;
    @Field(id = 10)
    public final zzfx zzj;
    @Field(id = 11)
    public final Location zzk;
    @Field(id = 12)
    public final String zzl;
    @Field(id = 13)
    public final Bundle zzm;
    @Field(id = 14)
    public final Bundle zzn;
    @Field(id = 15)
    public final List zzo;
    @Field(id = 16)
    public final String zzp;
    @Field(id = 17)
    public final String zzq;
    @Field(id = 18)
    @Deprecated
    public final boolean zzr;
    @Nullable
    @Field(id = 19)
    public final zzc zzs;
    @Field(id = 20)
    public final int zzt;
    @Nullable
    @Field(id = 21)
    public final String zzu;
    @Field(id = 22)
    public final List zzv;
    @Field(id = 23)
    public final int zzw;
    @Nullable
    @Field(id = 24)
    public final String zzx;
    @Field(id = 25)
    public final int zzy;
    @Field(id = 26)
    public final long zzz;

    static {
        zzm.CREATOR = new zzo();
    }

    @Constructor
    public zzm(@Param(id = 1) int v, @Param(id = 2) long v1, @Param(id = 3) Bundle bundle0, @Param(id = 4) int v2, @Param(id = 5) List list0, @Param(id = 6) boolean z, @Param(id = 7) int v3, @Param(id = 8) boolean z1, @Param(id = 9) String s, @Param(id = 10) zzfx zzfx0, @Param(id = 11) Location location0, @Param(id = 12) String s1, @Param(id = 13) Bundle bundle1, @Param(id = 14) Bundle bundle2, @Param(id = 15) List list1, @Param(id = 16) String s2, @Param(id = 17) String s3, @Param(id = 18) boolean z2, @Nullable @Param(id = 19) zzc zzc0, @Param(id = 20) int v4, @Nullable @Param(id = 21) String s4, @Param(id = 22) List list2, @Param(id = 23) int v5, @Nullable @Param(id = 24) String s5, @Param(id = 25) int v6, @Param(id = 26) long v7) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = bundle0 == null ? new Bundle() : bundle0;
        this.zzd = v2;
        this.zze = list0;
        this.zzf = z;
        this.zzg = v3;
        this.zzh = z1;
        this.zzi = s;
        this.zzj = zzfx0;
        this.zzk = location0;
        this.zzl = s1;
        this.zzm = bundle1 == null ? new Bundle() : bundle1;
        this.zzn = bundle2;
        this.zzo = list1;
        this.zzp = s2;
        this.zzq = s3;
        this.zzr = z2;
        this.zzs = zzc0;
        this.zzt = v4;
        this.zzu = s4;
        List list3 = list2 == null ? new ArrayList() : list2;
        this.zzv = list3;
        this.zzw = v5;
        this.zzx = s5;
        this.zzy = v6;
        this.zzz = v7;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzm ? this.zza(object0) && this.zzz == ((zzm)object0).zzz : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, Boolean.valueOf(this.zzf), this.zzg, Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeLong(parcel0, 2, this.zzb);
        SafeParcelWriter.writeBundle(parcel0, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzd);
        SafeParcelWriter.writeStringList(parcel0, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel0, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel0, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzh);
        SafeParcelWriter.writeString(parcel0, 9, this.zzi, false);
        SafeParcelWriter.writeParcelable(parcel0, 10, this.zzj, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 11, this.zzk, v, false);
        SafeParcelWriter.writeString(parcel0, 12, this.zzl, false);
        SafeParcelWriter.writeBundle(parcel0, 13, this.zzm, false);
        SafeParcelWriter.writeBundle(parcel0, 14, this.zzn, false);
        SafeParcelWriter.writeStringList(parcel0, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel0, 16, this.zzp, false);
        SafeParcelWriter.writeString(parcel0, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel0, 18, this.zzr);
        SafeParcelWriter.writeParcelable(parcel0, 19, this.zzs, v, false);
        SafeParcelWriter.writeInt(parcel0, 20, this.zzt);
        SafeParcelWriter.writeString(parcel0, 21, this.zzu, false);
        SafeParcelWriter.writeStringList(parcel0, 22, this.zzv, false);
        SafeParcelWriter.writeInt(parcel0, 23, this.zzw);
        SafeParcelWriter.writeString(parcel0, 24, this.zzx, false);
        SafeParcelWriter.writeInt(parcel0, 25, this.zzy);
        SafeParcelWriter.writeLong(parcel0, 26, this.zzz);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    // 去混淆评级： 低(37)
    public final boolean zza(Object object0) {
        if(!(object0 instanceof zzm)) {
            return false;
        }
        zzm zzm0 = (zzm)object0;
        return this.zza == zzm0.zza && this.zzb == zzm0.zzb && zzp.zza(this.zzc, zzm0.zzc) && this.zzd == zzm0.zzd && Objects.equal(this.zze, zzm0.zze) && this.zzf == zzm0.zzf && this.zzg == zzm0.zzg && this.zzh == zzm0.zzh && Objects.equal(this.zzi, zzm0.zzi) && Objects.equal(this.zzj, zzm0.zzj) && Objects.equal(this.zzk, zzm0.zzk) && Objects.equal(this.zzl, zzm0.zzl) && zzp.zza(this.zzm, zzm0.zzm) && zzp.zza(this.zzn, zzm0.zzn) && Objects.equal(this.zzo, zzm0.zzo) && Objects.equal(this.zzp, zzm0.zzp) && Objects.equal(this.zzq, zzm0.zzq) && this.zzr == zzm0.zzr && this.zzt == zzm0.zzt && Objects.equal(this.zzu, zzm0.zzu) && Objects.equal(this.zzv, zzm0.zzv) && this.zzw == zzm0.zzw && Objects.equal(this.zzx, zzm0.zzx) && this.zzy == zzm0.zzy;
    }

    public final boolean zzb() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }
}

