package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzbkx extends zzbkk {
    public static final int zza;
    @Nullable
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzbkx(Context context0, WebView webView0) {
        context0.getClass();
        webView0.getClass();
        zzfun.zzf(webView0.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView0;
        this.zzc = new H5AdsRequestHandler(context0, new zzbkw(webView0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbkk
    @Nullable
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbkk
    public final void onLoadResource(WebView webView0, String s) {
        if(this.zzc(webView0) && !this.zzc.handleH5AdsRequest(s)) {
            super.onLoadResource(webView0, s);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbkk
    @RequiresApi(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        if(!this.zzc(this.zzd)) {
            return false;
        }
        String s = webResourceRequest0.getUrl().toString();
        return this.zzc.handleH5AdsRequest(s) ? true : super.shouldOverrideUrlLoading(webView0, webResourceRequest0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbkk
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(!this.zzc(webView0)) {
            return false;
        }
        return this.zzc.handleH5AdsRequest(s) ? true : super.shouldOverrideUrlLoading(webView0, s);
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(@Nullable WebViewClient webViewClient0) {
        zzfun.zzf(webViewClient0 != this, "Delegate cannot be itself.");
        this.zzb = webViewClient0;
    }

    private final boolean zzc(WebView webView0) {
        if(this.zzd.equals(webView0)) {
            return true;
        }
        zzo.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }
}

