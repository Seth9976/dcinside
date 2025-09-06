package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.KM;

public class gK {
    public static String PjT(WebView webView0, int v) {
        if(webView0 == null) {
            return "";
        }
        String s = webView0.getSettings().getUserAgentString();
        return TextUtils.isEmpty(s) ? "" : s + " open_news open_news_u_s/" + v;
    }

    public static void PjT(Uri uri0, KM kM0) {
        if(kM0 != null && kM0.PjT(uri0)) {
            try {
                kM0.Zh(uri0);
            }
            catch(Exception exception0) {
                exception0.toString();
            }
        }
    }
}

