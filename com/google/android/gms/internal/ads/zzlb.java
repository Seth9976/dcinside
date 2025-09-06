package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.List;

final class zzlb {
    public final zzbq zza;
    public final zzug zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    @Nullable
    public final zzib zzf;
    public final boolean zzg;
    public final zzwj zzh;
    public final zzyc zzi;
    public final List zzj;
    public final zzug zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbe zzo;
    public final boolean zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;
    private static final zzug zzu;

    static {
        zzlb.zzu = new zzug(new Object(), -1L);
    }

    public zzlb(zzbq zzbq0, zzug zzug0, long v, long v1, int v2, @Nullable zzib zzib0, boolean z, zzwj zzwj0, zzyc zzyc0, List list0, zzug zzug1, boolean z1, int v3, int v4, zzbe zzbe0, long v5, long v6, long v7, long v8, boolean z2) {
        this.zza = zzbq0;
        this.zzb = zzug0;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = zzib0;
        this.zzg = z;
        this.zzh = zzwj0;
        this.zzi = zzyc0;
        this.zzj = list0;
        this.zzk = zzug1;
        this.zzl = z1;
        this.zzm = v3;
        this.zzn = v4;
        this.zzo = zzbe0;
        this.zzq = v5;
        this.zzr = v6;
        this.zzs = v7;
        this.zzt = v8;
        this.zzp = false;
    }

    @CheckResult
    public final zzlb zza(zzug zzug0) {
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzug0, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlb zzb(zzug zzug0, long v, long v1, long v2, long v3, zzwj zzwj0, zzyc zzyc0, List list0) {
        long v4 = this.zzq;
        long v5 = SystemClock.elapsedRealtime();
        return new zzlb(this.zza, zzug0, v1, v2, this.zze, this.zzf, this.zzg, zzwj0, zzyc0, list0, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, v4, v3, v, v5, false);
    }

    @CheckResult
    public final zzlb zzc(boolean z, int v, int v1) {
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, v, v1, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlb zzd(@Nullable zzib zzib0) {
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzib0, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlb zze(int v) {
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, v, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlb zzf(zzbq zzbq0) {
        return new zzlb(zzbq0, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public static zzlb zzg(zzyc zzyc0) {
        return new zzlb(zzbq.zza, zzlb.zzu, 0x8000000000000001L, 0L, 1, null, false, zzwj.zza, zzyc0, zzfxn.zzn(), zzlb.zzu, false, 1, 0, zzbe.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzug zzh() {
        return zzlb.zzu;
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}

