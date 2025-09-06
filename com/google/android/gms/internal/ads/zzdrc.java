package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdrc implements zzcvw, zzcxh, zzcyq, zzdee {
    private final zzdrq zza;
    private final zzdsb zzb;
    private final int zzc;

    zzdrc(zzdrq zzdrq0, zzdsb zzdsb0, int v) {
        this.zza = zzdrq0;
        this.zzb = zzdsb0;
        this.zzc = v;
    }

    private final void zzc(@Nullable Bundle bundle0) {
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                long v = bundle0.getLong(s);
                if(v >= 0L) {
                    this.zza.zzc(s, String.valueOf(v));
                }
            }
        }
    }

    private final void zzd(Bundle bundle0, zzfxn zzfxn0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && bundle0 != null) {
            bundle0.putLong("public-api-callback", zzv.zzC().currentTimeMillis());
            String s = "1";
            if(bundle0.containsKey("ls")) {
                String s1 = bundle0.getBoolean("ls") ? "1" : "0";
                this.zza.zzc("ls", s1);
            }
            int v = zzfxn0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                zzdrf zzdrf0 = (zzdrf)zzfxn0.get(v1);
                long v2 = bundle0.getLong(zzdrf0.zza().zza(), -1L);
                long v3 = bundle0.getLong(zzdrf0.zzb().zza(), -1L);
                if(v2 > 0L && v3 > 0L) {
                    this.zza.zzc(zzdrf0.zzc(), String.valueOf(v3 - v2));
                }
            }
            this.zzc(bundle0.getBundle("client_sig_latency_key"));
            this.zzc(bundle0.getBundle("gms_sig_latency_key"));
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
                if(bundle0.containsKey("sod_h")) {
                    zzdrq zzdrq0 = this.zza;
                    if(!bundle0.getBoolean("sod_h")) {
                        s = "0";
                    }
                    zzdrq0.zzc("sod_h", s);
                }
                if(bundle0.containsKey("cmr")) {
                    String s2 = String.valueOf(bundle0.getInt("cmr"));
                    this.zza.zzc("cmr", s2);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
        this.zza.zze(zzbvk0.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
        this.zza.zzd(zzfca0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zze0.zza));
        this.zza.zzc("ed", zze0.zzc);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgY)).booleanValue()) {
            this.zza.zzc("emsg", zze0.zzb);
        }
        this.zzb.zzg(this.zza.zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable zzbk zzbk0) {
        String s;
        JSONObject jSONObject0;
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            return;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
            this.zza.zzb().put("sgw", String.valueOf(this.zzc));
        }
        if(zzbk0 == null) {
            this.zza.zzb().put("action", "sgs");
            this.zza.zzb().put("request_id", "-1");
            this.zzb.zzg(this.zza.zzb());
            return;
        }
        zzbvk zzbvk0 = zzbk0.zzd;
        Bundle bundle0 = zzbk0.zze;
        if(zzbvk0 != null) {
            this.zzd(zzbvk0.zzm, zzdrf.zza);
        }
        else if(bundle0 != null && !bundle0.isEmpty()) {
            this.zzd(bundle0, zzdrf.zza);
        }
        try {
            jSONObject0 = new JSONObject((TextUtils.isEmpty(zzbk0.zzc) ? zzbk0.zzb : zzbk0.zzc));
        }
        catch(JSONException unused_ex) {
            this.zza.zzb().put("action", "sgf");
            this.zza.zzb().put("sgf_reason", "request_invalid");
            this.zzb.zzg(this.zza.zzb());
            return;
        }
        this.zza.zzb().put("action", "sgs");
        Map map0 = this.zza.zzb();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjz)).booleanValue()) {
            try {
                s = jSONObject0.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                goto label_35;
            }
            catch(JSONException jSONException0) {
            }
            zzo.zzh("Error retrieving JSONObject from the requestJson, ", jSONException0);
        }
        s = "na";
    label_35:
        map0.put("tpc", s);
        zzbvk zzbvk1 = zzbk0.zzd;
        if(zzbvk1 != null) {
            this.zza.zze(zzbvk1.zza);
        }
        this.zzb.zzg(this.zza.zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String s) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            return;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhq)).booleanValue()) {
            this.zza.zzb().put("sgw", String.valueOf(this.zzc));
        }
        this.zza.zzb().put("action", "sgf");
        this.zza.zzc("sgf_reason", s);
        this.zzb.zzg(this.zza.zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zza.zzb().put("action", "loaded");
        this.zzd(this.zza.zza(), zzdrf.zzb);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmw)).booleanValue()) {
            String s = WebViewFeature.a("MUTE_AUDIO") ? "1" : "0";
            this.zza.zzb().put("mafe", s);
        }
        this.zzb.zzg(this.zza.zzb());
    }
}

