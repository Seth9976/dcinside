package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@KeepForSdk
@Class(creator = "ExperimentTokensCreator")
@Reserved({1})
public class ExperimentTokens extends AbstractSafeParcelable {
    interface zza {
    }

    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    private static final zza zzaa;
    private static final byte[][] zzn;
    private static final ExperimentTokens zzo;
    @Field(id = 2)
    private final String zzp;
    @Field(id = 3)
    private final byte[] zzq;
    @Field(id = 4)
    private final byte[][] zzr;
    @Field(id = 5)
    private final byte[][] zzs;
    @Field(id = 6)
    private final byte[][] zzt;
    @Field(id = 7)
    private final byte[][] zzu;
    @Field(id = 8)
    private final int[] zzv;
    @Field(id = 9)
    private final byte[][] zzw;
    private static final zza zzx;
    private static final zza zzy;
    private static final zza zzz;

    static {
        ExperimentTokens.CREATOR = new zzh();
        byte[][] arr2_b = new byte[0][];
        ExperimentTokens.zzn = arr2_b;
        ExperimentTokens.zzo = new ExperimentTokens("", null, arr2_b, arr2_b, arr2_b, arr2_b, null, null);
        ExperimentTokens.zzx = new zzd();
        ExperimentTokens.zzy = new zze();
        ExperimentTokens.zzz = new zzf();
        ExperimentTokens.zzaa = new zzg();
    }

    @Constructor
    public ExperimentTokens(@Param(id = 2) String s, @Param(id = 3) byte[] arr_b, @Param(id = 4) byte[][] arr2_b, @Param(id = 5) byte[][] arr2_b1, @Param(id = 6) byte[][] arr2_b2, @Param(id = 7) byte[][] arr2_b3, @Param(id = 8) int[] arr_v, @Param(id = 9) byte[][] arr2_b4) {
        this.zzp = s;
        this.zzq = arr_b;
        this.zzr = arr2_b;
        this.zzs = arr2_b1;
        this.zzt = arr2_b2;
        this.zzu = arr2_b3;
        this.zzv = arr_v;
        this.zzw = arr2_b4;
    }

    // 去混淆评级： 中等(90)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof ExperimentTokens && zzn.equals(this.zzp, ((ExperimentTokens)object0).zzp) && Arrays.equals(this.zzq, ((ExperimentTokens)object0).zzq) && zzn.equals(ExperimentTokens.zza(this.zzr), ExperimentTokens.zza(((ExperimentTokens)object0).zzr)) && zzn.equals(ExperimentTokens.zza(this.zzs), ExperimentTokens.zza(((ExperimentTokens)object0).zzs)) && zzn.equals(ExperimentTokens.zza(this.zzt), ExperimentTokens.zza(((ExperimentTokens)object0).zzt)) && zzn.equals(ExperimentTokens.zza(this.zzu), ExperimentTokens.zza(((ExperimentTokens)object0).zzu)) && zzn.equals(ExperimentTokens.zza(this.zzv), ExperimentTokens.zza(((ExperimentTokens)object0).zzv)) && zzn.equals(ExperimentTokens.zza(this.zzw), ExperimentTokens.zza(((ExperimentTokens)object0).zzw));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ExperimentTokens");
        stringBuilder0.append("(");
        stringBuilder0.append((this.zzp == null ? "null" : "\'" + this.zzp + "\'"));
        stringBuilder0.append(", ");
        byte[] arr_b = this.zzq;
        stringBuilder0.append("direct");
        stringBuilder0.append("=");
        if(arr_b == null) {
            stringBuilder0.append("null");
        }
        else {
            stringBuilder0.append("\'");
            stringBuilder0.append(Base64.encodeToString(arr_b, 3));
            stringBuilder0.append("\'");
        }
        stringBuilder0.append(", ");
        ExperimentTokens.zza(stringBuilder0, "GAIA", this.zzr);
        stringBuilder0.append(", ");
        ExperimentTokens.zza(stringBuilder0, "PSEUDO", this.zzs);
        stringBuilder0.append(", ");
        ExperimentTokens.zza(stringBuilder0, "ALWAYS", this.zzt);
        stringBuilder0.append(", ");
        ExperimentTokens.zza(stringBuilder0, "OTHER", this.zzu);
        stringBuilder0.append(", ");
        int[] arr_v = this.zzv;
        stringBuilder0.append("weak");
        stringBuilder0.append("=");
        if(arr_v == null) {
            stringBuilder0.append("null");
        }
        else {
            stringBuilder0.append("(");
            int v = 0;
            for(boolean z = true; v < arr_v.length; z = false) {
                int v1 = arr_v[v];
                if(!z) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(v1);
                ++v;
            }
            stringBuilder0.append(")");
        }
        stringBuilder0.append(", ");
        ExperimentTokens.zza(stringBuilder0, "directs", this.zzw);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zzp, false);
        SafeParcelWriter.writeByteArray(parcel0, 3, this.zzq, false);
        SafeParcelWriter.writeByteArrayArray(parcel0, 4, this.zzr, false);
        SafeParcelWriter.writeByteArrayArray(parcel0, 5, this.zzs, false);
        SafeParcelWriter.writeByteArrayArray(parcel0, 6, this.zzt, false);
        SafeParcelWriter.writeByteArrayArray(parcel0, 7, this.zzu, false);
        SafeParcelWriter.writeIntArray(parcel0, 8, this.zzv, false);
        SafeParcelWriter.writeByteArrayArray(parcel0, 9, this.zzw, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    private static List zza(int[] arr_v) {
        if(arr_v == null) {
            return Collections.emptyList();
        }
        List list0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            list0.add(((int)arr_v[v]));
        }
        Collections.sort(list0);
        return list0;
    }

    private static List zza(byte[][] arr2_b) {
        if(arr2_b == null) {
            return Collections.emptyList();
        }
        List list0 = new ArrayList(arr2_b.length);
        for(int v = 0; v < arr2_b.length; ++v) {
            list0.add(Base64.encodeToString(arr2_b[v], 3));
        }
        Collections.sort(list0);
        return list0;
    }

    private static void zza(StringBuilder stringBuilder0, String s, byte[][] arr2_b) {
        String s1;
        stringBuilder0.append(s);
        stringBuilder0.append("=");
        if(arr2_b == null) {
            s1 = "null";
        }
        else {
            stringBuilder0.append("(");
            int v = 0;
            for(boolean z = true; v < arr2_b.length; z = false) {
                byte[] arr_b = arr2_b[v];
                if(!z) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append("\'");
                stringBuilder0.append(Base64.encodeToString(arr_b, 3));
                stringBuilder0.append("\'");
                ++v;
            }
            s1 = ")";
        }
        stringBuilder0.append(s1);
    }
}

