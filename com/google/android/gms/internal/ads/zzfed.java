package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import o3.h;

@Class(creator = "PoolConfigurationCreator")
public final class zzfed extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @h
    public final Context zza;
    public final zzfea zzb;
    @Field(id = 2)
    public final int zzc;
    @Field(id = 3)
    public final int zzd;
    @Field(id = 4)
    public final int zze;
    @Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfea[] zzh;
    @Field(getter = "getFormatInt", id = 1)
    private final int zzi;
    @Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;
    @Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    static {
        zzfed.CREATOR = new zzfee();
    }

    @Constructor
    public zzfed(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) int v2, @Param(id = 4) int v3, @Param(id = 5) String s, @Param(id = 6) int v4, @Param(id = 7) int v5) {
        zzfea[] arr_zzfea = zzfea.values();
        this.zzh = arr_zzfea;
        int[] arr_v = zzfeb.zza();
        this.zzl = arr_v;
        int[] arr_v1 = zzfec.zza();
        this.zzm = arr_v1;
        this.zza = null;
        this.zzi = v;
        this.zzb = arr_zzfea[v];
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = s;
        this.zzj = v4;
        this.zzg = arr_v[v4];
        this.zzk = v5;
        int v6 = arr_v1[v5];
    }

    private zzfed(@h Context context0, zzfea zzfea0, int v, int v1, int v2, String s, String s1, String s2) {
        int v3;
        this.zzh = zzfea.values();
        this.zzl = zzfeb.zza();
        this.zzm = zzfec.zza();
        this.zza = context0;
        this.zzi = zzfea0.ordinal();
        this.zzb = zzfea0;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = s;
        if("oldest".equals(s1)) {
            v3 = 1;
        }
        else if("lru".equals(s1)) {
            v3 = 2;
        }
        else if("lfu".equals(s1)) {
            v3 = 3;
        }
        else {
            v3 = 2;
        }
        this.zzg = v3;
        this.zzj = v3 - 1;
        "onAdClosed".equals(s2);
        this.zzk = 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel0, 4, this.zze);
        SafeParcelWriter.writeString(parcel0, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel0, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel0, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @h
    public static zzfed zza(zzfea zzfea0, Context context0) {
        if(zzfea0 == zzfea.zza) {
            return new zzfed(context0, zzfea0, ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgi)))), ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgo)))), ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgq)))), ((String)zzbe.zzc().zza(zzbcl.zzgs)), ((String)zzbe.zzc().zza(zzbcl.zzgk)), ((String)zzbe.zzc().zza(zzbcl.zzgm)));
        }
        if(zzfea0 == zzfea.zzb) {
            return new zzfed(context0, zzfea0, ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgj)))), ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgp)))), ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgr)))), ((String)zzbe.zzc().zza(zzbcl.zzgt)), ((String)zzbe.zzc().zza(zzbcl.zzgl)), ((String)zzbe.zzc().zza(zzbcl.zzgn)));
        }
        return zzfea0 == zzfea.zzc ? new zzfed(context0, zzfea0, ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgw)))), ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgy)))), ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgz)))), ((String)zzbe.zzc().zza(zzbcl.zzgu)), ((String)zzbe.zzc().zza(zzbcl.zzgv)), ((String)zzbe.zzc().zza(zzbcl.zzgx))) : null;
    }
}

