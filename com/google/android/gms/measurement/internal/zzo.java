package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.List;

@Class(creator = "AppMetadataCreator")
@Reserved({1, 17, 20, 33})
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    @Field(id = 2)
    public final String zza;
    @Field(id = 0x20)
    public final int zzaa;
    @Field(id = 34)
    public final long zzab;
    @Nullable
    @Field(id = 35)
    public final String zzac;
    @Field(defaultValue = "", id = 36)
    public final String zzad;
    @Field(id = 13)
    @Deprecated
    private final long zzae;
    @Nullable
    @Field(id = 24)
    private final String zzaf;
    @Nullable
    @Field(id = 3)
    public final String zzb;
    @Nullable
    @Field(id = 4)
    public final String zzc;
    @Nullable
    @Field(id = 5)
    public final String zzd;
    @Field(id = 6)
    public final long zze;
    @Field(id = 7)
    public final long zzf;
    @Nullable
    @Field(id = 8)
    public final String zzg;
    @Field(defaultValue = "true", id = 9)
    public final boolean zzh;
    @Field(id = 10)
    public final boolean zzi;
    @Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long zzj;
    @Nullable
    @Field(id = 12)
    public final String zzk;
    @Field(id = 14)
    public final long zzl;
    @Field(id = 15)
    public final int zzm;
    @Field(defaultValue = "true", id = 16)
    public final boolean zzn;
    @Field(id = 18)
    public final boolean zzo;
    @Nullable
    @Field(id = 19)
    public final String zzp;
    @Nullable
    @Field(id = 21)
    public final Boolean zzq;
    @Field(id = 22)
    public final long zzr;
    @Nullable
    @Field(id = 23)
    public final List zzs;
    @Field(defaultValue = "", id = 25)
    public final String zzt;
    @Field(defaultValue = "", id = 26)
    public final String zzu;
    @Nullable
    @Field(id = 27)
    public final String zzv;
    @Field(defaultValue = "false", id = 28)
    public final boolean zzw;
    @Field(id = 29)
    public final long zzx;
    @Field(defaultValue = "100", id = 30)
    public final int zzy;
    @Field(defaultValue = "", id = 0x1F)
    public final String zzz;

    static {
        zzo.CREATOR = new zzq();
    }

    zzo(@Nullable String s, @Nullable String s1, @Nullable String s2, long v, @Nullable String s3, long v1, long v2, @Nullable String s4, boolean z, boolean z1, @Nullable String s5, long v3, long v4, int v5, boolean z2, boolean z3, @Nullable String s6, @Nullable Boolean boolean0, long v6, @Nullable List list0, @Nullable String s7, String s8, String s9, @Nullable String s10, boolean z4, long v7, int v8, String s11, int v9, long v10, @Nullable String s12, String s13) {
        Preconditions.checkNotEmpty(s);
        this.zza = s;
        this.zzb = TextUtils.isEmpty(s1) ? null : s1;
        this.zzc = s2;
        this.zzj = v;
        this.zzd = s3;
        this.zze = v1;
        this.zzf = v2;
        this.zzg = s4;
        this.zzh = z;
        this.zzi = z1;
        this.zzk = s5;
        this.zzae = v3;
        this.zzl = v4;
        this.zzm = v5;
        this.zzn = z2;
        this.zzo = z3;
        this.zzp = s6;
        this.zzq = boolean0;
        this.zzr = v6;
        this.zzs = list0;
        this.zzaf = null;
        this.zzt = s8;
        this.zzu = s9;
        this.zzv = s10;
        this.zzw = z4;
        this.zzx = v7;
        this.zzy = v8;
        this.zzz = s11;
        this.zzaa = v9;
        this.zzab = v10;
        this.zzac = s12;
        this.zzad = s13;
    }

    @Constructor
    zzo(@Nullable @Param(id = 2) String s, @Nullable @Param(id = 3) String s1, @Nullable @Param(id = 4) String s2, @Nullable @Param(id = 5) String s3, @Param(id = 6) long v, @Param(id = 7) long v1, @Nullable @Param(id = 8) String s4, @Param(id = 9) boolean z, @Param(id = 10) boolean z1, @Param(id = 11) long v2, @Nullable @Param(id = 12) String s5, @Param(id = 13) long v3, @Param(id = 14) long v4, @Param(id = 15) int v5, @Param(id = 16) boolean z2, @Param(id = 18) boolean z3, @Nullable @Param(id = 19) String s6, @Nullable @Param(id = 21) Boolean boolean0, @Param(id = 22) long v6, @Nullable @Param(id = 23) List list0, @Nullable @Param(id = 24) String s7, @Param(id = 25) String s8, @Param(id = 26) String s9, @Param(id = 27) String s10, @Param(id = 28) boolean z4, @Param(id = 29) long v7, @Param(id = 30) int v8, @Param(id = 0x1F) String s11, @Param(id = 0x20) int v9, @Param(id = 34) long v10, @Nullable @Param(id = 35) String s12, @Param(id = 36) String s13) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzj = v2;
        this.zzd = s3;
        this.zze = v;
        this.zzf = v1;
        this.zzg = s4;
        this.zzh = z;
        this.zzi = z1;
        this.zzk = s5;
        this.zzae = v3;
        this.zzl = v4;
        this.zzm = v5;
        this.zzn = z2;
        this.zzo = z3;
        this.zzp = s6;
        this.zzq = boolean0;
        this.zzr = v6;
        this.zzs = list0;
        this.zzaf = s7;
        this.zzt = s8;
        this.zzu = s9;
        this.zzv = s10;
        this.zzw = z4;
        this.zzx = v7;
        this.zzy = v8;
        this.zzz = s11;
        this.zzaa = v9;
        this.zzab = v10;
        this.zzac = s12;
        this.zzad = s13;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel0, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel0, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel0, 6, this.zze);
        SafeParcelWriter.writeLong(parcel0, 7, this.zzf);
        SafeParcelWriter.writeString(parcel0, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel0, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel0, 11, this.zzj);
        SafeParcelWriter.writeString(parcel0, 12, this.zzk, false);
        SafeParcelWriter.writeLong(parcel0, 13, this.zzae);
        SafeParcelWriter.writeLong(parcel0, 14, this.zzl);
        SafeParcelWriter.writeInt(parcel0, 15, this.zzm);
        SafeParcelWriter.writeBoolean(parcel0, 16, this.zzn);
        SafeParcelWriter.writeBoolean(parcel0, 18, this.zzo);
        SafeParcelWriter.writeString(parcel0, 19, this.zzp, false);
        SafeParcelWriter.writeBooleanObject(parcel0, 21, this.zzq, false);
        SafeParcelWriter.writeLong(parcel0, 22, this.zzr);
        SafeParcelWriter.writeStringList(parcel0, 23, this.zzs, false);
        SafeParcelWriter.writeString(parcel0, 24, this.zzaf, false);
        SafeParcelWriter.writeString(parcel0, 25, this.zzt, false);
        SafeParcelWriter.writeString(parcel0, 26, this.zzu, false);
        SafeParcelWriter.writeString(parcel0, 27, this.zzv, false);
        SafeParcelWriter.writeBoolean(parcel0, 28, this.zzw);
        SafeParcelWriter.writeLong(parcel0, 29, this.zzx);
        SafeParcelWriter.writeInt(parcel0, 30, this.zzy);
        SafeParcelWriter.writeString(parcel0, 0x1F, this.zzz, false);
        SafeParcelWriter.writeInt(parcel0, 0x20, this.zzaa);
        SafeParcelWriter.writeLong(parcel0, 34, this.zzab);
        SafeParcelWriter.writeString(parcel0, 35, this.zzac, false);
        SafeParcelWriter.writeString(parcel0, 36, this.zzad, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

