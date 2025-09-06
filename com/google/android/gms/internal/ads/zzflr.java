package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import org.json.JSONObject;

public final class zzflr {
    private static final zzflr zza;

    static {
        zzflr.zza = new zzflr();
    }

    public static final zzflr zza() {
        return zzflr.zza;
    }

    @VisibleForTesting
    final void zzb(WebView webView0, String s, Object[] arr_object) {
        if(webView0 != null) {
            StringBuilder stringBuilder0 = new StringBuilder(0x80);
            stringBuilder0.append("if(window.omidBridge!==undefined){omidBridge.");
            stringBuilder0.append(s);
            stringBuilder0.append("(");
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                if(object0 == null) {
                    stringBuilder0.append("null");
                }
                else if(object0 instanceof String) {
                    String s1 = object0.toString();
                    if(s1.startsWith("{")) {
                        stringBuilder0.append(s1);
                    }
                    else {
                        stringBuilder0.append('\"');
                        stringBuilder0.append(s1);
                        stringBuilder0.append('\"');
                    }
                }
                else {
                    stringBuilder0.append(object0);
                }
                stringBuilder0.append(",");
            }
            stringBuilder0.setLength(stringBuilder0.length() - 1);
            stringBuilder0.append(")}");
            String s2 = stringBuilder0.toString();
            Handler handler0 = webView0.getHandler();
            if(handler0 != null && Looper.myLooper() != handler0.getLooper()) {
                handler0.post(new zzflq(this, webView0, s2));
                return;
            }
            zzflr.zzk(webView0, s2);
            return;
        }
        zzfkm.zza.booleanValue();
    }

    public final void zzc(WebView webView0, String s) {
        this.zzb(webView0, "finishSession", new Object[]{s});
    }

    public final void zzd(WebView webView0, String s, JSONObject jSONObject0) {
        this.zzb(webView0, "init", new Object[]{jSONObject0, s});
    }

    public final void zze(WebView webView0, String s, float f) {
        this.zzb(webView0, "setDeviceVolume", new Object[]{f, s});
    }

    public final void zzf(WebView webView0, @NonNull JSONObject jSONObject0) {
        this.zzb(webView0, "setLastActivity", new Object[]{jSONObject0});
    }

    public final void zzg(WebView webView0, String s, String s1) {
        this.zzb(webView0, "setDeviceLockState", new Object[]{s1});
    }

    public final void zzh(WebView webView0, String s, String s1) {
        this.zzb(webView0, "setNativeViewHierarchy", new Object[]{s1, s});
    }

    public final void zzi(WebView webView0, String s, String s1) {
        this.zzb(webView0, "setState", new Object[]{s1, s});
    }

    public final void zzj(WebView webView0, String s, JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2) {
        this.zzb(webView0, "startSession", new Object[]{s, jSONObject0, jSONObject1, jSONObject2});
    }

    public static final boolean zzk(WebView webView0, String s) {
        if(webView0 != null && !TextUtils.isEmpty(s)) {
            try {
                webView0.evaluateJavascript(s, null);
            }
            catch(IllegalStateException unused_ex) {
                webView0.loadUrl("javascript: " + s);
            }
            return true;
        }
        return false;
    }
}

