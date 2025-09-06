package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzfma {
    private final String zza;
    private zzfnc zzb;
    private long zzc;
    private int zzd;

    public zzfma(String s) {
        this.zzb();
        this.zza = s;
        this.zzb = new zzfnc(null);
    }

    public final WebView zza() {
        return (WebView)this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String s, long v) {
        if(v >= this.zzc && this.zzd != 3) {
            this.zzd = 3;
            zzflr.zza().zzh(this.zza(), this.zza, s);
        }
    }

    public final void zze() {
        zzflr.zza().zzc(this.zza(), this.zza);
    }

    public final void zzf(zzfkq zzfkq0) {
        WebView webView0 = this.zza();
        JSONObject jSONObject0 = zzfkq0.zzb();
        zzflr.zza().zzd(webView0, this.zza, jSONObject0);
    }

    public final void zzg(@NonNull Date date0) {
        if(date0 == null) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        zzfmg.zze(jSONObject0, "timestamp", date0.getTime());
        zzflr.zza().zzf(this.zza(), jSONObject0);
    }

    public final void zzh(String s, long v) {
        if(v >= this.zzc) {
            this.zzd = 2;
            zzflr.zza().zzh(this.zza(), this.zza, s);
        }
    }

    public void zzi(zzfkt zzfkt0, zzfkr zzfkr0) {
        this.zzj(zzfkt0, zzfkr0, null);
    }

    protected final void zzj(zzfkt zzfkt0, zzfkr zzfkr0, JSONObject jSONObject0) {
        String s = zzfkt0.zzh();
        JSONObject jSONObject1 = new JSONObject();
        zzfmg.zze(jSONObject1, "environment", "app");
        zzfmg.zze(jSONObject1, "adSessionType", zzfkr0.zzd());
        JSONObject jSONObject2 = new JSONObject();
        zzfmg.zze(jSONObject2, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfmg.zze(jSONObject2, "osVersion", "33");
        zzfmg.zze(jSONObject2, "os", "Android");
        zzfmg.zze(jSONObject1, "deviceInfo", jSONObject2);
        zzfmg.zze(jSONObject1, "deviceCategory", "other");
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put("clid");
        jSONArray0.put("vlid");
        zzfmg.zze(jSONObject1, "supports", jSONArray0);
        JSONObject jSONObject3 = new JSONObject();
        zzfmg.zze(jSONObject3, "partnerName", zzfkr0.zze().zzb());
        zzfmg.zze(jSONObject3, "partnerVersion", zzfkr0.zze().zzc());
        zzfmg.zze(jSONObject1, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        zzfmg.zze(jSONObject4, "libraryVersion", "1.5.2-google_20241009");
        zzfmg.zze(jSONObject4, "appId", "com.dcinside.app.android");
        zzfmg.zze(jSONObject1, "app", jSONObject4);
        if(zzfkr0.zzf() != null) {
            zzfmg.zze(jSONObject1, "contentUrl", zzfkr0.zzf());
        }
        if(zzfkr0.zzg() != null) {
            zzfmg.zze(jSONObject1, "customReferenceData", zzfkr0.zzg());
        }
        JSONObject jSONObject5 = new JSONObject();
        Iterator iterator0 = zzfkr0.zzh().iterator();
        if(!iterator0.hasNext()) {
            zzflr.zza().zzj(this.zza(), s, jSONObject1, jSONObject5, jSONObject0);
            return;
        }
        Object object0 = iterator0.next();
        zzfld zzfld0 = (zzfld)object0;
        throw null;
    }

    public final void zzk(boolean z) {
        if(this.zzp()) {
            zzflr.zza().zzi(this.zza(), this.zza, (z ? "foregrounded" : "backgrounded"));
        }
    }

    public final void zzl(float f) {
        zzflr.zza().zze(this.zza(), this.zza, f);
    }

    public final void zzm(boolean z) {
        if(this.zzp()) {
            zzflr.zza().zzg(this.zza(), this.zza, (z ? "locked" : "unlocked"));
        }
    }

    final void zzn(WebView webView0) {
        this.zzb = new zzfnc(webView0);
    }

    public void zzo() {
    }

    public final boolean zzp() {
        return this.zzb.get() != null;
    }
}

