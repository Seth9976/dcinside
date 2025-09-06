package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

public final class zzcvc {
    private final Context zza;
    private final zzfcj zzb;
    private final Bundle zzc;
    @Nullable
    private final zzfcb zzd;
    @Nullable
    private final zzcut zze;
    @Nullable
    private final zzedb zzf;
    private final int zzg;

    zzcvc(zzcva zzcva0, zzcvb zzcvb0) {
        this.zza = zzcva0.zza;
        this.zzb = zzcva0.zzb;
        this.zzc = zzcva0.zzc;
        this.zzd = zzcva0.zzd;
        this.zze = zzcva0.zze;
        this.zzf = zzcva0.zzf;
        this.zzg = zzcva0.zzg;
    }

    final int zza() {
        return this.zzg;
    }

    final Context zzb(Context context0) {
        return this.zza;
    }

    @Nullable
    final Bundle zzc() {
        return this.zzc;
    }

    @Nullable
    final zzcut zzd() {
        return this.zze;
    }

    final zzcva zze() {
        zzcva zzcva0 = new zzcva();
        zzcva0.zzf(this.zza);
        zzcva0.zzk(this.zzb);
        zzcva0.zzg(this.zzc);
        zzcva0.zzh(this.zze);
        zzcva0.zze(this.zzf);
        return zzcva0;
    }

    final zzedb zzf(String s) {
        return this.zzf == null ? new zzedb(s) : this.zzf;
    }

    @Nullable
    final zzfcb zzg() {
        return this.zzd;
    }

    final zzfcj zzh() {
        return this.zzb;
    }
}

