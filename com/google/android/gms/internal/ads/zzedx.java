package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzedx implements zzecw {
    private final zzcpq zza;
    private final Context zzb;
    private final zzdow zzc;
    private final zzfcj zzd;
    private final Executor zze;
    private final zzfuc zzf;
    private final zzdrq zzg;

    public zzedx(zzcpq zzcpq0, Context context0, Executor executor0, zzdow zzdow0, zzfcj zzfcj0, zzfuc zzfuc0, zzdrq zzdrq0) {
        this.zzb = context0;
        this.zza = zzcpq0;
        this.zze = executor0;
        this.zzc = zzdow0;
        this.zzd = zzfcj0;
        this.zzf = zzfuc0;
        this.zzg = zzdrq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        return zzgch.zzn(zzgch.zzh(null), (Object object0) -> {
            zzdoz zzdoz0;
            zzbcc zzbcc0 = zzbcl.zzcm;
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                long v = zzv.zzC().currentTimeMillis();
                this.zzg.zza().putLong("rendering-webview-creation-start", v);
            }
            zzs zzs0 = zzfcp.zza(this.zzb, zzfbo0.zzu);
            zzcex zzcex0 = this.zzc.zza(zzs0, zzfbo0, zzfca0.zzb.zzb);
            zzcex0.zzac(zzfbo0.zzW);
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !zzfbo0.zzag) {
                View view1 = zzcex0.zzF();
                zzau zzau0 = (zzau)this.zzf.apply(zzfbo0);
                zzdoz0 = new zzdoz(this.zzb, view1, zzau0);
            }
            else {
                View view0 = zzcex0.zzF();
                zzdoz0 = zzcql.zza(this.zzb, view0, zzfbo0);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                long v1 = zzv.zzC().currentTimeMillis();
                this.zzg.zza().putLong("rendering-webview-creation-end", v1);
            }
            zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, null);
            zzcot zzcot0 = new zzcot(zzdoz0, zzcex0, new zzedr(zzcex0), zzfcp.zzb(zzs0));
            zzcon zzcon0 = this.zza.zza(zzcrp0, zzcot0);
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                long v2 = zzv.zzC().currentTimeMillis();
                this.zzg.zza().putLong("rendering-ad-component-creation-end", v2);
            }
            zzcon0.zzh().zzi(zzcex0, false, null, this.zzg.zza());
            zzcwl zzcwl0 = zzcon0.zzc();
            zzeds zzeds0 = new zzeds(zzcex0);
            zzgcs zzgcs0 = zzbzw.zzg;
            zzcwl0.zzo(zzeds0, zzgcs0);
            String s = !((Boolean)zzbe.zzc().zza(zzbcl.zzff)).booleanValue() || !zzcon0.zzi().zze(true) ? zzfbo0.zzs.zza : zzcgi.zzb(zzfbo0.zzs.zza, new String[]{zzcgi.zza(zzfbo0)});
            zzcon0.zzh();
            t0 t00 = zzdov.zzj(zzcex0, zzfbo0.zzs.zzb, s, this.zzg.zza());
            if(zzfbo0.zzM) {
                t00.addListener(new zzedt(zzcex0), this.zze);
            }
            t00.addListener(() -> {
                zzcex0.zzab();
                zzcfz zzcfz0 = zzcex0.zzq();
                zzga zzga0 = this.zzd.zza;
                if(zzga0 != null && zzcfz0 != null) {
                    zzcfz0.zzs(zzga0);
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbr)).booleanValue() && !zzcex0.isAttachedToWindow()) {
                    zzcex0.onPause();
                    zzcex0.zzav(true);
                }
            }, this.zze);
            return zzgch.zzm(t00, new zzedv(zzcon0), zzgcs0);
        }, this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        return zzfbo0.zzs != null && zzfbo0.zzs.zza != null;
    }

    // 检测为 Lambda 实现
    final t0 zzc(zzfca zzfca0, zzfbo zzfbo0, Object object0) throws Exception [...]

    // 检测为 Lambda 实现
    final void zzd(zzcex zzcex0) [...]
}

