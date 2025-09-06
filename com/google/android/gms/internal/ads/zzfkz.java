package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat.WebMessageListener;
import org.json.JSONException;
import org.json.JSONObject;

final class zzfkz implements WebMessageListener {
    final zzfla zza;

    zzfkz(zzfla zzfla0) {
        this.zza = zzfla0;
        super();
    }

    @Override  // androidx.webkit.WebViewCompat$WebMessageListener
    public final void onPostMessage(WebView webView0, WebMessageCompat webMessageCompat0, Uri uri0, boolean z, JavaScriptReplyProxy javaScriptReplyProxy0) {
        String s = webMessageCompat0.c();
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            String s1 = jSONObject0.getString("method");
            String s2 = jSONObject0.getJSONObject("data").getString("adSessionId");
            if(!s1.equals("startSession")) {
                if(!s1.equals("finishSession")) {
                    zzfkm.zza.booleanValue();
                    return;
                }
                zzfla.zzc(this.zza, s2);
                return;
            }
            zzfla.zze(this.zza, s2);
            return;
        }
        catch(JSONException jSONException0) {
        }
        zzfmh.zza("Error parsing JS message in JavaScriptSessionService.", jSONException0);
    }
}

