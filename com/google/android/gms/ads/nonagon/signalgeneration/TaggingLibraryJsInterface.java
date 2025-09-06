package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzfcn;
import com.google.android.gms.internal.ads.zzfja;
import com.google.android.gms.internal.ads.zzgcs;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzava zzc;
    private final zzfcn zzd;
    private final int zze;
    private final zzdsb zzf;
    private final boolean zzg;
    private final zzgcs zzh;
    private final zzfja zzi;
    private final zzo zzj;
    private final zzf zzk;
    private final zzj zzl;

    TaggingLibraryJsInterface(WebView webView0, zzava zzava0, zzdsb zzdsb0, zzfja zzfja0, zzfcn zzfcn0, zzo zzo0, zzf zzf0, zzj zzj0) {
        this.zzh = zzbzw.zzf;
        this.zzb = webView0;
        Context context0 = webView0.getContext();
        this.zza = context0;
        this.zzc = zzava0;
        this.zzf = zzdsb0;
        zzbcl.zza(context0);
        this.zze = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzjv)));
        this.zzg = ((Boolean)zzbe.zzc().zza(zzbcl.zzjw)).booleanValue();
        this.zzi = zzfja0;
        this.zzd = zzfcn0;
        this.zzj = zzo0;
        this.zzk = zzf0;
        this.zzl = zzj0;
    }

    // 检测为 Lambda 实现
    @TargetApi(21)
    @JavascriptInterface
    @NonNull
    @KeepForSdk
    public String getClickSignals(@NonNull String s) [...]

    @TargetApi(21)
    @JavascriptInterface
    @NonNull
    @KeepForSdk
    public String getClickSignalsWithTimeout(@NonNull String s, int v) {
        if(v <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(("Invalid timeout for getting click signals. Timeout=" + v));
            return "";
        }
        zzbq zzbq0 = () -> try {
            long v = zzv.zzC().currentTimeMillis();
            String s1 = this.zzc.zzc().zzd(this.zza, s, this.zzb);
            if(this.zzg) {
                Pair[] arr_pair = {new Pair("clat", String.valueOf(zzv.zzC().currentTimeMillis() - v))};
                zzaa.zzd(this.zzf, null, "csg", arr_pair);
                return s1;
            }
            return s1;
        }
        catch(RuntimeException runtimeException0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals. ", runtimeException0);
            zzv.zzp().zzw(runtimeException0, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        };
        t0 t00 = zzbzw.zza.zzb(zzbq0);
        try {
            return (String)t00.get(((long)Math.min(v, this.zze)), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException | TimeoutException | ExecutionException interruptedException0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals with timeout. ", interruptedException0);
            zzv.zzp().zzw(interruptedException0, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return interruptedException0 instanceof TimeoutException ? "17" : "";
        }
    }

    @TargetApi(21)
    @JavascriptInterface
    @NonNull
    @KeepForSdk
    public String getQueryInfo() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("query_info_type", "requester_type_6");
        zzbu zzbu0 = new zzbu(this, "53d967ec-31ae-436e-bf53-9dd2a450e3a7");
        if(((Boolean)zzbeq.zzc.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbu0);
            return "53d967ec-31ae-436e-bf53-9dd2a450e3a7";
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjy)).booleanValue()) {
            zzbr zzbr0 = () -> {
                CookieManager cookieManager0 = zzv.zzr().zza(this.zza);
                bundle0.putBoolean("accept_3p_cookie", (cookieManager0 == null ? false : cookieManager0.acceptThirdPartyCookies(this.zzb)));
                AdRequest adRequest0 = ((Builder)new Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle0)).build();
                QueryInfo.generate(this.zza, AdFormat.BANNER, adRequest0, zzbu0);
            };
            this.zzh.execute(zzbr0);
            return "53d967ec-31ae-436e-bf53-9dd2a450e3a7";
        }
        AdRequest adRequest0 = ((Builder)new Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle0)).build();
        QueryInfo.generate(this.zza, AdFormat.BANNER, adRequest0, zzbu0);
        return "53d967ec-31ae-436e-bf53-9dd2a450e3a7";
    }

    // 检测为 Lambda 实现
    @TargetApi(21)
    @JavascriptInterface
    @NonNull
    @KeepForSdk
    public String getViewSignals() [...]

    @TargetApi(21)
    @JavascriptInterface
    @NonNull
    @KeepForSdk
    public String getViewSignalsWithTimeout(int v) {
        if(v <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(("Invalid timeout for getting view signals. Timeout=" + v));
            return "";
        }
        zzbo zzbo0 = () -> try {
            long v = zzv.zzC().currentTimeMillis();
            String s = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if(this.zzg) {
                Pair[] arr_pair = {new Pair("vlat", String.valueOf(zzv.zzC().currentTimeMillis() - v))};
                zzaa.zzd(this.zzf, null, "vsg", arr_pair);
                return s;
            }
            return s;
        }
        catch(RuntimeException runtimeException0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals. ", runtimeException0);
            zzv.zzp().zzw(runtimeException0, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        };
        t0 t00 = zzbzw.zza.zzb(zzbo0);
        try {
            return (String)t00.get(((long)Math.min(v, this.zze)), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException | TimeoutException | ExecutionException interruptedException0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals with timeout. ", interruptedException0);
            zzv.zzp().zzw(interruptedException0, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return interruptedException0 instanceof TimeoutException ? "17" : "";
        }
    }

    @TargetApi(21)
    @JavascriptInterface
    @KeepForSdk
    public void recordClick(@NonNull String s) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjA)).booleanValue() && !TextUtils.isEmpty(s)) {
            zzbp zzbp0 = () -> {
                Uri uri0 = Uri.parse(s);
                try {
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzlR)).booleanValue()) {
                        zzfcn zzfcn0 = this.zzd;
                        uri0 = zzfcn0 == null ? this.zzc.zza(uri0, this.zza, this.zzb, null) : zzfcn0.zza(uri0, this.zza, this.zzb, null);
                    }
                    else {
                        uri0 = this.zzc.zza(uri0, this.zza, this.zzb, null);
                    }
                }
                catch(zzavb zzavb0) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to append the click signal to URL: ", zzavb0);
                    zzv.zzp().zzw(zzavb0, "TaggingLibraryJsInterface.recordClick");
                }
                this.zzi.zzd(uri0.toString(), null, null);
            };
            zzbzw.zza.execute(zzbp0);
        }
    }

    @TargetApi(21)
    @JavascriptInterface
    @KeepForSdk
    public void reportTouchEvent(@NonNull String s) {
        int v3;
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            int v = jSONObject0.getInt("x");
            int v1 = jSONObject0.getInt("y");
            int v2 = jSONObject0.getInt("duration_ms");
            float f = (float)jSONObject0.getDouble("force");
            switch(jSONObject0.getInt("type")) {
                case 0: {
                    v3 = 0;
                    break;
                }
                case 1: {
                    v3 = 1;
                    break;
                }
                case 2: {
                    v3 = 2;
                    break;
                }
                case 3: {
                    v3 = 3;
                    break;
                }
                default: {
                    v3 = -1;
                }
            }
            MotionEvent motionEvent0 = MotionEvent.obtain(0L, v2, v3, ((float)v), ((float)v1), f, 1.0f, 0, 1.0f, 1.0f, 0, 0);
            this.zzc.zzd(motionEvent0);
        }
        catch(RuntimeException | JSONException runtimeException0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", runtimeException0);
            zzv.zzp().zzw(runtimeException0, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }

    // 检测为 Lambda 实现
    final void zze(Bundle bundle0, QueryInfoGenerationCallback queryInfoGenerationCallback0) [...]

    // 检测为 Lambda 实现
    final void zzf(String s) [...]
}

