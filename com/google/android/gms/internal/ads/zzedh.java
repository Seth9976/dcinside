package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzedh implements zzecw {
    private final zzcoa zza;
    private final Context zzb;
    private final zzdow zzc;
    private final zzfcj zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjs zzg;
    private final boolean zzh;
    private final zzebv zzi;
    private final zzdrq zzj;
    private final zzdrw zzk;

    public zzedh(zzcoa zzcoa0, Context context0, Executor executor0, zzdow zzdow0, zzfcj zzfcj0, VersionInfoParcel versionInfoParcel0, zzbjs zzbjs0, zzebv zzebv0, zzdrq zzdrq0, zzdrw zzdrw0) {
        this.zzb = context0;
        this.zza = zzcoa0;
        this.zze = executor0;
        this.zzc = zzdow0;
        this.zzd = zzfcj0;
        this.zzf = versionInfoParcel0;
        this.zzg = zzbjs0;
        this.zzh = ((Boolean)zzbe.zzc().zza(zzbcl.zziM)).booleanValue();
        this.zzi = zzebv0;
        this.zzj = zzdrq0;
        this.zzk = zzdrw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        zzdpa zzdpa0 = new zzdpa();
        t0 t00 = zzgch.zzn(zzgch.zzh(null), (Object object0) -> {
            zzbcc zzbcc0 = zzbcl.zzcm;
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                long v = zzv.zzC().currentTimeMillis();
                this.zzj.zza().putLong("rendering-webview-creation-start", v);
            }
            zzcex zzcex0 = this.zzc.zza(this.zzd.zze, zzfbo0, zzfca0.zzb.zzb);
            zzcex0.zzac(zzfbo0.zzW);
            View view0 = zzcex0.zzF();
            zzdpa0.zza(this.zzb, view0);
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                long v1 = zzv.zzC().currentTimeMillis();
                this.zzj.zza().putLong("rendering-webview-creation-end", v1);
            }
            zzcab zzcab0 = new zzcab();
            zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, null);
            zzdeu zzdeu0 = new zzdeu(new zzedj(this.zzf, zzcab0, zzfbo0, zzcex0, this.zzd, this.zzh, this.zzg, this.zzi, this.zzk), zzcex0);
            zzcny zzcny0 = new zzcny(zzfbo0.zzaa);
            zzcnx zzcnx0 = this.zza.zza(zzcrp0, zzdeu0, zzcny0);
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                long v2 = zzv.zzC().currentTimeMillis();
                this.zzj.zza().putLong("rendering-ad-component-creation-end", v2);
            }
            zzcnx0.zzh().zzi(zzcex0, false, (this.zzh ? this.zzg : null), this.zzj.zza());
            zzcab0.zzc(zzcnx0);
            zzcnx0.zzc().zzo(new zzedf(zzcex0), zzbzw.zzg);
            String s = !((Boolean)zzbe.zzc().zza(zzbcl.zzff)).booleanValue() || !zzcnx0.zzi().zze(true) ? zzfbo0.zzs.zza : zzcgi.zzb(zzfbo0.zzs.zza, new String[]{zzcgi.zza(zzfbo0)});
            zzcnx0.zzh();
            return zzgch.zzm(zzdov.zzj(zzcex0, zzfbo0.zzs.zzb, s, this.zzj.zza()), new zzedg(this, zzcex0, zzfbo0, zzcnx0), this.zze);
        }, this.zze);
        t00.addListener(new zzede(zzdpa0), this.zze);
        return t00;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        return zzfbo0.zzs != null && zzfbo0.zzs.zza != null;
    }

    // 检测为 Lambda 实现
    final t0 zzc(zzfbo zzfbo0, zzfca zzfca0, zzdpa zzdpa0, Object object0) throws Exception [...]
}

