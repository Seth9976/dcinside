package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;

public final class zzdio {
    zzbgx zza;
    zzbgu zzb;
    zzbhk zzc;
    zzbhh zzd;
    zzbmi zze;
    final SimpleArrayMap zzf;
    final SimpleArrayMap zzg;

    public zzdio() {
        this.zzf = new SimpleArrayMap();
        this.zzg = new SimpleArrayMap();
    }

    public final zzdio zza(zzbgu zzbgu0) {
        this.zzb = zzbgu0;
        return this;
    }

    public final zzdio zzb(zzbgx zzbgx0) {
        this.zza = zzbgx0;
        return this;
    }

    public final zzdio zzc(String s, zzbhd zzbhd0, @Nullable zzbha zzbha0) {
        this.zzf.put(s, zzbhd0);
        if(zzbha0 != null) {
            this.zzg.put(s, zzbha0);
        }
        return this;
    }

    public final zzdio zzd(zzbmi zzbmi0) {
        this.zze = zzbmi0;
        return this;
    }

    public final zzdio zze(zzbhh zzbhh0) {
        this.zzd = zzbhh0;
        return this;
    }

    public final zzdio zzf(zzbhk zzbhk0) {
        this.zzc = zzbhk0;
        return this;
    }

    public final zzdiq zzg() {
        return new zzdiq(this, null);
    }
}

