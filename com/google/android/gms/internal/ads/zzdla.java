package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import j..util.Optional;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class zzdla {
    private final zzgcs zza;
    private final zzdlp zzb;
    private final zzdlu zzc;

    public zzdla(zzgcs zzgcs0, zzdlp zzdlp0, zzdlu zzdlu0) {
        this.zza = zzgcs0;
        this.zzb = zzdlp0;
        this.zzc = zzdlu0;
    }

    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0, JSONObject jSONObject0) {
        t0 t09;
        t0 t07;
        zzdkv zzdkv0 = new zzdkv(this, zzfca0, zzfbo0, jSONObject0);
        t0 t00 = this.zza.zzb(zzdkv0);
        t0 t01 = this.zzb.zzf(jSONObject0, "images");
        t0 t02 = this.zzb.zzg(jSONObject0, "images", zzfbo0, zzfca0.zzb.zzb);
        t0 t03 = this.zzb.zze(jSONObject0, "secondary_image");
        t0 t04 = this.zzb.zze(jSONObject0, "app_icon");
        t0 t05 = this.zzb.zzd(jSONObject0, "attribution");
        t0 t06 = this.zzb.zzh(jSONObject0, zzfbo0, zzfca0.zzb.zzb);
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzmO)).booleanValue() || ((int)(((Integer)Optional.ofNullable(jSONObject0.optJSONObject("video")).map(new zzdkw()).map(new zzdkx()).map(new zzdky()).orElse(0)))) != 3) {
            t07 = zzgch.zzh(new Bundle());
        }
        else {
            zzcab zzcab0 = new zzcab();
            zzgch.zzr(t06, new zzdlo(this.zzb, zzcab0), zzbzw.zzf);
            t07 = zzcab0;
        }
        t0 t08 = this.zzc.zza(jSONObject0, "custom_assets");
        zzdlp zzdlp0 = this.zzb;
        if(jSONObject0.optBoolean("enable_omid")) {
            JSONObject jSONObject1 = jSONObject0.optJSONObject("omid_settings");
            if(jSONObject1 == null) {
                t09 = zzgch.zzh(null);
            }
            else {
                String s = jSONObject1.optString("omid_html");
                t09 = TextUtils.isEmpty(s) ? zzgch.zzh(null) : zzgch.zzn(zzgch.zzh(null), new zzdle(zzdlp0, s), zzbzw.zzf);
            }
        }
        else {
            t09 = zzgch.zzh(null);
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(t00);
        arrayList0.add(t01);
        arrayList0.add(t02);
        arrayList0.add(t03);
        arrayList0.add(t04);
        arrayList0.add(t05);
        arrayList0.add(t06);
        arrayList0.add(t07);
        arrayList0.add(t08);
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzfl)).booleanValue() || zzdla.zzc(jSONObject0)) {
            arrayList0.add(t09);
        }
        return zzgch.zza(arrayList0).zza(() -> {
            zzdif zzdif0 = (zzdif)t00.get();
            zzdif0.zzP(((List)t01.get()));
            zzdif0.zzM(((zzbfw)t04.get()));
            zzdif0.zzQ(((zzbfw)t03.get()));
            zzdif0.zzJ(((zzbfp)t05.get()));
            zzdif0.zzS(zzdlp.zzj(jSONObject0));
            zzdif0.zzL(zzdlp.zzi(jSONObject0));
            zzcex zzcex0 = (zzcex)t06.get();
            if(zzcex0 != null) {
                zzdif0.zzad(zzcex0);
                zzdif0.zzac(zzcex0.zzF());
                zzdif0.zzab(zzcex0.zzq());
            }
            zzdif0.zzd().putAll(((Bundle)t07.get()));
            zzcex zzcex1 = (zzcex)t02.get();
            if(zzcex1 != null) {
                zzdif0.zzO(zzcex1);
                zzdif0.zzae(zzcex1.zzF());
            }
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzfl)).booleanValue() || zzdla.zzc(jSONObject0)) {
                zzcex zzcex2 = (zzcex)t09.get();
                if(zzcex2 != null) {
                    zzdif0.zzT(zzcex2);
                }
            }
            else {
                zzdif0.zzU(t09);
                zzdif0.zzX(new zzcab());
            }
            for(Object object0: ((List)t08.get())) {
                zzdlt zzdlt0 = (zzdlt)object0;
                if(zzdlt0.zza == 1) {
                    zzdif0.zzZ(zzdlt0.zzb, zzdlt0.zzc);
                }
                else {
                    zzdif0.zzN(zzdlt0.zzb, zzdlt0.zzd);
                }
            }
            return zzdif0;
        }, this.zza);
    }

    // 检测为 Lambda 实现
    static final zzdif zzb(t0 t00, t0 t01, t0 t02, t0 t03, t0 t04, JSONObject jSONObject0, t0 t05, t0 t06, t0 t07, t0 t08, t0 t09) throws Exception [...]

    private static final boolean zzc(JSONObject jSONObject0) {
        return jSONObject0.optInt("template_id") == 3;
    }
}

