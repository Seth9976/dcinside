package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

@KeepForSdk
@Class(creator = "ConfigurationCreator")
@Reserved({1})
public class Configuration extends AbstractSafeParcelable implements Comparable {
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    private final int zzc;
    @Field(id = 3)
    private final zzi[] zzd;
    @Field(id = 4)
    private final String[] zze;
    private final Map zzf;

    static {
        Configuration.CREATOR = new zzc();
    }

    @Constructor
    public Configuration(@Param(id = 2) int v, @Param(id = 3) zzi[] arr_zzi, @Param(id = 4) String[] arr_s) {
        this.zzc = v;
        this.zzd = arr_zzi;
        this.zzf = new TreeMap();
        for(int v1 = 0; v1 < arr_zzi.length; ++v1) {
            zzi zzi0 = arr_zzi[v1];
            this.zzf.put(zzi0.name, zzi0);
        }
        this.zze = arr_s;
        if(arr_s != null) {
            Arrays.sort(arr_s);
        }
    }

    @Override
    public int compareTo(Object object0) {
        return this.zzc - ((Configuration)object0).zzc;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Configuration && this.zzc == ((Configuration)object0).zzc && zzn.equals(this.zzf, ((Configuration)object0).zzf) && Arrays.equals(this.zze, ((Configuration)object0).zze);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Configuration(");
        stringBuilder0.append(this.zzc);
        stringBuilder0.append(", ");
        stringBuilder0.append("(");
        for(Object object0: this.zzf.values()) {
            stringBuilder0.append(((zzi)object0));
            stringBuilder0.append(", ");
        }
        stringBuilder0.append(")");
        stringBuilder0.append(", ");
        stringBuilder0.append("(");
        String[] arr_s = this.zze;
        if(arr_s == null) {
            stringBuilder0.append("null");
        }
        else {
            for(int v = 0; v < arr_s.length; ++v) {
                stringBuilder0.append(arr_s[v]);
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(")");
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzc);
        SafeParcelWriter.writeTypedArray(parcel0, 3, this.zzd, v, false);
        SafeParcelWriter.writeStringArray(parcel0, 4, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

