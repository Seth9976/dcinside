package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.List;

public final class zzevx {
    private final zzbvk zza;
    private final int zzb;

    public zzevx(zzbvk zzbvk0, int v) {
        this.zza = zzbvk0;
        this.zzb = v;
    }

    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return zzfve.zzc(this.zza.zza.getString("ms"));
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    final boolean zzg() {
        return this.zza.zzl;
    }

    final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    final boolean zzi() {
        return this.zza.zzk;
    }
}

