package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdmh {
    private final zzfcj zza;
    private final Executor zzb;
    private final zzdow zzc;
    private final zzdnr zzd;
    private final Context zze;
    private final zzdrw zzf;
    private final zzfja zzg;
    private final zzebk zzh;

    public zzdmh(zzfcj zzfcj0, Executor executor0, zzdow zzdow0, Context context0, zzdrw zzdrw0, zzfja zzfja0, zzebk zzebk0, zzdnr zzdnr0) {
        this.zza = zzfcj0;
        this.zzb = executor0;
        this.zzc = zzdow0;
        this.zze = context0;
        this.zzf = zzdrw0;
        this.zzg = zzfja0;
        this.zzh = zzebk0;
        this.zzd = zzdnr0;
    }

    public final t0 zza(JSONObject jSONObject0) {
        return zzgch.zzn(zzgch.zzn(zzgch.zzh(null), (Object object0) -> {
            zzs zzs0 = zzs.zzc();
            zzcex zzcex0 = this.zzc.zza(zzs0, null, null);
            t0 t00 = zzcaa.zza(zzcex0);
            this.zzh(zzcex0);
            zzcex0.zzN().zzJ(new zzdlz(((zzcaa)t00)));
            zzcex0.loadUrl(((String)zzbe.zzc().zza(zzbcl.zzdR)));
            return t00;
        }, this.zzb), (zzcex zzcex0) -> {
            t0 t00 = zzcaa.zza(zzcex0);
            if(this.zza.zzb == null) {
                zzcex0.zzaj(zzcgr.zze());
            }
            else {
                zzcex0.zzaj(zzcgr.zzd());
            }
            zzcex0.zzN().zzC((boolean z, int v, String s, String s1) -> {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzdZ)).booleanValue()) {
                    if(z) {
                        this.zzi(zzcex0, ((zzcaa)t00));
                        return;
                    }
                    ((zzcaa)t00).zzd(new zzegu(1, "Native Video WebView failed to load. Error code: " + v + ", Description: " + s + ", Failing URL: " + s1));
                    return;
                }
                this.zzi(zzcex0, ((zzcaa)t00));
            });
            zzcex0.zzl("google.afma.nativeAds.renderVideo", jSONObject0);
            return t00;
        }, this.zzb);
    }

    public final t0 zzb(String s, String s1, zzfbo zzfbo0, zzfbr zzfbr0, zzs zzs0) {
        return zzgch.zzn(zzgch.zzh(null), (Object object0) -> {
            zzcex zzcex0 = this.zzc.zza(zzs0, zzfbo0, zzfbr0);
            t0 t00 = zzcaa.zza(zzcex0);
            if(this.zza.zzb == null) {
                zzdno zzdno0 = this.zzd.zzb();
                zzcex0.zzN().zzV(zzdno0, zzdno0, zzdno0, zzdno0, zzdno0, false, null, new zzb(this.zze, null, null), null, null, this.zzh, this.zzg, this.zzf, null, zzdno0, null, null, null, null);
                zzdmh.zzj(zzcex0);
            }
            else {
                this.zzh(zzcex0);
                zzcex0.zzaj(zzcgr.zzd());
            }
            zzcex0.zzN().zzC((boolean z, int v, String s, String s1) -> {
                if(z) {
                    if(this.zza.zza != null && zzcex0.zzq() != null) {
                        zzcex0.zzq().zzs(this.zza.zza);
                    }
                    ((zzcaa)t00).zzb();
                    return;
                }
                ((zzcaa)t00).zzd(new zzegu(1, "Html video Web View failed to load. Error code: " + v + ", Description: " + s + ", Failing URL: " + s1));
            });
            zzcex0.zzae(s, s1, null);
            return t00;
        }, this.zzb);
    }

    // 检测为 Lambda 实现
    final t0 zzc(JSONObject jSONObject0, zzcex zzcex0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzd(zzs zzs0, zzfbo zzfbo0, zzfbr zzfbr0, String s, String s1, Object object0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zze(Object object0) throws Exception [...]

    // 检测为 Lambda 实现
    final void zzf(zzcex zzcex0, zzcaa zzcaa0, boolean z, int v, String s, String s1) [...]

    // 检测为 Lambda 实现
    final void zzg(zzcex zzcex0, zzcaa zzcaa0, boolean z, int v, String s, String s1) [...]

    private final void zzh(zzcex zzcex0) {
        zzdmh.zzj(zzcex0);
        zzcex0.zzag("/video", zzbjo.zzl);
        zzcex0.zzag("/videoMeta", zzbjo.zzm);
        zzcex0.zzag("/precache", new zzcdf());
        zzcex0.zzag("/delayPageLoaded", zzbjo.zzp);
        zzcex0.zzag("/instrument", zzbjo.zzn);
        zzcex0.zzag("/log", zzbjo.zzg);
        zzcex0.zzag("/click", new zzbin(null, null));
        if(this.zza.zzb == null) {
            zzcex0.zzN().zzG(false);
        }
        else {
            zzcex0.zzN().zzG(true);
            zzcex0.zzag("/open", new zzbkb(null, null, null, null, null));
        }
        if(zzv.zzo().zzp(zzcex0.getContext())) {
            Map map0 = new HashMap();
            if(zzcex0.zzD() != null) {
                map0 = zzcex0.zzD().zzaw;
            }
            zzcex0.zzag("/logScionEvent", new zzbjv(zzcex0.getContext(), map0));
        }
    }

    private final void zzi(zzcex zzcex0, zzcaa zzcaa0) {
        if(this.zza.zza != null && zzcex0.zzq() != null) {
            zzcex0.zzq().zzs(this.zza.zza);
        }
        zzcaa0.zzb();
    }

    private static final void zzj(zzcex zzcex0) {
        zzcex0.zzag("/videoClicked", zzbjo.zzh);
        zzcex0.zzN().zzI(true);
        zzcex0.zzag("/getNativeAdViewSignals", zzbjo.zzs);
        zzcex0.zzag("/getNativeClickMeta", zzbjo.zzt);
    }
}

