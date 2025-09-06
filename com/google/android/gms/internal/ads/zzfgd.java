package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzfgd {
    final zzfgf zza;
    private final Object zzb;
    @Nullable
    private final String zzc;
    private final t0 zzd;
    private final List zze;
    private final t0 zzf;

    private zzfgd(zzfgf zzfgf0, Object object0, String s, t0 t00, List list0, t0 t01) {
        this.zza = zzfgf0;
        super();
        this.zzb = object0;
        this.zzc = s;
        this.zzd = t00;
        this.zze = list0;
        this.zzf = t01;
    }

    zzfgd(zzfgf zzfgf0, Object object0, String s, t0 t00, List list0, t0 t01, zzfge zzfge0) {
        this(zzfgf0, object0, null, t00, list0, t01);
    }

    public final zzfft zza() {
        String s = this.zzc == null ? this.zza.zzf(this.zzb) : this.zzc;
        zzfft zzfft0 = new zzfft(this.zzb, s, this.zzf);
        this.zza.zzd.zza(zzfft0);
        zzfgb zzfgb0 = new zzfgb(this, zzfft0);
        this.zzd.addListener(zzfgb0, zzbzw.zzg);
        zzgch.zzr(zzfft0, new zzfgc(this, zzfft0), zzbzw.zzg);
        return zzfft0;
    }

    public final zzfgd zzb(Object object0) {
        zzfft zzfft0 = this.zza();
        return this.zza.zzb(object0, zzfft0);
    }

    public final zzfgd zzc(Class class0, zzgbo zzgbo0) {
        t0 t00 = zzgch.zzf(this.zzf, class0, zzgbo0, this.zza.zzb);
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, t00);
    }

    public final zzfgd zzd(t0 t00) {
        return this.zzg(new zzfga(t00), zzbzw.zzg);
    }

    public final zzfgd zze(zzffr zzffr0) {
        return this.zzf(new zzffz(zzffr0));
    }

    public final zzfgd zzf(zzgbo zzgbo0) {
        return this.zzg(zzgbo0, this.zza.zzb);
    }

    public final zzfgd zzg(zzgbo zzgbo0, Executor executor0) {
        t0 t00 = zzgch.zzn(this.zzf, zzgbo0, executor0);
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, t00);
    }

    public final zzfgd zzh(String s) {
        return new zzfgd(this.zza, this.zzb, s, this.zzd, this.zze, this.zzf);
    }

    public final zzfgd zzi(long v, TimeUnit timeUnit0) {
        ScheduledExecutorService scheduledExecutorService0 = this.zza.zzc;
        t0 t00 = zzgch.zzo(this.zzf, v, timeUnit0, scheduledExecutorService0);
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, t00);
    }
}

