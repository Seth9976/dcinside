package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

public final class zzdiq {
    public static final zzdiq zza;
    @Nullable
    private final zzbgx zzb;
    @Nullable
    private final zzbgu zzc;
    @Nullable
    private final zzbhk zzd;
    @Nullable
    private final zzbhh zze;
    @Nullable
    private final zzbmi zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    static {
        zzdiq.zza = new zzdiq(new zzdio());
    }

    private zzdiq(zzdio zzdio0) {
        this.zzb = zzdio0.zza;
        this.zzc = zzdio0.zzb;
        this.zzd = zzdio0.zzc;
        this.zzg = new SimpleArrayMap(zzdio0.zzf);
        this.zzh = new SimpleArrayMap(zzdio0.zzg);
        this.zze = zzdio0.zzd;
        this.zzf = zzdio0.zze;
    }

    zzdiq(zzdio zzdio0, zzdip zzdip0) {
        this(zzdio0);
    }

    @Nullable
    public final zzbgu zza() {
        return this.zzc;
    }

    @Nullable
    public final zzbgx zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzbha zzc(String s) {
        return (zzbha)this.zzh.get(s);
    }

    @Nullable
    public final zzbhd zzd(@Nullable String s) {
        return s == null ? null : ((zzbhd)this.zzg.get(s));
    }

    @Nullable
    public final zzbhh zze() {
        return this.zze;
    }

    @Nullable
    public final zzbhk zzf() {
        return this.zzd;
    }

    @Nullable
    public final zzbmi zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList0 = new ArrayList(this.zzg.size());
        for(int v = 0; v < this.zzg.size(); ++v) {
            arrayList0.add(((String)this.zzg.g(v)));
        }
        return arrayList0;
    }

    public final ArrayList zzi() {
        ArrayList arrayList0 = new ArrayList();
        if(this.zzd != null) {
            arrayList0.add("6");
        }
        if(this.zzb != null) {
            arrayList0.add("1");
        }
        if(this.zzc != null) {
            arrayList0.add("2");
        }
        if(!this.zzg.isEmpty()) {
            arrayList0.add("3");
        }
        if(this.zzf != null) {
            arrayList0.add("7");
        }
        return arrayList0;
    }
}

