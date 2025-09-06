package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class zzcsd {
    private final zzdxl zza;
    private final zzfcj zzb;
    private final zzfgn zzc;
    private final zzcky zzd;
    private final zzegx zze;
    private final zzdba zzf;
    @Nullable
    private zzfca zzg;
    private final zzdyt zzh;
    private final zzcuw zzi;
    private final Executor zzj;
    private final zzdye zzk;
    private final zzedb zzl;

    zzcsd(zzdxl zzdxl0, zzfcj zzfcj0, zzfgn zzfgn0, zzcky zzcky0, zzegx zzegx0, zzdba zzdba0, @Nullable zzfca zzfca0, zzdyt zzdyt0, zzcuw zzcuw0, Executor executor0, zzdye zzdye0, zzedb zzedb0) {
        this.zza = zzdxl0;
        this.zzb = zzfcj0;
        this.zzc = zzfgn0;
        this.zzd = zzcky0;
        this.zze = zzegx0;
        this.zzf = zzdba0;
        this.zzg = zzfca0;
        this.zzh = zzdyt0;
        this.zzi = zzcuw0;
        this.zzj = executor0;
        this.zzk = zzdye0;
        this.zzl = zzedb0;
    }

    public final zze zza(Throwable throwable0) {
        return zzfdk.zzb(throwable0, this.zzl);
    }

    public final zzdba zzc() {
        return this.zzf;
    }

    final zzfca zzd(zzfca zzfca0) throws Exception {
        this.zzd.zza(zzfca0);
        return zzfca0;
    }

    public final t0 zze(zzfed zzfed0) {
        t0 t00 = this.zzi.zzc();
        t0 t01 = this.zzc.zzb(zzfgh.zzx, t00).zzf((zzbvk zzbvk0) -> {
            zzbvk0.zzi = zzfed0;
            return this.zzh.zza(zzbvk0);
        }).zza();
        zzgch.zzr(t01, new zzcsb(this), this.zzj);
        return t01;
    }

    // 检测为 Lambda 实现
    final t0 zzf(zzfed zzfed0, zzbvk zzbvk0) throws Exception [...]

    public final t0 zzg(zzbvk zzbvk0) {
        t0 t00 = this.zzh.zzf(zzbvk0);
        t0 t01 = this.zzc.zzb(zzfgh.zzy, t00).zza();
        zzgch.zzr(t01, new zzcsc(this), this.zzj);
        return t01;
    }

    public final t0 zzh(t0 t00) {
        zzfgd zzfgd0 = this.zzc.zzb(zzfgh.zzd, t00).zze(new zzcry(this)).zzf(this.zze);
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzfx)).booleanValue()) {
            zzfgd0 = zzfgd0.zzi(((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfy)))))), TimeUnit.SECONDS);
        }
        return zzfgd0.zza();
    }

    public final t0 zzi() {
        zzm zzm0 = this.zzb.zzd;
        return zzm0.zzx == null && zzm0.zzs == null ? this.zzj(this.zzi.zzc()) : zzffx.zzc(this.zza.zza(), zzfgh.zzA, this.zzc).zza();
    }

    public final t0 zzj(t0 t00) {
        zzfca zzfca0 = this.zzg;
        if(zzfca0 != null) {
            return zzffx.zzc(zzgch.zzh(zzfca0), zzfgh.zzc, this.zzc).zza();
        }
        zzv.zzc().zzj();
        zzfgd zzfgd0 = this.zzc.zzb(zzfgh.zzc, t00);
        Objects.requireNonNull(this.zzk);
        return zzfgd0.zzf(new zzcsa(this.zzk)).zza();
    }

    public final void zzk(zzfca zzfca0) {
        this.zzg = zzfca0;
    }
}

