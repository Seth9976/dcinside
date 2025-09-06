package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzefq implements zzefk {
    private final zzdgq zza;
    private final zzgcs zzb;
    private final zzdla zzc;
    private final zzfdi zzd;
    private final zzdnr zze;
    private final zzdrq zzf;

    public zzefq(zzdgq zzdgq0, zzgcs zzgcs0, zzdla zzdla0, zzfdi zzfdi0, zzdnr zzdnr0, zzdrq zzdrq0) {
        this.zza = zzdgq0;
        this.zzb = zzgcs0;
        this.zzc = zzdla0;
        this.zzd = zzfdi0;
        this.zze = zzdnr0;
        this.zzf = zzdrq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        return zzgch.zzn(zzgch.zzn(this.zzd.zza(), (zzdnl zzdnl0) -> {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("isNonagon", true);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zziA)).booleanValue()) {
                jSONObject0.put("skipDeepLinkValidation", true);
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("response", zzfbo0.zzs.zzc);
            jSONObject1.put("sdk_params", jSONObject0);
            return zzgch.zzn(zzdnl0.zzg("google.afma.nativeAds.preProcessJson", jSONObject1), (JSONObject jSONObject0) -> {
                t0 t00 = zzgch.zzh(zzdnl0);
                this.zzd.zzb(t00);
                if(!jSONObject0.optBoolean("success")) {
                    throw new zzbnv("process json failed");
                }
                return zzgch.zzh(jSONObject0.getJSONObject("json").getJSONArray("ads"));
            }, this.zzb);
        }, this.zzb), (JSONArray jSONArray0) -> {
            if(jSONArray0.length() == 0) {
                return zzgch.zzg(new zzdvy(3));
            }
            if(zzfca0.zza.zza.zzk > 1) {
                int v1 = jSONArray0.length();
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzcn)).booleanValue()) {
                    this.zzf.zzc("nsl", String.valueOf(v1));
                }
                this.zzd.zzc(Math.min(v1, zzfca0.zza.zza.zzk));
                ArrayList arrayList0 = new ArrayList(zzfca0.zza.zza.zzk);
                for(int v = 0; v < zzfca0.zza.zza.zzk; ++v) {
                    if(v < v1) {
                        arrayList0.add(this.zzg(zzfca0, zzfbo0, jSONArray0.getJSONObject(v)));
                    }
                    else {
                        arrayList0.add(zzgch.zzg(new zzdvy(3)));
                    }
                }
                return zzgch.zzh(arrayList0);
            }
            return zzgch.zzm(this.zzg(zzfca0, zzfbo0, jSONArray0.getJSONObject(0)), new zzefp(), this.zzb);
        }, this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        return zzfbo0.zzs != null && zzfbo0.zzs.zzc != null;
    }

    // 检测为 Lambda 实现
    final zzdia zzc(t0 t00, t0 t01, zzfca zzfca0, zzfbo zzfbo0, JSONObject jSONObject0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzd(zzdnl zzdnl0, JSONObject jSONObject0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zze(zzfbo zzfbo0, zzdnl zzdnl0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzf(zzfca zzfca0, zzfbo zzfbo0, JSONArray jSONArray0) throws Exception [...]

    private final t0 zzg(zzfca zzfca0, zzfbo zzfbo0, JSONObject jSONObject0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            long v = zzv.zzC().currentTimeMillis();
            this.zzf.zza().putLong("rendering-webview-creation-start", v);
        }
        t0 t00 = this.zzd.zza();
        t0 t01 = this.zzc.zza(zzfca0, zzfbo0, jSONObject0);
        return zzgch.zzc(new t0[]{t00, t01}).zza(() -> {
            zzdif zzdif0 = (zzdif)t01.get();
            zzdnl zzdnl0 = (zzdnl)t00.get();
            zzbcc zzbcc0 = zzbcl.zzcm;
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                long v = zzv.zzC().currentTimeMillis();
                this.zzf.zza().putLong("rendering-webview-creation-end", v);
            }
            zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, null);
            zzdir zzdir0 = new zzdir(zzdif0);
            zzdhd zzdhd0 = new zzdhd(jSONObject0, zzdnl0);
            zzdig zzdig0 = this.zza.zzd(zzcrp0, zzdir0, zzdhd0);
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                long v1 = zzv.zzC().currentTimeMillis();
                this.zzf.zza().putLong("rendering-ad-component-creation-end", v1);
                this.zzf.zza().putLong("rendering-configure-webview-start", v1);
            }
            zzdig0.zzh().zzb();
            zzdig0.zzi().zza(zzdnl0);
            zzdig0.zzg().zza(zzdif0.zzs());
            zzdnq zzdnq0 = zzdig0.zzl();
            zzcex zzcex0 = zzdif0.zzq();
            zzdnq0.zza(this.zze, zzcex0);
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                long v2 = zzv.zzC().currentTimeMillis();
                this.zzf.zza().putLong("rendering-configure-webview-end", v2);
            }
            return zzdig0.zza();
        }, this.zzb);
    }
}

