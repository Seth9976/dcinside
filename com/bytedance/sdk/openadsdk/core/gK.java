package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.JQp;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.qla.PjT.Zh;
import com.bytedance.sdk.openadsdk.utils.RD;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class gK {
    public static void PjT(Context context0, boolean z, JSONObject jSONObject0, Owx owx0, String s, int v, WebView webView0, JQp jQp0) {
        boolean z1;
        int v1 = jSONObject0.optInt("landingStyle");
        String s1 = jSONObject0.optString("url");
        String s2 = jSONObject0.optString("fallback_url");
        try {
            jSONObject0.put("is_activity", z);
            z1 = true;
        }
        catch(JSONException unused_ex) {
        }
        ReZ.PjT(owx0, s, 1, jSONObject0);
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        switch(v1) {
            case 2: {
                if(!RD.Zh(context0, s1, owx0, s)) {
                    Zh zh1 = new Zh();
                    zh1.PjT("openAdLandPageLinks");
                    zh1.PjT(owx0);
                    zh1.Zh(s);
                    zh1.PjT(-1);
                    zh1.PjT(false);
                    zh1.Zh(owx0.cI());
                    ReZ.PjT(zh1);
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put("deeplink_url", s1);
                    hashMap0.put("fallback_url", s2);
                    hashMap0.put("jsb_deeplink", 1);
                    ReZ.PjT(owx0, s, "open_fallback_url", hashMap0);
                    RD.PjT(context0, s2, owx0, "openAdLandPageLinks");
                }
                break;
            }
            case 3: {
                if(ZX.Zh(context0, s1, owx0, v, s, false)) {
                    ReZ.PjT(owx0, s, 3, null);
                }
                else {
                    ReZ.PjT(owx0, s, -2, null);
                }
                break;
            }
            case 1: 
            case 8: {
                Zh zh0 = new Zh();
                zh0.PjT("openAdLandPageLinks");
                zh0.PjT(owx0);
                zh0.Zh(s);
                zh0.PjT(-1);
                zh0.PjT(false);
                zh0.Zh(owx0.cI());
                ReZ.PjT(zh0);
                RD.PjT(context0, s1, owx0, "openAdLandPageLinks");
                break;
            }
            default: {
                z1 = false;
            }
        }
        if(jQp0 != null && z1) {
            jQp0.PjT();
        }
    }
}

