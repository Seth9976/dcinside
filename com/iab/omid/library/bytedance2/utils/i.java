package com.iab.omid.library.bytedance2.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat.WebMessageListener;
import androidx.webkit.WebViewCompat;
import java.util.Set;

public class i {
    public void a(@NonNull WebView webView0, @NonNull String s) {
        WebViewCompat.w(webView0, s);
    }

    public void a(@NonNull WebView webView0, @NonNull String s, @NonNull Set set0, @NonNull WebMessageListener webViewCompat$WebMessageListener0) {
        WebViewCompat.b(webView0, s, set0, webViewCompat$WebMessageListener0);
    }
}

