package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

@TargetApi(21)
public final class zzcgg extends zzcgf {
    public zzcgg(zzcex zzcex0, zzbbj zzbbj0, boolean z, @Nullable zzebv zzebv0) {
        super(zzcex0, zzbbj0, z, zzebv0);
    }

    @Override  // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
        return webResourceRequest0 == null || webResourceRequest0.getUrl() == null ? null : this.zzW(webView0, webResourceRequest0.getUrl().toString(), webResourceRequest0.getRequestHeaders());
    }
}

