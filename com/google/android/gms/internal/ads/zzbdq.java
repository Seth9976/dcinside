package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o3.g;
import o3.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbdq {
    private final ScheduledExecutorService zza;
    private final zzo zzb;
    private final zzf zzc;
    private final zzdsb zzd;
    private Runnable zze;
    private zzbdn zzf;
    private CustomTabsSession zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    @VisibleForTesting
    public zzbdq(ScheduledExecutorService scheduledExecutorService0, zzo zzo0, zzf zzf0, zzdsb zzdsb0) {
        this.zzi = 0L;
        this.zza = scheduledExecutorService0;
        this.zzb = zzo0;
        this.zzc = zzf0;
        this.zzd = zzdsb0;
    }

    @h
    public final CustomTabsSession zzb() {
        return this.zzg;
    }

    @VisibleForTesting
    final JSONObject zzc(String s, String s1) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("paw_id", s);
        jSONObject0.put("error", s1);
        jSONObject0.put("sdk_ttl_ms", (((Boolean)zzbeq.zzc.zze()).booleanValue() ? ((long)(((Long)zzbeq.zzf.zze()))) : 0L));
        this.zzk(jSONObject0);
        if(((Boolean)zzbeq.zza.zze()).booleanValue()) {
            jSONObject0.put("as", this.zzc.zza());
        }
        return jSONObject0;
    }

    @VisibleForTesting
    final JSONObject zzd(String s, String s1) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("paw_id", s);
        jSONObject0.put("signal", s1);
        jSONObject0.put("sdk_ttl_ms", (((Boolean)zzbeq.zzc.zze()).booleanValue() ? ((long)(((Long)zzbeq.zzf.zze()))) : 0L));
        this.zzk(jSONObject0);
        if(((Boolean)zzbeq.zza.zze()).booleanValue()) {
            jSONObject0.put("as", this.zzc.zza());
        }
        return jSONObject0;
    }

    final void zzf() {
        this.zzi = zzv.zzC().elapsedRealtime() + ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzjI))))));
        if(this.zze == null) {
            this.zze = () -> {
                zzbdn zzbdn0 = this.zzf;
                if(zzbdn0 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("PACT callback is not present, please initialize the PawCustomTabsImpl.");
                    return;
                }
                if(zzbdn0.zza().booleanValue()) {
                    return;
                }
                if(this.zzh != null && this.zzg != null && this.zza != null && (this.zzi != 0L && zzv.zzC().elapsedRealtime() <= this.zzi || ((Boolean)zzbe.zzc().zza(zzbcl.zzjJ)).booleanValue())) {
                    this.zzg.n(Uri.parse(this.zzh));
                    Runnable runnable0 = this.zze;
                    long v = (long)(((Long)zzbe.zzc().zza(zzbcl.zzjK)));
                    this.zza.schedule(runnable0, v, TimeUnit.MILLISECONDS);
                    return;
                }
                zze.zza("PACT max retry connection duration timed out");
            };
        }
        this.zzj();
    }

    public final void zzg(@g Context context0, @g CustomTabsClient customTabsClient0, @g String s, @h CustomTabsCallback customTabsCallback0) {
        if(context0 == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if(customTabsClient0 == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context0;
        this.zzh = s;
        zzbdn zzbdn0 = new zzbdn(this, customTabsCallback0, this.zzd);
        this.zzf = zzbdn0;
        CustomTabsSession customTabsSession0 = customTabsClient0.k(zzbdn0);
        this.zzg = customTabsSession0;
        if(customTabsSession0 == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("CustomTabsClient failed to create new session.");
        }
        Pair[] arr_pair = {new Pair("pe", "pact_init")};
        zzaa.zzd(this.zzd, null, "pact_action", arr_pair);
    }

    final void zzh(String s) {
        try {
            CustomTabsSession customTabsSession0 = this.zzg;
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("gsppack", true);
            jSONObject0.put("fpt", new Date(this.zzj).toString());
            this.zzk(jSONObject0);
            if(((Boolean)zzbeq.zza.zze()).booleanValue()) {
                jSONObject0.put("as", this.zzc.zza());
            }
            customTabsSession0.l(jSONObject0.toString(), null);
            zzbdp zzbdp0 = new zzbdp(this, s);
            if(((Boolean)zzbeq.zzc.zze()).booleanValue()) {
                this.zzb.zzg(this.zzg, zzbdp0);
                return;
            }
            Bundle bundle0 = new Bundle();
            bundle0.putString("query_info_type", "requester_type_6");
            Context context0 = this.zzl;
            AdRequest adRequest0 = ((Builder)new Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle0)).build();
            QueryInfo.generate(context0, AdFormat.BANNER, adRequest0, zzbdp0);
            return;
        }
        catch(JSONException jSONException0) {
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating JSON: ", jSONException0);
    }

    public final void zzi(long v) {
        this.zzj = v;
    }

    // 检测为 Lambda 实现
    private final void zzj() [...]

    private final void zzk(JSONObject jSONObject0) {
        try {
            if(this.zzk == null) {
                this.zzk = new JSONArray(((String)zzbe.zzc().zza(zzbcl.zzjM)));
            }
            jSONObject0.put("eids", this.zzk);
            return;
        }
        catch(JSONException jSONException0) {
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching the PACT active eids JSON: ", jSONException0);
    }
}

